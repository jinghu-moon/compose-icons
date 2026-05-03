package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Tree: ImageVector
    get() {
        if (_tree != null) return _tree!!
        _tree = phosphorFillIcon(
            name = "Tree",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(128.0f, 187.85f),
                    PathNode.CurveTo(130.56566f, 189.55864f, 133.23775f, 191.10178f, 136.0f, 192.47f),
                    PathNode.LineTo(136.0f, 232.0f),
                    PathNode.CurveTo(136.0f, 236.41827f, 132.41827f, 240.0f, 128.0f, 240.0f),
                    PathNode.CurveTo(123.58172f, 240.0f, 120.0f, 236.41827f, 120.0f, 232.0f),
                    PathNode.LineTo(120.0f, 192.47f),
                    PathNode.CurveTo(122.762245f, 191.10178f, 125.43435f, 189.55864f, 128.0f, 187.85f),
                    PathNode.Close,
                    PathNode.MoveTo(198.1f, 62.59f),
                    PathNode.CurveTo(186.2671f, 34.337452f, 158.63043f, 15.949666f, 128.0f, 15.949666f),
                    PathNode.CurveTo(97.36956f, 15.949666f, 69.73289f, 34.337452f, 57.9f, 62.59f),
                    PathNode.CurveTo(32.37697f, 74.255714f, 16.004032f, 99.73732f, 16.0f, 127.8f),
                    PathNode.CurveTo(15.9f, 166.0f, 48.0f, 199.0f, 86.14f, 200.0f),
                    PathNode.CurveTo(97.8708f, 200.278f, 109.49266f, 197.69347f, 120.0f, 192.47f),
                    PathNode.LineTo(120.0f, 156.94f),
                    PathNode.LineTo(76.42f, 135.16f),
                    PathNode.CurveTo(72.465645f, 133.18282f, 70.86282f, 128.37436f, 72.84f, 124.42f),
                    PathNode.CurveTo(74.81718f, 120.465645f, 79.62564f, 118.86282f, 83.58f, 120.84f),
                    PathNode.LineTo(120.0f, 139.06f),
                    PathNode.LineTo(120.0f, 88.0f),
                    PathNode.CurveTo(120.0f, 83.58172f, 123.58172f, 80.0f, 128.0f, 80.0f),
                    PathNode.CurveTo(132.41827f, 80.0f, 136.0f, 83.58172f, 136.0f, 88.0f),
                    PathNode.LineTo(136.0f, 115.06f),
                    PathNode.LineTo(172.42f, 96.84f),
                    PathNode.CurveTo(176.37436f, 94.86282f, 181.18282f, 96.465645f, 183.16f, 100.42f),
                    PathNode.CurveTo(185.13718f, 104.37436f, 183.53436f, 109.18282f, 179.58f, 111.16f),
                    PathNode.LineTo(136.0f, 132.94f),
                    PathNode.LineTo(136.0f, 192.47f),
                    PathNode.CurveTo(145.94536f, 197.40831f, 156.89607f, 199.98515f, 168.0f, 200.0f),
                    PathNode.LineTo(169.82f, 200.0f),
                    PathNode.CurveTo(208.0f, 199.0f, 240.11f, 166.0f, 240.0f, 127.8f),
                    PathNode.CurveTo(239.99597f, 99.73732f, 223.62303f, 74.255714f, 198.1f, 62.59f),
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
        return _tree!!
    }

private var _tree: ImageVector? = null
