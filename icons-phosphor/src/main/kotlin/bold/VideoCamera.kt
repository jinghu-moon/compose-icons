package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
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
                pathData = listOf(
                    PathNode.MoveTo(249.45f, 69.31f),
                    PathNode.CurveTo(245.4241f, 67.26246f, 240.58951f, 67.64892f, 236.94f, 70.31f),
                    PathNode.LineTo(212.0f, 88.43f),
                    PathNode.LineTo(212.0f, 72.0f),
                    PathNode.CurveTo(212.0f, 60.954304f, 203.0457f, 52.0f, 192.0f, 52.0f),
                    PathNode.LineTo(32.0f, 52.0f),
                    PathNode.CurveTo(20.954306f, 52.0f, 12.0f, 60.954304f, 12.0f, 72.0f),
                    PathNode.LineTo(12.0f, 184.0f),
                    PathNode.CurveTo(12.0f, 195.0457f, 20.954306f, 204.0f, 32.0f, 204.0f),
                    PathNode.LineTo(192.0f, 204.0f),
                    PathNode.CurveTo(203.0457f, 204.0f, 212.0f, 195.0457f, 212.0f, 184.0f),
                    PathNode.LineTo(212.0f, 167.57f),
                    PathNode.LineTo(236.94f, 185.71f),
                    PathNode.CurveTo(240.591f, 188.3664f, 245.42409f, 188.74857f, 249.44719f, 186.699f),
                    PathNode.CurveTo(253.47032f, 184.64944f, 256.00247f, 180.5151f, 256.0f, 176.0f),
                    PathNode.LineTo(256.0f, 80.0f),
                    PathNode.CurveTo(255.99962f, 75.48875f, 253.46915f, 71.358864f, 249.45f, 69.31f),
                    PathNode.Close,
                    PathNode.MoveTo(188.0f, 180.0f),
                    PathNode.LineTo(36.0f, 180.0f),
                    PathNode.LineTo(36.0f, 76.0f),
                    PathNode.LineTo(188.0f, 76.0f),
                    PathNode.Close,
                    PathNode.MoveTo(232.0f, 152.43f),
                    PathNode.LineTo(212.0f, 137.89f),
                    PathNode.LineTo(212.0f, 118.11f),
                    PathNode.LineTo(232.0f, 103.57f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 24.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _videoCamera!!
    }

private var _videoCamera: ImageVector? = null
