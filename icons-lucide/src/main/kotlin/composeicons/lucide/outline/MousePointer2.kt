package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.MousePointer2: ImageVector
    get() {
        if (_mousePointer2 != null) return _mousePointer2!!
        _mousePointer2 = lucideOutlineIcon(
            name = "MousePointer2",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(4.037f, 4.688f),
                    PathNode.CurveTo(3.956239f, 4.501616f, 3.997543f, 4.284811f, 4.141177f, 4.141177f),
                    PathNode.CurveTo(4.284811f, 3.997543f, 4.501616f, 3.956239f, 4.688f, 4.037f),
                    PathNode.LineTo(20.688f, 10.537f),
                    PathNode.CurveTo(20.88753f, 10.618291f, 21.012548f, 10.818256f, 20.998247f, 11.033235f),
                    PathNode.CurveTo(20.983946f, 11.248214f, 20.83354f, 11.429856f, 20.625f, 11.484f),
                    PathNode.LineTo(14.501f, 13.064f),
                    PathNode.CurveTo(13.796329f, 13.245158f, 13.245629f, 13.794709f, 13.063f, 14.499f),
                    PathNode.LineTo(11.484f, 20.625f),
                    PathNode.CurveTo(11.429856f, 20.83354f, 11.248214f, 20.983946f, 11.033235f, 20.998247f),
                    PathNode.CurveTo(10.818256f, 21.012548f, 10.618291f, 20.88753f, 10.537f, 20.688f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color.Black),
                strokeAlpha = 1f,
                strokeLineWidth = 2.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _mousePointer2!!
    }

private var _mousePointer2: ImageVector? = null
