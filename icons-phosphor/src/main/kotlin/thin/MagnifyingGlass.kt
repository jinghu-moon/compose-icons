package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.MagnifyingGlass: ImageVector
    get() {
        if (_magnifyingGlass != null) return _magnifyingGlass!!
        _magnifyingGlass = phosphorThinIcon(
            name = "MagnifyingGlass",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 226.830 221.170 L 174.130 168.470 C 204.848 134.678 202.986 82.547 169.935 51.033 C 136.884 19.520 84.724 20.140 52.432 52.432 C 20.140 84.724 19.520 136.884 51.033 169.935 C 82.547 202.986 134.678 204.848 168.470 174.130 L 221.170 226.830 C 222.733 228.393 225.267 228.393 226.830 226.830 C 228.393 225.267 228.393 222.733 226.830 221.170 ZM 36.000 112.000 C 36.000 70.026 70.026 36.000 112.000 36.000 C 153.974 36.000 188.000 70.026 188.000 112.000 C 188.000 153.974 153.974 188.000 112.000 188.000 C 70.045 187.956 36.044 153.955 36.000 112.000 Z"),
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
        return _magnifyingGlass!!
    }

private var _magnifyingGlass: ImageVector? = null
