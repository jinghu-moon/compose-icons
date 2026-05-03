package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.ArticleNyTimes: ImageVector
    get() {
        if (_articleNyTimes != null) return _articleNyTimes!!
        _articleNyTimes = phosphorThinIcon(
            name = "ArticleNyTimes",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 128.000 100.000 L 232.000 100.000 C 234.209 100.000 236.000 101.791 236.000 104.000 C 236.000 106.209 234.209 108.000 232.000 108.000 L 128.000 108.000 C 125.791 108.000 124.000 106.209 124.000 104.000 C 124.000 101.791 125.791 100.000 128.000 100.000 ZM 232.000 132.000 L 128.000 132.000 C 125.791 132.000 124.000 133.791 124.000 136.000 C 124.000 138.209 125.791 140.000 128.000 140.000 L 232.000 140.000 C 234.209 140.000 236.000 138.209 236.000 136.000 C 236.000 133.791 234.209 132.000 232.000 132.000 ZM 232.000 164.000 L 80.000 164.000 C 77.791 164.000 76.000 165.791 76.000 168.000 C 76.000 170.209 77.791 172.000 80.000 172.000 L 232.000 172.000 C 234.209 172.000 236.000 170.209 236.000 168.000 C 236.000 165.791 234.209 164.000 232.000 164.000 ZM 232.000 196.000 L 80.000 196.000 C 77.791 196.000 76.000 197.791 76.000 200.000 C 76.000 202.209 77.791 204.000 80.000 204.000 L 232.000 204.000 C 234.209 204.000 236.000 202.209 236.000 200.000 C 236.000 197.791 234.209 196.000 232.000 196.000 ZM 96.000 140.000 C 98.209 140.000 100.000 138.209 100.000 136.000 C 100.000 133.791 98.209 132.000 96.000 132.000 L 84.000 132.000 L 84.000 60.000 L 124.000 60.000 L 124.000 72.000 C 124.000 74.209 125.791 76.000 128.000 76.000 C 130.209 76.000 132.000 74.209 132.000 72.000 L 132.000 56.000 C 132.000 53.791 130.209 52.000 128.000 52.000 L 32.000 52.000 C 29.791 52.000 28.000 53.791 28.000 56.000 L 28.000 72.000 C 28.000 74.209 29.791 76.000 32.000 76.000 C 34.209 76.000 36.000 74.209 36.000 72.000 L 36.000 60.000 L 76.000 60.000 L 76.000 132.000 L 64.000 132.000 C 61.791 132.000 60.000 133.791 60.000 136.000 C 60.000 138.209 61.791 140.000 64.000 140.000 Z"),
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
        return _articleNyTimes!!
    }

private var _articleNyTimes: ImageVector? = null
