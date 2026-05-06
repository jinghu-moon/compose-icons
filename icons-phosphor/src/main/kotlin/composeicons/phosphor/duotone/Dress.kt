package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Dress: ImageVector
    get() {
        if (_dress != null) return _dress!!
        _dress = phosphorDuotoneIcon(
            name = "Dress",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M200 224h-144c-2.688-.001-5.196-1.353-6.676-3.597-1.48-2.244-1.733-5.082-.674-7.553L96 112 73.14 76.12c-1.523-2.535-1.523-5.705 0-8.24L96 35.23 103 44c6.072 7.6 15.272 12.025 25 12.025 9.728 0 18.928-4.425 25-12.025l7-8.76 22.86 32.65c1.523 2.535 1.523 5.705 0 8.24L160 112l47.34 100.85c1.058 2.469 .806 5.305-.672 7.549-1.477 2.244-3.982 3.597-6.668 3.601Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.2f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
            addPath(
                pathData = parseSvgPathData("M214.7 209.7c-.031-.086-.067-.169-.11-.25L169.11 112.59 189.61 80.41l.11-.18c3.039-5.066 3.039-11.394 0-16.46-.09-.16-.2-.32-.3-.47L168 32.7v-24.7c0-4.418-3.582-8-8-8-4.418 0-8 3.582-8 8v24.42L146.74 39c-4.555 5.693-11.45 9.006-18.74 9.006-7.29 0-14.185-3.314-18.74-9.006L104 32.42v-24.42C104 3.582 100.418 0 96 0 91.582 0 88 3.582 88 8v24.7L66.58 63.3c-.1 .15-.21 .31-.3 .47-3.039 5.066-3.039 11.394 0 16.46l.11 .18 20.5 32.18L41.41 209.45c-.043 .081-.079 .164-.11 .25-2.117 4.942-1.61 10.617 1.349 15.106 2.959 4.489 7.975 7.192 13.351 7.194h144c5.378 .001 10.397-2.7 13.358-7.19 2.961-4.489 3.469-10.166 1.352-15.11ZM80 72 96.43 48.57l.33 .42c7.591 9.493 19.086 15.019 31.24 15.019 12.154 0 23.649-5.526 31.24-15.019l.33-.42L176 72l-20.38 32h-55.23ZM56 216l45.07-96h53.84L200 216Z"),
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
