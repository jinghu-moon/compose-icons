package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Article: ImageVector
    get() {
        if (_article != null) return _article!!
        _article = phosphorThinIcon(
            name = "Article",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 216.000 44.000 L 40.000 44.000 C 33.373 44.000 28.000 49.373 28.000 56.000 L 28.000 200.000 C 28.000 206.627 33.373 212.000 40.000 212.000 L 216.000 212.000 C 222.627 212.000 228.000 206.627 228.000 200.000 L 228.000 56.000 C 228.000 49.373 222.627 44.000 216.000 44.000 ZM 220.000 200.000 C 220.000 202.209 218.209 204.000 216.000 204.000 L 40.000 204.000 C 37.791 204.000 36.000 202.209 36.000 200.000 L 36.000 56.000 C 36.000 53.791 37.791 52.000 40.000 52.000 L 216.000 52.000 C 218.209 52.000 220.000 53.791 220.000 56.000 ZM 180.000 96.000 C 180.000 98.209 178.209 100.000 176.000 100.000 L 80.000 100.000 C 77.791 100.000 76.000 98.209 76.000 96.000 C 76.000 93.791 77.791 92.000 80.000 92.000 L 176.000 92.000 C 178.209 92.000 180.000 93.791 180.000 96.000 ZM 180.000 128.000 C 180.000 130.209 178.209 132.000 176.000 132.000 L 80.000 132.000 C 77.791 132.000 76.000 130.209 76.000 128.000 C 76.000 125.791 77.791 124.000 80.000 124.000 L 176.000 124.000 C 178.209 124.000 180.000 125.791 180.000 128.000 ZM 180.000 160.000 C 180.000 162.209 178.209 164.000 176.000 164.000 L 80.000 164.000 C 77.791 164.000 76.000 162.209 76.000 160.000 C 76.000 157.791 77.791 156.000 80.000 156.000 L 176.000 156.000 C 178.209 156.000 180.000 157.791 180.000 160.000 Z"),
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
        return _article!!
    }

private var _article: ImageVector? = null
