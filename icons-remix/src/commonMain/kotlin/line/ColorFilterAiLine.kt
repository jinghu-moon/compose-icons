package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.ColorFilterAiLine: ImageVector
    get() {
        if (_colorFilterAiLine != null) return _colorFilterAiLine!!
        _colorFilterAiLine = remixIcon(
            name = "ColorFilterAiLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 6.007 7.297 C 6.002 7.199 6.000 7.100 6.000 7.000 C 6.000 3.686 8.686 1.000 12.000 1.000 C 13.350 1.000 14.598 1.447 15.601 2.200 L 14.399 3.799 C 13.731 3.297 12.902 3.000 12.000 3.000 C 11.724 3.000 11.454 3.028 11.194 3.081 C 9.371 3.454 8.000 5.067 8.000 7.000 C 8.000 9.033 9.517 10.712 11.481 10.967 C 12.504 9.558 14.055 8.709 15.696 8.533 C 16.380 8.460 17.079 8.504 17.764 8.672 C 18.301 8.805 18.828 9.014 19.330 9.304 C 22.200 10.961 23.183 14.630 21.526 17.500 C 19.869 20.370 16.200 21.353 13.330 19.696 C 12.828 19.406 12.383 19.054 12.000 18.655 C 11.617 19.054 11.172 19.406 10.670 19.696 C 7.800 21.353 4.131 20.370 2.474 17.500 C 0.817 14.630 1.800 10.961 4.670 9.304 C 5.172 9.014 5.699 8.805 6.236 8.673 C 6.113 8.246 6.035 7.801 6.010 7.341 L 6.007 7.297 ZM 7.150 10.533 C 6.644 10.599 6.141 10.764 5.670 11.036 C 3.757 12.141 3.101 14.587 4.206 16.500 C 5.310 18.413 7.757 19.069 9.670 17.964 C 10.302 17.599 10.795 17.090 11.134 16.502 C 11.743 15.446 11.853 14.139 11.365 12.967 C 10.981 12.926 10.607 12.850 10.248 12.740 C 10.203 12.726 10.158 12.712 10.113 12.697 C 8.912 12.300 7.880 11.533 7.150 10.533 ZM 13.154 16.934 C 13.465 17.340 13.859 17.692 14.330 17.964 C 16.243 19.069 18.690 18.413 19.794 16.500 C 20.294 15.635 20.433 14.661 20.259 13.751 C 20.049 12.649 19.378 11.641 18.330 11.036 C 17.698 10.671 17.010 10.499 16.332 10.499 C 15.113 10.500 13.926 11.058 13.155 12.067 C 13.266 12.316 13.359 12.571 13.434 12.828 C 13.477 12.979 13.515 13.130 13.547 13.283 C 13.560 13.348 13.573 13.413 13.584 13.479 C 13.787 14.657 13.630 15.861 13.154 16.934 ZM 18.577 7.000 C 18.866 7.334 19.106 7.714 19.287 8.128 L 19.533 8.694 C 19.714 9.108 20.286 9.108 20.467 8.694 L 20.713 8.128 C 21.153 7.119 21.944 6.316 22.932 5.877 L 23.670 5.539 C 24.081 5.357 24.081 4.759 23.670 4.576 L 22.975 4.257 C 21.962 3.807 21.156 2.974 20.724 1.931 L 20.471 1.320 C 20.294 0.893 19.706 0.893 19.529 1.320 L 19.276 1.931 C 19.197 2.123 19.104 2.308 19.000 2.485 C 18.540 3.268 17.851 3.890 17.025 4.257 L 16.308 4.576 C 15.897 4.759 15.897 5.357 16.308 5.539 L 17.068 5.877 C 17.650 6.136 18.163 6.521 18.577 7.000 Z"),
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
        return _colorFilterAiLine!!
    }

private var _colorFilterAiLine: ImageVector? = null
