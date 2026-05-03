package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Planet: ImageVector
    get() {
        if (_planet != null) return _planet!!
        _planet = phosphorBoldIcon(
            name = "Planet",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(248.59f, 58.67f),
                    PathNode.CurveTo(242.28f, 47.8f, 225.59f, 37.61f, 182.43f, 48.96f),
                    PathNode.CurveTo(153.07008f, 28.699858f, 114.89357f, 26.401863f, 83.31537f, 42.993904f),
                    PathNode.CurveTo(51.737175f, 59.58594f, 31.971758f, 92.3282f, 32.0f, 128.0f),
                    PathNode.QuadTo(32.0f, 131.6f, 32.26f, 135.14f),
                    PathNode.CurveTo(0.56f, 166.86f, 1.1f, 186.4f, 7.44f, 197.33f),
                    PathNode.CurveTo(13.4f, 207.61f, 25.3f, 212.0f, 40.68f, 212.0f),
                    PathNode.CurveTo(50.47f, 212.0f, 61.68f, 210.22f, 73.63f, 207.09f),
                    PathNode.CurveTo(102.9958f, 227.32129f, 141.15977f, 229.59586f, 172.7207f, 212.99577f),
                    PathNode.CurveTo(204.28165f, 196.39569f, 224.03146f, 163.66026f, 224.0f, 128.0f),
                    PathNode.CurveTo(224.0f, 125.59f, 223.91f, 123.21f, 223.73f, 120.84f),
                    PathNode.CurveTo(238.04f, 106.46f, 247.59f, 92.63f, 250.73f, 80.84f),
                    PathNode.CurveTo(253.55f, 70.42f, 251.12f, 63.0f, 248.59f, 58.67f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 56.0f),
                    PathNode.CurveTo(161.58215f, 56.045372f, 190.68748f, 79.266594f, 198.19f, 112.0f),
                    PathNode.CurveTo(184.0f, 124.73f, 165.0f, 138.59f, 141.92f, 151.86f),
                    PathNode.CurveTo(120.18f, 164.35f, 98.37f, 174.22f, 78.83f, 180.51f),
                    PathNode.CurveTo(57.298508f, 160.31056f, 50.28021f, 129.01363f, 61.124226f, 101.55403f),
                    PathNode.CurveTo(71.96824f, 74.09444f, 98.476776f, 56.037514f, 128.0f, 56.0f),
                    PathNode.Close,
                    PathNode.MoveTo(28.19f, 185.29f),
                    PathNode.CurveTo(27.58f, 184.22f, 28.02f, 177.07f, 38.86f, 163.58f),
                    PathNode.CurveTo(42.226955f, 171.9851f, 46.76884f, 179.87029f, 52.35f, 187.0f),
                    PathNode.CurveTo(35.12f, 189.61f, 28.85f, 186.41f, 28.19f, 185.29f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 200.0f),
                    PathNode.CurveTo(120.33371f, 200.00124f, 112.71688f, 198.77228f, 105.44f, 196.36f),
                    PathNode.CurveTo(122.10177f, 189.57768f, 138.2796f, 181.6625f, 153.86f, 172.67f),
                    PathNode.CurveTo(169.38196f, 163.81781f, 184.27406f, 153.90422f, 198.43f, 143.0f),
                    PathNode.CurveTo(191.30794f, 176.2163f, 161.97122f, 199.95891f, 128.0f, 200.0f),
                    PathNode.Close,
                    PathNode.MoveTo(227.57f, 74.65f),
                    PathNode.CurveTo(226.29f, 79.43f, 222.76f, 85.52f, 217.18f, 92.45f),
                    PathNode.CurveTo(213.81285f, 84.033646f, 209.26746f, 76.13814f, 203.68f, 69.0f),
                    PathNode.CurveTo(219.51f, 66.63f, 226.85f, 69.0f, 227.83f, 70.71f),
                    PathNode.CurveTo(228.0f, 71.0f, 228.21f, 72.28f, 227.57f, 74.65f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 24.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _planet!!
    }

private var _planet: ImageVector? = null
