package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.StripeLogo: ImageVector
    get() {
        if (_stripeLogo != null) return _stripeLogo!!
        _stripeLogo = phosphorDuotoneIcon(
            name = "StripeLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M216 48v160c0 4.418-3.582 8-8 8h-160c-4.418 0-8-3.582-8-8v-160c0-4.418 3.582-8 8-8h160c4.418 0 8 3.582 8 8Z"),
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
                pathData = parseSvgPathData("M168 152c0 17.65-17.94 32-40 32C105.94 184 88 169.65 88 152c0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8 0 8.67 11 16 24 16 13 0 24-7.33 24-16 0-9.48-8.61-13-26.88-18.26C109.37 129.2 89.78 123.55 89.78 104 89.78 85.76 106.21 72 128 72c15.72 0 29.18 7.3 35.12 19 1.395 2.561 1.287 5.678-.284 8.136-1.57 2.457-4.354 3.866-7.264 3.675-2.91-.191-5.486-1.95-6.723-4.591C145.64 91.94 137.65 88 128 88c-12.67 0-22.22 6.88-22.22 16 0 7 9 10.1 23.77 14.36C145.78 123 168 129.45 168 152ZM224 48v160c0 8.837-7.163 16-16 16h-160c-8.837 0-16-7.163-16-16v-160C32 39.163 39.163 32 48 32h160c8.837 0 16 7.163 16 16ZM208 208v-160h-160v160h160Z"),
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
        return _stripeLogo!!
    }

private var _stripeLogo: ImageVector? = null
