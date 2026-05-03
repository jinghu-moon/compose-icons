package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Target: ImageVector
    get() {
        if (_target != null) return _target!!
        _target = phosphorBoldIcon(
            name = "Target",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 229.260 90.400 C 246.985 138.009 229.134 191.535 186.380 218.974 C 143.626 246.412 87.529 240.345 51.630 204.400 C 10.990 163.894 9.119 98.681 47.369 55.911 C 85.619 13.142 150.635 7.748 195.410 43.630 L 215.510 23.520 C 220.204 18.826 227.816 18.826 232.510 23.520 C 237.204 28.214 237.204 35.826 232.510 40.520 L 136.510 136.520 C 131.816 141.214 124.204 141.214 119.510 136.520 C 114.816 131.826 114.816 124.214 119.510 119.520 L 143.510 95.520 C 129.643 88.895 113.100 91.803 102.324 102.760 C 91.548 113.717 88.915 130.306 95.770 144.060 C 102.625 157.815 117.455 165.702 132.692 163.695 C 147.928 161.688 160.211 150.230 163.270 135.170 C 164.579 128.672 170.907 124.466 177.405 125.775 C 183.903 127.084 188.109 133.412 186.800 139.910 C 181.552 165.760 160.038 185.151 133.783 187.694 C 107.528 190.237 82.693 175.334 72.582 150.971 C 62.471 126.609 69.458 98.500 89.798 81.706 C 110.138 64.912 139.061 63.371 161.070 77.910 L 178.300 60.740 C 144.842 35.752 98.108 39.137 68.599 68.686 C 39.091 98.234 35.769 144.972 60.803 178.397 C 85.836 211.821 131.621 221.781 168.277 201.776 C 204.933 181.771 221.327 137.876 206.760 98.740 C 205.234 94.713 205.983 90.176 208.723 86.853 C 211.463 83.530 215.773 81.930 220.018 82.661 C 224.262 83.392 227.789 86.342 229.260 90.390 Z"),
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
        return _target!!
    }

private var _target: ImageVector? = null
