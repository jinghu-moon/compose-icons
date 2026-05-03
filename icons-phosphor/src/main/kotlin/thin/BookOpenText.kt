package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.BookOpenText: ImageVector
    get() {
        if (_bookOpenText != null) return _bookOpenText!!
        _bookOpenText = phosphorThinIcon(
            name = "BookOpenText",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 232.000 52.000 L 160.000 52.000 C 146.516 52.006 134.165 59.548 128.000 71.540 C 121.835 59.548 109.484 52.006 96.000 52.000 L 24.000 52.000 C 21.791 52.000 20.000 53.791 20.000 56.000 L 20.000 200.000 C 20.000 202.209 21.791 204.000 24.000 204.000 L 96.000 204.000 C 111.464 204.000 124.000 216.536 124.000 232.000 C 124.000 234.209 125.791 236.000 128.000 236.000 C 130.209 236.000 132.000 234.209 132.000 232.000 C 132.000 216.536 144.536 204.000 160.000 204.000 L 232.000 204.000 C 234.209 204.000 236.000 202.209 236.000 200.000 L 236.000 56.000 C 236.000 53.791 234.209 52.000 232.000 52.000 ZM 96.000 196.000 L 28.000 196.000 L 28.000 60.000 L 96.000 60.000 C 111.464 60.000 124.000 72.536 124.000 88.000 L 124.000 209.400 C 117.176 200.925 106.881 195.998 96.000 196.000 ZM 228.000 196.000 L 160.000 196.000 C 149.118 196.000 138.822 200.931 132.000 209.410 L 132.000 88.000 C 132.000 72.536 144.536 60.000 160.000 60.000 L 228.000 60.000 ZM 160.000 92.000 L 200.000 92.000 C 202.209 92.000 204.000 93.791 204.000 96.000 C 204.000 98.209 202.209 100.000 200.000 100.000 L 160.000 100.000 C 157.791 100.000 156.000 98.209 156.000 96.000 C 156.000 93.791 157.791 92.000 160.000 92.000 ZM 204.000 128.000 C 204.000 130.209 202.209 132.000 200.000 132.000 L 160.000 132.000 C 157.791 132.000 156.000 130.209 156.000 128.000 C 156.000 125.791 157.791 124.000 160.000 124.000 L 200.000 124.000 C 202.209 124.000 204.000 125.791 204.000 128.000 ZM 204.000 160.000 C 204.000 162.209 202.209 164.000 200.000 164.000 L 160.000 164.000 C 157.791 164.000 156.000 162.209 156.000 160.000 C 156.000 157.791 157.791 156.000 160.000 156.000 L 200.000 156.000 C 202.209 156.000 204.000 157.791 204.000 160.000 Z"),
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
        return _bookOpenText!!
    }

private var _bookOpenText: ImageVector? = null
