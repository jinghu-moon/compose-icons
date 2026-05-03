package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.UserCircle: ImageVector
    get() {
        if (_userCircle != null) return _userCircle!!
        _userCircle = phosphorBoldIcon(
            name = "UserCircle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 128.000 20.000 C 68.353 20.000 20.000 68.353 20.000 128.000 C 20.000 187.647 68.353 236.000 128.000 236.000 C 187.647 236.000 236.000 187.647 236.000 128.000 C 235.934 68.381 187.619 20.066 128.000 20.000 ZM 79.570 196.570 C 90.869 181.121 108.860 171.989 128.000 171.989 C 147.140 171.989 165.131 181.121 176.430 196.570 C 147.421 217.143 108.579 217.143 79.570 196.570 ZM 100.000 120.000 C 100.000 104.536 112.536 92.000 128.000 92.000 C 143.464 92.000 156.000 104.536 156.000 120.000 C 156.000 135.464 143.464 148.000 128.000 148.000 C 112.536 148.000 100.000 135.464 100.000 120.000 ZM 194.000 179.940 C 186.222 170.047 176.308 162.041 165.000 156.520 C 185.119 136.146 184.982 103.340 164.692 83.136 C 144.403 62.931 111.597 62.931 91.308 83.136 C 71.018 103.340 70.881 136.146 91.000 156.520 C 79.692 162.041 69.778 170.047 62.000 179.940 C 34.846 145.518 38.733 96.002 70.924 66.238 C 103.116 36.474 152.784 36.474 184.976 66.238 C 217.167 96.002 221.054 145.518 193.900 179.940 Z"),
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
        return _userCircle!!
    }

private var _userCircle: ImageVector? = null
