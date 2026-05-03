package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.SmileyWink: ImageVector
    get() {
        if (_smileyWink != null) return _smileyWink!!
        _smileyWink = phosphorFillIcon(
            name = "SmileyWink",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 128.000 24.000 C 70.562 24.000 24.000 70.562 24.000 128.000 C 24.000 185.438 70.562 232.000 128.000 232.000 C 185.438 232.000 232.000 185.438 232.000 128.000 C 231.939 70.588 185.412 24.061 128.000 24.000 ZM 92.000 96.000 C 98.627 96.000 104.000 101.373 104.000 108.000 C 104.000 114.627 98.627 120.000 92.000 120.000 C 85.373 120.000 80.000 114.627 80.000 108.000 C 80.000 101.373 85.373 96.000 92.000 96.000 ZM 174.920 156.000 C 164.630 173.790 147.530 184.000 128.000 184.000 C 108.470 184.000 91.370 173.800 81.080 156.000 C 79.504 153.520 79.414 150.376 80.846 147.809 C 82.278 145.243 85.001 143.669 87.940 143.709 C 90.878 143.749 93.558 145.396 94.920 148.000 C 102.390 160.910 114.130 168.000 128.000 168.000 C 141.870 168.000 153.610 160.900 161.080 148.000 C 162.442 145.396 165.122 143.749 168.060 143.709 C 170.999 143.669 173.722 145.243 175.154 147.809 C 176.586 150.376 176.496 153.520 174.920 156.000 ZM 184.000 116.000 L 152.000 116.000 C 147.582 116.000 144.000 112.418 144.000 108.000 C 144.000 103.582 147.582 100.000 152.000 100.000 L 184.000 100.000 C 188.418 100.000 192.000 103.582 192.000 108.000 C 192.000 112.418 188.418 116.000 184.000 116.000 Z"),
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
        return _smileyWink!!
    }

private var _smileyWink: ImageVector? = null
