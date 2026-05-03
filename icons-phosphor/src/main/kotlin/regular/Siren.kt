package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Siren: ImageVector
    get() {
        if (_siren != null) return _siren!!
        _siren = phosphorRegularIcon(
            name = "Siren",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 120.000 16.000 L 120.000 8.000 C 120.000 3.582 123.582 0.000 128.000 0.000 C 132.418 -0.000 136.000 3.582 136.000 8.000 L 136.000 16.000 C 136.000 20.418 132.418 24.000 128.000 24.000 C 123.582 24.000 120.000 20.418 120.000 16.000 ZM 200.000 48.000 C 202.122 48.002 204.158 47.160 205.660 45.660 L 213.660 37.660 C 216.786 34.534 216.786 29.466 213.660 26.340 C 210.534 23.214 205.466 23.214 202.340 26.340 L 194.340 34.340 C 192.049 36.628 191.364 40.071 192.603 43.062 C 193.842 46.053 196.762 48.003 200.000 48.000 ZM 50.340 45.660 C 53.466 48.786 58.534 48.786 61.660 45.660 C 64.786 42.534 64.786 37.466 61.660 34.340 L 53.660 26.340 C 50.534 23.214 45.466 23.214 42.340 26.340 C 39.214 29.466 39.214 34.534 42.340 37.660 ZM 137.340 72.110 C 134.508 71.609 131.625 72.667 129.789 74.880 C 127.953 77.094 127.447 80.122 128.462 82.813 C 129.478 85.503 131.859 87.442 134.700 87.890 C 153.670 91.080 168.000 108.320 168.000 128.000 C 168.000 132.418 171.582 136.000 176.000 136.000 C 180.418 136.000 184.000 132.418 184.000 128.000 C 184.000 100.600 163.930 76.570 137.320 72.110 ZM 232.000 176.000 L 232.000 200.000 C 232.000 208.837 224.837 216.000 216.000 216.000 L 40.000 216.000 C 31.163 216.000 24.000 208.837 24.000 200.000 L 24.000 176.000 C 24.000 167.163 31.163 160.000 40.000 160.000 L 40.000 128.000 C 39.999 104.544 49.363 82.059 66.011 65.537 C 82.659 49.014 105.215 39.821 128.670 40.000 C 176.820 40.360 216.000 80.290 216.000 129.000 L 216.000 160.000 C 224.837 160.000 232.000 167.163 232.000 176.000 ZM 56.000 160.000 L 200.000 160.000 L 200.000 129.000 C 200.000 89.000 167.950 56.290 128.550 56.000 L 128.000 56.000 C 88.235 56.000 56.000 88.235 56.000 128.000 ZM 216.000 200.000 L 216.000 176.000 L 40.000 176.000 L 40.000 200.000 L 216.000 200.000 Z"),
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
        return _siren!!
    }

private var _siren: ImageVector? = null
