package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.FloppyDiskBack: ImageVector
    get() {
        if (_floppyDiskBack != null) return _floppyDiskBack!!
        _floppyDiskBack = phosphorBoldIcon(
            name = "FloppyDiskBack",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 208.000 28.000 L 83.310 28.000 C 78.003 27.986 72.911 30.096 69.170 33.860 L 33.860 69.170 C 30.096 72.911 27.986 78.003 28.000 83.310 L 28.000 208.000 C 28.000 219.046 36.954 228.000 48.000 228.000 L 208.000 228.000 C 219.046 228.000 228.000 219.046 228.000 208.000 L 228.000 48.000 C 228.000 36.954 219.046 28.000 208.000 28.000 ZM 92.000 52.000 L 164.000 52.000 L 164.000 72.000 L 92.000 72.000 ZM 204.000 204.000 L 52.000 204.000 L 52.000 85.000 L 68.000 69.000 L 68.000 76.000 C 68.000 87.046 76.954 96.000 88.000 96.000 L 168.000 96.000 C 179.046 96.000 188.000 87.046 188.000 76.000 L 188.000 52.000 L 204.000 52.000 ZM 128.000 108.000 C 104.804 108.000 86.000 126.804 86.000 150.000 C 86.000 173.196 104.804 192.000 128.000 192.000 C 151.196 192.000 170.000 173.196 170.000 150.000 C 170.000 126.804 151.196 108.000 128.000 108.000 ZM 128.000 168.000 C 118.059 168.000 110.000 159.941 110.000 150.000 C 110.000 140.059 118.059 132.000 128.000 132.000 C 137.941 132.000 146.000 140.059 146.000 150.000 C 146.000 159.941 137.941 168.000 128.000 168.000 Z"),
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
        return _floppyDiskBack!!
    }

private var _floppyDiskBack: ImageVector? = null
