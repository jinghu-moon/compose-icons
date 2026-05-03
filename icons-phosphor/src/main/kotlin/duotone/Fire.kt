package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Fire: ImageVector
    get() {
        if (_fire != null) return _fire!!
        _fire = phosphorDuotoneIcon(
            name = "Fire",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    group(
        groupAlpha = 0.20000000298023224f,
    ) {
        addPath(
            pathData = parseSvgPathData("M 208.000 144.000 C 208.000 188.183 172.183 224.000 128.000 224.000 C 83.817 224.000 48.000 188.183 48.000 144.000 C 48.000 113.430 62.420 85.740 79.000 64.000 L 112.000 96.000 L 138.270 24.000 C 159.860 41.920 208.000 88.150 208.000 144.000 Z"),
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
    addPath(
        pathData = parseSvgPathData("M 183.890 153.340 C 179.641 177.072 161.063 195.646 137.330 199.890 C 136.890 199.960 136.445 199.997 136.000 200.000 C 131.839 199.999 128.374 196.809 128.030 192.662 C 127.685 188.516 130.576 184.798 134.680 184.110 C 151.250 181.320 165.310 167.260 168.120 150.660 C 168.860 146.302 172.992 143.370 177.350 144.110 C 181.708 144.850 184.640 148.982 183.900 153.340 ZM 216.000 144.000 C 216.000 192.601 176.601 232.000 128.000 232.000 C 79.399 232.000 40.000 192.601 40.000 144.000 C 40.000 116.080 51.000 87.530 72.660 59.150 C 74.047 57.332 76.145 56.195 78.425 56.025 C 80.705 55.855 82.949 56.668 84.590 58.260 L 108.710 81.670 L 130.710 21.260 C 131.602 18.815 133.628 16.957 136.140 16.278 C 138.653 15.600 141.339 16.186 143.340 17.850 C 165.210 36.000 216.000 84.550 216.000 144.000 ZM 200.000 144.000 C 200.000 97.910 164.210 58.080 141.790 37.670 L 119.520 98.740 C 118.591 101.289 116.435 103.193 113.791 103.799 C 111.147 104.405 108.376 103.630 106.430 101.740 L 80.060 76.160 C 64.090 99.210 56.000 122.000 56.000 144.000 C 56.000 183.764 88.235 216.000 128.000 216.000 C 167.764 216.000 200.000 183.764 200.000 144.000 Z"),
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
        return _fire!!
    }

private var _fire: ImageVector? = null
