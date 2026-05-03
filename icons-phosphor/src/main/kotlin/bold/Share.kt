package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Share: ImageVector
    get() {
        if (_share != null) return _share!!
        _share = phosphorBoldIcon(
            name = "Share",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 232.490 112.490 L 184.490 160.490 C 179.796 165.184 172.184 165.184 167.490 160.490 C 162.796 155.796 162.796 148.184 167.490 143.490 L 195.000 116.000 L 165.000 116.000 C 126.686 115.988 93.219 141.903 83.640 179.000 C 81.983 185.418 75.438 189.277 69.020 187.620 C 62.602 185.963 58.743 179.418 60.400 173.000 C 72.696 125.293 115.734 91.965 165.000 92.000 L 195.000 92.000 L 167.510 64.480 C 162.816 59.786 162.816 52.174 167.510 47.480 C 172.204 42.786 179.816 42.786 184.510 47.480 L 232.510 95.480 C 234.770 97.735 236.038 100.797 236.034 103.989 C 236.031 107.181 234.755 110.241 232.490 112.490 ZM 192.000 204.000 L 44.000 204.000 L 44.000 88.000 C 44.000 81.373 38.627 76.000 32.000 76.000 C 25.373 76.000 20.000 81.373 20.000 88.000 L 20.000 216.000 C 20.000 222.627 25.373 228.000 32.000 228.000 L 192.000 228.000 C 198.627 228.000 204.000 222.627 204.000 216.000 C 204.000 209.373 198.627 204.000 192.000 204.000 Z"),
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
        return _share!!
    }

private var _share: ImageVector? = null
