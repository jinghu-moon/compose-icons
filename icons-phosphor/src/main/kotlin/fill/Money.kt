package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Money: ImageVector
    get() {
        if (_money != null) return _money!!
        _money = phosphorFillIcon(
            name = "Money",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 168.000 128.000 C 168.000 150.091 150.091 168.000 128.000 168.000 C 105.909 168.000 88.000 150.091 88.000 128.000 C 88.000 105.909 105.909 88.000 128.000 88.000 C 150.091 88.000 168.000 105.909 168.000 128.000 ZM 248.000 64.000 L 248.000 192.000 C 248.000 196.418 244.418 200.000 240.000 200.000 L 16.000 200.000 C 11.582 200.000 8.000 196.418 8.000 192.000 L 8.000 64.000 C 8.000 59.582 11.582 56.000 16.000 56.000 L 240.000 56.000 C 244.418 56.000 248.000 59.582 248.000 64.000 ZM 232.000 110.350 C 213.543 104.893 199.107 90.457 193.650 72.000 L 62.350 72.000 C 56.893 90.457 42.457 104.893 24.000 110.350 L 24.000 145.650 C 42.457 151.107 56.893 165.543 62.350 184.000 L 193.650 184.000 C 199.107 165.543 213.543 151.107 232.000 145.650 Z"),
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
        return _money!!
    }

private var _money: ImageVector? = null
