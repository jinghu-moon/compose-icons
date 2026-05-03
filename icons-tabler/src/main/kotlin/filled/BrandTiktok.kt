package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.BrandTiktok: ImageVector
    get() {
        if (_brandTiktok != null) return _brandTiktok!!
        _brandTiktok = tablerFilledIcon(
            name = "BrandTiktok",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 16.083 2.000 L 12.000 2.000 C 11.448 2.000 11.000 2.448 11.000 3.000 L 11.000 14.500 C 11.000 15.186 10.535 15.785 9.870 15.954 C 9.205 16.124 8.510 15.820 8.182 15.217 C 7.854 14.615 7.977 13.866 8.481 13.400 L 8.601 13.300 C 8.852 13.111 9.000 12.815 9.000 12.500 L 9.000 8.174 C 9.000 7.868 8.861 7.579 8.621 7.389 C 8.381 7.199 8.068 7.130 7.770 7.200 C 4.063 8.074 1.599 11.588 2.041 15.371 C 2.483 19.154 5.691 22.005 9.500 22.000 L 9.743 21.995 C 13.788 21.864 16.999 18.547 17.000 14.500 L 17.000 11.800 L 17.311 11.953 C 18.433 12.483 19.644 12.821 20.901 12.946 C 21.182 12.974 21.462 12.882 21.672 12.692 C 21.881 12.502 22.000 12.233 22.000 11.950 L 22.000 7.917 C 22.000 7.429 21.647 7.012 21.166 6.931 C 19.069 6.575 17.425 4.932 17.069 2.835 C 16.988 2.353 16.571 2.000 16.083 2.000 Z"),
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
        return _brandTiktok!!
    }

private var _brandTiktok: ImageVector? = null
