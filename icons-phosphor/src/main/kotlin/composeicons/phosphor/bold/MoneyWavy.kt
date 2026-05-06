package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.MoneyWavy: ImageVector
    get() {
        if (_moneyWavy != null) return _moneyWavy!!
        _moneyWavy = phosphorBoldIcon(
            name = "MoneyWavy",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M246.36 56.55c-3.513-2.194-7.91-2.421-11.63-.6-41.48 20.29-71.4 10.71-103.07 .56C98.48 45.89 60.88 33.85 10.73 58.37 6.609 60.385 3.997 64.573 4 69.16v120.1c-.003 4.141 2.129 7.992 5.642 10.186 3.512 2.194 7.908 2.423 11.628 .604 41.48-20.29 71.4-10.71 103.07-.56 18.83 6 39.08 12.51 62.24 12.51 17.66 0 37-3.77 58.69-14.37 4.121-2.015 6.733-6.203 6.73-10.79v-120.1c.005-4.142-2.127-7.994-5.64-10.19ZM228 179.12c-38 16.16-66.41 7.07-96.34-2.51-18.83-6-39.08-12.52-62.24-12.52-14.112 .026-28.117 2.443-41.42 7.15v-94.36c38-16.16 66.41-7.08 96.34 2.51 29.26 9.37 61.95 19.84 103.66 5.37ZM128 96c-17.673 0-32 14.327-32 32 0 17.673 14.327 32 32 32 17.673 0 32-14.327 32-32C159.967 110.341 145.659 96.033 128 96ZM128 136c-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8 0 4.418-3.582 8-8 8ZM64 100v40c0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12v-40C40 93.373 45.373 88 52 88c6.627 0 12 5.373 12 12ZM192 156v-40c0-6.627 5.373-12 12-12 6.627 0 12 5.373 12 12v40c0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12Z"),
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
        return _moneyWavy!!
    }

private var _moneyWavy: ImageVector? = null
