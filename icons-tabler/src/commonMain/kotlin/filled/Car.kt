package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Car: ImageVector
    get() {
        if (_car != null) return _car!!
        _car = tablerFilledIcon(
            name = "Car",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(14.0f, 5.0f),
                    PathNode.CurveTo(14.258854f, 4.999994f, 14.507626f, 5.100363f, 14.694f, 5.28f),
                    PathNode.LineTo(14.781f, 5.375f),
                    PathNode.LineTo(18.48f, 10.0f),
                    PathNode.LineTo(19.0f, 10.0f),
                    PathNode.CurveTo(20.588558f, 9.999911f, 21.901804f, 11.238178f, 21.995f, 12.824f),
                    PathNode.LineTo(22.0f, 13.0f),
                    PathNode.LineTo(22.0f, 17.0f),
                    PathNode.CurveTo(22.0f, 17.552284f, 21.552284f, 18.0f, 21.0f, 18.0f),
                    PathNode.LineTo(19.829f, 18.0f),
                    PathNode.CurveTo(19.404768f, 19.198498f, 18.271366f, 19.99962f, 17.0f, 19.99962f),
                    PathNode.CurveTo(15.728634f, 19.99962f, 14.595232f, 19.198498f, 14.171f, 18.0f),
                    PathNode.LineTo(9.829f, 18.0f),
                    PathNode.CurveTo(9.404768f, 19.198498f, 8.271366f, 19.99962f, 7.0f, 19.99962f),
                    PathNode.CurveTo(5.728635f, 19.99962f, 4.595232f, 19.198498f, 4.171f, 18.0f),
                    PathNode.LineTo(3.0f, 18.0f),
                    PathNode.CurveTo(2.447715f, 18.0f, 2.0f, 17.552284f, 2.0f, 17.0f),
                    PathNode.LineTo(2.0f, 11.0f),
                    PathNode.LineTo(2.007f, 10.883f),
                    PathNode.LineTo(2.015f, 10.827f),
                    PathNode.LineTo(2.032f, 10.749f),
                    PathNode.LineTo(2.044f, 10.713f),
                    PathNode.LineTo(2.058f, 10.663f),
                    PathNode.LineTo(4.072f, 5.629f),
                    PathNode.CurveTo(4.223675f, 5.24935f, 4.591173f, 5.000259f, 5.0f, 5.0f),
                    PathNode.Close,
                    PathNode.MoveTo(7.0f, 16.0f),
                    PathNode.CurveTo(6.447716f, 16.0f, 6.0f, 16.447716f, 6.0f, 17.0f),
                    PathNode.CurveTo(6.0f, 17.552284f, 6.447716f, 18.0f, 7.0f, 18.0f),
                    PathNode.CurveTo(7.552285f, 18.0f, 8.0f, 17.552284f, 8.0f, 17.0f),
                    PathNode.CurveTo(8.0f, 16.447716f, 7.552285f, 16.0f, 7.0f, 16.0f),
                    PathNode.MoveTo(17.0f, 16.0f),
                    PathNode.CurveTo(16.447716f, 16.0f, 16.0f, 16.447716f, 16.0f, 17.0f),
                    PathNode.CurveTo(16.0f, 17.552284f, 16.447716f, 18.0f, 17.0f, 18.0f),
                    PathNode.CurveTo(17.552284f, 18.0f, 18.0f, 17.552284f, 18.0f, 17.0f),
                    PathNode.CurveTo(18.0f, 16.447716f, 17.552284f, 16.0f, 17.0f, 16.0f),
                    PathNode.MoveTo(11.0f, 7.0f),
                    PathNode.LineTo(5.676f, 7.0f),
                    PathNode.LineTo(4.476f, 10.0f),
                    PathNode.LineTo(11.0f, 10.0f),
                    PathNode.Close,
                    PathNode.MoveTo(13.52f, 7.0f),
                    PathNode.LineTo(13.0f, 7.0f),
                    PathNode.LineTo(13.0f, 10.0f),
                    PathNode.LineTo(15.92f, 10.0f),
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
        return _car!!
    }

private var _car: ImageVector? = null
