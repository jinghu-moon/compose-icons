package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Cylinder: ImageVector
    get() {
        if (_cylinder != null) return _cylinder!!
        _cylinder = phosphorLightIcon(
            name = "Cylinder",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 128.000 18.000 C 88.750 18.000 58.000 36.450 58.000 60.000 L 58.000 196.000 C 58.000 219.550 88.750 238.000 128.000 238.000 C 167.250 238.000 198.000 219.550 198.000 196.000 L 198.000 60.000 C 198.000 36.450 167.250 18.000 128.000 18.000 ZM 128.000 30.000 C 159.440 30.000 186.000 43.740 186.000 60.000 C 186.000 76.260 159.440 90.000 128.000 90.000 C 96.560 90.000 70.000 76.260 70.000 60.000 C 70.000 43.740 96.560 30.000 128.000 30.000 ZM 128.000 226.000 C 96.560 226.000 70.000 212.260 70.000 196.000 L 70.000 83.810 C 82.480 94.870 103.590 102.000 128.000 102.000 C 152.410 102.000 173.520 94.870 186.000 83.810 L 186.000 196.000 C 186.000 212.260 159.440 226.000 128.000 226.000 Z"),
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
        return _cylinder!!
    }

private var _cylinder: ImageVector? = null
