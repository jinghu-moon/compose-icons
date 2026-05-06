package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.TelegramLogo: ImageVector
    get() {
        if (_telegramLogo != null) return _telegramLogo!!
        _telegramLogo = phosphorLightIcon(
            name = "TelegramLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M227.57 27.7c-1.966-1.698-4.711-2.168-7.13-1.22L17.78 105.79c-5.063 1.981-8.211 7.067-7.725 12.483 .486 5.415 4.489 9.86 9.825 10.907L74 139.81v60.19c.002 5.708 3.47 10.844 8.764 12.978 5.294 2.135 11.354 .842 15.316-3.268l26.64-27.63 41.58 36.45c2.539 2.246 5.81 3.487 9.2 3.49 1.48-.003 2.951-.236 4.36-.69 4.701-1.487 8.257-5.36 9.34-10.17L229.82 34.57c.582-2.53-.284-5.174-2.25-6.87ZM22.05 117.37h0c-.038-.103-.038-.217 0-.32 .045-.035 .096-.062 .15-.08L181.91 54.45 78.61 128.45 22.2 117.41ZM89.44 201.37c-.564 .585-1.425 .771-2.18 .47C86.505 201.54 86.007 200.812 86 200v-51.89l29.69 26ZM177.51 208.45c-.15 .689-.664 1.241-1.34 1.44-.69 .242-1.457 .089-2-.4L89.64 135.34 215 45.5Z"),
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
