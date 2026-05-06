package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Key: ImageVector
    get() {
        if (_key != null) return _key!!
        _key = phosphorLightIcon(
            name = "Key",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M215.15 40.85C189.485 15.164 149.489 10.585 118.683 29.807 87.876 49.029 74.409 86.966 86.2 121.31L30.1 177.41c-2.631 2.622-4.107 6.186-4.1 9.9v28.69c0 7.732 6.268 14 14 14h32c3.314 0 6-2.686 6-6v-18h18c3.314 0 6-2.686 6-6v-18h18c1.591-.001 3.116-.634 4.24-1.76l10.45-10.44c8.145 2.795 16.699 4.214 25.31 4.2h.1c31.527-.044 59.928-19.063 71.974-48.198C244.119 96.667 237.441 63.145 215.15 40.85ZM226 98.16c-1.12 35.16-30.67 63.8-65.88 63.84-8.393 .018-16.712-1.567-24.51-4.67-2.262-.985-4.896-.485-6.64 1.26L117.51 170h-21.51c-3.314 0-6 2.686-6 6v18h-18c-3.314 0-6 2.686-6 6v18h-26c-1.105 0-2-.895-2-2v-28.69c-0-.528 .208-1.035 .58-1.41L97.41 127.07c1.745-1.744 2.245-4.378 1.26-6.64C95.56 112.634 93.975 104.314 94 95.92 94 60.71 122.68 31.16 157.83 30c18.258-.611 35.953 6.374 48.872 19.291C219.621 62.208 226.608 79.901 226 98.16ZM190 76c0 5.523-4.477 10-10 10-5.523 0-10-4.477-10-10 0-5.523 4.477-10 10-10 5.523 0 10 4.477 10 10Z"),
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
        return _key!!
    }

private var _key: ImageVector? = null
