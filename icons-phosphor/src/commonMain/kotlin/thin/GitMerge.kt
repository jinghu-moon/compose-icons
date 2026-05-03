package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.GitMerge: ImageVector
    get() {
        if (_gitMerge != null) return _gitMerge!!
        _gitMerge = phosphorThinIcon(
            name = "GitMerge",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(208.0f, 116.0f),
                    PathNode.CurveTo(194.2983f, 116.00303f, 182.61142f, 125.92122f, 180.38f, 139.44f),
                    PathNode.LineTo(134.53f, 132.89f),
                    PathNode.CurveTo(131.64806f, 132.47713f, 129.0145f, 131.03062f, 127.12f, 128.82f),
                    PathNode.LineTo(87.75f, 82.9f),
                    PathNode.CurveTo(101.507256f, 78.93318f, 110.05556f, 65.2268f, 107.56585f, 51.127186f),
                    PathNode.CurveTo(105.07615f, 37.027573f, 92.35063f, 27.077717f, 78.06679f, 28.06239f),
                    PathNode.CurveTo(63.782944f, 29.047064f, 52.543125f, 40.649f, 52.011723f, 54.956875f),
                    PathNode.CurveTo(51.480316f, 69.264755f, 61.828552f, 81.66848f, 76.0f, 83.71f),
                    PathNode.LineTo(76.0f, 172.29f),
                    PathNode.CurveTo(61.464695f, 174.38799f, 51.020195f, 187.35973f, 52.071888f, 202.00797f),
                    PathNode.CurveTo(53.123585f, 216.65619f, 65.314064f, 228.0028f, 80.0f, 228.0028f),
                    PathNode.CurveTo(94.685936f, 228.0028f, 106.87642f, 216.65619f, 107.92811f, 202.00797f),
                    PathNode.CurveTo(108.979805f, 187.35973f, 98.53531f, 174.38799f, 84.0f, 172.29f),
                    PathNode.LineTo(84.0f, 90.81f),
                    PathNode.LineTo(121.0f, 134.0f),
                    PathNode.CurveTo(124.16054f, 137.68526f, 128.55365f, 140.09508f, 133.36f, 140.78f),
                    PathNode.LineTo(180.19f, 147.47f),
                    PathNode.CurveTo(182.05014f, 162.36397f, 195.32361f, 173.14195f, 210.28221f, 171.9047f),
                    PathNode.CurveTo(225.24081f, 170.66743f, 236.56306f, 157.85507f, 235.95085f, 142.85786f),
                    PathNode.CurveTo(235.33861f, 127.860695f, 223.00967f, 116.013855f, 208.0f, 116.0f),
                    PathNode.Close,
                    PathNode.MoveTo(60.0f, 56.0f),
                    PathNode.CurveTo(60.0f, 44.954304f, 68.95431f, 36.0f, 80.0f, 36.0f),
                    PathNode.CurveTo(91.04569f, 36.0f, 100.0f, 44.954304f, 100.0f, 56.0f),
                    PathNode.CurveTo(100.0f, 67.04569f, 91.04569f, 76.0f, 80.0f, 76.0f),
                    PathNode.CurveTo(68.95431f, 76.0f, 60.0f, 67.04569f, 60.0f, 56.0f),
                    PathNode.Close,
                    PathNode.MoveTo(100.0f, 200.0f),
                    PathNode.CurveTo(100.0f, 211.0457f, 91.04569f, 220.0f, 80.0f, 220.0f),
                    PathNode.CurveTo(68.95431f, 220.0f, 60.0f, 211.0457f, 60.0f, 200.0f),
                    PathNode.CurveTo(60.0f, 188.9543f, 68.95431f, 180.0f, 80.0f, 180.0f),
                    PathNode.CurveTo(91.04569f, 180.0f, 100.0f, 188.9543f, 100.0f, 200.0f),
                    PathNode.Close,
                    PathNode.MoveTo(208.0f, 164.0f),
                    PathNode.CurveTo(196.9543f, 164.0f, 188.0f, 155.0457f, 188.0f, 144.0f),
                    PathNode.CurveTo(188.0f, 132.9543f, 196.9543f, 124.0f, 208.0f, 124.0f),
                    PathNode.CurveTo(219.0457f, 124.0f, 228.0f, 132.9543f, 228.0f, 144.0f),
                    PathNode.CurveTo(228.0f, 155.0457f, 219.0457f, 164.0f, 208.0f, 164.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 8.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _gitMerge!!
    }

private var _gitMerge: ImageVector? = null
