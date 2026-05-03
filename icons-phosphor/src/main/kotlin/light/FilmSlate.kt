package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.FilmSlate: ImageVector
    get() {
        if (_filmSlate != null) return _filmSlate!!
        _filmSlate = phosphorLightIcon(
            name = "FilmSlate",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 216.000 106.000 L 86.680 106.000 L 209.530 73.570 C 211.077 73.162 212.398 72.153 213.198 70.768 C 213.998 69.382 214.211 67.734 213.790 66.190 L 205.630 36.190 C 203.576 28.845 196.001 24.514 188.630 26.470 L 36.320 66.670 C 32.739 67.600 29.683 69.932 27.840 73.140 C 26.006 76.290 25.516 80.045 26.480 83.560 L 34.000 111.340 C 34.000 111.560 34.000 111.780 34.000 112.000 L 34.000 200.000 C 34.000 207.732 40.268 214.000 48.000 214.000 L 208.000 214.000 C 215.732 214.000 222.000 207.732 222.000 200.000 L 222.000 112.000 C 222.000 108.686 219.314 106.000 216.000 106.000 ZM 125.750 55.480 L 158.750 74.550 L 116.320 85.750 L 83.320 66.680 ZM 191.750 38.070 C 192.742 37.795 193.774 38.351 194.090 39.330 L 200.660 63.510 L 175.260 70.200 L 142.260 51.130 ZM 38.230 79.140 C 38.480 78.706 38.895 78.393 39.380 78.270 L 66.860 71.000 L 99.860 90.080 L 44.660 104.680 L 38.060 80.410 C 37.941 79.981 38.002 79.522 38.230 79.140 ZM 210.000 200.000 C 210.000 201.105 209.105 202.000 208.000 202.000 L 48.000 202.000 C 46.895 202.000 46.000 201.105 46.000 200.000 L 46.000 118.000 L 210.000 118.000 Z"),
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
        return _filmSlate!!
    }

private var _filmSlate: ImageVector? = null
