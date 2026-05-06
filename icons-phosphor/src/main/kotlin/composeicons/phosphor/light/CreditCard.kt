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
                pathData = parseSvgPathData("M224 50h-192C24.268 50 18 56.268 18 64v128c0 7.732 6.268 14 14 14h192c7.732 0 14-6.268 14-14v-128c0-7.732-6.268-14-14-14ZM32 62h192c1.105 0 2 .895 2 2v26h-196v-26c0-1.105 .895-2 2-2ZM224 194h-192c-1.105 0-2-.895-2-2v-90h196v90c0 1.105-.895 2-2 2ZM206 168c0 3.314-2.686 6-6 6h-32c-3.314 0-6-2.686-6-6 0-3.314 2.686-6 6-6h32c3.314 0 6 2.686 6 6ZM142 168c0 3.314-2.686 6-6 6h-16c-3.314 0-6-2.686-6-6 0-3.314 2.686-6 6-6h16c3.314 0 6 2.686 6 6Z"),
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
