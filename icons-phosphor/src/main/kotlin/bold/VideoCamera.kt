package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.VideoCamera: ImageVector
    get() {
        if (_videoCamera != null) return _videoCamera!!
        _videoCamera = phosphorBoldIcon(
            name = "VideoCamera",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 249.450 69.310 C 245.424 67.262 240.590 67.649 236.940 70.310 L 212.000 88.430 L 212.000 72.000 C 212.000 60.954 203.046 52.000 192.000 52.000 L 32.000 52.000 C 20.954 52.000 12.000 60.954 12.000 72.000 L 12.000 184.000 C 12.000 195.046 20.954 204.000 32.000 204.000 L 192.000 204.000 C 203.046 204.000 212.000 195.046 212.000 184.000 L 212.000 167.570 L 236.940 185.710 C 240.591 188.366 245.424 188.749 249.447 186.699 C 253.470 184.649 256.002 180.515 256.000 176.000 L 256.000 80.000 C 256.000 75.489 253.469 71.359 249.450 69.310 ZM 188.000 180.000 L 36.000 180.000 L 36.000 76.000 L 188.000 76.000 ZM 232.000 152.430 L 212.000 137.890 L 212.000 118.110 L 232.000 103.570 Z"),
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
        return _videoCamera!!
    }

private var _videoCamera: ImageVector? = null
