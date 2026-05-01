package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Translate: ImageVector
    get() {
        if (_translate != null) return _translate!!
        _translate = phosphorBoldIcon(
            name = "Translate",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(250.73f, 210.63f),
                    PathNode.LineTo(194.73f, 98.63f),
                    PathNode.CurveTo(192.69606f, 94.56802f, 188.54276f, 92.00281f, 184.0f, 92.00281f),
                    PathNode.CurveTo(179.45724f, 92.00281f, 175.30394f, 94.56802f, 173.27f, 98.63f),
                    PathNode.LineTo(152.75f, 139.63f),
                    PathNode.CurveTo(138.92563f, 138.42151f, 125.61426f, 133.81491f, 114.0f, 126.22f),
                    PathNode.CurveTo(128.11351f, 109.80689f, 136.94214f, 89.51463f, 139.33f, 68.0f),
                    PathNode.LineTo(160.0f, 68.0f),
                    PathNode.CurveTo(166.62741f, 68.0f, 172.0f, 62.62742f, 172.0f, 56.0f),
                    PathNode.CurveTo(172.0f, 49.37258f, 166.62741f, 44.0f, 160.0f, 44.0f),
                    PathNode.LineTo(108.0f, 44.0f),
                    PathNode.LineTo(108.0f, 32.0f),
                    PathNode.CurveTo(108.0f, 25.372583f, 102.62742f, 20.0f, 96.0f, 20.0f),
                    PathNode.CurveTo(89.37258f, 20.0f, 84.0f, 25.372583f, 84.0f, 32.0f),
                    PathNode.LineTo(84.0f, 44.0f),
                    PathNode.LineTo(32.0f, 44.0f),
                    PathNode.CurveTo(25.372583f, 44.0f, 20.0f, 49.37258f, 20.0f, 56.0f),
                    PathNode.CurveTo(20.0f, 62.62742f, 25.372583f, 68.0f, 32.0f, 68.0f),
                    PathNode.LineTo(115.13f, 68.0f),
                    PathNode.CurveTo(112.87902f, 83.63949f, 106.24664f, 98.32225f, 96.0f, 110.35f),
                    PathNode.CurveTo(90.999664f, 104.498566f, 86.82729f, 97.98764f, 83.6f, 91.0f),
                    PathNode.CurveTo(81.87927f, 86.99931f, 78.12608f, 84.24493f, 73.793495f, 83.803215f),
                    PathNode.CurveTo(69.460915f, 83.3615f, 65.229095f, 85.30182f, 62.73642f, 88.87295f),
                    PathNode.CurveTo(60.24374f, 92.44407f, 59.881523f, 97.085396f, 61.79f, 101.0f),
                    PathNode.CurveTo(65.987755f, 110.12925f, 71.444145f, 118.625206f, 78.0f, 126.24f),
                    PathNode.CurveTo(64.34349f, 135.22914f, 48.349453f, 140.01344f, 32.0f, 140.0f),
                    PathNode.CurveTo(25.372583f, 140.0f, 20.0f, 145.37259f, 20.0f, 152.0f),
                    PathNode.CurveTo(20.0f, 158.62741f, 25.372583f, 164.0f, 32.0f, 164.0f),
                    PathNode.CurveTo(55.04037f, 164.01869f, 77.47681f, 156.6322f, 96.0f, 142.93f),
                    PathNode.CurveTo(109.43301f, 152.81557f, 124.96595f, 159.46814f, 141.39f, 162.37f),
                    PathNode.LineTo(117.26f, 210.63f),
                    PathNode.CurveTo(115.21836f, 214.4782f, 115.42255f, 219.13058f, 117.793465f, 222.78513f),
                    PathNode.CurveTo(120.16439f, 226.43967f, 124.329636f, 228.5223f, 128.67581f, 228.2263f),
                    PathNode.CurveTo(133.02199f, 227.93034f, 136.86642f, 225.30223f, 138.72f, 221.36f),
                    PathNode.LineTo(151.41f, 196.0f),
                    PathNode.LineTo(216.58f, 196.0f),
                    PathNode.LineTo(229.26f, 221.36f),
                    PathNode.CurveTo(232.223f, 227.28877f, 239.43123f, 229.69301f, 245.36f, 226.73f),
                    PathNode.CurveTo(251.28877f, 223.767f, 253.69301f, 216.55878f, 250.73f, 210.63f),
                    PathNode.Close,
                    PathNode.MoveTo(163.41f, 172.0f),
                    PathNode.LineTo(184.0f, 130.83f),
                    PathNode.LineTo(204.58f, 172.0f),
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
        return _translate!!
    }

private var _translate: ImageVector? = null
