package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.SmileyWink: ImageVector
    get() {
        if (_smileyWink != null) return _smileyWink!!
        _smileyWink = phosphorRegularIcon(
            name = "SmileyWink",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M128 24C70.562 24 24 70.562 24 128c0 57.438 46.562 104 104 104 57.438 0 104-46.562 104-104C231.939 70.588 185.412 24.061 128 24ZM128 216C79.399 216 40 176.601 40 128 40 79.399 79.399 40 128 40c48.601 0 88 39.399 88 88-.055 48.578-39.422 87.945-88 88ZM80 108c0-6.627 5.373-12 12-12 6.627 0 12 5.373 12 12 0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12ZM184 108c0 4.418-3.582 8-8 8h-24c-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8h24c4.418 0 8 3.582 8 8ZM174.92 156C164.63 173.79 147.53 184 128 184 108.47 184 91.37 173.8 81.07 156c-2.209-3.827-.897-8.721 2.93-10.93 3.827-2.209 8.721-.897 10.93 2.93 7.46 12.91 19.2 20 33.07 20 13.87 0 25.61-7.1 33.08-20 1.362-2.604 4.042-4.251 6.98-4.291 2.938-.04 5.662 1.535 7.094 4.101 1.432 2.566 1.342 5.711-.234 8.191Z"),
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
        return _smileyWink!!
    }

private var _smileyWink: ImageVector? = null
