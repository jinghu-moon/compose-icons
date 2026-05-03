package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.GoodreadsLogo: ImageVector
    get() {
        if (_goodreadsLogo != null) return _goodreadsLogo!!
        _goodreadsLogo = phosphorRegularIcon(
            name = "GoodreadsLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 184.000 24.000 C 179.582 24.000 176.000 27.582 176.000 32.000 L 176.000 45.740 C 158.403 25.787 130.297 18.801 105.406 28.193 C 80.515 37.585 64.030 61.396 64.000 88.000 L 64.000 112.000 C 64.030 138.604 80.515 162.415 105.406 171.807 C 130.297 181.199 158.403 174.213 176.000 154.260 L 176.000 168.000 C 175.972 194.498 154.498 215.972 128.000 216.000 C 111.550 216.000 95.280 207.920 86.560 195.420 C 84.031 191.797 79.043 190.911 75.420 193.440 C 71.797 195.969 70.911 200.957 73.440 204.580 C 85.060 221.240 106.480 232.000 128.000 232.000 C 163.330 231.961 191.961 203.330 192.000 168.000 L 192.000 32.000 C 192.000 27.582 188.418 24.000 184.000 24.000 ZM 128.000 160.000 C 101.502 159.972 80.028 138.498 80.000 112.000 L 80.000 88.000 C 80.000 61.490 101.490 40.000 128.000 40.000 C 154.510 40.000 176.000 61.490 176.000 88.000 L 176.000 112.000 C 175.972 138.498 154.498 159.972 128.000 160.000 Z"),
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
        return _goodreadsLogo!!
    }

private var _goodreadsLogo: ImageVector? = null
