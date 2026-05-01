package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.MetaLogo: ImageVector
    get() {
        if (_metaLogo != null) return _metaLogo!!
        _metaLogo = phosphorBoldIcon(
            name = "MetaLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(244.0f, 149.31f),
                    PathNode.CurveTo(244.0f, 166.15f, 240.63f, 180.64f, 234.25f, 191.22f),
                    PathNode.CurveTo(226.06f, 204.81f, 213.33f, 212.0f, 197.44f, 212.0f),
                    PathNode.CurveTo(167.11f, 212.0f, 146.72f, 173.95f, 125.14f, 133.67f),
                    PathNode.CurveTo(109.46f, 104.41f, 90.0f, 68.0f, 74.0f, 68.0f),
                    PathNode.CurveTo(66.29f, 68.0f, 56.84f, 77.37f, 49.34f, 92.45f),
                    PathNode.CurveTo(40.76116f, 110.18998f, 36.206024f, 129.60567f, 36.0f, 149.31f),
                    PathNode.CurveTo(36.0f, 161.61f, 38.24f, 172.09f, 42.3f, 178.83f),
                    PathNode.CurveTo(46.07f, 185.09f, 51.24f, 188.0f, 58.56f, 188.0f),
                    PathNode.CurveTo(72.31f, 188.0f, 89.19f, 159.0f, 94.74f, 149.51f),
                    PathNode.CurveTo(98.07856f, 143.7828f, 105.42781f, 141.84644f, 111.155f, 145.185f),
                    PathNode.CurveTo(116.882195f, 148.52356f, 118.81856f, 155.8728f, 115.48f, 161.6f),
                    PathNode.CurveTo(106.57f, 176.88f, 98.95f, 187.6f, 91.48f, 195.38f),
                    PathNode.CurveTo(80.75f, 206.56f, 70.0f, 212.0f, 58.56f, 212.0f),
                    PathNode.CurveTo(42.67f, 212.0f, 29.94f, 204.81f, 21.75f, 191.22f),
                    PathNode.CurveTo(15.37f, 180.64f, 12.0f, 166.15f, 12.0f, 149.31f),
                    PathNode.CurveTo(12.0f, 105.34f, 35.58f, 44.0f, 74.0f, 44.0f),
                    PathNode.CurveTo(104.33f, 44.0f, 124.72f, 82.05f, 146.3f, 122.33f),
                    PathNode.CurveTo(162.0f, 151.59f, 181.47f, 188.0f, 197.44f, 188.0f),
                    PathNode.CurveTo(204.76f, 188.0f, 209.93f, 185.09f, 213.7f, 178.83f),
                    PathNode.CurveTo(217.76f, 172.09f, 220.0f, 161.61f, 220.0f, 149.31f),
                    PathNode.CurveTo(219.7971f, 129.60641f, 215.24538f, 110.19077f, 206.67f, 92.45f),
                    PathNode.CurveTo(199.17f, 77.37f, 189.72f, 68.0f, 182.0f, 68.0f),
                    PathNode.CurveTo(176.28f, 68.0f, 169.39f, 73.0f, 161.51f, 82.83f),
                    PathNode.CurveTo(157.36786f, 88.004906f, 149.81491f, 88.84213f, 144.64f, 84.7f),
                    PathNode.CurveTo(139.46509f, 80.55786f, 138.62787f, 73.004906f, 142.77f, 67.83f),
                    PathNode.CurveTo(155.62f, 51.8f, 168.45f, 44.0f, 182.0f, 44.0f),
                    PathNode.CurveTo(199.65f, 44.0f, 216.0f, 57.41f, 228.15f, 81.76f),
                    PathNode.CurveTo(238.34172f, 102.83527f, 243.75392f, 125.90107f, 244.0f, 149.31f),
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
        return _metaLogo!!
    }

private var _metaLogo: ImageVector? = null
