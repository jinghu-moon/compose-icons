package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Lock: ImageVector
    get() {
        if (_lock != null) return _lock!!
        _lock = phosphorBoldIcon(
            name = "Lock",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M208 76h-28v-20C180 27.281 156.719 4 128 4 99.281 4 76 27.281 76 56v20h-28C36.954 76 28 84.954 28 96v112c0 11.046 8.954 20 20 20h160c11.046 0 20-8.954 20-20v-112C228 84.954 219.046 76 208 76ZM100 56c0-15.464 12.536-28 28-28 15.464 0 28 12.536 28 28v20h-56ZM204 204h-152v-104h152ZM144 152c0 8.837-7.163 16-16 16-8.837 0-16-7.163-16-16 0-8.837 7.163-16 16-16 8.837 0 16 7.163 16 16Z"),
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
