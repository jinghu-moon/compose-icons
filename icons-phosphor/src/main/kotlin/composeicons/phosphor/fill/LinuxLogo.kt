package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.LinuxLogo: ImageVector
    get() {
        if (_linuxLogo != null) return _linuxLogo!!
        _linuxLogo = phosphorFillIcon(
            name = "LinuxLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M161.22 209.74c.84 1.226 .93 2.816 .236 4.13-.695 1.314-2.06 2.134-3.546 2.13h-59.81c-1.486 .004-2.851-.817-3.546-2.13-.695-1.314-.604-2.904 .236-4.13 7.428-11.07 19.884-17.712 33.215-17.712 13.331 0 25.787 6.642 33.215 17.712ZM230.15 213.11c-1.607 1.872-3.963 2.931-6.43 2.89h-39.16c-1.687-.002-3.191-1.062-3.76-2.65-7.913-22.371-29.066-37.327-52.795-37.327-23.729 0-44.882 14.956-52.795 37.327-.569 1.588-2.073 2.648-3.76 2.65h-39.22c-2.472 .041-4.831-1.035-6.42-2.93C23.415 210.149 23.39 205.95 25.75 203c.06-.07 7.64-9.78 15.12-28.72C47.77 156.8 56 127.64 56 88 56 48.235 88.235 16 128 16c39.764 0 72 32.235 72 72 0 39.64 8.23 68.8 15.13 86.28 7.48 18.94 15.06 28.65 15.13 28.74 2.357 2.965 2.311 7.177-.11 10.09ZM88 100c0 6.627 5.373 12 12 12 6.627 0 12-5.373 12-12 0-6.627-5.373-12-12-12-6.627 0-12 5.373-12 12ZM167.16 132.42c-1.975-3.951-6.778-5.553-10.73-3.58L128 143.06 99.58 128.84c-3.954-1.974-8.761-.369-10.735 3.585-1.974 3.954-.369 8.761 3.585 10.735l32 16c2.251 1.124 4.899 1.124 7.15 0l32-16c1.9-.948 3.345-2.613 4.016-4.628 .672-2.015 .515-4.213-.436-6.112ZM168 100c0-6.627-5.373-12-12-12-6.627 0-12 5.373-12 12 0 6.627 5.373 12 12 12 6.627 0 12-5.373 12-12Z"),
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
        return _linuxLogo!!
    }

private var _linuxLogo: ImageVector? = null
