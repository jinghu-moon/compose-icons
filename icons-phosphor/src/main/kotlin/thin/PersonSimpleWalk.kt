package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.PersonSimpleWalk: ImageVector
    get() {
        if (_personSimpleWalk != null) return _personSimpleWalk!!
        _personSimpleWalk = phosphorThinIcon(
            name = "PersonSimpleWalk",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 152.000 76.000 C 167.464 76.000 180.000 63.464 180.000 48.000 C 180.000 32.536 167.464 20.000 152.000 20.000 C 136.536 20.000 124.000 32.536 124.000 48.000 C 124.000 63.464 136.536 76.000 152.000 76.000 ZM 152.000 28.000 C 163.046 28.000 172.000 36.954 172.000 48.000 C 172.000 59.046 163.046 68.000 152.000 68.000 C 140.954 68.000 132.000 59.046 132.000 48.000 C 132.000 36.954 140.954 28.000 152.000 28.000 ZM 212.000 144.000 C 212.000 146.209 210.209 148.000 208.000 148.000 C 174.350 148.000 158.080 131.570 143.720 117.070 C 140.200 113.500 136.860 110.140 133.380 107.070 C 132.720 106.500 132.040 105.980 131.380 105.480 L 114.520 144.250 L 154.360 172.700 C 155.411 173.468 156.023 174.699 156.000 176.000 L 156.000 232.000 C 156.000 234.209 154.209 236.000 152.000 236.000 C 149.791 236.000 148.000 234.209 148.000 232.000 L 148.000 178.060 L 111.230 151.800 L 75.670 233.590 C 74.789 235.617 72.432 236.546 70.405 235.665 C 68.378 234.784 67.449 232.427 68.330 230.400 L 124.260 101.780 C 94.560 91.230 51.260 131.420 50.740 131.870 C 49.119 133.383 46.578 133.296 45.065 131.675 C 43.552 130.054 43.639 127.513 45.260 126.000 C 55.259 116.946 66.280 109.089 78.100 102.590 C 103.250 89.050 124.170 88.530 138.620 101.070 C 142.330 104.300 145.770 107.770 149.410 111.440 C 163.310 125.440 177.690 140.000 208.000 140.000 C 210.209 140.000 212.000 141.791 212.000 144.000 Z"),
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
        return _personSimpleWalk!!
    }

private var _personSimpleWalk: ImageVector? = null
