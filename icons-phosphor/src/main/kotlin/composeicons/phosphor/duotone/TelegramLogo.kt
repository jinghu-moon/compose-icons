package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.TelegramLogo: ImageVector
    get() {
        if (_telegramLogo != null) return _telegramLogo!!
        _telegramLogo = phosphorDuotoneIcon(
            name = "TelegramLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M223.41 32.09 80 134.87 21 123.3c-2.714-.55-4.739-2.826-4.97-5.585-.231-2.759 1.386-5.34 3.97-6.335L222.63 32.07c.252-.099 .533-.092 .78 .02ZM80 200c-.003 3.264 1.977 6.203 5.003 7.426 3.026 1.223 6.492 .485 8.757-1.866l30.61-31.76L80 134.87Z"),
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
                pathData = parseSvgPathData("M228.88 26.19c-2.526-2.181-6.052-2.786-9.16-1.57L17.06 103.93c-5.9 2.294-9.573 8.213-9.01 14.518 .563 6.305 5.227 11.479 11.44 12.692L72 141.45v58.55c-.021 6.526 3.942 12.403 10 14.83 6.049 2.47 12.993 .991 17.51-3.73l25.32-26.26L165 220c2.898 2.571 6.636 3.993 10.51 4 1.698-.001 3.385-.268 5-.79 5.371-1.704 9.434-6.132 10.67-11.63L231.77 35c.74-3.245-.372-6.634-2.89-8.81ZM78.15 126.35 28.54 116.62 167.74 62.14ZM88 200v-47.48l24.79 21.74ZM175.53 208 92.85 135.5 211.85 50.21Z"),
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
