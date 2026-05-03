package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Disc: ImageVector
    get() {
        if (_disc != null) return _disc!!
        _disc = phosphorThinIcon(
            name = "Disc",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 128.000 28.000 C 72.772 28.000 28.000 72.772 28.000 128.000 C 28.000 183.228 72.772 228.000 128.000 228.000 C 183.228 228.000 228.000 183.228 228.000 128.000 C 227.939 72.797 183.203 28.061 128.000 28.000 ZM 163.770 124.000 C 163.020 117.247 160.363 110.848 156.110 105.550 L 195.790 65.870 C 210.440 81.792 218.984 102.384 219.910 124.000 ZM 156.000 128.000 C 156.000 143.464 143.464 156.000 128.000 156.000 C 112.536 156.000 100.000 143.464 100.000 128.000 C 100.000 112.536 112.536 100.000 128.000 100.000 C 143.464 100.000 156.000 112.536 156.000 128.000 ZM 128.000 220.000 C 86.842 220.030 50.671 192.720 39.430 153.126 C 28.189 113.532 44.614 71.290 79.649 49.689 C 114.683 28.088 159.802 32.384 190.130 60.210 L 150.450 99.890 C 137.613 89.642 119.467 89.383 106.343 99.260 C 93.218 109.138 88.444 126.646 94.738 141.819 C 101.032 156.991 116.797 165.979 133.059 163.666 C 149.322 161.353 161.956 148.325 163.770 132.000 L 219.910 132.000 C 217.713 181.182 177.231 219.942 128.000 220.000 Z"),
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
        return _disc!!
    }

private var _disc: ImageVector? = null
