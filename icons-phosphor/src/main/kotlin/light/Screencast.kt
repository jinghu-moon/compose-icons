package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Screencast: ImageVector
    get() {
        if (_screencast != null) return _screencast!!
        _screencast = phosphorLightIcon(
            name = "Screencast",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 230.000 56.000 L 230.000 200.000 C 230.000 207.732 223.732 214.000 216.000 214.000 L 144.000 214.000 C 140.686 214.000 138.000 211.314 138.000 208.000 C 138.000 204.686 140.686 202.000 144.000 202.000 L 216.000 202.000 C 217.105 202.000 218.000 201.105 218.000 200.000 L 218.000 56.000 C 218.000 54.895 217.105 54.000 216.000 54.000 L 40.000 54.000 C 38.895 54.000 38.000 54.895 38.000 56.000 L 38.000 96.000 C 38.000 99.314 35.314 102.000 32.000 102.000 C 28.686 102.000 26.000 99.314 26.000 96.000 L 26.000 56.000 C 26.000 48.268 32.268 42.000 40.000 42.000 L 216.000 42.000 C 223.732 42.000 230.000 48.268 230.000 56.000 ZM 32.000 186.000 C 28.686 186.000 26.000 188.686 26.000 192.000 C 26.000 195.314 28.686 198.000 32.000 198.000 C 37.523 198.000 42.000 202.477 42.000 208.000 C 42.000 211.314 44.686 214.000 48.000 214.000 C 51.314 214.000 54.000 211.314 54.000 208.000 C 54.000 195.850 44.150 186.000 32.000 186.000 ZM 32.000 154.000 C 28.686 154.000 26.000 156.686 26.000 160.000 C 26.000 163.314 28.686 166.000 32.000 166.000 C 55.196 166.000 74.000 184.804 74.000 208.000 C 74.000 211.314 76.686 214.000 80.000 214.000 C 83.314 214.000 86.000 211.314 86.000 208.000 C 85.967 178.190 61.810 154.033 32.000 154.000 ZM 32.000 122.000 C 28.686 122.000 26.000 124.686 26.000 128.000 C 26.000 131.314 28.686 134.000 32.000 134.000 C 72.849 134.050 105.950 167.151 106.000 208.000 C 106.000 211.314 108.686 214.000 112.000 214.000 C 115.314 214.000 118.000 211.314 118.000 208.000 C 117.945 160.526 79.474 122.055 32.000 122.000 Z"),
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
