package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Horse: ImageVector
    get() {
        if (_horse != null) return _horse!!
        _horse = phosphorFillIcon(
            name = "Horse",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M202.05 55C182.559 35.1 155.855 23.921 128 24h-8c-4.418 0-8 3.582-8 8v27.53L11.81 121.19c-1.814 1.117-3.108 2.912-3.594 4.986-.486 2.074-.125 4.257 1.004 6.064l13.78 22 .3 .43c7.118 9.938 19.297 14.924 31.34 12.83 13.93-2.36 38.62-6.54 61.4 3.29L89.44 207.36C82.137 203.889 75.368 199.39 69.34 194c-3.314-2.946-8.389-2.649-11.335 .665-2.946 3.314-2.649 8.389 .665 11.335 19.086 16.918 43.756 26.179 69.26 26h2.17c41.549-.821 78.622-26.298 94.28-64.793C240.039 128.713 231.278 84.592 202.1 55ZM124 112c-6.627 0-12-5.373-12-12 0-6.627 5.373-12 12-12 6.627 0 12 5.373 12 12 0 6.627-5.373 12-12 12Z"),
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
        return _horse!!
    }

private var _horse: ImageVector? = null
