package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.MousePointer: ImageVector
    get() {
        if (_mousePointer != null) return _mousePointer!!
        _mousePointer = lucideOutlineIcon(
            name = "MousePointer",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(12.586f, 12.586f),
                    PathNode.LineTo(19.0f, 19.0f)
                ),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1.0f,
                stroke = SolidColor(Color.Black),
                strokeAlpha = 1.0f,
                strokeLineWidth = 2.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(3.688f, 3.037f),
                    PathNode.CurveTo(3.501736f, 2.958505f, 3.286487f, 3.000634f, 3.143561f, 3.143561f),
                    PathNode.CurveTo(3.000634f, 3.286487f, 2.958505f, 3.501736f, 3.037f, 3.688f),
                    PathNode.LineTo(9.537f, 19.687f),
                    PathNode.CurveTo(9.61904f, 19.88546f, 9.818439f, 20.009562f, 10.032729f, 19.995531f),
                    PathNode.CurveTo(10.247019f, 19.981503f, 10.428535f, 19.832462f, 10.484f, 19.625f),
                    PathNode.LineTo(12.053f, 13.542f),
                    PathNode.CurveTo(12.223197f, 12.818155f, 12.780922f, 12.248489f, 13.501f, 12.063f),
                    PathNode.LineTo(19.625f, 10.484f),
                    PathNode.CurveTo(19.83354f, 10.429856f, 19.983946f, 10.248214f, 19.998247f, 10.033235f),
                    PathNode.CurveTo(20.012548f, 9.818256f, 19.88753f, 9.618291f, 19.688f, 9.537f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1.0f,
                stroke = SolidColor(Color.Black),
                strokeAlpha = 1.0f,
                strokeLineWidth = 2.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _mousePointer!!
    }

private var _mousePointer: ImageVector? = null
