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
                pathData = parseSvgPathData("M 212.920 17.710 C 210.987 16.178 208.449 15.638 206.060 16.250 L 78.060 48.250 C 74.503 49.139 72.005 52.333 72.000 56.000 L 72.000 166.100 C 58.267 156.924 40.052 158.270 27.817 169.365 C 15.582 180.459 12.466 198.456 20.259 213.019 C 28.051 227.581 44.753 234.973 60.772 230.948 C 76.790 226.924 88.015 212.516 88.000 196.000 L 88.000 102.250 L 200.000 74.250 L 200.000 134.100 C 186.267 124.924 168.052 126.270 155.817 137.365 C 143.582 148.459 140.466 166.456 148.259 181.019 C 156.051 195.581 172.753 202.973 188.772 198.948 C 204.790 194.924 216.015 180.516 216.000 164.000 L 216.000 24.000 C 215.994 21.541 214.859 19.222 212.920 17.710 Z"),
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
