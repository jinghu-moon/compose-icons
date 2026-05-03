package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.ArrowsOutSimple: ImageVector
    get() {
        if (_arrowsOutSimple != null) return _arrowsOutSimple!!
        _arrowsOutSimple = phosphorThinIcon(
            name = "ArrowsOutSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 212.000 48.000 L 212.000 96.000 C 212.000 98.209 210.209 100.000 208.000 100.000 C 205.791 100.000 204.000 98.209 204.000 96.000 L 204.000 57.660 L 146.830 114.830 C 145.267 116.393 142.733 116.393 141.170 114.830 C 139.607 113.267 139.607 110.733 141.170 109.170 L 198.340 52.000 L 160.000 52.000 C 157.791 52.000 156.000 50.209 156.000 48.000 C 156.000 45.791 157.791 44.000 160.000 44.000 L 208.000 44.000 C 210.209 44.000 212.000 45.791 212.000 48.000 ZM 109.170 141.170 L 52.000 198.340 L 52.000 160.000 C 52.000 157.791 50.209 156.000 48.000 156.000 C 45.791 156.000 44.000 157.791 44.000 160.000 L 44.000 208.000 C 44.000 210.209 45.791 212.000 48.000 212.000 L 96.000 212.000 C 98.209 212.000 100.000 210.209 100.000 208.000 C 100.000 205.791 98.209 204.000 96.000 204.000 L 57.660 204.000 L 114.830 146.830 C 116.393 145.267 116.393 142.733 114.830 141.170 C 113.267 139.607 110.733 139.607 109.170 141.170 Z"),
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
        return _arrowsOutSimple!!
    }

private var _arrowsOutSimple: ImageVector? = null
