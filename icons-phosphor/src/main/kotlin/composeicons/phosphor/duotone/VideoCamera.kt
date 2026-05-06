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
            addPath(
                pathData = parseSvgPathData("M200 72v112c0 4.418-3.582 8-8 8h-160c-4.418 0-8-3.582-8-8v-112c0-4.418 3.582-8 8-8h160c4.418 0 8 3.582 8 8Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.2f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
            addPath(
                pathData = parseSvgPathData("M251.77 73c-2.599-1.393-5.754-1.243-8.21 .39L208 97.05v-25.05c0-8.837-7.163-16-16-16h-160C23.163 56 16 63.163 16 72v112c0 8.837 7.163 16 16 16h160c8.837 0 16-7.163 16-16v-25l35.56 23.71c1.321 .858 2.865 1.306 4.44 1.29 4.418 0 8-3.582 8-8v-96c-.021-2.932-1.644-5.618-4.23-7ZM192 184h-160v-112h160v112ZM240 161.05 208 139.72v-23.44L240 95Z"),
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
