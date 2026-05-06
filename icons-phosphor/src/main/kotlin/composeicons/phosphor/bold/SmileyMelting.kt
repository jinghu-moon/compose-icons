package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.SmileyMelting: ImageVector
    get() {
        if (_smileyMelting != null) return _smileyMelting!!
        _smileyMelting = phosphorBoldIcon(
            name = "SmileyMelting",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M180 136c0 8.837-7.163 16-16 16-8.837 0-16-7.163-16-16 0-8.837 7.163-16 16-16 8.837 0 16 7.163 16 16ZM136 92c0-8.837-7.163-16-16-16-8.837 0-16 7.163-16 16 0 8.837 7.163 16 16 16 8.837 0 16-7.163 16-16ZM203.83 51.1C162.298 10.143 95.748 9.565 53.51 49.795 11.273 90.025 8.612 156.524 47.5 200c4.418 4.94 12.005 5.363 16.945 .945 4.94-4.418 5.363-12.005 .945-16.945C35.271 150.325 37.182 98.859 69.715 67.511c32.534-31.348 84.035-31.348 116.569 0 32.534 31.348 34.445 82.814 4.325 116.489-4.418 4.94-3.995 12.527 .945 16.945 4.94 4.418 12.527 3.995 16.945-.945C246.902 157.064 244.847 91.545 203.83 51.1ZM140 164h-4C116.19 164 92 147.39 92 128c.001-2.01 .168-4.017 .5-6 1.105-6.536-3.299-12.73-9.835-13.835C76.129 107.06 69.935 111.464 68.83 118c-.552 3.305-.83 6.649-.83 10 0 16.1 8 31.46 22.49 43.25C103.58 181.9 120.17 188 136 188h4c4.418 0 8 3.582 8 8 0 4.418-3.582 8-8 8h-40c-17.673 0-32 14.327-32 32 0 6.627 5.373 12 12 12 6.627 0 12-5.373 12-12 0-4.418 3.582-8 8-8h40c17.673 0 32-14.327 32-32 0-17.673-14.327-32-32-32Z"),
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
        return _smileyMelting!!
    }

private var _smileyMelting: ImageVector? = null
