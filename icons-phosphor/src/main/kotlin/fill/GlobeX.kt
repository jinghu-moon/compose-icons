package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.GlobeX: ImageVector
    get() {
        if (_globeX != null) return _globeX!!
        _globeX = phosphorFillIcon(
            name = "GlobeX",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 128.000 24.000 C 70.562 24.000 24.000 70.562 24.000 128.000 C 24.000 185.438 70.562 232.000 128.000 232.000 C 131.379 231.982 134.382 229.843 135.503 226.655 C 136.625 223.468 135.623 219.920 133.000 217.790 L 133.000 217.790 C 131.880 216.880 112.120 200.470 101.940 168.020 L 127.940 168.020 C 132.358 168.020 135.940 164.438 135.940 160.020 C 135.940 155.602 132.358 152.020 127.940 152.020 L 98.080 152.020 C 95.320 136.139 95.320 119.901 98.080 104.020 L 157.960 104.020 C 159.337 111.939 160.020 119.963 160.000 128.000 C 160.000 132.418 163.582 136.000 168.000 136.000 C 172.418 136.000 176.000 132.418 176.000 128.000 C 176.011 119.964 175.396 111.940 174.160 104.000 L 212.670 104.000 C 214.886 111.807 216.007 119.884 216.000 128.000 C 216.000 132.418 219.582 136.000 224.000 136.000 C 228.418 136.000 232.000 132.418 232.000 128.000 C 231.939 70.588 185.412 24.061 128.000 24.000 ZM 102.000 88.000 C 107.123 71.214 116.016 55.822 128.000 43.000 C 139.979 55.825 148.872 71.216 154.000 88.000 ZM 170.750 88.000 C 166.261 71.529 158.694 56.057 148.450 42.400 C 173.512 48.406 194.699 65.063 206.450 88.000 ZM 221.700 173.660 L 203.310 192.000 L 221.660 210.340 C 224.786 213.466 224.786 218.534 221.660 221.660 C 218.534 224.786 213.466 224.786 210.340 221.660 L 192.000 203.310 L 173.660 221.660 C 170.534 224.786 165.466 224.786 162.340 221.660 C 159.214 218.534 159.214 213.466 162.340 210.340 L 180.690 192.000 L 162.340 173.660 C 159.214 170.534 159.214 165.466 162.340 162.340 C 165.466 159.214 170.534 159.214 173.660 162.340 L 192.000 180.690 L 210.340 162.340 C 213.466 159.214 218.534 159.214 221.660 162.340 C 224.786 165.466 224.786 170.534 221.660 173.660 Z"),
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
        return _globeX!!
    }

private var _globeX: ImageVector? = null
