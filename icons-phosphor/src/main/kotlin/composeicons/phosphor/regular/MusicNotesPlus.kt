package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.MusicNotesPlus: ImageVector
    get() {
        if (_musicNotesPlus != null) return _musicNotesPlus!!
        _musicNotesPlus = phosphorRegularIcon(
            name = "MusicNotesPlus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M232 48c0 4.418-3.582 8-8 8h-16v16c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8v-16h-16c-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8h16v-16c0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8v16h16c4.418 0 8 3.582 8 8ZM216 112v52c.006 16.514-11.225 30.915-27.243 34.932-16.018 4.017-32.715-3.379-40.503-17.942-7.788-14.563-4.668-32.557 7.567-43.648 12.235-11.092 30.448-12.436 44.179-3.262v-22.08c0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8ZM200 164c0-11.046-8.954-20-20-20-11.046 0-20 8.954-20 20 0 11.046 8.954 20 20 20 11.046 0 20-8.954 20-20ZM88 110.25v85.75c.006 16.514-11.225 30.915-27.243 34.932C44.739 234.949 28.042 227.552 20.254 212.99c-7.788-14.563-4.668-32.557 7.567-43.648C40.056 158.25 58.269 156.905 72 166.08v-110.08c.001-3.671 2.499-6.87 6.06-7.76l56-14c4.252-.986 8.509 1.618 9.568 5.853 1.059 4.235-1.472 8.536-5.688 9.667L88 62.25v31.5L158.06 76.24c4.252-.986 8.509 1.618 9.568 5.853 1.059 4.234-1.472 8.536-5.688 9.667ZM72 196C72 184.954 63.046 176 52 176c-11.046 0-20 8.954-20 20 0 11.046 8.954 20 20 20 11.046 0 20-8.954 20-20Z"),
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
        return _musicNotesPlus!!
    }

private var _musicNotesPlus: ImageVector? = null
