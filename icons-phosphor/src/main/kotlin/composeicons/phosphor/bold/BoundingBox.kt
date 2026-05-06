package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.BoundingBox: ImageVector
    get() {
        if (_boundingBox != null) return _boundingBox!!
        _boundingBox = phosphorBoldIcon(
            name = "BoundingBox",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M208 100c11.046 0 20-8.954 20-20v-32C228 36.954 219.046 28 208 28h-32c-11.046 0-20 8.954-20 20v4h-56v-4C100 36.954 91.046 28 80 28h-32C36.954 28 28 36.954 28 48v32c0 11.046 8.954 20 20 20h4v56h-4c-11.046 0-20 8.954-20 20v32c0 11.046 8.954 20 20 20h32c11.046 0 20-8.954 20-20v-4h56v4c0 11.046 8.954 20 20 20h32c11.046 0 20-8.954 20-20v-32c0-11.046-8.954-20-20-20h-4v-56ZM180 52h24v24h-24ZM52 52h24v24h-24ZM76 204h-24v-24h24ZM204 204h-24v-24h24ZM180 156h-4c-11.046 0-20 8.954-20 20v4h-56v-4c0-11.046-8.954-20-20-20h-4v-56h4c11.046 0 20-8.954 20-20v-4h56v4c0 11.046 8.954 20 20 20h4Z"),
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
        return _boundingBox!!
    }

private var _boundingBox: ImageVector? = null
