package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.CarWashingLine: ImageVector
    get() {
        if (_carWashingLine != null) return _carWashingLine!!
        _carWashingLine = remixIcon(
            name = "CarWashingLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 19.000 21.000 L 5.000 21.000 L 5.000 22.000 C 5.000 22.552 4.552 23.000 4.000 23.000 L 3.000 23.000 C 2.448 23.000 2.000 22.552 2.000 22.000 L 2.000 12.000 L 4.417 7.971 C 4.779 7.369 5.430 7.000 6.132 7.000 L 17.868 7.000 C 18.570 7.000 19.221 7.369 19.583 7.971 L 22.000 12.000 L 22.000 22.000 C 22.000 22.552 21.552 23.000 21.000 23.000 L 20.000 23.000 C 19.448 23.000 19.000 22.552 19.000 22.000 L 19.000 21.000 ZM 20.000 14.000 L 4.000 14.000 L 4.000 19.000 L 20.000 19.000 L 20.000 14.000 ZM 4.332 12.000 L 19.668 12.000 L 17.868 9.000 L 6.132 9.000 L 4.332 12.000 ZM 5.439 3.439 L 6.500 2.379 L 7.561 3.439 C 7.832 3.711 8.000 4.086 8.000 4.500 C 8.000 5.328 7.328 6.000 6.500 6.000 C 5.672 6.000 5.000 5.328 5.000 4.500 C 5.000 4.086 5.168 3.711 5.439 3.439 ZM 10.939 3.439 L 12.000 2.379 L 13.061 3.439 C 13.332 3.711 13.500 4.086 13.500 4.500 C 13.500 5.328 12.828 6.000 12.000 6.000 C 11.172 6.000 10.500 5.328 10.500 4.500 C 10.500 4.086 10.668 3.711 10.939 3.439 ZM 16.439 3.439 L 17.500 2.379 L 18.561 3.439 C 18.832 3.711 19.000 4.086 19.000 4.500 C 19.000 5.328 18.328 6.000 17.500 6.000 C 16.672 6.000 16.000 5.328 16.000 4.500 C 16.000 4.086 16.168 3.711 16.439 3.439 ZM 6.500 18.000 C 5.672 18.000 5.000 17.328 5.000 16.500 C 5.000 15.672 5.672 15.000 6.500 15.000 C 7.328 15.000 8.000 15.672 8.000 16.500 C 8.000 17.328 7.328 18.000 6.500 18.000 ZM 17.500 18.000 C 16.672 18.000 16.000 17.328 16.000 16.500 C 16.000 15.672 16.672 15.000 17.500 15.000 C 18.328 15.000 19.000 15.672 19.000 16.500 C 19.000 17.328 18.328 18.000 17.500 18.000 Z"),
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
        return _carWashingLine!!
    }

private var _carWashingLine: ImageVector? = null
