package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Plant: ImageVector
    get() {
        if (_plant != null) return _plant!!
        _plant = phosphorRegularIcon(
            name = "Plant",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(247.63f, 47.89f),
                    PathNode.CurveTo(247.39342f, 43.838856f, 244.16115f, 40.60658f, 240.11f, 40.37f),
                    PathNode.CurveTo(188.35f, 37.37f, 146.79f, 53.11f, 128.93f, 82.59f),
                    PathNode.CurveTo(117.13f, 102.08f, 117.15f, 125.75f, 128.77f, 148.33f),
                    PathNode.CurveTo(122.15598f, 156.20358f, 117.32224f, 165.41396f, 114.6f, 175.33f),
                    PathNode.LineTo(98.33f, 159.0f),
                    PathNode.CurveTo(106.15f, 142.67f, 105.85f, 125.65f, 97.33f, 111.51f),
                    PathNode.CurveTo(84.13f, 89.72f, 53.66f, 78.04f, 15.83f, 80.26f),
                    PathNode.CurveTo(11.778856f, 80.49658f, 8.54658f, 83.72886f, 8.310001f, 87.78f),
                    PathNode.CurveTo(6.08f, 125.61f, 17.77f, 156.08f, 39.56f, 169.28f),
                    PathNode.CurveTo(46.75065f, 173.6732f, 55.013515f, 175.99843f, 63.44f, 176.0f),
                    PathNode.CurveTo(71.618996f, 175.89928f, 79.670746f, 173.96153f, 87.0f, 170.33f),
                    PathNode.LineTo(112.0f, 195.33f),
                    PathNode.LineTo(112.0f, 224.0f),
                    PathNode.CurveTo(112.0f, 228.41827f, 115.58172f, 232.0f, 120.0f, 232.0f),
                    PathNode.CurveTo(124.41828f, 232.0f, 128.0f, 228.41827f, 128.0f, 224.0f),
                    PathNode.LineTo(128.0f, 194.51f),
                    PathNode.CurveTo(127.9644f, 181.78299f, 132.29541f, 169.42886f, 140.27f, 159.51f),
                    PathNode.CurveTo(150.55948f, 164.88733f, 161.97104f, 167.76505f, 173.58f, 167.91f),
                    PathNode.CurveTo(184.80373f, 167.94621f, 195.81915f, 164.88002f, 205.41f, 159.05f),
                    PathNode.CurveTo(234.89f, 141.21f, 250.67f, 99.65f, 247.63f, 47.89f),
                    PathNode.Close,
                    PathNode.MoveTo(47.81f, 155.6f),
                    PathNode.CurveTo(32.47f, 146.31f, 23.79f, 124.32f, 24.0f, 96.0f),
                    PathNode.CurveTo(52.32f, 95.76f, 74.31f, 104.47f, 83.6f, 119.81f),
                    PathNode.CurveTo(88.45f, 127.81f, 89.24f, 137.14f, 86.06f, 146.75f),
                    PathNode.LineTo(61.65f, 122.34f),
                    PathNode.CurveTo(58.504684f, 119.35177f, 53.55075f, 119.41519f, 50.482975f, 122.48297f),
                    PathNode.CurveTo(47.415195f, 125.55075f, 47.35177f, 130.50468f, 50.34f, 133.65f),
                    PathNode.LineTo(74.75f, 158.06f),
                    PathNode.CurveTo(65.14f, 161.24f, 55.82f, 160.45f, 47.81f, 155.6f),
                    PathNode.Close,
                    PathNode.MoveTo(197.12f, 145.38f),
                    PathNode.CurveTo(183.72f, 153.49f, 167.97f, 154.11f, 151.97f, 147.38f),
                    PathNode.LineTo(205.66f, 93.68f),
                    PathNode.CurveTo(208.64822f, 90.53468f, 208.58482f, 85.58075f, 205.51703f, 82.51297f),
                    PathNode.CurveTo(202.44925f, 79.4452f, 197.49532f, 79.38177f, 194.35f, 82.37f),
                    PathNode.LineTo(140.65f, 136.0f),
                    PathNode.CurveTo(133.89f, 120.0f, 134.5f, 104.24f, 142.65f, 90.85f),
                    PathNode.CurveTo(156.59f, 67.85f, 189.65f, 55.03f, 231.98f, 56.02f),
                    PathNode.CurveTo(232.94f, 98.34f, 220.14f, 131.44f, 197.12f, 145.38f),
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
        return _plant!!
    }

private var _plant: ImageVector? = null
