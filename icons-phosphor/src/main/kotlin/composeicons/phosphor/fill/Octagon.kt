package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Octagon: ImageVector
    get() {
        if (_octagon != null) return _octagon!!
        _octagon = phosphorFillIcon(
            name = "Octagon",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M227.31 80.23 175.77 28.69C172.76 25.699 168.693 24.013 164.45 24h-72.9c-4.243 .013-8.31 1.699-11.32 4.69L28.69 80.23C25.699 83.24 24.013 87.307 24 91.55v72.9c.013 4.243 1.699 8.31 4.69 11.32l51.54 51.54c3.01 2.991 7.077 4.677 11.32 4.69h72.9c4.243-.013 8.31-1.699 11.32-4.69l51.54-51.54c2.991-3.01 4.677-7.077 4.69-11.32v-72.9c-.013-4.243-1.699-8.31-4.69-11.32Z"),
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
        return _octagon!!
    }

private var _octagon: ImageVector? = null
