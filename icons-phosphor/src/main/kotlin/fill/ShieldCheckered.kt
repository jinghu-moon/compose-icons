package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.ShieldCheckered: ImageVector
    get() {
        if (_shieldCheckered != null) return _shieldCheckered!!
        _shieldCheckered = phosphorFillIcon(
            name = "ShieldCheckered",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 208.000 40.000 L 48.000 40.000 C 39.163 40.000 32.000 47.163 32.000 56.000 L 32.000 112.000 C 32.000 164.720 57.520 196.670 78.930 214.190 C 101.990 233.050 124.930 239.460 125.930 239.720 C 127.305 240.094 128.755 240.094 130.130 239.720 C 131.130 239.460 154.040 233.050 177.130 214.190 C 198.480 196.670 224.000 164.720 224.000 112.000 L 224.000 56.000 C 224.000 47.163 216.837 40.000 208.000 40.000 ZM 128.000 223.620 C 113.852 218.680 100.679 211.298 89.080 201.810 C 65.830 182.790 52.370 158.000 48.900 128.000 L 128.000 128.000 L 128.000 56.000 L 208.000 56.000 L 208.000 112.000 C 208.003 117.346 207.703 122.688 207.100 128.000 L 128.000 128.000 L 128.000 223.620 Z"),
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
        return _shieldCheckered!!
    }

private var _shieldCheckered: ImageVector? = null
