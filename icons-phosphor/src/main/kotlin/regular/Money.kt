package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Money: ImageVector
    get() {
        if (_money != null) return _money!!
        _money = phosphorRegularIcon(
            name = "Money",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 128.000 88.000 C 105.909 88.000 88.000 105.909 88.000 128.000 C 88.000 150.091 105.909 168.000 128.000 168.000 C 150.091 168.000 168.000 150.091 168.000 128.000 C 168.000 105.909 150.091 88.000 128.000 88.000 ZM 128.000 152.000 C 114.745 152.000 104.000 141.255 104.000 128.000 C 104.000 114.745 114.745 104.000 128.000 104.000 C 141.255 104.000 152.000 114.745 152.000 128.000 C 152.000 141.255 141.255 152.000 128.000 152.000 ZM 240.000 56.000 L 16.000 56.000 C 11.582 56.000 8.000 59.582 8.000 64.000 L 8.000 192.000 C 8.000 196.418 11.582 200.000 16.000 200.000 L 240.000 200.000 C 244.418 200.000 248.000 196.418 248.000 192.000 L 248.000 64.000 C 248.000 59.582 244.418 56.000 240.000 56.000 ZM 193.650 184.000 L 62.350 184.000 C 56.893 165.543 42.457 151.107 24.000 145.650 L 24.000 110.350 C 42.457 104.893 56.893 90.457 62.350 72.000 L 193.650 72.000 C 199.107 90.457 213.543 104.893 232.000 110.350 L 232.000 145.650 C 213.543 151.107 199.107 165.543 193.650 184.000 ZM 232.000 93.370 C 222.404 89.244 214.756 81.596 210.630 72.000 L 232.000 72.000 ZM 45.370 72.000 C 41.244 81.596 33.596 89.244 24.000 93.370 L 24.000 72.000 ZM 24.000 162.630 C 33.596 166.756 41.244 174.404 45.370 184.000 L 24.000 184.000 ZM 210.630 184.000 C 214.756 174.404 222.404 166.756 232.000 162.630 L 232.000 184.000 Z"),
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
        return _money!!
    }

private var _money: ImageVector? = null
