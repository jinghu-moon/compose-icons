package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.NuclearPlant: ImageVector
    get() {
        if (_nuclearPlant != null) return _nuclearPlant!!
        _nuclearPlant = phosphorBoldIcon(
            name = "NuclearPlant",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(92.83f, 50.0f),
                    PathNode.CurveTo(97.62966f, 21.081985f, 122.68652f, -0.091634f, 152.0f, 0f),
                    PathNode.CurveTo(158.62741f, 0f, 164.0f, 5.372583f, 164.0f, 12.0f),
                    PathNode.CurveTo(164.0f, 18.627417f, 158.62741f, 24.0f, 152.0f, 24.0f),
                    PathNode.CurveTo(134.40901f, 23.935974f, 119.3704f, 36.64467f, 116.5f, 54.0f),
                    PathNode.CurveTo(115.524826f, 59.769207f, 110.53105f, 63.994072f, 104.68f, 64.0f),
                    PathNode.CurveTo(104.00961f, 64.00262f, 103.340324f, 63.945724f, 102.68f, 63.83f),
                    PathNode.CurveTo(99.539085f, 63.303726f, 96.73618f, 61.55049f, 94.888664f, 58.956463f),
                    PathNode.CurveTo(93.041145f, 56.36243f, 92.300545f, 53.140385f, 92.83f, 50.0f),
                    PathNode.Close,
                    PathNode.MoveTo(148.0f, 40.0f),
                    PathNode.CurveTo(141.37259f, 40.0f, 136.0f, 45.37258f, 136.0f, 52.0f),
                    PathNode.CurveTo(136.0f, 58.62742f, 141.37259f, 64.0f, 148.0f, 64.0f),
                    PathNode.LineTo(152.0f, 64.0f),
                    PathNode.CurveTo(180.7051f, 63.966934f, 203.96693f, 40.7051f, 204.0f, 12.0f),
                    PathNode.CurveTo(204.0f, 5.372583f, 198.62741f, 0f, 192.0f, 0f),
                    PathNode.CurveTo(185.37259f, 0f, 180.0f, 5.372583f, 180.0f, 12.0f),
                    PathNode.CurveTo(180.0f, 27.463972f, 167.46397f, 40.0f, 152.0f, 40.0f),
                    PathNode.Close,
                    PathNode.MoveTo(252.0f, 216.0f),
                    PathNode.CurveTo(252.0f, 222.62741f, 246.62741f, 228.0f, 240.0f, 228.0f),
                    PathNode.LineTo(16.0f, 228.0f),
                    PathNode.CurveTo(9.372583f, 228.0f, 4.0f, 222.62741f, 4.0f, 216.0f),
                    PathNode.CurveTo(4.0f, 209.37259f, 9.372583f, 204.0f, 16.0f, 204.0f),
                    PathNode.LineTo(32.15f, 204.0f),
                    PathNode.CurveTo(44.62f, 177.47f, 58.35f, 139.59f, 59.87f, 99.19f),
                    PathNode.CurveTo(60.24827f, 88.44436f, 69.09785f, 79.944695f, 79.85f, 80.0f),
                    PathNode.LineTo(168.19f, 80.0f),
                    PathNode.CurveTo(178.88617f, 79.98868f, 187.69798f, 88.39515f, 188.19f, 99.08f),
                    PathNode.CurveTo(190.19f, 143.2f, 210.65f, 185.56f, 220.77f, 204.0f),
                    PathNode.LineTo(240.0f, 204.0f),
                    PathNode.CurveTo(246.62741f, 204.0f, 252.0f, 209.37259f, 252.0f, 216.0f),
                    PathNode.Close,
                    PathNode.MoveTo(164.4f, 104.0f),
                    PathNode.LineTo(148.4f, 104.0f),
                    PathNode.CurveTo(150.76f, 142.59f, 163.89f, 178.53f, 175.87f, 204.0f),
                    PathNode.LineTo(193.65f, 204.0f),
                    PathNode.CurveTo(181.92f, 180.52f, 167.0f, 143.66f, 164.4f, 104.0f),
                    PathNode.Close,
                    PathNode.MoveTo(58.48f, 204.0f),
                    PathNode.LineTo(149.48f, 204.0f),
                    PathNode.CurveTo(137.82f, 177.12f, 126.37f, 141.85f, 124.29f, 104.0f),
                    PathNode.LineTo(83.67f, 104.0f),
                    PathNode.CurveTo(81.59f, 141.85f, 70.14f, 177.12f, 58.48f, 204.0f),
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
        return _nuclearPlant!!
    }

private var _nuclearPlant: ImageVector? = null
