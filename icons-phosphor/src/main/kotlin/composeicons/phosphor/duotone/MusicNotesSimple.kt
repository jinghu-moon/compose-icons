package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.MusicNotesSimple: ImageVector
    get() {
        if (_musicNotesSimple != null) return _musicNotesSimple!!
        _musicNotesSimple = phosphorDuotoneIcon(
            name = "MusicNotesSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M208 164c0 15.464-12.536 28-28 28-15.464 0-28-12.536-28-28 0-15.464 12.536-28 28-28 15.464 0 28 12.536 28 28ZM52 168c-15.464 0-28 12.536-28 28 0 15.464 12.536 28 28 28 15.464 0 28-12.536 28-28C80 180.536 67.464 168 52 168Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.2f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
            addPath(
                pathData = parseSvgPathData("M212.92 17.69c-1.942-1.513-4.472-2.048-6.86-1.45l-128 32C74.499 49.13 72.001 52.329 72 56v110.08c-13.731-9.175-31.944-7.83-44.179 3.262-12.235 11.092-15.355 29.085-7.567 43.648 7.788 14.563 24.485 21.959 40.503 17.942C76.775 226.915 88.006 212.514 88 196v-133.75l112-28v99.83c-13.731-9.175-31.944-7.83-44.179 3.262-12.235 11.092-15.355 29.085-7.567 43.648 7.788 14.563 24.485 21.959 40.503 17.942C204.775 194.915 216.006 180.514 216 164v-140c.001-2.466-1.136-4.794-3.08-6.31ZM52 216C40.954 216 32 207.046 32 196c0-11.046 8.954-20 20-20 11.046 0 20 8.954 20 20 0 11.046-8.954 20-20 20ZM180 184c-11.046 0-20-8.954-20-20 0-11.046 8.954-20 20-20 11.046 0 20 8.954 20 20 0 11.046-8.954 20-20 20Z"),
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
        return _musicNotesSimple!!
    }

private var _musicNotesSimple: ImageVector? = null
