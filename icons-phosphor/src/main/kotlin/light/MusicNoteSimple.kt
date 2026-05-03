package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.MusicNoteSimple: ImageVector
    get() {
        if (_musicNoteSimple != null) return _musicNoteSimple!!
        _musicNoteSimple = phosphorLightIcon(
            name = "MusicNoteSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 209.720 58.250 L 129.720 34.250 C 127.903 33.706 125.937 34.054 124.416 35.186 C 122.895 36.319 121.999 38.104 122.000 40.000 L 122.000 153.050 C 107.081 136.679 82.613 133.264 63.782 144.925 C 44.951 156.586 37.104 180.011 45.111 200.663 C 53.118 221.314 74.705 233.327 96.475 229.246 C 118.246 225.165 134.016 206.149 134.000 184.000 L 134.000 48.060 L 206.270 69.750 C 209.446 70.703 212.792 68.901 213.745 65.725 C 214.698 62.549 212.896 59.203 209.720 58.250 ZM 88.000 218.000 C 69.222 218.000 54.000 202.778 54.000 184.000 C 54.000 165.222 69.222 150.000 88.000 150.000 C 106.778 150.000 122.000 165.222 122.000 184.000 C 122.000 202.778 106.778 218.000 88.000 218.000 Z"),
        pathFillType = PathFillType.NonZero,
        fill = SolidColor(Color(0xFF000000)),
        fillAlpha = 1.0f,
        stroke = null,
        strokeAlpha = 1.0f,
        strokeLineWidth = 0.0f,
        strokeLineCap = StrokeCap.Butt,
        strokeLineJoin = StrokeJoin.Miter,
    )
        }
        return _musicNoteSimple!!
    }

private var _musicNoteSimple: ImageVector? = null
