package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Belt: ImageVector
    get() {
        if (_belt != null) return _belt!!
        _belt = phosphorThinIcon(
            name = "Belt",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 248.000 164.000 L 188.000 164.000 L 188.000 92.000 L 248.000 92.000 C 250.209 92.000 252.000 90.209 252.000 88.000 C 252.000 85.791 250.209 84.000 248.000 84.000 L 187.300 84.000 C 185.607 79.210 181.080 76.006 176.000 76.000 L 112.000 76.000 C 106.920 76.006 102.393 79.210 100.700 84.000 L 60.000 84.000 L 60.000 80.000 C 60.000 77.791 58.209 76.000 56.000 76.000 C 53.791 76.000 52.000 77.791 52.000 80.000 L 52.000 84.000 L 8.000 84.000 C 5.791 84.000 4.000 85.791 4.000 88.000 C 4.000 90.209 5.791 92.000 8.000 92.000 L 52.000 92.000 L 52.000 164.000 L 8.000 164.000 C 5.791 164.000 4.000 165.791 4.000 168.000 C 4.000 170.209 5.791 172.000 8.000 172.000 L 52.000 172.000 L 52.000 176.000 C 52.000 178.209 53.791 180.000 56.000 180.000 C 58.209 180.000 60.000 178.209 60.000 176.000 L 60.000 172.000 L 100.700 172.000 C 102.393 176.790 106.920 179.994 112.000 180.000 L 176.000 180.000 C 181.080 179.994 185.607 176.790 187.300 172.000 L 248.000 172.000 C 250.209 172.000 252.000 170.209 252.000 168.000 C 252.000 165.791 250.209 164.000 248.000 164.000 ZM 60.000 92.000 L 100.000 92.000 L 100.000 164.000 L 60.000 164.000 ZM 176.000 172.000 L 112.000 172.000 C 109.791 172.000 108.000 170.209 108.000 168.000 L 108.000 88.000 C 108.000 85.791 109.791 84.000 112.000 84.000 L 176.000 84.000 C 178.209 84.000 180.000 85.791 180.000 88.000 L 180.000 124.000 L 144.000 124.000 C 141.791 124.000 140.000 125.791 140.000 128.000 C 140.000 130.209 141.791 132.000 144.000 132.000 L 180.000 132.000 L 180.000 168.000 C 180.000 170.209 178.209 172.000 176.000 172.000 Z"),
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
        return _belt!!
    }

private var _belt: ImageVector? = null
