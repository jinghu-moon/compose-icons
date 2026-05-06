package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.SplitHorizontal: ImageVector
    get() {
        if (_splitHorizontal != null) return _splitHorizontal!!
        _splitHorizontal = phosphorDuotoneIcon(
            name = "SplitHorizontal",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M232 128l-32 32v-64ZM56 160v-64L24 128Z"),
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
                pathData = parseSvgPathData("M104 40c-4.418 0-8 3.582-8 8v72h-32v-24c.003-3.238-1.947-6.158-4.938-7.397-2.991-1.239-6.434-.554-8.722 1.737l-32 32c-1.502 1.501-2.346 3.537-2.346 5.66 0 2.123 .844 4.159 2.346 5.66l32 32c2.288 2.291 5.731 2.976 8.722 1.737C62.053 166.158 64.003 163.238 64 160v-24h32v72c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8v-160c0-4.418-3.582-8-8-8ZM48 140.69 35.31 128 48 115.31ZM237.66 122.34l-32-32c-2.288-2.291-5.731-2.976-8.722-1.737C193.947 89.842 191.997 92.762 192 96v24h-32v-72c0-4.418-3.582-8-8-8-4.418 0-8 3.582-8 8v160c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8v-72h32v24c-.003 3.238 1.947 6.158 4.938 7.397 2.991 1.239 6.434 .554 8.722-1.737l32-32c1.502-1.501 2.346-3.537 2.346-5.66 0-2.123-.844-4.159-2.346-5.66ZM208 140.69v-25.38L220.69 128Z"),
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
        return _splitHorizontal!!
    }

private var _splitHorizontal: ImageVector? = null
