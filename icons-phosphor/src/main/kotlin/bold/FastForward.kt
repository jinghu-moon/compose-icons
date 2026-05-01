package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.FastForward: ImageVector
    get() {
        if (_fastForward != null) return _fastForward!!
        _fastForward = phosphorBoldIcon(
            name = "FastForward",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(246.81f, 111.29f),
                    PathNode.LineTo(158.63f, 55.12f),
                    PathNode.CurveTo(152.50966f, 51.209393f, 144.74544f, 50.9418f, 138.37038f, 54.421753f),
                    PathNode.CurveTo(131.99532f, 57.90171f, 128.02101f, 64.57701f, 128.0f, 71.84f),
                    PathNode.LineTo(128.0f, 101.84f),
                    PathNode.LineTo(54.63f, 55.12f),
                    PathNode.CurveTo(48.509655f, 51.209393f, 40.745438f, 50.9418f, 34.370377f, 54.421753f),
                    PathNode.CurveTo(27.995314f, 57.90171f, 24.021013f, 64.57701f, 24.0f, 71.84f),
                    PathNode.LineTo(24.0f, 184.16f),
                    PathNode.CurveTo(24.034224f, 191.41722f, 28.01061f, 198.0822f, 34.380653f, 201.55942f),
                    PathNode.CurveTo(40.7507f, 205.03664f, 48.50736f, 204.77638f, 54.63f, 200.88f),
                    PathNode.LineTo(128.0f, 154.15f),
                    PathNode.LineTo(128.0f, 184.15f),
                    PathNode.CurveTo(128.03423f, 191.40723f, 132.0106f, 198.0722f, 138.38066f, 201.54941f),
                    PathNode.CurveTo(144.7507f, 205.02663f, 152.50735f, 204.76637f, 158.63f, 200.87f),
                    PathNode.LineTo(246.81f, 144.7f),
                    PathNode.CurveTo(252.53094f, 141.06995f, 255.99718f, 134.76544f, 255.99718f, 127.99f),
                    PathNode.CurveTo(255.99718f, 121.21456f, 252.53094f, 114.91006f, 246.81f, 111.28f),
                    PathNode.Close,
                    PathNode.MoveTo(48.0f, 176.64f),
                    PathNode.LineTo(48.0f, 79.36f),
                    PathNode.LineTo(124.38f, 128.0f),
                    PathNode.Close,
                    PathNode.MoveTo(152.0f, 176.64f),
                    PathNode.LineTo(152.0f, 79.36f),
                    PathNode.LineTo(228.38f, 128.0f),
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
        return _fastForward!!
    }

private var _fastForward: ImageVector? = null
