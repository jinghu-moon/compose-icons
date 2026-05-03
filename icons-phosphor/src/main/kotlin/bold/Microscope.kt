package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Microscope: ImageVector
    get() {
        if (_microscope != null) return _microscope!!
        _microscope = phosphorBoldIcon(
            name = "Microscope",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 224.000 204.000 L 212.000 204.000 C 230.027 177.584 233.060 143.708 220.012 114.510 C 206.965 85.312 179.705 64.973 148.000 60.780 L 148.000 32.000 C 148.000 20.954 139.046 12.000 128.000 12.000 L 80.000 12.000 C 68.954 12.000 60.000 20.954 60.000 32.000 L 60.000 128.000 C 60.000 139.046 68.954 148.000 80.000 148.000 L 128.000 148.000 C 139.046 148.000 148.000 139.046 148.000 128.000 L 148.000 85.080 C 180.383 90.927 203.953 119.093 204.000 152.000 C 204.085 172.069 195.221 191.132 179.820 204.000 L 32.000 204.000 C 25.373 204.000 20.000 209.373 20.000 216.000 C 20.000 222.627 25.373 228.000 32.000 228.000 L 224.000 228.000 C 230.627 228.000 236.000 222.627 236.000 216.000 C 236.000 209.373 230.627 204.000 224.000 204.000 ZM 124.000 124.000 L 84.000 124.000 L 84.000 36.000 L 124.000 36.000 ZM 72.000 188.000 C 65.373 188.000 60.000 182.627 60.000 176.000 C 60.000 169.373 65.373 164.000 72.000 164.000 L 136.000 164.000 C 142.627 164.000 148.000 169.373 148.000 176.000 C 148.000 182.627 142.627 188.000 136.000 188.000 Z"),
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
        return _microscope!!
    }

private var _microscope: ImageVector? = null
