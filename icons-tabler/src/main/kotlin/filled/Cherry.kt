package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Cherry: ImageVector
    get() {
        if (_cherry != null) return _cherry!!
        _cherry = tablerFilledIcon(
            name = "Cherry",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 16.588 5.191 L 16.646 5.236 L 16.724 5.310 L 16.796 5.394 L 16.809 5.412 C 16.962 5.621 17.027 5.882 16.991 6.139 L 16.969 6.250 L 16.939 6.342 C 15.949 9.067 16.273 11.500 17.618 14.048 C 19.696 14.373 21.167 16.251 20.985 18.346 C 20.803 20.442 19.029 22.038 16.927 21.999 C 14.824 21.961 13.110 20.300 13.005 18.200 L 13.000 18.000 L 13.005 17.800 C 13.083 16.243 14.059 14.872 15.505 14.289 C 14.558 12.259 14.163 10.224 14.453 8.082 C 14.287 8.159 14.121 8.232 13.954 8.300 L 14.048 8.236 C 11.805 9.706 10.496 11.240 10.068 12.806 C 11.800 14.011 12.463 16.257 11.662 18.209 C 10.861 20.161 8.811 21.294 6.732 20.935 C 4.653 20.575 3.103 18.820 3.004 16.712 L 3.000 16.500 L 3.005 16.288 C 3.065 15.010 3.667 13.817 4.659 13.010 C 5.652 12.202 6.941 11.855 8.205 12.055 C 8.537 10.982 9.150 9.959 10.035 8.986 C 8.241 8.890 6.449 8.227 4.680 7.000 L 4.412 6.810 L 4.361 6.770 L 4.315 6.730 L 4.271 6.686 L 4.231 6.640 L 4.191 6.590 L 4.159 6.543 L 4.124 6.483 L 4.071 6.373 L 4.033 6.257 L 4.010 6.140 L 4.005 6.098 L 4.000 5.980 L 4.010 5.862 L 4.033 5.745 L 4.071 5.630 L 4.101 5.564 L 4.124 5.519 L 4.159 5.459 L 4.191 5.413 L 4.231 5.362 L 4.271 5.316 L 4.315 5.272 L 4.361 5.232 L 4.411 5.192 C 8.429 2.270 12.571 2.270 16.588 5.192 Z"),
        pathFillType = PathFillType.NonZero,
        fill = SolidColor(Color(0xFF000000)),
        fillAlpha = 1.0f,
        stroke = null,
        strokeAlpha = 1.0f,
        strokeLineWidth = 0.0f,
        strokeLineCap = StrokeCap.Butt,
        strokeLineJoin = StrokeJoin.Miter,
    )
        }
        return _cherry!!
    }

private var _cherry: ImageVector? = null
