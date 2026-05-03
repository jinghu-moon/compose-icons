package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Vignette: ImageVector
    get() {
        if (_vignette != null) return _vignette!!
        _vignette = phosphorRegularIcon(
            name = "Vignette",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 216.000 40.000 L 40.000 40.000 C 31.163 40.000 24.000 47.163 24.000 56.000 L 24.000 200.000 C 24.000 208.837 31.163 216.000 40.000 216.000 L 216.000 216.000 C 224.837 216.000 232.000 208.837 232.000 200.000 L 232.000 56.000 C 232.000 47.163 224.837 40.000 216.000 40.000 ZM 216.000 200.000 L 40.000 200.000 L 40.000 56.000 L 216.000 56.000 L 216.000 200.000 ZM 178.050 87.660 C 164.590 77.560 146.810 72.000 128.000 72.000 C 109.190 72.000 91.410 77.560 78.000 87.660 C 63.790 98.270 56.000 112.600 56.000 128.000 C 56.000 143.400 63.790 157.730 78.000 168.340 C 91.410 178.440 109.190 184.000 128.000 184.000 C 146.810 184.000 164.590 178.440 178.050 168.340 C 192.210 157.730 200.000 143.400 200.000 128.000 C 200.000 112.600 192.210 98.270 178.050 87.660 ZM 128.000 168.000 C 97.120 168.000 72.000 150.060 72.000 128.000 C 72.000 105.940 97.120 88.000 128.000 88.000 C 158.880 88.000 184.000 105.940 184.000 128.000 C 184.000 150.060 158.880 168.000 128.000 168.000 Z"),
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
        return _vignette!!
    }

private var _vignette: ImageVector? = null
