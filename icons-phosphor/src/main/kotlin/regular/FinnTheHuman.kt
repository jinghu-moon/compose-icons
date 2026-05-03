package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.FinnTheHuman: ImageVector
    get() {
        if (_finnTheHuman != null) return _finnTheHuman!!
        _finnTheHuman = phosphorRegularIcon(
            name = "FinnTheHuman",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 168.000 104.000 L 88.000 104.000 C 65.909 104.000 48.000 121.909 48.000 144.000 L 48.000 152.000 C 48.000 174.091 65.909 192.000 88.000 192.000 L 168.000 192.000 C 190.091 192.000 208.000 174.091 208.000 152.000 L 208.000 144.000 C 208.000 121.909 190.091 104.000 168.000 104.000 ZM 192.000 152.000 C 192.000 165.255 181.255 176.000 168.000 176.000 L 88.000 176.000 C 74.745 176.000 64.000 165.255 64.000 152.000 L 64.000 144.000 C 64.000 130.745 74.745 120.000 88.000 120.000 L 168.000 120.000 C 181.255 120.000 192.000 130.745 192.000 144.000 ZM 208.000 40.000 C 193.409 40.014 180.668 49.878 177.000 64.000 L 79.000 64.000 C 74.997 48.366 59.979 38.159 43.969 40.192 C 27.959 42.225 15.968 55.861 16.000 72.000 L 16.000 152.000 C 16.044 191.746 48.254 223.956 88.000 224.000 L 168.000 224.000 C 207.746 223.956 239.956 191.746 240.000 152.000 L 240.000 72.000 C 240.000 54.327 225.673 40.000 208.000 40.000 ZM 224.000 152.000 C 223.967 182.914 198.914 207.967 168.000 208.000 L 88.000 208.000 C 57.086 207.967 32.033 182.914 32.000 152.000 L 32.000 72.000 C 32.000 63.163 39.163 56.000 48.000 56.000 C 56.837 56.000 64.000 63.163 64.000 72.000 C 64.000 76.418 67.582 80.000 72.000 80.000 L 184.000 80.000 C 188.418 80.000 192.000 76.418 192.000 72.000 C 192.000 63.163 199.163 56.000 208.000 56.000 C 216.837 56.000 224.000 63.163 224.000 72.000 ZM 104.000 148.000 C 104.000 154.627 98.627 160.000 92.000 160.000 C 85.373 160.000 80.000 154.627 80.000 148.000 C 80.000 141.373 85.373 136.000 92.000 136.000 C 98.627 136.000 104.000 141.373 104.000 148.000 ZM 176.000 148.000 C 176.000 154.627 170.627 160.000 164.000 160.000 C 157.373 160.000 152.000 154.627 152.000 148.000 C 152.000 141.373 157.373 136.000 164.000 136.000 C 170.627 136.000 176.000 141.373 176.000 148.000 Z"),
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
        return _finnTheHuman!!
    }

private var _finnTheHuman: ImageVector? = null
