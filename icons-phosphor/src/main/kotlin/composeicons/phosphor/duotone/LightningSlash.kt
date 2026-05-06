package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.LightningSlash: ImageVector
    get() {
        if (_lightningSlash != null) return _lightningSlash!!
        _lightningSlash = phosphorDuotoneIcon(
            name = "LightningSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M96 240l16-80L48 136 160 16 144 96l64 24Z"),
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
                pathData = parseSvgPathData("M53.92 34.62C52.008 32.465 49.085 31.504 46.267 32.105c-2.818 .601-5.095 2.67-5.961 5.418-.867 2.748-.189 5.749 1.774 7.858L81.33 88.56l-39.18 42c-1.848 1.947-2.596 4.691-1.992 7.306 .604 2.615 2.478 4.754 4.992 5.694l57.63 21.61L88.16 238.43c-.682 3.5 1.035 7.029 4.21 8.653 3.175 1.624 7.041 .949 9.48-1.653l61.86-66.28 38.37 42.2c1.912 2.155 4.835 3.116 7.653 2.515 2.818-.601 5.095-2.67 5.961-5.418 .867-2.748 .189-5.749-1.774-7.858ZM109.37 214l10.47-52.38c.774-3.836-1.342-7.67-5-9.06L62 132.71 92.12 100.44l60.78 66.86ZM108.66 71c-1.552-1.448-2.465-3.453-2.538-5.574-.073-2.121 .7-4.185 2.148-5.736L154.15 10.53c2.438-2.602 6.305-3.276 9.48-1.653 3.175 1.623 4.892 5.153 4.21 8.653L153.18 90.9l57.63 21.61c2.495 .947 4.354 3.075 4.956 5.674 .602 2.6-.131 5.328-1.956 7.276l-22.3 23.89c-3.032 3.137-8.018 3.266-11.208 .291-3.191-2.975-3.409-7.958-.492-11.201L194 123.29 141.2 103.49c-3.658-1.39-5.774-5.224-5-9.06L146.67 42.05 120 70.62c-1.45 1.56-3.462 2.477-5.591 2.548-2.129 .071-4.198-.709-5.749-2.168Z"),
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
