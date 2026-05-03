package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Screencast: ImageVector
    get() {
        if (_screencast != null) return _screencast!!
        _screencast = phosphorBoldIcon(
            name = "Screencast",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 232.000 60.000 L 232.000 196.000 C 232.000 207.046 223.046 216.000 212.000 216.000 L 172.000 216.000 C 165.373 216.000 160.000 210.627 160.000 204.000 C 160.000 197.373 165.373 192.000 172.000 192.000 L 208.000 192.000 L 208.000 64.000 L 48.000 64.000 L 48.000 68.000 C 48.000 74.627 42.627 80.000 36.000 80.000 C 29.373 80.000 24.000 74.627 24.000 68.000 L 24.000 60.000 C 24.000 48.954 32.954 40.000 44.000 40.000 L 212.000 40.000 C 223.046 40.000 232.000 48.954 232.000 60.000 ZM 36.000 176.000 C 29.373 176.000 24.000 181.373 24.000 188.000 C 24.000 194.627 29.373 200.000 36.000 200.000 C 38.209 200.000 40.000 201.791 40.000 204.000 C 40.000 210.627 45.373 216.000 52.000 216.000 C 58.627 216.000 64.000 210.627 64.000 204.000 C 64.000 188.536 51.464 176.000 36.000 176.000 ZM 36.000 136.000 C 29.373 136.000 24.000 141.373 24.000 148.000 C 24.000 154.627 29.373 160.000 36.000 160.000 C 60.289 160.028 79.972 179.711 80.000 204.000 C 80.000 210.627 85.373 216.000 92.000 216.000 C 98.627 216.000 104.000 210.627 104.000 204.000 C 103.961 166.461 73.539 136.039 36.000 136.000 ZM 36.000 96.000 C 29.373 96.000 24.000 101.373 24.000 108.000 C 24.000 114.627 29.373 120.000 36.000 120.000 C 82.371 120.050 119.950 157.629 120.000 204.000 C 120.000 210.627 125.373 216.000 132.000 216.000 C 138.627 216.000 144.000 210.627 144.000 204.000 C 143.934 144.381 95.619 96.066 36.000 96.000 Z"),
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
        return _screencast!!
    }

private var _screencast: ImageVector? = null
