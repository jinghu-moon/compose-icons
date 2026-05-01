package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Tree: ImageVector
    get() {
        if (_tree != null) return _tree!!
        _tree = phosphorDuotoneIcon(
            name = "Tree",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(232.0f, 127.82f),
                    PathNode.CurveTo(232.09f, 161.76f, 203.59f, 191.12f, 169.66f, 191.98f),
                    PathNode.CurveTo(154.55247f, 192.40157f, 139.78694f, 187.43954f, 128.0f, 177.98f),
                    PathNode.CurveTo(116.216125f, 187.43808f, 101.45425f, 192.40005f, 86.35f, 191.98f),
                    PathNode.CurveTo(52.42f, 191.12f, 23.91f, 161.76f, 24.0f, 127.82f),
                    PathNode.CurveTo(24.074165f, 101.75618f, 39.946693f, 78.34093f, 64.13f, 68.62f),
                    PathNode.CurveTo(73.93022f, 41.798386f, 99.44403f, 23.95716f, 128.0f, 23.95716f),
                    PathNode.CurveTo(156.55597f, 23.95716f, 182.06978f, 41.798386f, 191.87f, 68.62f),
                    PathNode.CurveTo(216.0533f, 78.34093f, 231.92583f, 101.75618f, 232.0f, 127.82f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(198.1f, 62.59f),
                    PathNode.CurveTo(186.2671f, 34.337452f, 158.63043f, 15.949666f, 128.0f, 15.949666f),
                    PathNode.CurveTo(97.36956f, 15.949666f, 69.73289f, 34.337452f, 57.9f, 62.59f),
                    PathNode.CurveTo(32.37697f, 74.255714f, 16.004032f, 99.73732f, 16.0f, 127.8f),
                    PathNode.CurveTo(15.9f, 166.0f, 48.0f, 199.0f, 86.14f, 200.0f),
                    PathNode.CurveTo(97.8708f, 200.278f, 109.49266f, 197.69347f, 120.0f, 192.47f),
                    PathNode.LineTo(120.0f, 232.0f),
                    PathNode.CurveTo(120.0f, 236.41827f, 123.58172f, 240.0f, 128.0f, 240.0f),
                    PathNode.CurveTo(132.41827f, 240.0f, 136.0f, 236.41827f, 136.0f, 232.0f),
                    PathNode.LineTo(136.0f, 192.47f),
                    PathNode.CurveTo(145.94536f, 197.40831f, 156.89607f, 199.98515f, 168.0f, 200.0f),
                    PathNode.LineTo(169.82f, 200.0f),
                    PathNode.CurveTo(208.0f, 199.0f, 240.11f, 166.0f, 240.0f, 127.8f),
                    PathNode.CurveTo(239.99597f, 99.73732f, 223.62303f, 74.255714f, 198.1f, 62.59f),
                    PathNode.Close,
                    PathNode.MoveTo(169.45f, 184.0f),
                    PathNode.CurveTo(157.52f, 184.31071f, 145.80196f, 180.80757f, 136.0f, 174.0f),
                    PathNode.LineTo(136.0f, 133.0f),
                    PathNode.LineTo(179.58f, 111.22f),
                    PathNode.CurveTo(183.53436f, 109.24282f, 185.13718f, 104.43436f, 183.16f, 100.48f),
                    PathNode.CurveTo(181.18282f, 96.52564f, 176.37436f, 94.92282f, 172.42f, 96.9f),
                    PathNode.LineTo(136.0f, 115.06f),
                    PathNode.LineTo(136.0f, 88.0f),
                    PathNode.CurveTo(136.0f, 83.58172f, 132.41827f, 80.0f, 128.0f, 80.0f),
                    PathNode.CurveTo(123.58172f, 80.0f, 120.0f, 83.58172f, 120.0f, 88.0f),
                    PathNode.LineTo(120.0f, 139.06f),
                    PathNode.LineTo(83.58f, 120.84f),
                    PathNode.CurveTo(79.62564f, 118.86282f, 74.81718f, 120.465645f, 72.84f, 124.42f),
                    PathNode.CurveTo(70.86282f, 128.37436f, 72.465645f, 133.18282f, 76.42f, 135.16f),
                    PathNode.LineTo(120.0f, 156.94f),
                    PathNode.LineTo(120.0f, 173.94f),
                    PathNode.CurveTo(110.2005f, 180.75267f, 98.480736f, 184.25633f, 86.55f, 183.94f),
                    PathNode.CurveTo(56.9f, 183.23f, 31.92f, 157.52f, 32.0f, 127.84f),
                    PathNode.CurveTo(31.990034f, 105.00267f, 45.899544f, 84.46524f, 67.11f, 76.0f),
                    PathNode.CurveTo(69.213394f, 75.155365f, 70.85976f, 73.458115f, 71.64f, 71.33f),
                    PathNode.CurveTo(80.284035f, 47.658012f, 102.79916f, 31.91034f, 128.0f, 31.91034f),
                    PathNode.CurveTo(153.20084f, 31.91034f, 175.71597f, 47.658012f, 184.36f, 71.33f),
                    PathNode.CurveTo(185.14024f, 73.458115f, 186.7866f, 75.155365f, 188.89f, 76.0f),
                    PathNode.CurveTo(210.10046f, 84.46524f, 224.00996f, 105.00267f, 224.0f, 127.84f),
                    PathNode.CurveTo(224.08f, 157.52f, 199.1f, 183.23f, 169.45f, 184.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _tree!!
    }

private var _tree: ImageVector? = null
