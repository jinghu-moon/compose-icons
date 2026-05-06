package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.GlobeStand: ImageVector
    get() {
        if (_globeStand != null) return _globeStand!!
        _globeStand = phosphorBoldIcon(
            name = "GlobeStand",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M136 176c39.764 0 72-32.236 72-72C208 64.235 175.764 32 136 32 96.235 32 64 64.235 64 104c.044 39.746 32.254 71.956 72 72ZM136 56c26.51 0 48 21.49 48 48 0 26.51-21.49 48-48 48C109.49 152 88 130.51 88 104c.028-26.498 21.502-47.972 48-48ZM148 215.35v12.65h20c6.627 0 12 5.373 12 12 0 6.627-5.373 12-12 12h-64c-6.627 0-12-5.373-12-12 0-6.627 5.373-12 12-12h20v-12.64C81.882 210.823 45.927 182.911 31.09 143.232 16.253 103.553 25.072 58.899 53.88 27.84c2.889-3.247 7.309-4.678 11.553-3.741 4.244 .938 7.65 4.097 8.902 8.26 1.253 4.162 .156 8.677-2.866 11.801C39.205 78.839 40.178 132.835 73.671 166.329c33.494 33.494 87.49 34.467 122.169 2.201 3.124-3.022 7.639-4.118 11.801-2.866 4.162 1.253 7.322 4.658 8.26 8.902 .938 4.244-.493 8.664-3.741 11.553C194.497 202.546 171.985 212.802 148 215.35Z"),
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
        return _globeStand!!
    }

private var _globeStand: ImageVector? = null
