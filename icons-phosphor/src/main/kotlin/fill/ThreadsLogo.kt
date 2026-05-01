package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.ThreadsLogo: ImageVector
    get() {
        if (_threadsLogo != null) return _threadsLogo!!
        _threadsLogo = phosphorFillIcon(
            name = "ThreadsLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(138.62f, 128.0f),
                    PathNode.CurveTo(143.03719f, 128.00085f, 147.43729f, 128.54836f, 151.72f, 129.63f),
                    PathNode.CurveTo(151.15f, 137.84f, 148.38f, 144.63f, 143.61f, 149.24f),
                    PathNode.CurveTo(139.16121f, 153.56471f, 133.20442f, 155.98903f, 127.0f, 156.0f),
                    PathNode.CurveTo(115.13f, 156.0f, 112.0f, 148.42f, 112.0f, 143.93f),
                    PathNode.CurveTo(112.0f, 133.0f, 125.8f, 128.0f, 138.62f, 128.0f),
                    PathNode.Close,
                    PathNode.MoveTo(224.0f, 128.0f),
                    PathNode.CurveTo(224.0f, 193.12f, 188.11f, 232.0f, 128.0f, 232.0f),
                    PathNode.CurveTo(67.89f, 232.0f, 32.0f, 193.12f, 32.0f, 128.0f),
                    PathNode.CurveTo(32.0f, 62.88f, 67.89f, 24.0f, 128.0f, 24.0f),
                    PathNode.CurveTo(188.11f, 24.0f, 224.0f, 62.88f, 224.0f, 128.0f),
                    PathNode.Close,
                    PathNode.MoveTo(72.0f, 128.0f),
                    PathNode.CurveTo(72.0f, 84.93f, 90.32f, 64.0f, 128.0f, 64.0f),
                    PathNode.CurveTo(154.34f, 64.0f, 171.0f, 74.08f, 178.81f, 94.83f),
                    PathNode.CurveTo(180.37297f, 98.97214f, 184.99785f, 101.062965f, 189.14f, 99.5f),
                    PathNode.CurveTo(193.28214f, 97.937035f, 195.37297f, 93.31213f, 193.81f, 89.17f),
                    PathNode.CurveTo(180.9f, 55.14f, 150.9f, 48.0f, 128.0f, 48.0f),
                    PathNode.CurveTo(101.9f, 48.0f, 82.48f, 56.7f, 70.28f, 73.86f),
                    PathNode.CurveTo(60.8f, 87.19f, 56.0f, 105.4f, 56.0f, 128.0f),
                    PathNode.CurveTo(56.0f, 150.6f, 60.8f, 168.81f, 70.28f, 182.14f),
                    PathNode.CurveTo(82.48f, 199.3f, 101.9f, 208.0f, 128.0f, 208.0f),
                    PathNode.CurveTo(152.45f, 208.0f, 167.82f, 199.2f, 176.41f, 191.82f),
                    PathNode.CurveTo(187.17f, 182.57f, 193.6f, 169.93f, 193.6f, 158.0f),
                    PathNode.CurveTo(193.6f, 143.7f, 187.01f, 131.21f, 175.04f, 122.83f),
                    PathNode.CurveTo(172.57903f, 121.11752f, 169.98009f, 119.61235f, 167.27f, 118.33f),
                    PathNode.CurveTo(165.18f, 103.68f, 157.27f, 92.58f, 144.93f, 87.26f),
                    PathNode.CurveTo(130.43f, 81.0f, 112.0f, 83.93f, 101.21f, 94.19f),
                    PathNode.CurveTo(98.00123f, 97.22757f, 97.862434f, 102.29123f, 100.9f, 105.5f),
                    PathNode.CurveTo(103.93757f, 108.70877f, 109.00123f, 108.847565f, 112.21f, 105.81f),
                    PathNode.CurveTo(117.64f, 100.67f, 129.0f, 97.81f, 138.61f, 101.96f),
                    PathNode.CurveTo(143.50537f, 104.02877f, 147.37914f, 107.95648f, 149.38f, 112.88f),
                    PathNode.CurveTo(145.82109f, 112.3157f, 142.22337f, 112.03149f, 138.62f, 112.03f),
                    PathNode.CurveTo(113.53f, 112.0f, 96.0f, 125.15f, 96.0f, 143.93f),
                    PathNode.CurveTo(96.0f, 160.2f, 109.0f, 172.0f, 127.0f, 172.0f),
                    PathNode.CurveTo(137.36327f, 171.97353f, 147.31177f, 167.92601f, 154.75f, 160.71f),
                    PathNode.CurveTo(159.45f, 156.12f, 164.86f, 148.51f, 166.92f, 136.71f),
                    PathNode.CurveTo(173.77246f, 141.61172f, 177.76796f, 149.57652f, 177.6f, 158.0f),
                    PathNode.CurveTo(177.6f, 171.71f, 161.84f, 192.0f, 128.0f, 192.0f),
                    PathNode.CurveTo(90.32f, 192.0f, 72.0f, 171.07f, 72.0f, 128.0f),
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
        return _threadsLogo!!
    }

private var _threadsLogo: ImageVector? = null
