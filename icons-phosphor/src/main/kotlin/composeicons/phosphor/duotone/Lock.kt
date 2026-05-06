package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Lock: ImageVector
    get() {
        if (_lock != null) return _lock!!
        _lock = phosphorDuotoneIcon(
            name = "Lock",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M216 96v112c0 4.418-3.582 8-8 8h-160c-4.418 0-8-3.582-8-8v-112c0-4.418 3.582-8 8-8h160c4.418 0 8 3.582 8 8Z"),
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
                pathData = parseSvgPathData("M208 80h-32v-24C176 29.49 154.51 8 128 8 101.49 8 80 29.49 80 56v24h-32C39.163 80 32 87.163 32 96v112c0 8.837 7.163 16 16 16h160c8.837 0 16-7.163 16-16v-112c0-8.837-7.163-16-16-16ZM96 56C96 38.327 110.327 24 128 24c17.673 0 32 14.327 32 32v24h-64ZM208 208h-160v-112h160v112ZM140 152c0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12 0-6.627 5.373-12 12-12 6.627 0 12 5.373 12 12Z"),
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
        return _lock!!
    }

private var _lock: ImageVector? = null
