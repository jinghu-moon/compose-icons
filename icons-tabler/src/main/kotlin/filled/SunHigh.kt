package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.SunHigh: ImageVector
    get() {
        if (_sunHigh != null) return _sunHigh!!
        _sunHigh = tablerFilledIcon(
            name = "SunHigh",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 12.000 19.000 C 12.552 19.000 13.000 19.448 13.000 20.000 L 13.000 22.000 C 13.000 22.552 12.552 23.000 12.000 23.000 C 11.448 23.000 11.000 22.552 11.000 22.000 L 11.000 20.000 C 11.000 19.448 11.448 19.000 12.000 19.000M 7.050 16.950 C 7.440 17.340 7.440 17.973 7.050 18.364 L 5.636 19.778 C 5.385 20.038 5.013 20.142 4.663 20.051 C 4.314 19.959 4.041 19.686 3.949 19.337 C 3.858 18.987 3.962 18.615 4.222 18.364 L 5.636 16.950 C 6.026 16.560 6.660 16.560 7.050 16.950M 18.364 16.950 L 19.778 18.364 C 20.157 18.756 20.152 19.380 19.766 19.766 C 19.380 20.152 18.756 20.157 18.364 19.778 L 16.950 18.364 C 16.571 17.972 16.576 17.348 16.962 16.962 C 17.348 16.576 17.972 16.571 18.364 16.950M 13.315 7.114 C 15.051 7.559 16.417 8.899 16.894 10.627 C 17.371 12.355 16.886 14.206 15.624 15.479 C 14.362 16.751 12.515 17.251 10.783 16.788 C 8.125 16.078 6.540 13.353 7.237 10.692 C 7.934 8.030 10.650 6.431 13.315 7.114M 4.000 11.000 C 4.552 11.000 5.000 11.448 5.000 12.000 C 5.000 12.552 4.552 13.000 4.000 13.000 L 2.000 13.000 C 1.448 13.000 1.000 12.552 1.000 12.000 C 1.000 11.448 1.448 11.000 2.000 11.000 ZM 22.000 11.000 C 22.552 11.000 23.000 11.448 23.000 12.000 C 23.000 12.552 22.552 13.000 22.000 13.000 L 20.000 13.000 C 19.448 13.000 19.000 12.552 19.000 12.000 C 19.000 11.448 19.448 11.000 20.000 11.000 ZM 5.636 4.222 L 7.050 5.636 C 7.429 6.028 7.424 6.652 7.038 7.038 C 6.652 7.424 6.028 7.429 5.636 7.050 L 4.222 5.636 C 3.843 5.244 3.848 4.620 4.234 4.234 C 4.620 3.848 5.244 3.843 5.636 4.222M 19.778 4.222 C 20.168 4.612 20.168 5.246 19.778 5.636 L 18.364 7.050 C 17.972 7.429 17.348 7.424 16.962 7.038 C 16.576 6.652 16.571 6.028 16.950 5.636 L 18.364 4.222 C 18.754 3.832 19.388 3.832 19.778 4.222M 12.000 1.000 C 12.552 1.000 13.000 1.448 13.000 2.000 L 13.000 4.000 C 13.000 4.552 12.552 5.000 12.000 5.000 C 11.448 5.000 11.000 4.552 11.000 4.000 L 11.000 2.000 C 11.000 1.448 11.448 1.000 12.000 1.000"),
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
        return _sunHigh!!
    }

private var _sunHigh: ImageVector? = null
