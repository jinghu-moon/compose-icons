package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Wine: ImageVector
    get() {
        if (_wine != null) return _wine!!
        _wine = phosphorBoldIcon(
            name = "Wine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(209.17f, 102.54f),
                    PathNode.LineTo(187.39f, 28.61f),
                    PathNode.CurveTo(185.88777f, 23.50899f, 181.20761f, 20.004967f, 175.89f, 20.0f),
                    PathNode.LineTo(80.11f, 20.0f),
                    PathNode.CurveTo(74.79239f, 20.004967f, 70.11222f, 23.50899f, 68.61f, 28.61f),
                    PathNode.LineTo(46.83f, 102.54f),
                    PathNode.CurveTo(39.4347f, 127.10658f, 46.616688f, 153.74156f, 65.36f, 171.26f),
                    PathNode.CurveTo(79.31543f, 184.3477f, 97.02896f, 192.72176f, 116.0f, 195.2f),
                    PathNode.LineTo(116.0f, 228.0f),
                    PathNode.LineTo(88.0f, 228.0f),
                    PathNode.CurveTo(81.37258f, 228.0f, 76.0f, 233.37259f, 76.0f, 240.0f),
                    PathNode.CurveTo(76.0f, 246.62741f, 81.37258f, 252.0f, 88.0f, 252.0f),
                    PathNode.LineTo(168.0f, 252.0f),
                    PathNode.CurveTo(174.62741f, 252.0f, 180.0f, 246.62741f, 180.0f, 240.0f),
                    PathNode.CurveTo(180.0f, 233.37259f, 174.62741f, 228.0f, 168.0f, 228.0f),
                    PathNode.LineTo(140.0f, 228.0f),
                    PathNode.LineTo(140.0f, 195.2f),
                    PathNode.CurveTo(158.97458f, 192.72377f, 176.6919f, 184.34958f, 190.65f, 171.26f),
                    PathNode.CurveTo(209.38972f, 153.73935f, 216.56776f, 127.10468f, 209.17f, 102.54f),
                    PathNode.Close,
                    PathNode.MoveTo(89.08f, 44.0f),
                    PathNode.LineTo(166.92f, 44.0f),
                    PathNode.LineTo(185.3f, 106.41f),
                    PathNode.CurveTo(174.42f, 109.21f, 157.25f, 109.41f, 133.42f, 97.29f),
                    PathNode.CurveTo(110.68f, 85.78f, 91.92f, 83.0f, 77.24f, 84.22f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 172.0f),
                    PathNode.CurveTo(110.81661f, 172.02017f, 94.27241f, 165.48618f, 81.74f, 153.73f),
                    PathNode.CurveTo(69.8077f, 142.51888f, 65.17166f, 125.56257f, 69.74f, 109.84f),
                    PathNode.CurveTo(88.18f, 104.51f, 108.38f, 111.5f, 122.61f, 118.71f),
                    PathNode.CurveTo(134.16f, 124.56f, 152.79f, 131.99f, 172.87f, 131.99f),
                    PathNode.CurveTo(177.66579f, 132.00317f, 182.45154f, 131.55106f, 187.16f, 130.64f),
                    PathNode.CurveTo(185.38808f, 139.49239f, 180.8873f, 147.5672f, 174.29f, 153.73f),
                    PathNode.CurveTo(161.75003f, 165.49329f, 145.19374f, 172.02782f, 128.0f, 172.0f),
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
        return _wine!!
    }

private var _wine: ImageVector? = null
