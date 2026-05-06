package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Quotes: ImageVector
    get() {
        if (_quotes != null) return _quotes!!
        _quotes = phosphorBoldIcon(
            name = "Quotes",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M100 52h-60C28.954 52 20 60.954 20 72v64c0 11.046 8.954 20 20 20h56v4c0 15.464-12.536 28-28 28-6.627 0-12 5.373-12 12 0 6.627 5.373 12 12 12 28.705-.033 51.967-23.295 52-52v-88C120 60.954 111.046 52 100 52ZM96 132h-52v-56h52ZM216 52h-60c-11.046 0-20 8.954-20 20v64c0 11.046 8.954 20 20 20h56v4c0 15.464-12.536 28-28 28-6.627 0-12 5.373-12 12 0 6.627 5.373 12 12 12 28.705-.033 51.967-23.295 52-52v-88C236 60.954 227.046 52 216 52ZM212 132h-52v-56h52Z"),
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
        return _quotes!!
    }

private var _quotes: ImageVector? = null
