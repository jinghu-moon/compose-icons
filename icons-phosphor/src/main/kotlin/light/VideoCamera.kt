package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.VideoCamera: ImageVector
    get() {
        if (_videoCamera != null) return _videoCamera!!
        _videoCamera = phosphorLightIcon(
            name = "VideoCamera",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 250.830 74.710 C 248.878 73.666 246.511 73.782 244.670 75.010 L 206.000 100.790 L 206.000 72.000 C 206.000 64.268 199.732 58.000 192.000 58.000 L 32.000 58.000 C 24.268 58.000 18.000 64.268 18.000 72.000 L 18.000 184.000 C 18.000 191.732 24.268 198.000 32.000 198.000 L 192.000 198.000 C 199.732 198.000 206.000 191.732 206.000 184.000 L 206.000 155.210 L 244.670 181.000 C 246.512 182.229 248.882 182.344 250.834 181.297 C 252.786 180.251 254.003 178.215 254.000 176.000 L 254.000 80.000 C 254.000 77.787 252.781 75.754 250.830 74.710 ZM 194.000 184.000 C 194.000 185.105 193.105 186.000 192.000 186.000 L 32.000 186.000 C 30.895 186.000 30.000 185.105 30.000 184.000 L 30.000 72.000 C 30.000 70.895 30.895 70.000 32.000 70.000 L 192.000 70.000 C 193.105 70.000 194.000 70.895 194.000 72.000 ZM 242.000 164.790 L 206.000 140.790 L 206.000 115.210 L 242.000 91.210 Z"),
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
