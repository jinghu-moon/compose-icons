package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.FloppyDisk: ImageVector
    get() {
        if (_floppyDisk != null) return _floppyDisk!!
        _floppyDisk = phosphorBoldIcon(
            name = "FloppyDisk",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 222.140 69.170 L 186.830 33.860 C 183.089 30.096 177.997 27.986 172.690 28.000 L 48.000 28.000 C 36.954 28.000 28.000 36.954 28.000 48.000 L 28.000 208.000 C 28.000 219.046 36.954 228.000 48.000 228.000 L 208.000 228.000 C 219.046 228.000 228.000 219.046 228.000 208.000 L 228.000 83.310 C 228.014 78.003 225.904 72.911 222.140 69.170 ZM 164.000 204.000 L 92.000 204.000 L 92.000 160.000 L 164.000 160.000 ZM 204.000 204.000 L 188.000 204.000 L 188.000 156.000 C 188.000 144.954 179.046 136.000 168.000 136.000 L 88.000 136.000 C 76.954 136.000 68.000 144.954 68.000 156.000 L 68.000 204.000 L 52.000 204.000 L 52.000 52.000 L 171.000 52.000 L 204.000 85.000 ZM 164.000 84.000 C 164.000 90.627 158.627 96.000 152.000 96.000 L 96.000 96.000 C 89.373 96.000 84.000 90.627 84.000 84.000 C 84.000 77.373 89.373 72.000 96.000 72.000 L 152.000 72.000 C 158.627 72.000 164.000 77.373 164.000 84.000 Z"),
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
        return _floppyDisk!!
    }

private var _floppyDisk: ImageVector? = null
