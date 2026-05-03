package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Lego: ImageVector
    get() {
        if (_lego != null) return _lego!!
        _lego = phosphorLightIcon(
            name = "Lego",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 242.680 74.630 L 195.850 51.220 C 190.690 41.090 176.780 34.000 160.000 34.000 C 138.690 34.000 122.000 45.420 122.000 60.000 C 122.006 62.583 122.536 65.138 123.560 67.510 L 101.560 78.510 C 94.783 75.468 87.428 73.930 80.000 74.000 C 58.690 74.000 42.000 85.420 42.000 100.000 C 42.006 102.583 42.536 105.138 43.560 107.510 L 13.320 122.630 C 11.285 123.646 9.999 125.725 10.000 128.000 L 10.000 192.000 C 9.999 194.275 11.285 196.354 13.320 197.370 L 77.320 229.370 C 79.007 230.212 80.993 230.212 82.680 229.370 L 242.680 149.370 C 244.715 148.354 246.001 146.275 246.000 144.000 L 246.000 80.000 C 246.001 77.725 244.715 75.646 242.680 74.630 ZM 80.000 153.290 L 29.420 128.000 L 51.190 117.120 C 58.100 122.590 68.360 126.000 80.000 126.000 C 101.310 126.000 118.000 114.580 118.000 100.000 C 117.931 94.958 115.996 90.120 112.570 86.420 L 131.190 77.120 C 138.100 82.590 148.360 86.000 160.000 86.000 C 178.630 86.000 193.740 77.270 197.230 65.330 L 226.580 80.000 ZM 160.000 46.000 C 175.320 46.000 186.000 53.380 186.000 60.000 C 186.000 66.620 175.320 74.000 160.000 74.000 C 144.680 74.000 134.000 66.620 134.000 60.000 C 134.000 53.380 144.680 46.000 160.000 46.000 ZM 80.000 86.000 C 95.320 86.000 106.000 93.380 106.000 100.000 C 106.000 106.620 95.320 114.000 80.000 114.000 C 64.680 114.000 54.000 106.620 54.000 100.000 C 54.000 93.380 64.680 86.000 80.000 86.000 ZM 22.000 137.710 L 74.000 163.710 L 74.000 214.290 L 22.000 188.290 ZM 86.000 214.290 L 86.000 163.710 L 234.000 89.710 L 234.000 140.290 Z"),
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
        return _lego!!
    }

private var _lego: ImageVector? = null
