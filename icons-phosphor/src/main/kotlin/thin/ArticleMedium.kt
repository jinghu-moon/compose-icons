package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.ArticleMedium: ImageVector
    get() {
        if (_articleMedium != null) return _articleMedium!!
        _articleMedium = phosphorThinIcon(
            name = "ArticleMedium",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 52.000 136.000 C 52.000 138.209 50.209 140.000 48.000 140.000 L 24.000 140.000 C 21.791 140.000 20.000 138.209 20.000 136.000 C 20.000 133.791 21.791 132.000 24.000 132.000 L 36.000 132.000 L 36.000 60.000 L 24.000 60.000 C 21.791 60.000 20.000 58.209 20.000 56.000 C 20.000 53.791 21.791 52.000 24.000 52.000 L 40.000 52.000 C 41.376 51.999 42.657 52.705 43.390 53.870 L 80.000 112.450 L 116.610 53.880 C 117.341 52.711 118.622 52.001 120.000 52.000 L 136.000 52.000 C 138.209 52.000 140.000 53.791 140.000 56.000 C 140.000 58.209 138.209 60.000 136.000 60.000 L 124.000 60.000 L 124.000 132.000 L 136.000 132.000 C 138.209 132.000 140.000 133.791 140.000 136.000 C 140.000 138.209 138.209 140.000 136.000 140.000 L 112.000 140.000 C 109.791 140.000 108.000 138.209 108.000 136.000 C 108.000 133.791 109.791 132.000 112.000 132.000 L 116.000 132.000 L 116.000 70.000 L 83.390 122.120 C 82.659 123.288 81.378 123.997 80.000 123.997 C 78.622 123.997 77.341 123.288 76.610 122.120 L 44.000 70.000 L 44.000 132.000 L 48.000 132.000 C 50.209 132.000 52.000 133.791 52.000 136.000 ZM 168.000 108.000 L 232.000 108.000 C 234.209 108.000 236.000 106.209 236.000 104.000 C 236.000 101.791 234.209 100.000 232.000 100.000 L 168.000 100.000 C 165.791 100.000 164.000 101.791 164.000 104.000 C 164.000 106.209 165.791 108.000 168.000 108.000 ZM 232.000 132.000 L 168.000 132.000 C 165.791 132.000 164.000 133.791 164.000 136.000 C 164.000 138.209 165.791 140.000 168.000 140.000 L 232.000 140.000 C 234.209 140.000 236.000 138.209 236.000 136.000 C 236.000 133.791 234.209 132.000 232.000 132.000 ZM 232.000 164.000 L 80.000 164.000 C 77.791 164.000 76.000 165.791 76.000 168.000 C 76.000 170.209 77.791 172.000 80.000 172.000 L 232.000 172.000 C 234.209 172.000 236.000 170.209 236.000 168.000 C 236.000 165.791 234.209 164.000 232.000 164.000 ZM 232.000 196.000 L 80.000 196.000 C 77.791 196.000 76.000 197.791 76.000 200.000 C 76.000 202.209 77.791 204.000 80.000 204.000 L 232.000 204.000 C 234.209 204.000 236.000 202.209 236.000 200.000 C 236.000 197.791 234.209 196.000 232.000 196.000 Z"),
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
        return _articleMedium!!
    }

private var _articleMedium: ImageVector? = null
