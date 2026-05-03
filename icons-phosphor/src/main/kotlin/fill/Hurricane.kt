package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Hurricane: ImageVector
    get() {
        if (_hurricane != null) return _hurricane!!
        _hurricane = phosphorFillIcon(
            name = "Hurricane",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 158.320 45.360 L 167.730 10.060 C 168.446 7.370 167.712 4.500 165.792 2.484 C 163.872 0.468 161.042 -0.404 158.320 0.180 C 137.530 5.282 117.718 13.758 99.670 25.270 C 60.630 50.370 40.000 85.890 40.000 128.000 C 40.020 164.909 63.042 197.893 97.680 210.640 L 88.270 245.940 C 87.554 248.630 88.288 251.500 90.208 253.516 C 92.128 255.532 94.958 256.404 97.680 255.820 C 118.470 250.718 138.282 242.242 156.330 230.730 C 195.370 205.630 216.000 170.110 216.000 128.000 C 215.983 91.090 192.959 58.104 158.320 45.360 ZM 128.000 152.000 C 114.745 152.000 104.000 141.255 104.000 128.000 C 104.000 114.745 114.745 104.000 128.000 104.000 C 141.255 104.000 152.000 114.745 152.000 128.000 C 152.000 141.255 141.255 152.000 128.000 152.000 Z"),
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
        return _hurricane!!
    }

private var _hurricane: ImageVector? = null
