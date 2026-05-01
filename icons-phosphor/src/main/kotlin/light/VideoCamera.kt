package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.VideoCamera: ImageVector
    get() {
        if (_videoCamera != null) return _videoCamera!!
        _videoCamera = phosphorLightIcon(
            name = "VideoCamera",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(250.83f, 74.71f),
                    PathNode.CurveTo(248.87848f, 73.6663f, 246.51086f, 73.7816f, 244.67f, 75.01f),
                    PathNode.LineTo(206.0f, 100.79f),
                    PathNode.LineTo(206.0f, 72.0f),
                    PathNode.CurveTo(206.0f, 64.26801f, 199.73198f, 58.0f, 192.0f, 58.0f),
                    PathNode.LineTo(32.0f, 58.0f),
                    PathNode.CurveTo(24.268015f, 58.0f, 18.0f, 64.26801f, 18.0f, 72.0f),
                    PathNode.LineTo(18.0f, 184.0f),
                    PathNode.CurveTo(18.0f, 191.73198f, 24.268015f, 198.0f, 32.0f, 198.0f),
                    PathNode.LineTo(192.0f, 198.0f),
                    PathNode.CurveTo(199.73198f, 198.0f, 206.0f, 191.73198f, 206.0f, 184.0f),
                    PathNode.LineTo(206.0f, 155.21f),
                    PathNode.LineTo(244.67f, 181.0f),
                    PathNode.CurveTo(246.51236f, 182.22919f, 248.88202f, 182.3435f, 250.83412f, 181.29736f),
                    PathNode.CurveTo(252.78622f, 180.25122f, 254.00328f, 178.21475f, 254.0f, 176.0f),
                    PathNode.LineTo(254.0f, 80.0f),
                    PathNode.CurveTo(253.99976f, 77.786995f, 252.78137f, 75.7538f, 250.83f, 74.71f),
                    PathNode.Close,
                    PathNode.MoveTo(194.0f, 184.0f),
                    PathNode.CurveTo(194.0f, 185.10457f, 193.10457f, 186.0f, 192.0f, 186.0f),
                    PathNode.LineTo(32.0f, 186.0f),
                    PathNode.CurveTo(30.89543f, 186.0f, 30.0f, 185.10457f, 30.0f, 184.0f),
                    PathNode.LineTo(30.0f, 72.0f),
                    PathNode.CurveTo(30.0f, 70.89543f, 30.89543f, 70.0f, 32.0f, 70.0f),
                    PathNode.LineTo(192.0f, 70.0f),
                    PathNode.CurveTo(193.10457f, 70.0f, 194.0f, 70.89543f, 194.0f, 72.0f),
                    PathNode.Close,
                    PathNode.MoveTo(242.0f, 164.79f),
                    PathNode.LineTo(206.0f, 140.79f),
                    PathNode.LineTo(206.0f, 115.21f),
                    PathNode.LineTo(242.0f, 91.21f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 12.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _videoCamera!!
    }

private var _videoCamera: ImageVector? = null
