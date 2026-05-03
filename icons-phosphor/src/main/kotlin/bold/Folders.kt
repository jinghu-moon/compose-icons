package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Folders: ImageVector
    get() {
        if (_folders != null) return _folders!!
        _folders = phosphorBoldIcon(
            name = "Folders",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 228.000 56.000 L 160.000 56.000 L 133.330 36.000 C 129.864 33.411 125.656 32.009 121.330 32.000 L 76.000 32.000 C 64.954 32.000 56.000 40.954 56.000 52.000 L 56.000 72.000 L 36.000 72.000 C 24.954 72.000 16.000 80.954 16.000 92.000 L 16.000 204.000 C 16.000 215.046 24.954 224.000 36.000 224.000 L 188.890 224.000 C 199.440 223.989 207.989 215.440 208.000 204.890 L 208.000 184.000 L 228.890 184.000 C 239.440 183.989 247.989 175.440 248.000 164.890 L 248.000 76.000 C 248.000 64.954 239.046 56.000 228.000 56.000 ZM 184.000 200.000 L 40.000 200.000 L 40.000 96.000 L 80.000 96.000 L 108.800 117.600 C 110.877 119.158 113.404 120.000 116.000 120.000 L 184.000 120.000 ZM 224.000 160.000 L 208.000 160.000 L 208.000 116.000 C 208.000 104.954 199.046 96.000 188.000 96.000 L 120.000 96.000 L 93.330 76.000 C 89.864 73.411 85.656 72.009 81.330 72.000 L 80.000 72.000 L 80.000 56.000 L 120.000 56.000 L 148.800 77.600 C 150.877 79.158 153.404 80.000 156.000 80.000 L 224.000 80.000 Z"),
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
        return _folders!!
    }

private var _folders: ImageVector? = null
