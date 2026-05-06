package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.CarLine: ImageVector
    get() {
        if (_carLine != null) return _carLine!!
        _carLine = remixIcon(
            name = "CarLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M19 20h-14v1c0 .552-.448 1-1 1h-1C2.448 22 2 21.552 2 21v-10L4.481 5.212C4.796 4.477 5.519 4 6.319 4h11.362c.8 0 1.523 .477 1.838 1.212L22 11v10c0 .552-.448 1-1 1h-1c-.552 0-1-.448-1-1v-1ZM20 13h-16v5h16v-5ZM4.176 11h15.648L17.681 6h-11.362L4.176 11ZM6.5 17C5.672 17 5 16.328 5 15.5 5 14.672 5.672 14 6.5 14 7.328 14 8 14.672 8 15.5 8 16.328 7.328 17 6.5 17ZM17.5 17C16.672 17 16 16.328 16 15.5 16 14.672 16.672 14 17.5 14c.828 0 1.5 .672 1.5 1.5C19 16.328 18.328 17 17.5 17Z"),
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
        return _carLine!!
    }

private var _carLine: ImageVector? = null
