package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.BowlSpoon: ImageVector
    get() {
        if (_bowlSpoon != null) return _bowlSpoon!!
        _bowlSpoon = tablerFilledIcon(
            name = "BowlSpoon",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(20.0f, 10.0f),
                    PathNode.CurveTo(21.10457f, 10.0f, 22.0f, 10.895431f, 22.0f, 12.0f),
                    PathNode.LineTo(22.0f, 12.5f),
                    PathNode.CurveTo(22.0f, 14.194f, 19.753f, 17.99f, 18.017f, 19.483f),
                    PathNode.LineTo(18.0f, 19.496f),
                    PathNode.LineTo(18.0f, 20.0f),
                    PathNode.CurveTo(18.000332f, 21.046625f, 17.193678f, 21.916504f, 16.15f, 21.995f),
                    PathNode.LineTo(16.0f, 22.0f),
                    PathNode.LineTo(8.0f, 22.0f),
                    PathNode.CurveTo(6.895431f, 22.0f, 6.0f, 21.10457f, 6.0f, 20.0f),
                    PathNode.LineTo(6.0f, 19.504f),
                    PathNode.LineTo(5.935f, 19.451f),
                    PathNode.CurveTo(4.175f, 17.955f, 2.141f, 14.486f, 2.007f, 12.681f),
                    PathNode.LineTo(2.0f, 12.5f),
                    PathNode.LineTo(2.0f, 12.0f),
                    PathNode.CurveTo(2.0f, 10.895431f, 2.895431f, 10.0f, 4.0f, 10.0f),
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
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(8.0f, 2.0f),
                    PathNode.CurveTo(9.71f, 2.0f, 11.237f, 2.787f, 11.785f, 4.0f),
                    PathNode.LineTo(20.0f, 4.0f),
                    PathNode.CurveTo(20.552284f, 4.0f, 21.0f, 4.447716f, 21.0f, 5.0f),
                    PathNode.CurveTo(21.0f, 5.552285f, 20.552284f, 6.0f, 20.0f, 6.0f),
                    PathNode.LineTo(11.784f, 6.001f),
                    PathNode.CurveTo(11.236f, 7.214f, 9.71f, 8.0f, 8.0f, 8.0f),
                    PathNode.CurveTo(5.856f, 8.0f, 4.0f, 6.763f, 4.0f, 5.0f),
                    PathNode.CurveTo(4.0f, 3.237f, 5.856f, 2.0f, 8.0f, 2.0f)
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
        return _bowlSpoon!!
    }

private var _bowlSpoon: ImageVector? = null
