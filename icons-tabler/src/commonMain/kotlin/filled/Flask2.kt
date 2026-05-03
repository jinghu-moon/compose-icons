package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Flask2: ImageVector
    get() {
        if (_flask2 != null) return _flask2!!
        _flask2 = tablerFilledIcon(
            name = "Flask2",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(15.0f, 2.0f),
                    PathNode.CurveTo(15.552285f, 2.0f, 16.0f, 2.447715f, 16.0f, 3.0f),
                    PathNode.CurveTo(16.0f, 3.552285f, 15.552285f, 4.0f, 15.0f, 4.0f),
                    PathNode.LineTo(15.0f, 9.674f),
                    PathNode.LineTo(15.062f, 9.704f),
                    PathNode.CurveTo(17.110703f, 10.699554f, 18.546907f, 12.629663f, 18.912f, 14.878f),
                    PathNode.LineTo(18.949f, 15.14f),
                    PathNode.CurveTo(19.274872f, 17.774122f, 18.082924f, 20.365969f, 15.871f, 21.833f),
                    PathNode.CurveTo(15.707108f, 21.941854f, 15.514748f, 21.999947f, 15.318f, 22.0f),
                    PathNode.LineTo(8.683f, 22.0f),
                    PathNode.CurveTo(8.486695f, 22.000046f, 8.294718f, 21.942314f, 8.131f, 21.834f),
                    PathNode.CurveTo(6.034785f, 20.446268f, 4.8437f, 18.041035f, 5.010527f, 15.53263f),
                    PathNode.CurveTo(5.177354f, 13.024226f, 6.676471f, 10.797911f, 8.938f, 9.7f),
                    PathNode.LineTo(9.0f, 9.672f),
                    PathNode.LineTo(9.0f, 4.0f),
                    PathNode.CurveTo(8.447715f, 4.0f, 8.0f, 3.552285f, 8.0f, 3.0f),
                    PathNode.CurveTo(8.0f, 2.447715f, 8.447715f, 2.0f, 9.0f, 2.0f),
                    PathNode.LineTo(15.0f, 2.0f),
                    PathNode.Close,
                    PathNode.MoveTo(13.0f, 4.0f),
                    PathNode.LineTo(11.0f, 4.0f),
                    PathNode.LineTo(11.0f, 10.34f),
                    PathNode.CurveTo(11.000177f, 10.718221f, 10.786952f, 11.064178f, 10.449f, 11.234f),
                    PathNode.LineTo(10.333f, 11.283f),
                    PathNode.CurveTo(9.024935f, 11.744437f, 7.967333f, 12.728515f, 7.413f, 14.0f),
                    PathNode.LineTo(16.585f, 14.0f),
                    PathNode.CurveTo(16.030672f, 12.729682f, 14.973924f, 11.74645f, 13.667f, 11.285f),
                    PathNode.CurveTo(13.267256f, 11.143828f, 12.999969f, 10.76594f, 13.0f, 10.342f),
                    PathNode.LineTo(13.0f, 4.0f),
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
        return _flask2!!
    }

private var _flask2: ImageVector? = null
