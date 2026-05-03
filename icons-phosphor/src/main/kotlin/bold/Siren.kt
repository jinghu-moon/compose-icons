package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Siren: ImageVector
    get() {
        if (_siren != null) return _siren!!
        _siren = phosphorBoldIcon(
            name = "Siren",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 116.000 20.000 L 116.000 12.000 C 116.000 5.373 121.373 0.000 128.000 0.000 C 134.627 -0.000 140.000 5.373 140.000 12.000 L 140.000 20.000 C 140.000 26.627 134.627 32.000 128.000 32.000 C 121.373 32.000 116.000 26.627 116.000 20.000 ZM 200.000 56.000 C 203.184 56.003 206.238 54.740 208.490 52.490 L 216.490 44.490 C 221.184 39.796 221.184 32.184 216.490 27.490 C 211.796 22.796 204.184 22.796 199.490 27.490 L 191.490 35.490 C 188.037 38.923 187.001 44.102 188.867 48.599 C 190.733 53.096 195.131 56.020 200.000 56.000 ZM 47.510 52.490 C 52.204 57.184 59.816 57.184 64.510 52.490 C 69.204 47.796 69.204 40.184 64.510 35.490 L 56.510 27.490 C 51.816 22.796 44.204 22.796 39.510 27.490 C 34.816 32.184 34.816 39.796 39.510 44.490 ZM 236.000 176.000 L 236.000 200.000 C 236.000 211.046 227.046 220.000 216.000 220.000 L 40.000 220.000 C 28.954 220.000 20.000 211.046 20.000 200.000 L 20.000 176.000 C 19.998 166.495 26.687 158.301 36.000 156.400 L 36.000 140.000 C 36.000 89.190 77.190 48.000 128.000 48.000 L 128.710 48.000 C 179.000 48.380 220.000 90.100 220.000 141.000 L 220.000 156.400 C 229.313 158.301 236.002 166.495 236.000 176.000 ZM 60.000 140.000 L 60.000 156.000 L 196.000 156.000 L 196.000 141.000 C 196.000 103.230 165.730 72.280 128.520 72.000 L 128.000 72.000 C 90.445 72.000 60.000 102.445 60.000 140.000 ZM 212.000 180.000 L 44.000 180.000 L 44.000 196.000 L 212.000 196.000 ZM 136.400 113.280 C 145.135 116.024 151.976 122.865 154.720 131.600 C 156.708 137.924 163.446 141.438 169.770 139.450 C 176.094 137.462 179.608 130.724 177.620 124.400 C 172.522 108.193 159.827 95.498 143.620 90.400 C 137.296 88.412 130.558 91.926 128.570 98.250 C 126.582 104.574 130.096 111.312 136.420 113.300 Z"),
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
