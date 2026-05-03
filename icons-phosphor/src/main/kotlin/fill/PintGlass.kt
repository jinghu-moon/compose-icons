package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.PintGlass: ImageVector
    get() {
        if (_pintGlass != null) return _pintGlass!!
        _pintGlass = phosphorFillIcon(
            name = "PintGlass",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 206.000 26.690 C 204.478 24.975 202.293 23.995 200.000 24.000 L 56.000 24.000 C 53.704 23.999 51.517 24.985 49.998 26.707 C 48.479 28.430 47.773 30.722 48.060 33.000 L 71.210 226.000 C 72.219 234.006 79.031 240.008 87.100 240.000 L 168.900 240.000 C 176.999 240.002 183.823 233.952 184.790 225.910 L 207.940 33.000 C 208.232 30.715 207.525 28.416 206.000 26.690 ZM 191.000 40.000 L 188.100 64.000 L 67.900 64.000 L 65.000 40.000 Z"),
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
        return _pintGlass!!
    }

private var _pintGlass: ImageVector? = null
