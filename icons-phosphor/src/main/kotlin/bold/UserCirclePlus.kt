package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.UserCirclePlus: ImageVector
    get() {
        if (_userCirclePlus != null) return _userCirclePlus!!
        _userCirclePlus = phosphorBoldIcon(
            name = "UserCirclePlus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 164.000 56.000 C 164.000 49.373 169.373 44.000 176.000 44.000 L 188.000 44.000 L 188.000 32.000 C 188.000 25.373 193.373 20.000 200.000 20.000 C 206.627 20.000 212.000 25.373 212.000 32.000 L 212.000 44.000 L 224.000 44.000 C 230.627 44.000 236.000 49.373 236.000 56.000 C 236.000 62.627 230.627 68.000 224.000 68.000 L 212.000 68.000 L 212.000 80.000 C 212.000 86.627 206.627 92.000 200.000 92.000 C 193.373 92.000 188.000 86.627 188.000 80.000 L 188.000 68.000 L 176.000 68.000 C 169.373 68.000 164.000 62.627 164.000 56.000 ZM 234.510 110.000 C 242.286 156.275 219.259 202.269 177.550 223.768 C 135.842 245.268 85.019 237.341 51.839 204.161 C 18.659 170.981 10.732 120.158 32.232 78.450 C 53.731 36.741 99.725 13.714 146.000 21.490 C 152.536 22.595 156.940 28.789 155.835 35.325 C 154.730 41.861 148.536 46.265 142.000 45.160 C 137.373 44.388 132.691 44.000 128.000 44.000 C 95.824 43.978 66.466 62.352 52.422 91.301 C 38.377 120.251 42.117 154.681 62.050 179.940 C 69.828 170.047 79.742 162.041 91.050 156.520 C 70.931 136.146 71.068 103.340 91.358 83.136 C 111.647 62.931 144.453 62.931 164.742 83.136 C 185.032 103.340 185.169 136.146 165.050 156.520 C 176.361 162.038 186.275 170.044 194.050 179.940 C 205.721 165.147 212.047 146.842 212.000 128.000 C 211.999 123.309 211.611 118.627 210.840 114.000 C 209.735 107.464 214.139 101.270 220.675 100.165 C 227.211 99.060 233.405 103.464 234.510 110.000 ZM 128.000 148.000 C 143.464 148.000 156.000 135.464 156.000 120.000 C 156.000 104.536 143.464 92.000 128.000 92.000 C 112.536 92.000 100.000 104.536 100.000 120.000 C 100.000 135.464 112.536 148.000 128.000 148.000 ZM 128.000 212.000 C 145.354 212.012 162.281 206.619 176.430 196.570 C 165.131 181.121 147.140 171.989 128.000 171.989 C 108.860 171.989 90.869 181.121 79.570 196.570 C 93.718 206.619 110.646 212.012 128.000 212.000 Z"),
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
        return _userCirclePlus!!
    }

private var _userCirclePlus: ImageVector? = null
