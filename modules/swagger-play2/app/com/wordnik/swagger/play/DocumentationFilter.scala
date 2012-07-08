package com.wordnik.swagger.play

import com.wordnik.swagger.core._
import com.wordnik.swagger.core.util.TypeUtil
import java.lang.reflect.{ Type, Field, Modifier, Method }

trait OperationFilter {
  /**
   * If you would like to transform documentation after it is generated,
   * override this method
   */
  def processOperation(method: Method, o: DocumentationOperation): DocumentationOperation
}