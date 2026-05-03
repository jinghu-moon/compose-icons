package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.AirplayLine: ImageVector
    get() {
        if (_airplayLine != null) return _airplayLine!!
        _airplayLine = remixIcon(
            name = "AirplayLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 12.400 13.533 L 17.400 20.200 C 17.566 20.421 17.521 20.734 17.300 20.900 C 17.213 20.965 17.108 21.000 17.000 21.000 L 7.000 21.000 C 6.724 21.000 6.500 20.776 6.500 20.500 C 6.500 20.392 6.535 20.287 6.600 20.200 L 11.600 13.533 C 11.766 13.312 12.079 13.268 12.300 13.433 C 12.338 13.462 12.372 13.495 12.400 13.533 ZM 12.000 16.330 L 10.000 19.000 L 14.000 19.000 L 12.000 16.330 ZM 18.000 19.000 L 18.000 17.000 L 20.000 17.000 L 20.000 5.000 L 4.000 5.000 L 4.000 17.000 L 6.000 17.000 L 6.000 19.000 L 2.992 19.000 C 2.444 19.000 2.000 18.555 2.000 17.999 L 2.000 4.001 C 2.000 3.448 2.455 3.000 2.992 3.000 L 21.008 3.000 C 21.556 3.000 22.000 3.445 22.000 4.001 L 22.000 17.999 C 22.000 18.552 21.545 19.000 21.008 19.000 L 18.000 19.000 Z"),
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
        return _airplayLine!!
    }

private var _airplayLine: ImageVector? = null
