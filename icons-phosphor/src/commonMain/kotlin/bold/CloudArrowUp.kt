package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.CloudArrowUp: ImageVector
    get() {
        if (_cloudArrowUp != null) return _cloudArrowUp!!
        _cloudArrowUp = phosphorBoldIcon(
            name = "CloudArrowUp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(196.49f, 151.51f),
                    PathNode.CurveTo(201.18442f, 156.20442f, 201.18442f, 163.81558f, 196.49f, 168.51f),
                    PathNode.CurveTo(191.79558f, 173.20442f, 184.18442f, 173.20442f, 179.49f, 168.51f),
                    PathNode.LineTo(168.0f, 157.0f),
                    PathNode.LineTo(168.0f, 208.0f),
                    PathNode.CurveTo(168.0f, 214.62741f, 162.62741f, 220.0f, 156.0f, 220.0f),
                    PathNode.CurveTo(149.37259f, 220.0f, 144.0f, 214.62741f, 144.0f, 208.0f),
                    PathNode.LineTo(144.0f, 157.0f),
                    PathNode.LineTo(132.49f, 168.52f),
                    PathNode.CurveTo(127.79558f, 173.21442f, 120.18442f, 173.21442f, 115.49f, 168.52f),
                    PathNode.CurveTo(110.79558f, 163.82558f, 110.79558f, 156.21442f, 115.49f, 151.52f),
                    PathNode.LineTo(147.49f, 119.52f),
                    PathNode.CurveTo(149.74162f, 117.260544f, 152.80019f, 115.99054f, 155.99f, 115.99054f),
                    PathNode.CurveTo(159.17982f, 115.99054f, 162.23837f, 117.260544f, 164.49f, 119.52f),
                    PathNode.Close,
                    PathNode.MoveTo(160.0f, 36.0f),
                    PathNode.CurveTo(126.163605f, 36.016243f, 95.062f, 54.588894f, 79.0f, 84.37f),
                    PathNode.CurveTo(53.985687f, 81.75002f, 29.568007f, 93.15121f, 15.517222f, 114.01159f),
                    PathNode.CurveTo(1.466439f, 134.87198f, 0.077459f, 161.78444f, 11.906057f, 183.98048f),
                    PathNode.CurveTo(23.734655f, 206.17653f, 46.848873f, 220.03088f, 72.0f, 220.0f),
                    PathNode.LineTo(100.0f, 220.0f),
                    PathNode.CurveTo(106.62742f, 220.0f, 112.0f, 214.62741f, 112.0f, 208.0f),
                    PathNode.CurveTo(112.0f, 201.37259f, 106.62742f, 196.0f, 100.0f, 196.0f),
                    PathNode.LineTo(72.0f, 196.0f),
                    PathNode.CurveTo(48.157536f, 195.85388f, 28.76953f, 176.74402f, 28.27895f, 152.90614f),
                    PathNode.CurveTo(27.788368f, 129.06828f, 46.373734f, 109.17692f, 70.19f, 108.05f),
                    PathNode.CurveTo(68.732285f, 114.599846f, 67.99789f, 121.2899f, 68.0f, 128.0f),
                    PathNode.CurveTo(68.0f, 134.62741f, 73.37258f, 140.0f, 80.0f, 140.0f),
                    PathNode.CurveTo(86.62742f, 140.0f, 92.0f, 134.62741f, 92.0f, 128.0f),
                    PathNode.CurveTo(92.02256f, 101.12228f, 107.874596f, 76.77983f, 132.4471f, 65.88925f),
                    PathNode.CurveTo(157.0196f, 54.998676f, 185.7012f, 59.60374f, 205.6294f, 77.63926f),
                    PathNode.CurveTo(225.55759f, 95.67478f, 232.99254f, 123.75614f, 224.6f, 149.29f),
                    PathNode.CurveTo(222.52617f, 155.58604f, 225.94896f, 162.37117f, 232.245f, 164.445f),
                    PathNode.CurveTo(238.54105f, 166.51883f, 245.32617f, 163.09604f, 247.4f, 156.8f),
                    PathNode.CurveTo(256.6135f, 128.7624f, 251.82623f, 98.00727f, 234.52664f, 74.09662f),
                    PathNode.CurveTo(217.22705f, 50.18597f, 189.51262f, 36.018875f, 160.0f, 36.0f),
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
        return _cloudArrowUp!!
    }

private var _cloudArrowUp: ImageVector? = null
