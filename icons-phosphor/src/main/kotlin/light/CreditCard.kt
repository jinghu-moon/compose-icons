package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.CreditCard: ImageVector
    get() {
        if (_creditCard != null) return _creditCard!!
        _creditCard = phosphorLightIcon(
            name = "CreditCard",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 224.000 50.000 L 32.000 50.000 C 24.268 50.000 18.000 56.268 18.000 64.000 L 18.000 192.000 C 18.000 199.732 24.268 206.000 32.000 206.000 L 224.000 206.000 C 231.732 206.000 238.000 199.732 238.000 192.000 L 238.000 64.000 C 238.000 56.268 231.732 50.000 224.000 50.000 ZM 32.000 62.000 L 224.000 62.000 C 225.105 62.000 226.000 62.895 226.000 64.000 L 226.000 90.000 L 30.000 90.000 L 30.000 64.000 C 30.000 62.895 30.895 62.000 32.000 62.000 ZM 224.000 194.000 L 32.000 194.000 C 30.895 194.000 30.000 193.105 30.000 192.000 L 30.000 102.000 L 226.000 102.000 L 226.000 192.000 C 226.000 193.105 225.105 194.000 224.000 194.000 ZM 206.000 168.000 C 206.000 171.314 203.314 174.000 200.000 174.000 L 168.000 174.000 C 164.686 174.000 162.000 171.314 162.000 168.000 C 162.000 164.686 164.686 162.000 168.000 162.000 L 200.000 162.000 C 203.314 162.000 206.000 164.686 206.000 168.000 ZM 142.000 168.000 C 142.000 171.314 139.314 174.000 136.000 174.000 L 120.000 174.000 C 116.686 174.000 114.000 171.314 114.000 168.000 C 114.000 164.686 116.686 162.000 120.000 162.000 L 136.000 162.000 C 139.314 162.000 142.000 164.686 142.000 168.000 Z"),
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
