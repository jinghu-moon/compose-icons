package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.VideoCamera: ImageVector
    get() {
        if (_videoCamera != null) return _videoCamera!!
        _videoCamera = phosphorDuotoneIcon(
            name = "VideoCamera",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(200.0f, 72.0f),
                    PathNode.LineTo(200.0f, 184.0f),
                    PathNode.CurveTo(200.0f, 188.41827f, 196.41827f, 192.0f, 192.0f, 192.0f),
                    PathNode.LineTo(32.0f, 192.0f),
                    PathNode.CurveTo(27.581722f, 192.0f, 24.0f, 188.41827f, 24.0f, 184.0f),
                    PathNode.LineTo(24.0f, 72.0f),
                    PathNode.CurveTo(24.0f, 67.58172f, 27.581722f, 64.0f, 32.0f, 64.0f),
                    PathNode.LineTo(192.0f, 64.0f),
                    PathNode.CurveTo(196.41827f, 64.0f, 200.0f, 67.58172f, 200.0f, 72.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 0.2f,
                stroke = null,
                strokeAlpha = 0.2f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(251.77f, 73.0f),
                    PathNode.CurveTo(249.17065f, 71.60676f, 246.01558f, 71.75663f, 243.56f, 73.39f),
                    PathNode.LineTo(208.0f, 97.05f),
                    PathNode.LineTo(208.0f, 72.0f),
                    PathNode.CurveTo(208.0f, 63.163445f, 200.83656f, 56.0f, 192.0f, 56.0f),
                    PathNode.LineTo(32.0f, 56.0f),
                    PathNode.CurveTo(23.163445f, 56.0f, 16.0f, 63.163445f, 16.0f, 72.0f),
                    PathNode.LineTo(16.0f, 184.0f),
                    PathNode.CurveTo(16.0f, 192.83656f, 23.163445f, 200.0f, 32.0f, 200.0f),
                    PathNode.LineTo(192.0f, 200.0f),
                    PathNode.CurveTo(200.83656f, 200.0f, 208.0f, 192.83656f, 208.0f, 184.0f),
                    PathNode.LineTo(208.0f, 159.0f),
                    PathNode.LineTo(243.56f, 182.71f),
                    PathNode.CurveTo(244.88077f, 183.56763f, 246.4253f, 184.01637f, 248.0f, 184.0f),
                    PathNode.CurveTo(252.41827f, 184.0f, 256.0f, 180.41827f, 256.0f, 176.0f),
                    PathNode.LineTo(256.0f, 80.0f),
                    PathNode.CurveTo(255.97943f, 77.067764f, 254.35632f, 74.381775f, 251.77f, 73.0f),
                    PathNode.Close,
                    PathNode.MoveTo(192.0f, 184.0f),
                    PathNode.LineTo(32.0f, 184.0f),
                    PathNode.LineTo(32.0f, 72.0f),
                    PathNode.LineTo(192.0f, 72.0f),
                    PathNode.LineTo(192.0f, 184.0f),
                    PathNode.Close,
                    PathNode.MoveTo(240.0f, 161.05f),
                    PathNode.LineTo(208.0f, 139.72f),
                    PathNode.LineTo(208.0f, 116.28f),
                    PathNode.LineTo(240.0f, 95.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _videoCamera!!
    }

private var _videoCamera: ImageVector? = null
