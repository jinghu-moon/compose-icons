package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.VideoCamera: ImageVector
    get() {
        if (_videoCamera != null) return _videoCamera!!
        _videoCamera = phosphorDuotoneIcon(
            name = "VideoCamera",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            group(
                groupAlpha = 0.2f,
            ) {
                addPath(
                    pathData = parseSvgPathData("M 200.000 72.000 L 200.000 184.000 C 200.000 188.418 196.418 192.000 192.000 192.000 L 32.000 192.000 C 27.582 192.000 24.000 188.418 24.000 184.000 L 24.000 72.000 C 24.000 67.582 27.582 64.000 32.000 64.000 L 192.000 64.000 C 196.418 64.000 200.000 67.582 200.000 72.000 Z"),
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
            addPath(
                pathData = parseSvgPathData("M 251.770 73.000 C 249.171 71.607 246.016 71.757 243.560 73.390 L 208.000 97.050 L 208.000 72.000 C 208.000 63.163 200.837 56.000 192.000 56.000 L 32.000 56.000 C 23.163 56.000 16.000 63.163 16.000 72.000 L 16.000 184.000 C 16.000 192.837 23.163 200.000 32.000 200.000 L 192.000 200.000 C 200.837 200.000 208.000 192.837 208.000 184.000 L 208.000 159.000 L 243.560 182.710 C 244.881 183.568 246.425 184.016 248.000 184.000 C 252.418 184.000 256.000 180.418 256.000 176.000 L 256.000 80.000 C 255.979 77.068 254.356 74.382 251.770 73.000 ZM 192.000 184.000 L 32.000 184.000 L 32.000 72.000 L 192.000 72.000 L 192.000 184.000 ZM 240.000 161.050 L 208.000 139.720 L 208.000 116.280 L 240.000 95.000 Z"),
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
