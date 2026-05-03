package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.MusicNote: ImageVector
    get() {
        if (_musicNote != null) return _musicNote!!
        _musicNote = phosphorThinIcon(
            name = "MusicNote",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 209.150 60.170 L 129.150 36.170 C 127.939 35.807 126.628 36.037 125.613 36.791 C 124.598 37.546 124.000 38.736 124.000 40.000 L 124.000 158.750 C 111.516 140.984 87.938 134.982 68.478 144.616 C 49.019 154.250 39.497 176.638 46.055 197.338 C 52.613 218.037 73.291 230.858 94.748 227.528 C 116.204 224.198 132.024 205.714 132.000 184.000 L 132.000 93.380 L 206.850 115.830 C 208.061 116.193 209.372 115.963 210.387 115.209 C 211.402 114.454 212.000 113.264 212.000 112.000 L 212.000 64.000 C 212.000 62.234 210.841 60.678 209.150 60.170 ZM 88.000 220.000 C 68.118 220.000 52.000 203.882 52.000 184.000 C 52.000 164.118 68.118 148.000 88.000 148.000 C 107.882 148.000 124.000 164.118 124.000 184.000 C 124.000 203.882 107.882 220.000 88.000 220.000 ZM 204.000 106.620 L 132.000 85.000 L 132.000 45.380 L 204.000 67.000 Z"),
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
        return _musicNote!!
    }

private var _musicNote: ImageVector? = null
