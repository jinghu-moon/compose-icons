package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.DiamondsFour: ImageVector
    get() {
        if (_diamondsFour != null) return _diamondsFour!!
        _diamondsFour = phosphorRegularIcon(
            name = "DiamondsFour",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 122.340 109.660 C 123.841 111.162 125.877 112.006 128.000 112.006 C 130.123 112.006 132.159 111.162 133.660 109.660 L 173.660 69.660 C 175.162 68.159 176.006 66.123 176.006 64.000 C 176.006 61.877 175.162 59.841 173.660 58.340 L 133.660 18.340 C 132.159 16.838 130.123 15.994 128.000 15.994 C 125.877 15.994 123.841 16.838 122.340 18.340 L 82.340 58.340 C 80.838 59.841 79.994 61.877 79.994 64.000 C 79.994 66.123 80.838 68.159 82.340 69.660 ZM 128.000 35.310 L 156.690 64.000 L 128.000 92.690 L 99.310 64.000 ZM 133.660 146.310 C 132.159 144.808 130.123 143.964 128.000 143.964 C 125.877 143.964 123.841 144.808 122.340 146.310 L 82.340 186.310 C 80.838 187.811 79.994 189.847 79.994 191.970 C 79.994 194.093 80.838 196.129 82.340 197.630 L 122.340 237.630 C 123.841 239.132 125.877 239.976 128.000 239.976 C 130.123 239.976 132.159 239.132 133.660 237.630 L 173.660 197.630 C 175.162 196.129 176.006 194.093 176.006 191.970 C 176.006 189.847 175.162 187.811 173.660 186.310 ZM 128.000 220.690 L 99.310 192.000 L 128.000 163.310 L 156.690 192.000 ZM 237.660 122.340 L 197.660 82.340 C 196.159 80.838 194.123 79.994 192.000 79.994 C 189.877 79.994 187.841 80.838 186.340 82.340 L 146.340 122.340 C 144.838 123.841 143.994 125.877 143.994 128.000 C 143.994 130.123 144.838 132.159 146.340 133.660 L 186.340 173.660 C 187.841 175.162 189.877 176.006 192.000 176.006 C 194.123 176.006 196.159 175.162 197.660 173.660 L 237.660 133.660 C 239.162 132.159 240.006 130.123 240.006 128.000 C 240.006 125.877 239.162 123.841 237.660 122.340 ZM 192.000 156.690 L 163.310 128.000 L 192.000 99.310 L 220.690 128.000 ZM 109.660 122.340 L 69.660 82.340 C 68.159 80.838 66.123 79.994 64.000 79.994 C 61.877 79.994 59.841 80.838 58.340 82.340 L 18.340 122.340 C 16.838 123.841 15.994 125.877 15.994 128.000 C 15.994 130.123 16.838 132.159 18.340 133.660 L 58.340 173.660 C 59.841 175.162 61.877 176.006 64.000 176.006 C 66.123 176.006 68.159 175.162 69.660 173.660 L 109.660 133.660 C 111.162 132.159 112.006 130.123 112.006 128.000 C 112.006 125.877 111.162 123.841 109.660 122.340 ZM 64.000 156.690 L 35.310 128.000 L 64.000 99.310 L 92.690 128.000 Z"),
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
        return _diamondsFour!!
    }

private var _diamondsFour: ImageVector? = null
