package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.ImageBroken: ImageVector
    get() {
        if (_imageBroken != null) return _imageBroken!!
        _imageBroken = phosphorFillIcon(
            name = "ImageBroken",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(216.0f, 40.0f),
                    PathNode.LineTo(40.0f, 40.0f),
                    PathNode.CurveTo(31.163445f, 40.0f, 24.0f, 47.163445f, 24.0f, 56.0f),
                    PathNode.LineTo(24.0f, 200.0f),
                    PathNode.CurveTo(24.0f, 208.83656f, 31.163445f, 216.0f, 40.0f, 216.0f),
                    PathNode.LineTo(104.0f, 216.0f),
                    PathNode.CurveTo(107.44359f, 216.00026f, 110.50096f, 213.79686f, 111.59f, 210.53f),
                    PathNode.LineTo(126.42f, 166.05f),
                    PathNode.LineTo(163.0f, 151.43f),
                    PathNode.CurveTo(165.03015f, 150.60992f, 166.63992f, 149.00014f, 167.46f, 146.97f),
                    PathNode.LineTo(182.08f, 110.42f),
                    PathNode.LineTo(226.56f, 95.59f),
                    PathNode.CurveTo(229.815f, 94.49059f, 232.00458f, 91.43565f, 232.0f, 88.0f),
                    PathNode.LineTo(232.0f, 56.0f),
                    PathNode.CurveTo(232.0f, 47.163445f, 224.83656f, 40.0f, 216.0f, 40.0f),
                    PathNode.Close,
                    PathNode.MoveTo(117.0f, 152.57f),
                    PathNode.CurveTo(114.81404f, 153.444f, 113.12401f, 155.23645f, 112.38f, 157.47f),
                    PathNode.LineTo(98.23f, 200.0f),
                    PathNode.LineTo(40.0f, 200.0f),
                    PathNode.LineTo(40.0f, 160.69f),
                    PathNode.LineTo(86.34f, 114.34f),
                    PathNode.CurveTo(87.840546f, 112.83778f, 89.876724f, 111.993706f, 92.0f, 111.993706f),
                    PathNode.CurveTo(94.123276f, 111.993706f, 96.159454f, 112.83778f, 97.66f, 114.34f),
                    PathNode.LineTo(130.5f, 147.18f),
                    PathNode.Close,
                    PathNode.MoveTo(232.0f, 121.73f),
                    PathNode.LineTo(232.0f, 200.0f),
                    PathNode.CurveTo(232.0f, 208.83656f, 224.83656f, 216.0f, 216.0f, 216.0f),
                    PathNode.LineTo(137.73f, 216.0f),
                    PathNode.CurveTo(135.15831f, 216.00018f, 132.74333f, 214.76407f, 131.2396f, 212.67784f),
                    PathNode.CurveTo(129.73584f, 210.59163f, 129.3267f, 207.9097f, 130.14f, 205.47f),
                    PathNode.LineTo(138.08f, 181.67f),
                    PathNode.CurveTo(138.82181f, 179.4385f, 140.50786f, 177.64642f, 142.69f, 176.77f),
                    PathNode.LineTo(178.46f, 162.46f),
                    PathNode.LineTo(192.77f, 126.69f),
                    PathNode.CurveTo(193.64642f, 124.50785f, 195.4385f, 122.821815f, 197.67f, 122.08f),
                    PathNode.LineTo(221.47f, 114.14f),
                    PathNode.CurveTo(223.9097f, 113.326706f, 226.59163f, 113.73585f, 228.67784f, 115.239586f),
                    PathNode.CurveTo(230.76407f, 116.743324f, 232.00018f, 119.15832f, 232.0f, 121.73f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
        }
        return _imageBroken!!
    }

private var _imageBroken: ImageVector? = null
