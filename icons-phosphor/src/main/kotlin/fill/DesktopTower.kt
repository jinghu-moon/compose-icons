package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.DesktopTower: ImageVector
    get() {
        if (_desktopTower != null) return _desktopTower!!
        _desktopTower = phosphorFillIcon(
            name = "DesktopTower",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 120.000 76.000 L 120.000 188.000 C 120.000 190.209 118.209 192.000 116.000 192.000 L 96.000 192.000 L 96.000 208.000 L 111.730 208.000 C 116.011 207.947 119.609 211.205 119.980 215.470 C 120.127 217.682 119.349 219.856 117.833 221.473 C 116.316 223.090 114.197 224.005 111.980 224.000 L 64.270 224.000 C 59.981 224.063 56.372 220.803 56.000 216.530 C 55.853 214.318 56.631 212.144 58.147 210.527 C 59.664 208.910 61.783 207.995 64.000 208.000 L 80.000 208.000 L 80.000 192.000 L 32.000 192.000 C 18.745 192.000 8.000 181.255 8.000 168.000 L 8.000 96.000 C 8.000 82.745 18.745 72.000 32.000 72.000 L 116.000 72.000 C 118.209 72.000 120.000 73.791 120.000 76.000 ZM 248.000 48.000 L 248.000 208.000 C 248.000 216.837 240.837 224.000 232.000 224.000 L 152.000 224.000 C 143.163 224.000 136.000 216.837 136.000 208.000 L 136.000 48.000 C 136.000 39.163 143.163 32.000 152.000 32.000 L 232.000 32.000 C 240.837 32.000 248.000 39.163 248.000 48.000 ZM 203.900 181.570 C 204.572 176.474 201.923 171.516 197.314 169.241 C 192.705 166.966 187.158 167.879 183.522 171.512 C 179.885 175.145 178.967 180.691 181.237 185.302 C 183.508 189.914 188.463 192.567 193.560 191.900 C 198.948 191.195 203.190 186.957 203.900 181.570 ZM 224.000 103.470 C 223.628 99.197 220.019 95.937 215.730 96.000 L 168.270 96.000 C 163.989 95.947 160.391 99.205 160.020 103.470 C 159.873 105.682 160.651 107.856 162.167 109.473 C 163.684 111.090 165.803 112.005 168.020 112.000 L 216.020 112.000 C 218.233 111.999 220.348 111.082 221.860 109.465 C 223.372 107.849 224.147 105.678 224.000 103.470 ZM 224.000 71.470 C 223.628 67.197 220.019 63.937 215.730 64.000 L 168.270 64.000 C 163.981 63.937 160.372 67.197 160.000 71.470 C 159.853 73.682 160.631 75.856 162.147 77.473 C 163.664 79.090 165.783 80.005 168.000 80.000 L 216.000 80.000 C 218.217 80.005 220.336 79.090 221.853 77.473 C 223.369 75.856 224.147 73.682 224.000 71.470 Z"),
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
        return _desktopTower!!
    }

private var _desktopTower: ImageVector? = null
