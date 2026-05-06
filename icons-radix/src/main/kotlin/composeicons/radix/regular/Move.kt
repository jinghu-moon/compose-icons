package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.Move: ImageVector
    get() {
        if (_move != null) return _move!!
        _move = radixIcon(
            name = "Move",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15f, height = 15f),
        ) {
            addPath(
                pathData = parseSvgPathData("M7.5 9c.276 0 .5 .224 .5 .5v3.113l.932-.932c.176-.176 .461-.176 .637 0 .176 .176 .176 .461 0 .637L7.819 14.069c-.154 .154-.392 .173-.566 .058l-.07-.058L5.432 12.319l-.058-.07c-.116-.175-.096-.413 .058-.566 .154-.154 .392-.173 .566-.058l.07 .058 .932 .932v-3.113c0-.276 .224-.5 .5-.5ZM11.682 5.432c.154-.154 .392-.173 .566-.058l.07 .058 1.75 1.75 .058 .07c.115 .175 .096 .413-.058 .566L12.318 9.569c-.176 .176-.461 .176-.637 0-.176-.176-.176-.461 0-.637l.932-.932h-3.113c-.276 0-.5-.224-.5-.5 0-.276 .224-.5 .5-.5h3.113l-.932-.932-.058-.07c-.115-.175-.096-.413 .058-.566ZM2.682 5.432c.176-.176 .461-.176 .637 0 .176 .176 .176 .461 0 .637l-.932 .932h3.113l.101 .01c.228 .047 .399 .249 .399 .49-0 .242-.172 .444-.399 .49l-.101 .01h-3.113l.932 .932 .058 .07c.115 .175 .096 .413-.058 .566-.154 .154-.392 .173-.566 .058L2.682 9.569 .932 7.819C.756 7.643 .756 7.358 .932 7.182L2.682 5.432ZM7.252 .874c.175-.115 .413-.096 .566 .058L9.569 2.682l.058 .07c.115 .175 .096 .413-.058 .566-.154 .154-.392 .173-.566 .058L8.932 3.319 8 2.387v3.113l-.01 .101c-.047 .228-.249 .399-.49 .399-.242 0-.444-.172-.49-.399L7 5.5v-3.113l-.932 .932c-.176 .176-.461 .176-.637 0-.176-.176-.176-.461 0-.637L7.182 .932 7.252 .874Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
        }
        return _move!!
    }

private var _move: ImageVector? = null
