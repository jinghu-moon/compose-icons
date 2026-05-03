package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.OrangeSlice: ImageVector
    get() {
        if (_orangeSlice != null) return _orangeSlice!!
        _orangeSlice = phosphorRegularIcon(
            name = "OrangeSlice",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 248.000 80.000 L 8.000 80.000 C 3.582 80.000 0.000 83.582 0.000 88.000 C 0.000 158.692 57.308 216.000 128.000 216.000 C 198.692 216.000 256.000 158.692 256.000 88.000 C 256.000 83.582 252.418 80.000 248.000 80.000 ZM 77.400 149.910 L 120.000 107.310 L 120.000 167.600 C 104.365 166.038 89.542 159.882 77.400 149.910 ZM 66.090 138.600 C 56.118 126.458 49.962 111.635 48.400 96.000 L 108.690 96.000 ZM 136.000 107.310 L 178.600 149.910 C 166.458 159.882 151.635 166.038 136.000 167.600 ZM 189.910 138.600 L 147.310 96.000 L 207.600 96.000 C 206.038 111.635 199.882 126.458 189.910 138.600 ZM 128.000 200.000 C 69.275 199.930 20.548 154.570 16.280 96.000 L 32.340 96.000 C 36.535 145.713 78.110 183.928 128.000 183.928 C 177.890 183.928 219.465 145.713 223.660 96.000 L 239.720 96.000 C 235.452 154.570 186.725 199.930 128.000 200.000 Z"),
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
        return _orangeSlice!!
    }

private var _orangeSlice: ImageVector? = null
