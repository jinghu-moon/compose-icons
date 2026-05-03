package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Question: ImageVector
    get() {
        if (_question != null) return _question!!
        _question = phosphorThinIcon(
            name = "Question",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 136.000 180.000 C 136.000 184.418 132.418 188.000 128.000 188.000 C 123.582 188.000 120.000 184.418 120.000 180.000 C 120.000 175.582 123.582 172.000 128.000 172.000 C 132.418 172.000 136.000 175.582 136.000 180.000 ZM 128.000 76.000 C 108.150 76.000 92.000 90.360 92.000 108.000 L 92.000 112.000 C 92.000 114.209 93.791 116.000 96.000 116.000 C 98.209 116.000 100.000 114.209 100.000 112.000 L 100.000 108.000 C 100.000 94.770 112.560 84.000 128.000 84.000 C 143.440 84.000 156.000 94.770 156.000 108.000 C 156.000 121.230 143.440 132.000 128.000 132.000 C 125.791 132.000 124.000 133.791 124.000 136.000 L 124.000 144.000 C 124.000 146.209 125.791 148.000 128.000 148.000 C 130.209 148.000 132.000 146.209 132.000 144.000 L 132.000 139.800 C 150.000 138.030 164.000 124.440 164.000 108.000 C 164.000 90.360 147.850 76.000 128.000 76.000 ZM 228.000 128.000 C 228.000 183.228 183.228 228.000 128.000 228.000 C 72.772 228.000 28.000 183.228 28.000 128.000 C 28.000 72.772 72.772 28.000 128.000 28.000 C 183.203 28.061 227.939 72.797 228.000 128.000 ZM 220.000 128.000 C 220.000 77.190 178.810 36.000 128.000 36.000 C 77.190 36.000 36.000 77.190 36.000 128.000 C 36.000 178.810 77.190 220.000 128.000 220.000 C 178.787 219.945 219.945 178.787 220.000 128.000 Z"),
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
        return _question!!
    }

private var _question: ImageVector? = null
