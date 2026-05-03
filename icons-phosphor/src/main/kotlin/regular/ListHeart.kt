package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.ListHeart: ImageVector
    get() {
        if (_listHeart != null) return _listHeart!!
        _listHeart = phosphorRegularIcon(
            name = "ListHeart",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 32.000 64.000 C 32.000 59.582 35.582 56.000 40.000 56.000 L 216.000 56.000 C 220.418 56.000 224.000 59.582 224.000 64.000 C 224.000 68.418 220.418 72.000 216.000 72.000 L 40.000 72.000 C 35.582 72.000 32.000 68.418 32.000 64.000 ZM 40.000 136.000 L 104.000 136.000 C 108.418 136.000 112.000 132.418 112.000 128.000 C 112.000 123.582 108.418 120.000 104.000 120.000 L 40.000 120.000 C 35.582 120.000 32.000 123.582 32.000 128.000 C 32.000 132.418 35.582 136.000 40.000 136.000 ZM 120.000 184.000 L 40.000 184.000 C 35.582 184.000 32.000 187.582 32.000 192.000 C 32.000 196.418 35.582 200.000 40.000 200.000 L 120.000 200.000 C 124.418 200.000 128.000 196.418 128.000 192.000 C 128.000 187.582 124.418 184.000 120.000 184.000 ZM 248.000 144.000 C 248.000 180.520 197.720 206.080 195.580 207.160 C 193.327 208.288 190.673 208.288 188.420 207.160 C 186.280 206.080 136.000 180.520 136.000 144.000 C 136.011 130.696 144.252 118.787 156.698 114.088 C 169.145 109.390 183.200 112.882 192.000 122.860 C 200.800 112.882 214.855 109.390 227.302 114.088 C 239.748 118.787 247.989 130.696 248.000 144.000 ZM 232.000 144.000 C 232.000 135.163 224.837 128.000 216.000 128.000 C 207.163 128.000 200.000 135.163 200.000 144.000 C 200.000 148.418 196.418 152.000 192.000 152.000 C 187.582 152.000 184.000 148.418 184.000 144.000 C 184.000 135.163 176.837 128.000 168.000 128.000 C 159.163 128.000 152.000 135.163 152.000 144.000 C 152.000 164.180 178.210 183.140 192.000 190.930 C 205.790 183.150 232.000 164.190 232.000 144.000 Z"),
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
        return _listHeart!!
    }

private var _listHeart: ImageVector? = null
