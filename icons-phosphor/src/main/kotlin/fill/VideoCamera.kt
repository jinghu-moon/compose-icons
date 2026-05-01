package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.VideoCamera: ImageVector
    get() {
        if (_videoCamera != null) return _videoCamera!!
        _videoCamera = phosphorFillIcon(
            name = "VideoCamera",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(192.0f, 72.0f),
                    PathNode.LineTo(192.0f, 184.0f),
                    PathNode.CurveTo(192.0f, 192.83656f, 184.83656f, 200.0f, 176.0f, 200.0f),
                    PathNode.LineTo(32.0f, 200.0f),
                    PathNode.CurveTo(23.163445f, 200.0f, 16.0f, 192.83656f, 16.0f, 184.0f),
                    PathNode.LineTo(16.0f, 72.0f),
                    PathNode.CurveTo(16.0f, 63.163445f, 23.163445f, 56.0f, 32.0f, 56.0f),
                    PathNode.LineTo(176.0f, 56.0f),
                    PathNode.CurveTo(184.83656f, 56.0f, 192.0f, 63.163445f, 192.0f, 72.0f),
                    PathNode.Close,
                    PathNode.MoveTo(250.0f, 72.25f),
                    PathNode.CurveTo(247.71718f, 71.691376f, 245.30443f, 72.135345f, 243.37f, 73.47f),
                    PathNode.LineTo(209.78f, 95.86f),
                    PathNode.CurveTo(208.66713f, 96.60249f, 207.99913f, 97.85218f, 208.0f, 99.19f),
                    PathNode.LineTo(208.0f, 156.81f),
                    PathNode.CurveTo(207.99913f, 158.14783f, 208.66713f, 159.3975f, 209.78f, 160.14f),
                    PathNode.LineTo(243.56f, 182.66f),
                    PathNode.CurveTo(246.14116f, 184.38182f, 249.48515f, 184.45587f, 252.14f, 182.85f),
                    PathNode.CurveTo(254.58676f, 181.2946f, 256.0488f, 178.57887f, 256.0f, 175.68f),
                    PathNode.LineTo(256.0f, 80.0f),
                    PathNode.CurveTo(256.00183f, 76.35051f, 253.5336f, 73.16237f, 250.0f, 72.25f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
        }
        return _videoCamera!!
    }

private var _videoCamera: ImageVector? = null
