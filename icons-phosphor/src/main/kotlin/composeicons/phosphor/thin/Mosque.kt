package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Mosque: ImageVector
    get() {
        if (_mosque != null) return _mosque!!
        _mosque = phosphorThinIcon(
            name = "Mosque",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M224 132c-4.328-.007-8.541 1.398-12 4v-8C212 88.37 183.18 69.18 160 53.77 145 43.77 132 35.11 132 24c0-2.209-1.791-4-4-4-2.209 0-4 1.791-4 4 0 11.11-13 19.76-28 29.77C72.82 69.18 44 88.37 44 128v8c-6.06-4.545-14.169-5.276-20.944-1.889C16.28 137.499 12 144.425 12 152v56c0 2.209 1.791 4 4 4h64c2.209 0 4-1.791 4-4v-32c0-6.627 5.373-12 12-12 6.627 0 12 5.373 12 12v32c0 2.209 1.791 4 4 4h32c2.209 0 4-1.791 4-4v-32c0-6.627 5.373-12 12-12 6.627 0 12 5.373 12 12v32c0 2.209 1.791 4 4 4h64c2.209 0 4-1.791 4-4v-56c0-11.046-8.954-20-20-20ZM100.41 60.43C112 52.71 122.51 45.71 128 37.14c5.49 8.57 16 15.57 27.59 23.29C177.41 75 202 91.34 203.87 124h-151.74C54 91.34 78.59 75 100.41 60.43ZM20 152c0-6.627 5.373-12 12-12 6.627 0 12 5.373 12 12v52h-24ZM160 156c-11.046 0-20 8.954-20 20v28h-24v-28c0-11.046-8.954-20-20-20-11.046 0-20 8.954-20 20v28h-24v-72h152v72h-24v-28c0-11.046-8.954-20-20-20ZM236 204h-24v-52c0-6.627 5.373-12 12-12 6.627 0 12 5.373 12 12Z"),
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
        return _mosque!!
    }

private var _mosque: ImageVector? = null
