package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.LightningA: ImageVector
    get() {
        if (_lightningA != null) return _lightningA!!
        _lightningA = phosphorBoldIcon(
            name = "LightningA",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(179.76f, 110.75f),
                    PathNode.CurveTo(178.98972f, 106.95942f, 176.43948f, 103.77257f, 172.91f, 102.19f),
                    PathNode.LineTo(126.0f, 81.12f),
                    PathNode.LineTo(138.9f, 26.77f),
                    PathNode.CurveTo(140.1558f, 21.465664f, 137.67873f, 15.981277f, 132.86879f, 13.416605f),
                    PathNode.CurveTo(128.05885f, 10.851933f, 122.12457f, 11.851355f, 118.42f, 15.85f),
                    PathNode.LineTo(23.19f, 118.7f),
                    PathNode.CurveTo(20.564756f, 121.53532f, 19.465452f, 125.46131f, 20.236593f, 129.24763f),
                    PathNode.CurveTo(21.007734f, 133.03395f, 23.554958f, 136.21729f, 27.08f, 137.8f),
                    PathNode.LineTo(74.08f, 158.88f),
                    PathNode.LineTo(61.12f, 213.22f),
                    PathNode.CurveTo(59.849148f, 218.53096f, 62.324425f, 224.03023f, 67.14267f, 226.60043f),
                    PathNode.CurveTo(71.96091f, 229.17062f, 77.90688f, 228.16351f, 81.61f, 224.15f),
                    PathNode.LineTo(176.8f, 121.29f),
                    PathNode.CurveTo(179.42519f, 118.45764f, 180.52681f, 114.53495f, 179.76f, 110.75f),
                    PathNode.Close,
                    PathNode.MoveTo(95.0f, 174.31f),
                    PathNode.LineTo(99.64f, 154.77f),
                    PathNode.CurveTo(100.97068f, 149.16707f, 98.13353f, 143.40881f, 92.88f, 141.05f),
                    PathNode.LineTo(52.12f, 122.75f),
                    PathNode.LineTo(105.0f, 65.69f),
                    PathNode.LineTo(100.36f, 85.23f),
                    PathNode.CurveTo(98.99671f, 90.83882f, 101.81977f, 96.623566f, 107.08f, 99.0f),
                    PathNode.LineTo(147.85f, 117.3f),
                    PathNode.Close,
                    PathNode.MoveTo(242.7f, 210.63f),
                    PathNode.LineTo(206.7f, 138.63f),
                    PathNode.CurveTo(204.66805f, 134.56253f, 200.51178f, 131.99281f, 195.965f, 131.99281f),
                    PathNode.CurveTo(191.41823f, 131.99281f, 187.26196f, 134.56253f, 185.23f, 138.63f),
                    PathNode.LineTo(149.23f, 210.63f),
                    PathNode.CurveTo(147.18835f, 214.4782f, 147.39255f, 219.13058f, 149.76347f, 222.78513f),
                    PathNode.CurveTo(152.13438f, 226.43967f, 156.29964f, 228.5223f, 160.64581f, 228.2263f),
                    PathNode.CurveTo(164.99199f, 227.93034f, 168.83643f, 225.30223f, 170.69f, 221.36f),
                    PathNode.LineTo(175.37f, 212.0f),
                    PathNode.LineTo(216.54f, 212.0f),
                    PathNode.LineTo(221.22f, 221.36f),
                    PathNode.CurveTo(224.18301f, 227.28877f, 231.39122f, 229.69301f, 237.32f, 226.73f),
                    PathNode.CurveTo(243.24878f, 223.767f, 245.65302f, 216.55878f, 242.69f, 210.63f),
                    PathNode.Close,
                    PathNode.MoveTo(187.41f, 188.0f),
                    PathNode.LineTo(196.0f, 170.83f),
                    PathNode.LineTo(204.58f, 188.0f),
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
        return _lightningA!!
    }

private var _lightningA: ImageVector? = null
