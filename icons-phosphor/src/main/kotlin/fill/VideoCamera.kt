package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.VideoCamera: ImageVector
    get() {
        if (_videoCamera != null) return _videoCamera!!
        _videoCamera = phosphorFillIcon(
            name = "VideoCamera",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 192.000 72.000 L 192.000 184.000 C 192.000 192.837 184.837 200.000 176.000 200.000 L 32.000 200.000 C 23.163 200.000 16.000 192.837 16.000 184.000 L 16.000 72.000 C 16.000 63.163 23.163 56.000 32.000 56.000 L 176.000 56.000 C 184.837 56.000 192.000 63.163 192.000 72.000 ZM 250.000 72.250 C 247.717 71.691 245.304 72.135 243.370 73.470 L 209.780 95.860 C 208.667 96.602 207.999 97.852 208.000 99.190 L 208.000 156.810 C 207.999 158.148 208.667 159.398 209.780 160.140 L 243.560 182.660 C 246.141 184.382 249.485 184.456 252.140 182.850 C 254.587 181.295 256.049 178.579 256.000 175.680 L 256.000 80.000 C 256.002 76.351 253.534 73.162 250.000 72.250 Z"),
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
        return _videoCamera!!
    }

private var _videoCamera: ImageVector? = null
