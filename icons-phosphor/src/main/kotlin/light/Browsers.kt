package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Browsers: ImageVector
    get() {
        if (_browsers != null) return _browsers!!
        _browsers = phosphorLightIcon(
            name = "Browsers",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 216.000 42.000 L 72.000 42.000 C 64.268 42.000 58.000 48.268 58.000 56.000 L 58.000 74.000 L 40.000 74.000 C 32.268 74.000 26.000 80.268 26.000 88.000 L 26.000 200.000 C 26.000 207.732 32.268 214.000 40.000 214.000 L 184.000 214.000 C 191.732 214.000 198.000 207.732 198.000 200.000 L 198.000 182.000 L 216.000 182.000 C 223.732 182.000 230.000 175.732 230.000 168.000 L 230.000 56.000 C 230.000 48.268 223.732 42.000 216.000 42.000 ZM 40.000 86.000 L 184.000 86.000 C 185.105 86.000 186.000 86.895 186.000 88.000 L 186.000 106.000 L 38.000 106.000 L 38.000 88.000 C 38.000 86.895 38.895 86.000 40.000 86.000 ZM 186.000 200.000 C 186.000 201.105 185.105 202.000 184.000 202.000 L 40.000 202.000 C 38.895 202.000 38.000 201.105 38.000 200.000 L 38.000 118.000 L 186.000 118.000 ZM 218.000 168.000 C 218.000 169.105 217.105 170.000 216.000 170.000 L 198.000 170.000 L 198.000 88.000 C 198.000 80.268 191.732 74.000 184.000 74.000 L 70.000 74.000 L 70.000 56.000 C 70.000 54.895 70.895 54.000 72.000 54.000 L 216.000 54.000 C 217.105 54.000 218.000 54.895 218.000 56.000 Z"),
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
        return _browsers!!
    }

private var _browsers: ImageVector? = null
