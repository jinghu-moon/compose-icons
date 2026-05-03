package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Screencast: ImageVector
    get() {
        if (_screencast != null) return _screencast!!
        _screencast = phosphorThinIcon(
            name = "Screencast",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 228.000 56.000 L 228.000 200.000 C 228.000 206.627 222.627 212.000 216.000 212.000 L 144.000 212.000 C 141.791 212.000 140.000 210.209 140.000 208.000 C 140.000 205.791 141.791 204.000 144.000 204.000 L 216.000 204.000 C 218.209 204.000 220.000 202.209 220.000 200.000 L 220.000 56.000 C 220.000 53.791 218.209 52.000 216.000 52.000 L 40.000 52.000 C 37.791 52.000 36.000 53.791 36.000 56.000 L 36.000 96.000 C 36.000 98.209 34.209 100.000 32.000 100.000 C 29.791 100.000 28.000 98.209 28.000 96.000 L 28.000 56.000 C 28.000 49.373 33.373 44.000 40.000 44.000 L 216.000 44.000 C 222.627 44.000 228.000 49.373 228.000 56.000 ZM 32.000 188.000 C 29.791 188.000 28.000 189.791 28.000 192.000 C 28.000 194.209 29.791 196.000 32.000 196.000 C 38.627 196.000 44.000 201.373 44.000 208.000 C 44.000 210.209 45.791 212.000 48.000 212.000 C 50.209 212.000 52.000 210.209 52.000 208.000 C 52.000 196.954 43.046 188.000 32.000 188.000 ZM 32.000 156.000 C 29.791 156.000 28.000 157.791 28.000 160.000 C 28.000 162.209 29.791 164.000 32.000 164.000 C 56.289 164.028 75.972 183.711 76.000 208.000 C 76.000 210.209 77.791 212.000 80.000 212.000 C 82.209 212.000 84.000 210.209 84.000 208.000 C 83.967 179.295 60.705 156.033 32.000 156.000 ZM 32.000 124.000 C 29.791 124.000 28.000 125.791 28.000 128.000 C 28.000 130.209 29.791 132.000 32.000 132.000 C 73.955 132.044 107.956 166.045 108.000 208.000 C 108.000 210.209 109.791 212.000 112.000 212.000 C 114.209 212.000 116.000 210.209 116.000 208.000 C 115.950 161.629 78.371 124.050 32.000 124.000 Z"),
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
        return _screencast!!
    }

private var _screencast: ImageVector? = null
