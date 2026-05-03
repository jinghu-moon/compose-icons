package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.VideoCamera: ImageVector
    get() {
        if (_videoCamera != null) return _videoCamera!!
        _videoCamera = phosphorThinIcon(
            name = "VideoCamera",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 249.890 76.470 C 248.588 75.773 247.008 75.850 245.780 76.670 L 204.000 104.530 L 204.000 72.000 C 204.000 65.373 198.627 60.000 192.000 60.000 L 32.000 60.000 C 25.373 60.000 20.000 65.373 20.000 72.000 L 20.000 184.000 C 20.000 190.627 25.373 196.000 32.000 196.000 L 192.000 196.000 C 198.627 196.000 204.000 190.627 204.000 184.000 L 204.000 151.470 L 245.780 179.330 C 247.008 180.149 248.587 180.226 249.888 179.529 C 251.189 178.832 252.001 177.476 252.000 176.000 L 252.000 80.000 C 252.002 78.524 251.191 77.167 249.890 76.470 ZM 196.000 184.000 C 196.000 186.209 194.209 188.000 192.000 188.000 L 32.000 188.000 C 29.791 188.000 28.000 186.209 28.000 184.000 L 28.000 72.000 C 28.000 69.791 29.791 68.000 32.000 68.000 L 192.000 68.000 C 194.209 68.000 196.000 69.791 196.000 72.000 ZM 244.000 168.530 L 204.000 141.860 L 204.000 114.140 L 244.000 87.470 Z"),
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
