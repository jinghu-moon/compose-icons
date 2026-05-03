package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.TextHThree: ImageVector
    get() {
        if (_textHThree != null) return _textHThree!!
        _textHThree = phosphorFillIcon(
            name = "TextHThree",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 208.000 32.000 L 48.000 32.000 C 39.163 32.000 32.000 39.163 32.000 48.000 L 32.000 208.000 C 32.000 216.837 39.163 224.000 48.000 224.000 L 208.000 224.000 C 216.837 224.000 224.000 216.837 224.000 208.000 L 224.000 48.000 C 224.000 39.163 216.837 32.000 208.000 32.000 ZM 128.000 160.000 C 128.000 164.418 124.418 168.000 120.000 168.000 C 115.582 168.000 112.000 164.418 112.000 160.000 L 112.000 128.000 L 72.000 128.000 L 72.000 160.000 C 72.000 164.418 68.418 168.000 64.000 168.000 C 59.582 168.000 56.000 164.418 56.000 160.000 L 56.000 80.000 C 56.000 75.582 59.582 72.000 64.000 72.000 C 68.418 72.000 72.000 75.582 72.000 80.000 L 72.000 112.000 L 112.000 112.000 L 112.000 80.000 C 112.000 75.582 115.582 72.000 120.000 72.000 C 124.418 72.000 128.000 75.582 128.000 80.000 ZM 168.000 184.000 C 160.126 184.001 152.528 181.100 146.660 175.850 C 143.368 172.901 143.091 167.842 146.040 164.550 C 148.989 161.258 154.048 160.981 157.340 163.930 C 162.657 168.682 170.477 169.341 176.515 165.547 C 182.552 161.753 185.351 154.422 183.376 147.570 C 181.402 140.717 175.131 135.999 168.000 136.000 C 164.970 136.000 162.200 134.288 160.845 131.578 C 159.489 128.867 159.782 125.624 161.600 123.200 L 176.000 104.000 L 152.000 104.000 C 147.582 104.000 144.000 100.418 144.000 96.000 C 144.000 91.582 147.582 88.000 152.000 88.000 L 192.000 88.000 C 195.030 88.000 197.800 89.712 199.155 92.422 C 200.511 95.133 200.218 98.376 198.400 100.800 L 181.690 123.080 C 195.216 129.487 202.495 144.413 199.213 159.016 C 195.932 173.619 182.967 183.996 168.000 184.000 Z"),
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
        return _textHThree!!
    }

private var _textHThree: ImageVector? = null
