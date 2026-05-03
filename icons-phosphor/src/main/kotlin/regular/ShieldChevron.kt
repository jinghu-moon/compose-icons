package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.ShieldChevron: ImageVector
    get() {
        if (_shieldChevron != null) return _shieldChevron!!
        _shieldChevron = phosphorRegularIcon(
            name = "ShieldChevron",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 208.000 40.000 L 48.000 40.000 C 39.163 40.000 32.000 47.163 32.000 56.000 L 32.000 112.000 C 32.000 164.720 57.520 196.670 78.930 214.190 C 101.990 233.050 124.930 239.450 125.930 239.720 C 127.305 240.094 128.755 240.094 130.130 239.720 C 131.130 239.450 154.040 233.050 177.130 214.190 C 198.480 196.670 224.000 164.720 224.000 112.000 L 224.000 56.000 C 224.000 47.163 216.837 40.000 208.000 40.000 ZM 167.400 201.420 C 155.673 211.077 142.336 218.592 128.000 223.620 C 113.852 218.680 100.679 211.298 89.080 201.810 C 79.434 194.019 71.151 184.679 64.570 174.170 L 128.000 129.770 L 191.430 174.170 C 184.963 184.505 176.845 193.711 167.400 201.420 ZM 208.000 112.000 Q 208.000 138.310 198.860 159.840 L 132.590 113.450 C 129.834 111.520 126.166 111.520 123.410 113.450 L 57.130 159.840 C 51.060 145.520 48.000 129.540 48.000 112.000 L 48.000 56.000 L 208.000 56.000 Z"),
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
        return _shieldChevron!!
    }

private var _shieldChevron: ImageVector? = null
