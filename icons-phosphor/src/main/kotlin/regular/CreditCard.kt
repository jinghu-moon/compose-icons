package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.CreditCard: ImageVector
    get() {
        if (_creditCard != null) return _creditCard!!
        _creditCard = phosphorRegularIcon(
            name = "CreditCard",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 224.000 48.000 L 32.000 48.000 C 23.163 48.000 16.000 55.163 16.000 64.000 L 16.000 192.000 C 16.000 200.837 23.163 208.000 32.000 208.000 L 224.000 208.000 C 232.837 208.000 240.000 200.837 240.000 192.000 L 240.000 64.000 C 240.000 55.163 232.837 48.000 224.000 48.000 ZM 224.000 64.000 L 224.000 88.000 L 32.000 88.000 L 32.000 64.000 ZM 224.000 192.000 L 32.000 192.000 L 32.000 104.000 L 224.000 104.000 L 224.000 192.000 ZM 208.000 168.000 C 208.000 172.418 204.418 176.000 200.000 176.000 L 168.000 176.000 C 163.582 176.000 160.000 172.418 160.000 168.000 C 160.000 163.582 163.582 160.000 168.000 160.000 L 200.000 160.000 C 204.418 160.000 208.000 163.582 208.000 168.000 ZM 144.000 168.000 C 144.000 172.418 140.418 176.000 136.000 176.000 L 120.000 176.000 C 115.582 176.000 112.000 172.418 112.000 168.000 C 112.000 163.582 115.582 160.000 120.000 160.000 L 136.000 160.000 C 140.418 160.000 144.000 163.582 144.000 168.000 Z"),
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
        return _creditCard!!
    }

private var _creditCard: ImageVector? = null
