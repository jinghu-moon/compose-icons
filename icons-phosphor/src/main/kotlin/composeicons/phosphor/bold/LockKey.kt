package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.LockKey: ImageVector
    get() {
        if (_lockKey != null) return _lockKey!!
        _lockKey = phosphorBoldIcon(
            name = "LockKey",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M208 76h-28v-20C180 27.281 156.719 4 128 4 99.281 4 76 27.281 76 56v20h-28C36.954 76 28 84.954 28 96v112c0 11.046 8.954 20 20 20h160c11.046 0 20-8.954 20-20v-112C228 84.954 219.046 76 208 76ZM100 56c0-15.464 12.536-28 28-28 15.464 0 28 12.536 28 28v20h-56ZM204 204h-152v-104h152ZM128 112c-15.312 .006-28.474 10.857-31.399 25.887-2.925 15.03 5.207 30.025 19.399 35.773v6.34c0 6.627 5.373 12 12 12 6.627 0 12-5.373 12-12v-6.34c14.192-5.748 22.324-20.743 19.399-35.773C156.474 122.857 143.312 112.006 128 112ZM128 136c4.418 0 8 3.582 8 8 0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8Z"),
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
        return _lockKey!!
    }

private var _lockKey: ImageVector? = null
