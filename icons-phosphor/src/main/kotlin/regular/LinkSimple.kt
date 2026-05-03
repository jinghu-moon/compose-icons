package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.LinkSimple: ImageVector
    get() {
        if (_linkSimple != null) return _linkSimple!!
        _linkSimple = phosphorRegularIcon(
            name = "LinkSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 165.660 90.340 C 167.162 91.841 168.006 93.877 168.006 96.000 C 168.006 98.123 167.162 100.159 165.660 101.660 L 101.660 165.660 C 98.534 168.786 93.466 168.786 90.340 165.660 C 87.214 162.534 87.214 157.466 90.340 154.340 L 154.340 90.340 C 155.841 88.838 157.877 87.994 160.000 87.994 C 162.123 87.994 164.159 88.838 165.660 90.340 ZM 215.600 40.400 C 205.098 29.897 190.853 23.996 176.000 23.996 C 161.147 23.996 146.902 29.897 136.400 40.400 L 106.340 70.450 C 103.214 73.576 103.214 78.644 106.340 81.770 C 109.466 84.896 114.534 84.896 117.660 81.770 L 147.720 51.770 C 163.389 36.446 188.471 36.584 203.970 52.080 C 219.469 67.576 219.612 92.659 204.290 108.330 L 174.220 138.390 C 171.094 141.513 171.092 146.579 174.215 149.705 C 177.338 152.831 182.404 152.833 185.530 149.710 L 215.600 119.600 C 226.103 109.098 232.004 94.853 232.004 80.000 C 232.004 65.147 226.103 50.902 215.600 40.400 ZM 138.340 174.220 L 108.280 204.280 C 98.213 214.573 83.392 218.662 69.471 214.986 C 55.551 211.310 44.680 200.437 41.007 186.517 C 37.334 172.596 41.425 157.775 51.720 147.710 L 81.770 117.660 C 84.896 114.534 84.896 109.466 81.770 106.340 C 78.644 103.214 73.576 103.214 70.450 106.340 L 40.400 136.400 C 18.530 158.270 18.530 193.730 40.400 215.600 C 62.270 237.470 97.730 237.470 119.600 215.600 L 149.660 185.530 C 152.783 182.404 152.781 177.338 149.655 174.215 C 146.529 171.092 141.463 171.094 138.340 174.220 Z"),
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
        return _linkSimple!!
    }

private var _linkSimple: ImageVector? = null
