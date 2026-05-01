package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.OctagonMinus: ImageVector
    get() {
        if (_octagonMinus != null) return _octagonMinus!!
        _octagonMinus = tablerFilledIcon(
            name = "OctagonMinus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(13.196f, 1.246f),
                    PathNode.LineTo(18.771f, 3.636f),
                    PathNode.CurveTo(19.487356f, 3.943208f, 20.058342f, 4.513838f, 20.366f, 5.23f),
                    PathNode.LineTo(22.754f, 10.803f),
                    PathNode.CurveTo(23.082f, 11.567f, 23.082f, 12.433f, 22.754f, 13.196f),
                    PathNode.LineTo(20.364f, 18.771f),
                    PathNode.CurveTo(20.056791f, 19.487356f, 19.486162f, 20.058342f, 18.77f, 20.366f),
                    PathNode.LineTo(13.197f, 22.754f),
                    PathNode.CurveTo(12.433119f, 23.082327f, 11.567881f, 23.082327f, 10.804f, 22.754f),
                    PathNode.LineTo(5.23f, 20.365f),
                    PathNode.CurveTo(4.513461f, 20.057554f, 3.942447f, 19.48654f, 3.635f, 18.77f),
                    PathNode.LineTo(1.247f, 13.196f),
                    PathNode.CurveTo(0.920133f, 12.432166f, 0.920133f, 11.567834f, 1.247f, 10.804f),
                    PathNode.LineTo(3.637f, 5.229f),
                    PathNode.CurveTo(3.943969f, 4.512829f, 4.514214f, 3.941868f, 5.23f, 3.634f),
                    PathNode.LineTo(10.804f, 1.246f),
                    PathNode.CurveTo(11.567834f, 0.919133f, 12.432166f, 0.919133f, 13.196f, 1.246f),
                    PathNode.MoveTo(15.0f, 11.0f),
                    PathNode.LineTo(9.0f, 11.0f),
                    PathNode.CurveTo(8.447715f, 11.0f, 8.0f, 11.447715f, 8.0f, 12.0f),
                    PathNode.CurveTo(8.0f, 12.552285f, 8.447715f, 13.0f, 9.0f, 13.0f),
                    PathNode.LineTo(15.0f, 13.0f),
                    PathNode.CurveTo(15.552285f, 13.0f, 16.0f, 12.552285f, 16.0f, 12.0f),
                    PathNode.CurveTo(16.0f, 11.447715f, 15.552285f, 11.0f, 15.0f, 11.0f)
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
        }
        return _octagonMinus!!
    }

private var _octagonMinus: ImageVector? = null
