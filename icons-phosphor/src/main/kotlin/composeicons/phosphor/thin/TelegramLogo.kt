package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.TelegramLogo: ImageVector
    get() {
        if (_telegramLogo != null) return _telegramLogo!!
        _telegramLogo = phosphorThinIcon(
            name = "TelegramLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M226.27 29.22c-1.406-1.215-3.37-1.55-5.1-.87L18.51 107.66c-4.244 1.647-6.887 5.904-6.481 10.438 .406 4.535 3.762 8.254 8.231 9.122L76 138.16v61.84c-.001 4.894 2.971 9.299 7.51 11.13 1.428 .573 2.952 .868 4.49 .87 3.253-.007 6.364-1.336 8.62-3.68l28-29 43 37.71c2.18 1.923 4.983 2.989 7.89 3 1.269-.005 2.531-.204 3.74-.59 4.029-1.275 7.076-4.597 8-8.72L227.87 34.12c.415-1.804-.201-3.689-1.6-4.9ZM20 117.38c-.121-.997 .471-1.943 1.42-2.27L196.07 46.76 79.07 130.61 21.81 119.37c-1.001-.147-1.759-.98-1.81-1.99ZM90.87 202.76c-1.131 1.165-2.854 1.531-4.361 .926C85.002 203.08 84.011 201.624 84 200v-56.3L118.58 174ZM179.45 208.9c-.315 1.382-1.337 2.494-2.688 2.923-1.35 .43-2.827 .113-3.882-.833L86.43 135.18 218.13 40.8Z"),
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
        return _telegramLogo!!
    }

private var _telegramLogo: ImageVector? = null
