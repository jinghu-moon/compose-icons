package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.GoodreadsLogo: ImageVector
    get() {
        if (_goodreadsLogo != null) return _goodreadsLogo!!
        _goodreadsLogo = phosphorFillIcon(
            name = "GoodreadsLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 200.000 24.000 L 56.000 24.000 C 47.163 24.000 40.000 31.163 40.000 40.000 L 40.000 216.000 C 40.000 224.837 47.163 232.000 56.000 232.000 L 200.000 232.000 C 208.837 232.000 216.000 224.837 216.000 216.000 L 216.000 40.000 C 216.000 31.163 208.837 24.000 200.000 24.000 ZM 176.000 160.000 C 176.000 180.661 162.779 199.003 143.179 205.537 C 123.579 212.070 101.996 205.329 89.600 188.800 C 86.949 185.265 87.665 180.251 91.200 177.600 C 94.735 174.949 99.749 175.665 102.400 179.200 C 110.664 190.219 125.052 194.714 138.119 190.358 C 151.186 186.002 160.000 173.774 160.000 160.000 L 160.000 147.740 C 145.896 160.355 125.697 163.507 108.421 155.788 C 91.145 148.070 80.015 130.922 80.000 112.000 L 80.000 104.000 C 80.015 85.078 91.145 67.930 108.421 60.212 C 125.697 52.493 145.896 55.645 160.000 68.260 L 160.000 64.000 C 160.000 59.582 163.582 56.000 168.000 56.000 C 172.418 56.000 176.000 59.582 176.000 64.000 ZM 160.000 104.000 L 160.000 112.000 C 160.000 129.673 145.673 144.000 128.000 144.000 C 110.327 144.000 96.000 129.673 96.000 112.000 L 96.000 104.000 C 96.000 86.327 110.327 72.000 128.000 72.000 C 145.673 72.000 160.000 86.327 160.000 104.000 Z"),
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
        return _goodreadsLogo!!
    }

private var _goodreadsLogo: ImageVector? = null
