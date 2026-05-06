package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.LightningSlash: ImageVector
    get() {
        if (_lightningSlash != null) return _lightningSlash!!
        _lightningSlash = phosphorLightIcon(
            name = "LightningSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M52.44 36c-2.277-2.113-5.79-2.139-8.098-.06-2.308 2.079-2.647 5.576-.782 8.06L84.05 88.58 43.61 131.91c-1.366 1.465-1.911 3.514-1.453 5.464 .458 1.95 1.858 3.542 3.733 4.246l59.23 22.21-15 75c-.529 2.631 .753 5.293 3.14 6.52 .85 .428 1.788 .651 2.74 .65 1.665 0 3.255-.692 4.39-1.91l63.34-67.87L203.56 220c2.231 2.452 6.028 2.631 8.48 .4 2.452-2.231 2.631-6.028 .4-8.48ZM106 220.46l11.85-59.28c.581-2.884-1.016-5.764-3.77-6.8L58.48 133.53l33.64-36 63.48 69.83ZM110 69.55c-2.422-2.262-2.551-6.058-.29-8.48L155.59 11.91c1.83-1.961 4.739-2.469 7.126-1.244 2.386 1.225 3.67 3.884 3.144 6.514l-15 75 59.23 22.21c1.875 .704 3.276 2.296 3.733 4.246 .458 1.95-.087 3.999-1.453 5.464L190.08 148c-1.458 1.589-3.656 2.273-5.758 1.792-2.102-.48-3.784-2.052-4.407-4.116-.623-2.064-.09-4.304 1.395-5.867l16.18-17.33L141.89 101.63c-2.754-1.036-4.351-3.916-3.77-6.8L150 35.54 118.5 69.25c-1.085 1.17-2.592 1.86-4.188 1.916-1.595 .056-3.147-.525-4.312-1.616Z"),
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
        return _lightningSlash!!
    }

private var _lightningSlash: ImageVector? = null
