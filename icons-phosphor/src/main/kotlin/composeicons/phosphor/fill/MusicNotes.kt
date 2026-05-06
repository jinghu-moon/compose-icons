package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.MusicNotes: ImageVector
    get() {
        if (_musicNotes != null) return _musicNotes!!
        _musicNotes = phosphorFillIcon(
            name = "MusicNotes",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M212.92 17.71c-1.933-1.532-4.471-2.072-6.86-1.46l-128 32C74.503 49.139 72.005 52.333 72 56v110.1c-13.733-9.176-31.948-7.83-44.183 3.265-12.235 11.095-15.351 29.091-7.559 43.654 7.793 14.562 24.494 21.954 40.513 17.93C76.79 226.924 88.015 212.516 88 196v-93.75l112-28v59.85c-13.733-9.176-31.948-7.83-44.183 3.265-12.235 11.095-15.351 29.091-7.559 43.654 7.793 14.562 24.494 21.954 40.513 17.93C204.79 194.924 216.015 180.516 216 164v-140c-.006-2.459-1.141-4.778-3.08-6.29Z"),
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
        return _musicNotes!!
    }

private var _musicNotes: ImageVector? = null
