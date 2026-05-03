package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.ArrowLineDownLeft: ImageVector
    get() {
        if (_arrowLineDownLeft != null) return _arrowLineDownLeft!!
        _arrowLineDownLeft = phosphorThinIcon(
            name = "ArrowLineDownLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 228.000 48.000 C 228.000 50.209 226.209 52.000 224.000 52.000 L 48.000 52.000 C 45.791 52.000 44.000 50.209 44.000 48.000 C 44.000 45.791 45.791 44.000 48.000 44.000 L 224.000 44.000 C 226.209 44.000 228.000 45.791 228.000 48.000 ZM 181.170 93.170 L 76.000 198.340 L 76.000 112.000 C 76.000 109.791 74.209 108.000 72.000 108.000 C 69.791 108.000 68.000 109.791 68.000 112.000 L 68.000 208.000 C 68.000 210.209 69.791 212.000 72.000 212.000 L 168.000 212.000 C 170.209 212.000 172.000 210.209 172.000 208.000 C 172.000 205.791 170.209 204.000 168.000 204.000 L 81.660 204.000 L 186.830 98.830 C 188.393 97.267 188.393 94.733 186.830 93.170 C 185.267 91.607 182.733 91.607 181.170 93.170 Z"),
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
        return _arrowLineDownLeft!!
    }

private var _arrowLineDownLeft: ImageVector? = null
