package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Percent: ImageVector
    get() {
        if (_percent != null) return _percent!!
        _percent = phosphorBoldIcon(
            name = "Percent",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 208.490 64.470 L 64.490 208.470 C 59.796 213.164 52.184 213.164 47.490 208.470 C 42.796 203.776 42.796 196.164 47.490 191.470 L 191.490 47.470 C 196.184 42.776 203.796 42.776 208.490 47.470 C 213.184 52.164 213.184 59.776 208.490 64.470 ZM 47.720 104.270 C 34.233 90.770 32.161 69.622 42.771 53.761 C 53.380 37.899 73.717 31.741 91.344 39.052 C 108.970 46.363 118.978 65.108 115.246 83.822 C 111.515 102.537 95.083 116.009 76.000 116.000 C 65.385 116.026 55.200 111.802 47.720 104.270 ZM 60.000 76.000 C 59.996 83.633 65.386 90.206 72.872 91.699 C 80.358 93.191 87.856 89.187 90.780 82.136 C 93.704 75.085 91.239 66.950 84.894 62.707 C 78.549 58.464 70.089 59.294 64.690 64.690 C 61.677 67.681 59.988 71.754 60.000 76.000 ZM 220.000 180.000 C 219.999 199.082 206.520 215.507 187.804 219.230 C 169.088 222.953 150.349 212.937 143.046 195.308 C 135.742 177.679 141.909 157.345 157.774 146.742 C 173.639 136.139 194.785 138.219 208.280 151.710 C 215.812 159.194 220.033 169.382 220.000 180.000 ZM 196.000 180.000 C 196.015 175.751 194.326 171.673 191.310 168.680 L 191.310 168.680 C 185.911 163.285 177.453 162.454 171.108 166.696 C 164.763 170.937 162.297 179.070 165.218 186.122 C 168.140 193.173 175.635 197.179 183.121 195.690 C 190.607 194.201 195.999 187.632 196.000 180.000 Z"),
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
        return _percent!!
    }

private var _percent: ImageVector? = null
