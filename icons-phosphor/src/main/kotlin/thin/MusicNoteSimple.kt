package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.MusicNoteSimple: ImageVector
    get() {
        if (_musicNoteSimple != null) return _musicNoteSimple!!
        _musicNoteSimple = phosphorThinIcon(
            name = "MusicNoteSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 209.150 60.170 L 129.150 36.170 C 127.939 35.807 126.628 36.037 125.613 36.791 C 124.598 37.546 124.000 38.736 124.000 40.000 L 124.000 158.750 C 111.516 140.984 87.938 134.982 68.478 144.616 C 49.019 154.250 39.497 176.638 46.055 197.338 C 52.613 218.037 73.291 230.858 94.748 227.528 C 116.204 224.198 132.024 205.714 132.000 184.000 L 132.000 45.380 L 206.850 67.830 C 208.945 68.406 211.117 67.205 211.742 65.124 C 212.367 63.042 211.216 60.843 209.150 60.170 ZM 88.000 220.000 C 68.118 220.000 52.000 203.882 52.000 184.000 C 52.000 164.118 68.118 148.000 88.000 148.000 C 107.882 148.000 124.000 164.118 124.000 184.000 C 124.000 203.882 107.882 220.000 88.000 220.000 Z"),
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
        return _musicNoteSimple!!
    }

private var _musicNoteSimple: ImageVector? = null
