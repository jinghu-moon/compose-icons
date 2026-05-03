package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Presentation: ImageVector
    get() {
        if (_presentation != null) return _presentation!!
        _presentation = phosphorLightIcon(
            name = "Presentation",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 216.000 42.000 L 134.000 42.000 L 134.000 24.000 C 134.000 20.686 131.314 18.000 128.000 18.000 C 124.686 18.000 122.000 20.686 122.000 24.000 L 122.000 42.000 L 40.000 42.000 C 32.268 42.000 26.000 48.268 26.000 56.000 L 26.000 176.000 C 26.000 183.732 32.268 190.000 40.000 190.000 L 83.520 190.000 L 59.310 220.250 C 57.239 222.840 57.660 226.619 60.250 228.690 C 62.840 230.761 66.619 230.340 68.690 227.750 L 98.880 190.000 L 157.120 190.000 L 187.310 227.750 C 189.381 230.340 193.160 230.761 195.750 228.690 C 198.340 226.619 198.761 222.840 196.690 220.250 L 172.480 190.000 L 216.000 190.000 C 223.732 190.000 230.000 183.732 230.000 176.000 L 230.000 56.000 C 230.000 48.268 223.732 42.000 216.000 42.000 ZM 218.000 176.000 C 218.000 177.105 217.105 178.000 216.000 178.000 L 40.000 178.000 C 38.895 178.000 38.000 177.105 38.000 176.000 L 38.000 56.000 C 38.000 54.895 38.895 54.000 40.000 54.000 L 216.000 54.000 C 217.105 54.000 218.000 54.895 218.000 56.000 Z"),
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
        return _presentation!!
    }

private var _presentation: ImageVector? = null
