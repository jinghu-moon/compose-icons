package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Waves: ImageVector
    get() {
        if (_waves != null) return _waves!!
        _waves = phosphorBoldIcon(
            name = "Waves",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(225.24f, 174.74f),
                    PathNode.CurveTo(229.46498f, 179.8412f, 228.7578f, 187.40091f, 223.66f, 191.63f),
                    PathNode.CurveTo(205.49f, 206.71f, 189.06f, 212.0f, 174.15f, 212.0f),
                    PathNode.CurveTo(154.39f, 212.0f, 137.29f, 202.71f, 122.27f, 194.56f),
                    PathNode.CurveTo(97.21f, 180.94f, 77.41f, 170.19f, 47.66f, 194.86f),
                    PathNode.CurveTo(42.55689f, 199.0905f, 34.9905f, 198.38312f, 30.76f, 193.28f),
                    PathNode.CurveTo(26.5295f, 188.1769f, 27.236889f, 180.61052f, 32.34f, 176.38f),
                    PathNode.CurveTo(74.59f, 141.38f, 107.34f, 159.15f, 133.73f, 173.46f),
                    PathNode.CurveTo(158.79f, 187.07f, 178.59f, 197.83f, 208.34f, 173.16f),
                    PathNode.CurveTo(210.79036f, 171.12787f, 213.94777f, 170.15268f, 217.11731f, 170.44897f),
                    PathNode.CurveTo(220.28687f, 170.7453f, 223.20879f, 172.28888f, 225.24f, 174.74f),
                    PathNode.Close,
                    PathNode.MoveTo(208.34f, 117.15f),
                    PathNode.CurveTo(178.59f, 141.82f, 158.79f, 131.06f, 133.73f, 117.45f),
                    PathNode.CurveTo(107.38f, 103.15f, 74.59f, 85.34f, 32.34f, 120.37f),
                    PathNode.CurveTo(27.236889f, 124.6005f, 26.5295f, 132.16689f, 30.76f, 137.27f),
                    PathNode.CurveTo(34.9905f, 142.37311f, 42.55689f, 143.0805f, 47.66f, 138.85f),
                    PathNode.CurveTo(77.41f, 114.18f, 97.21f, 124.93f, 122.27f, 138.55f),
                    PathNode.CurveTo(137.27f, 146.7f, 154.39f, 155.99f, 174.15f, 155.99f),
                    PathNode.CurveTo(189.06f, 155.99f, 205.49f, 150.7f, 223.66f, 135.63f),
                    PathNode.CurveTo(228.7631f, 131.3995f, 229.4705f, 123.833115f, 225.24f, 118.73f),
                    PathNode.CurveTo(221.0095f, 113.6269f, 213.44312f, 112.9195f, 208.34f, 117.15f),
                    PathNode.Close,
                    PathNode.MoveTo(47.66f, 82.84f),
                    PathNode.CurveTo(77.41f, 58.17f, 97.21f, 68.92f, 122.27f, 82.54f),
                    PathNode.CurveTo(137.27f, 90.69f, 154.39f, 99.98f, 174.15f, 99.98f),
                    PathNode.CurveTo(189.06f, 99.98f, 205.49f, 94.69f, 223.66f, 79.62f),
                    PathNode.CurveTo(228.7631f, 75.389496f, 229.4705f, 67.82311f, 225.24f, 62.72f),
                    PathNode.CurveTo(221.0095f, 57.616886f, 213.44312f, 56.9095f, 208.34f, 61.14f),
                    PathNode.CurveTo(178.59f, 85.81f, 158.79f, 75.06f, 133.73f, 61.44f),
                    PathNode.CurveTo(107.38f, 47.14f, 74.59f, 29.33f, 32.34f, 64.37f),
                    PathNode.CurveTo(28.958704f, 67.08174f, 27.302534f, 71.40615f, 28.007397f, 75.682816f),
                    PathNode.CurveTo(28.712257f, 79.95949f, 31.668589f, 83.52368f, 35.74128f, 85.0069f),
                    PathNode.CurveTo(39.81397f, 86.490105f, 44.369984f, 85.6618f, 47.66f, 82.84f),
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
        return _waves!!
    }

private var _waves: ImageVector? = null
