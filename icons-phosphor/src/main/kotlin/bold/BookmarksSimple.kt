package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.BookmarksSimple: ImageVector
    get() {
        if (_bookmarksSimple != null) return _bookmarksSimple!!
        _bookmarksSimple = phosphorBoldIcon(
            name = "BookmarksSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 156.000 56.000 L 60.000 56.000 C 48.954 56.000 40.000 64.954 40.000 76.000 L 40.000 228.000 C 39.995 232.503 42.511 236.630 46.517 238.687 C 50.522 240.745 55.343 240.387 59.000 237.760 L 108.000 202.760 L 157.000 237.760 C 160.657 240.387 165.478 240.745 169.483 238.687 C 173.489 236.630 176.005 232.503 176.000 228.000 L 176.000 76.000 C 176.000 64.954 167.046 56.000 156.000 56.000 ZM 152.000 204.680 L 115.000 178.230 C 110.817 175.226 105.183 175.226 101.000 178.230 L 64.000 204.680 L 64.000 80.000 L 152.000 80.000 ZM 216.000 36.000 L 216.000 188.000 C 216.000 194.627 210.627 200.000 204.000 200.000 C 197.373 200.000 192.000 194.627 192.000 188.000 L 192.000 40.000 L 92.000 40.000 C 85.373 40.000 80.000 34.627 80.000 28.000 C 80.000 21.373 85.373 16.000 92.000 16.000 L 196.000 16.000 C 207.046 16.000 216.000 24.954 216.000 36.000 Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
        }
        return _bookmarksSimple!!
    }

private var _bookmarksSimple: ImageVector? = null
