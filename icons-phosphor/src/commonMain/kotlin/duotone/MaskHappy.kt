package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.MaskHappy: ImageVector
    get() {
        if (_maskHappy != null) return _maskHappy!!
        _maskHappy = phosphorDuotoneIcon(
            name = "MaskHappy",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(216.0f, 48.0f),
                    PathNode.LineTo(216.0f, 103.77f),
                    PathNode.CurveTo(216.0f, 174.6f, 176.6f, 232.0f, 128.0f, 232.0f),
                    PathNode.CurveTo(79.4f, 232.0f, 40.0f, 174.6f, 40.0f, 103.79f),
                    PathNode.LineTo(40.0f, 48.0f),
                    PathNode.CurveTo(39.996616f, 45.359024f, 41.296856f, 42.886543f, 43.47471f, 41.392647f),
                    PathNode.CurveTo(45.652557f, 39.898746f, 48.42737f, 39.575943f, 50.89f, 40.53f),
                    PathNode.CurveTo(66.0f, 46.41f, 95.11f, 55.71f, 128.0f, 55.71f),
                    PathNode.CurveTo(160.89f, 55.71f, 190.0f, 46.41f, 205.11f, 40.55f),
                    PathNode.CurveTo(207.56932f, 39.59722f, 210.34024f, 39.917816f, 212.51704f, 41.406994f),
                    PathNode.CurveTo(214.69383f, 42.89617f, 215.99678f, 45.36256f, 216.0f, 48.0f),
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
                    PathNode.MoveTo(217.0f, 34.8f),
                    PathNode.CurveTo(212.64804f, 31.810835f, 207.09834f, 31.170486f, 202.18f, 33.09f),
                    PathNode.CurveTo(188.15f, 38.55f, 159.82f, 47.71f, 128.0f, 47.71f),
                    PathNode.CurveTo(96.18f, 47.71f, 67.84f, 38.55f, 53.79f, 33.09f),
                    PathNode.CurveTo(48.86856f, 31.179577f, 43.32151f, 31.819765f, 38.964622f, 34.801006f),
                    PathNode.CurveTo(34.60773f, 37.782246f, 32.001858f, 42.720768f, 32.0f, 48.0f),
                    PathNode.LineTo(32.0f, 103.77f),
                    PathNode.CurveTo(32.0f, 139.61f, 41.65f, 173.42f, 59.18f, 198.95f),
                    PathNode.CurveTo(77.34f, 225.41f, 101.78f, 239.95f, 128.0f, 239.95f),
                    PathNode.CurveTo(154.22f, 239.95f, 178.66f, 225.38f, 196.82f, 198.95f),
                    PathNode.CurveTo(214.35f, 173.44f, 224.0f, 139.63f, 224.0f, 103.79f),
                    PathNode.LineTo(224.0f, 48.0f),
                    PathNode.CurveTo(223.9905f, 42.713802f, 221.37062f, 37.773483f, 217.0f, 34.8f),
                    PathNode.Close,
                    PathNode.MoveTo(208.0f, 103.8f),
                    PathNode.CurveTo(208.0f, 136.44f, 199.34f, 167.03f, 183.63f, 189.93f),
                    PathNode.CurveTo(168.54f, 211.9f, 148.79f, 224.0f, 128.0f, 224.0f),
                    PathNode.CurveTo(107.21f, 224.0f, 87.46f, 211.9f, 72.37f, 189.92f),
                    PathNode.CurveTo(56.66f, 167.0f, 48.0f, 136.43f, 48.0f, 103.79f),
                    PathNode.LineTo(48.0f, 48.0f),
                    PathNode.CurveTo(63.11f, 53.87f, 93.58f, 63.71f, 128.0f, 63.71f),
                    PathNode.CurveTo(162.42f, 63.71f, 192.9f, 53.87f, 208.0f, 48.0f),
                    PathNode.LineTo(208.0f, 103.81f),
                    PathNode.Close,
                    PathNode.MoveTo(190.0f, 122.67f),
                    PathNode.CurveTo(192.94368f, 125.98371f, 192.6437f, 131.05632f, 189.33f, 134.0f),
                    PathNode.CurveTo(186.0163f, 136.94368f, 180.94368f, 136.6437f, 178.0f, 133.33f),
                    PathNode.CurveTo(175.32f, 130.33f, 169.15f, 128.0f, 164.0f, 128.0f),
                    PathNode.CurveTo(158.85f, 128.0f, 152.64f, 130.34f, 150.0f, 133.33f),
                    PathNode.CurveTo(147.05356f, 136.6437f, 141.97871f, 136.94144f, 138.665f, 133.995f),
                    PathNode.CurveTo(135.35127f, 131.04855f, 135.05356f, 125.97371f, 138.0f, 122.66f),
                    PathNode.CurveTo(143.71f, 116.28f, 154.14f, 112.0f, 164.0f, 112.0f),
                    PathNode.CurveTo(173.86f, 112.0f, 184.25f, 116.28f, 190.0f, 122.66f),
                    PathNode.Close,
                    PathNode.MoveTo(92.0f, 128.0f),
                    PathNode.CurveTo(86.81f, 128.0f, 80.64f, 130.34f, 78.0f, 133.33f),
                    PathNode.CurveTo(75.05356f, 136.6437f, 69.97871f, 136.94144f, 66.665f, 133.995f),
                    PathNode.CurveTo(63.35129f, 131.04855f, 63.053562f, 125.97371f, 66.0f, 122.66f),
                    PathNode.CurveTo(71.75f, 116.28f, 82.18f, 112.0f, 92.0f, 112.0f),
                    PathNode.CurveTo(101.82f, 112.0f, 112.25f, 116.28f, 118.0f, 122.66f),
                    PathNode.CurveTo(120.94644f, 125.97371f, 120.64871f, 131.04855f, 117.335f, 133.995f),
                    PathNode.CurveTo(114.02129f, 136.94144f, 108.94644f, 136.6437f, 106.0f, 133.33f),
                    PathNode.CurveTo(103.36f, 130.34f, 97.19f, 128.0f, 92.0f, 128.0f),
                    PathNode.Close,
                    PathNode.MoveTo(168.45f, 173.19f),
                    PathNode.CurveTo(158.39873f, 185.11609f, 143.5968f, 191.99886f, 128.0f, 191.99886f),
                    PathNode.CurveTo(112.403206f, 191.99886f, 97.60128f, 185.11609f, 87.55f, 173.19f),
                    PathNode.CurveTo(84.68088f, 169.82935f, 85.079346f, 164.77911f, 88.44f, 161.91f),
                    PathNode.CurveTo(91.80065f, 159.04088f, 96.85088f, 159.43935f, 99.72f, 162.8f),
                    PathNode.CurveTo(106.72917f, 171.16797f, 117.08435f, 176.00217f, 128.0f, 176.00217f),
                    PathNode.CurveTo(138.91565f, 176.00217f, 149.27083f, 171.16797f, 156.28f, 162.8f),
                    PathNode.CurveTo(159.14912f, 159.43935f, 164.19934f, 159.04088f, 167.56f, 161.91f),
                    PathNode.CurveTo(170.92065f, 164.77911f, 171.31912f, 169.82935f, 168.45f, 173.19f),
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
        return _maskHappy!!
    }

private var _maskHappy: ImageVector? = null
