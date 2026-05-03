package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.ArrowsOut: ImageVector
    get() {
        if (_arrowsOut != null) return _arrowsOut!!
        _arrowsOut = phosphorThinIcon(
            name = "ArrowsOut",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 212.000 48.000 L 212.000 96.000 C 212.000 98.209 210.209 100.000 208.000 100.000 C 205.791 100.000 204.000 98.209 204.000 96.000 L 204.000 57.660 L 154.830 106.830 C 153.267 108.393 150.733 108.393 149.170 106.830 C 147.607 105.267 147.607 102.733 149.170 101.170 L 198.340 52.000 L 160.000 52.000 C 157.791 52.000 156.000 50.209 156.000 48.000 C 156.000 45.791 157.791 44.000 160.000 44.000 L 208.000 44.000 C 210.209 44.000 212.000 45.791 212.000 48.000 ZM 101.170 149.170 L 52.000 198.340 L 52.000 160.000 C 52.000 157.791 50.209 156.000 48.000 156.000 C 45.791 156.000 44.000 157.791 44.000 160.000 L 44.000 208.000 C 44.000 210.209 45.791 212.000 48.000 212.000 L 96.000 212.000 C 98.209 212.000 100.000 210.209 100.000 208.000 C 100.000 205.791 98.209 204.000 96.000 204.000 L 57.660 204.000 L 106.830 154.830 C 108.393 153.267 108.393 150.733 106.830 149.170 C 105.267 147.607 102.733 147.607 101.170 149.170 ZM 208.000 156.000 C 205.791 156.000 204.000 157.791 204.000 160.000 L 204.000 198.340 L 154.830 149.170 C 153.267 147.607 150.733 147.607 149.170 149.170 C 147.607 150.733 147.607 153.267 149.170 154.830 L 198.340 204.000 L 160.000 204.000 C 157.791 204.000 156.000 205.791 156.000 208.000 C 156.000 210.209 157.791 212.000 160.000 212.000 L 208.000 212.000 C 210.209 212.000 212.000 210.209 212.000 208.000 L 212.000 160.000 C 212.000 157.791 210.209 156.000 208.000 156.000 ZM 57.660 52.000 L 96.000 52.000 C 98.209 52.000 100.000 50.209 100.000 48.000 C 100.000 45.791 98.209 44.000 96.000 44.000 L 48.000 44.000 C 45.791 44.000 44.000 45.791 44.000 48.000 L 44.000 96.000 C 44.000 98.209 45.791 100.000 48.000 100.000 C 50.209 100.000 52.000 98.209 52.000 96.000 L 52.000 57.660 L 101.170 106.830 C 102.733 108.393 105.267 108.393 106.830 106.830 C 108.393 105.267 108.393 102.733 106.830 101.170 Z"),
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
        return _arrowsOut!!
    }

private var _arrowsOut: ImageVector? = null
