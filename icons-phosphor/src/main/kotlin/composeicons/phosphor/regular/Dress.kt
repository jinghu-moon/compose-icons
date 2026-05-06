package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Dress: ImageVector
    get() {
        if (_dress != null) return _dress!!
        _dress = phosphorRegularIcon(
            name = "Dress",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M214.7 209.7c-.031-.086-.067-.169-.11-.25L169.11 112.59 189.61 80.41c.04-.058 .077-.118 .11-.18 3.039-5.066 3.039-11.394 0-16.46-.09-.16-.2-.32-.3-.47L168 32.7v-24.7c0-4.418-3.582-8-8-8-4.418 0-8 3.582-8 8v24.42L146.74 39c-4.555 5.693-11.45 9.006-18.74 9.006-7.29 0-14.185-3.314-18.74-9.006L104 32.42v-24.42C104 3.582 100.418 0 96 0 91.582 0 88 3.582 88 8v24.7L66.58 63.3c-.1 .15-.21 .31-.3 .47-3.039 5.066-3.039 11.394 0 16.46 .033 .062 .07 .122 .11 .18l20.5 32.18L41.41 209.45c-.043 .081-.079 .164-.11 .25-2.117 4.942-1.61 10.617 1.349 15.106 2.959 4.489 7.975 7.192 13.351 7.194h144c5.378 .001 10.397-2.7 13.358-7.19 2.961-4.489 3.469-10.166 1.352-15.11ZM80 72 96.43 48.57l.33 .42c7.591 9.493 19.086 15.019 31.24 15.019 12.154 0 23.649-5.526 31.24-15.019l.33-.42L176 72l-20.38 32h-55.23ZM56 216l45.07-96h53.84L200 216Z"),
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
        return _dress!!
    }

private var _dress: ImageVector? = null
