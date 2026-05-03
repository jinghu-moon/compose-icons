package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Bowl: ImageVector
    get() {
        if (_bowl != null) return _bowl!!
        _bowl = tablerFilledIcon(
            name = "Bowl",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(20.0f, 7.0f),
                    PathNode.CurveTo(21.10457f, 7.0f, 22.0f, 7.895431f, 22.0f, 9.0f),
                    PathNode.LineTo(22.0f, 9.5f),
                    PathNode.CurveTo(22.0f, 11.194f, 19.753f, 14.99f, 18.017f, 16.483f),
                    PathNode.LineTo(18.0f, 16.496f),
                    PathNode.LineTo(18.0f, 17.0f),
                    PathNode.CurveTo(18.000332f, 18.046625f, 17.193678f, 18.916504f, 16.15f, 18.995f),
                    PathNode.LineTo(16.0f, 19.0f),
                    PathNode.LineTo(8.0f, 19.0f),
                    PathNode.CurveTo(6.895431f, 19.0f, 6.0f, 18.10457f, 6.0f, 17.0f),
                    PathNode.LineTo(6.0f, 16.504f),
                    PathNode.LineTo(5.935f, 16.451f),
                    PathNode.CurveTo(4.175f, 14.955f, 2.141f, 11.486f, 2.007f, 9.681f),
                    PathNode.LineTo(2.0f, 9.5f),
                    PathNode.LineTo(2.0f, 9.0f),
                    PathNode.CurveTo(2.0f, 7.895431f, 2.895431f, 7.0f, 4.0f, 7.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
        }
        return _bowl!!
    }

private var _bowl: ImageVector? = null
