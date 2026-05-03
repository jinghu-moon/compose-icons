package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Feather: ImageVector
    get() {
        if (_feather != null) return _feather!!
        _feather = phosphorRegularIcon(
            name = "Feather",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 221.280 34.750 C 196.289 9.770 155.781 9.770 130.790 34.750 L 60.690 104.000 C 57.680 106.993 55.991 111.065 56.000 115.310 L 56.000 188.690 L 26.340 218.340 C 23.214 221.466 23.214 226.534 26.340 229.660 C 29.466 232.786 34.534 232.786 37.660 229.660 L 67.320 200.000 L 140.700 200.000 C 144.940 200.007 149.007 198.322 152.000 195.320 L 152.000 195.320 L 221.230 125.320 C 233.257 113.322 240.021 97.034 240.030 80.045 C 240.040 63.057 233.294 46.761 221.280 34.750 ZM 142.070 46.060 C 160.446 27.676 190.116 27.260 209.001 45.120 C 227.886 62.981 229.122 92.629 211.790 112.000 L 155.330 112.000 L 189.680 77.660 C 192.806 74.534 192.806 69.466 189.680 66.340 C 186.554 63.214 181.486 63.214 178.360 66.340 L 120.000 124.690 L 120.000 67.870 ZM 72.000 115.350 L 104.000 83.680 L 104.000 140.680 L 72.000 172.680 ZM 140.700 184.000 L 83.320 184.000 L 139.320 128.000 L 196.060 128.000 Z"),
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
        return _feather!!
    }

private var _feather: ImageVector? = null
