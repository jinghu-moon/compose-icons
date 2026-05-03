package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.ListHeart: ImageVector
    get() {
        if (_listHeart != null) return _listHeart!!
        _listHeart = phosphorFillIcon(
            name = "ListHeart",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 208.000 32.000 L 48.000 32.000 C 39.163 32.000 32.000 39.163 32.000 48.000 L 32.000 208.000 C 32.000 216.837 39.163 224.000 48.000 224.000 L 208.000 224.000 C 216.837 224.000 224.000 216.837 224.000 208.000 L 224.000 48.000 C 224.000 39.163 216.837 32.000 208.000 32.000 ZM 104.000 184.000 L 64.000 184.000 C 59.582 184.000 56.000 180.418 56.000 176.000 C 56.000 171.582 59.582 168.000 64.000 168.000 L 104.000 168.000 C 108.418 168.000 112.000 171.582 112.000 176.000 C 112.000 180.418 108.418 184.000 104.000 184.000 ZM 56.000 128.000 C 56.000 123.582 59.582 120.000 64.000 120.000 L 96.000 120.000 C 100.418 120.000 104.000 123.582 104.000 128.000 C 104.000 132.418 100.418 136.000 96.000 136.000 L 64.000 136.000 C 59.582 136.000 56.000 132.418 56.000 128.000 ZM 161.790 185.580 C 160.663 186.144 159.337 186.144 158.210 185.580 C 156.650 184.800 120.000 166.170 120.000 140.000 C 120.004 130.407 126.224 121.922 135.371 119.032 C 144.518 116.141 154.484 119.511 160.000 127.360 C 165.516 119.511 175.482 116.141 184.629 119.032 C 193.776 121.922 199.996 130.407 200.000 140.000 C 200.000 166.170 163.350 184.800 161.790 185.580 ZM 192.000 88.000 L 64.000 88.000 C 59.582 88.000 56.000 84.418 56.000 80.000 C 56.000 75.582 59.582 72.000 64.000 72.000 L 192.000 72.000 C 196.418 72.000 200.000 75.582 200.000 80.000 C 200.000 84.418 196.418 88.000 192.000 88.000 Z"),
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
        return _listHeart!!
    }

private var _listHeart: ImageVector? = null
