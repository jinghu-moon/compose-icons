package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.ColorFilterLine: ImageVector
    get() {
        if (_colorFilterLine != null) return _colorFilterLine!!
        _colorFilterLine = remixIcon(
            name = "ColorFilterLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 12.000 3.000 C 14.209 3.000 16.000 4.791 16.000 7.000 C 16.000 7.544 15.892 8.062 15.696 8.533 C 14.055 8.709 12.504 9.558 11.480 10.967 C 10.221 10.803 9.145 10.054 8.534 8.999 C 8.195 8.411 8.000 7.730 8.000 7.000 C 8.000 4.791 9.791 3.000 12.000 3.000 ZM 17.764 8.672 C 17.917 8.141 18.000 7.580 18.000 7.000 C 18.000 3.686 15.314 1.000 12.000 1.000 C 8.686 1.000 6.000 3.686 6.000 7.000 C 6.000 7.580 6.082 8.141 6.236 8.672 C 5.699 8.805 5.172 9.014 4.670 9.304 C 1.800 10.961 0.817 14.630 2.474 17.500 C 4.131 20.370 7.800 21.353 10.670 19.696 C 11.172 19.406 11.617 19.054 12.000 18.655 C 12.383 19.054 12.828 19.406 13.330 19.696 C 16.200 21.353 19.869 20.370 21.526 17.500 C 23.183 14.630 22.200 10.961 19.330 9.304 C 18.828 9.014 18.301 8.805 17.764 8.672 ZM 13.154 16.934 C 13.823 15.425 13.863 13.657 13.155 12.067 C 13.926 11.058 15.113 10.500 16.332 10.499 C 17.010 10.499 17.698 10.671 18.330 11.036 C 20.243 12.140 20.899 14.587 19.794 16.500 C 18.690 18.413 16.243 19.069 14.330 17.964 C 13.859 17.692 13.465 17.340 13.154 16.934 ZM 11.365 12.967 C 11.853 14.139 11.743 15.446 11.134 16.502 C 10.795 17.090 10.302 17.599 9.670 17.964 C 7.757 19.069 5.310 18.413 4.206 16.500 C 3.101 14.587 3.757 12.141 5.670 11.036 C 6.141 10.764 6.644 10.599 7.150 10.533 C 8.123 11.866 9.634 12.785 11.365 12.967 Z"),
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
        return _colorFilterLine!!
    }

private var _colorFilterLine: ImageVector? = null
