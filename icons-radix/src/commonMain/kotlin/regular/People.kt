package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.People: ImageVector
    get() {
        if (_people != null) return _people!!
        _people = radixIcon(
            name = "People",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15.0f, height = 15.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 5.000 8.900 C 6.439 8.900 7.680 9.152 8.575 9.755 C 9.502 10.380 10.000 11.343 10.000 12.601 C 10.000 12.876 9.776 13.100 9.500 13.101 C 9.224 13.100 9.000 12.876 9.000 12.601 C 9.000 11.643 8.642 11.005 8.017 10.584 C 7.359 10.141 6.350 9.900 5.000 9.900 C 3.650 9.900 2.641 10.141 1.983 10.584 C 1.358 11.005 1.000 11.643 1.000 12.601 C 1.000 12.876 0.776 13.100 0.500 13.101 C 0.224 13.100 0.000 12.876 0.000 12.601 C 0.000 11.343 0.497 10.380 1.424 9.755 C 2.319 9.152 3.561 8.900 5.000 8.900 ZM 9.975 8.900 C 11.414 8.900 12.655 9.152 13.550 9.755 C 14.477 10.380 14.975 11.343 14.975 12.601 C 14.974 12.876 14.750 13.101 14.475 13.101 C 14.199 13.100 13.975 12.876 13.975 12.601 C 13.975 11.643 13.616 11.005 12.991 10.584 C 12.473 10.235 11.738 10.014 10.789 9.935 C 10.556 9.554 10.267 9.207 9.920 8.901 C 9.938 8.901 9.956 8.900 9.975 8.900 ZM 5.001 1.850 C 6.740 1.850 8.150 3.261 8.150 5.000 C 8.150 6.739 6.740 8.149 5.001 8.149 C 3.261 8.149 1.851 6.740 1.851 5.000 C 1.851 3.260 3.261 1.850 5.001 1.850 ZM 9.976 1.850 C 11.715 1.850 13.125 3.261 13.125 5.000 C 13.125 6.739 11.715 8.149 9.976 8.149 C 9.452 8.149 8.960 8.020 8.525 7.794 C 8.733 7.532 8.914 7.247 9.060 6.942 C 9.338 7.074 9.648 7.149 9.976 7.149 C 11.163 7.149 12.125 6.187 12.125 5.000 C 12.125 3.813 11.163 2.850 9.976 2.850 C 9.648 2.850 9.338 2.924 9.060 3.056 C 8.913 2.751 8.733 2.466 8.525 2.204 C 8.960 1.978 9.452 1.850 9.976 1.850 ZM 5.001 2.850 C 3.814 2.850 2.851 3.813 2.851 5.000 C 2.851 6.187 3.814 7.149 5.001 7.149 C 6.188 7.149 7.150 6.187 7.150 5.000 C 7.150 3.813 6.188 2.850 5.001 2.850 Z"),
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
        return _people!!
    }

private var _people: ImageVector? = null
