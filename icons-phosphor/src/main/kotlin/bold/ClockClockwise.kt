package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ClockClockwise: ImageVector
    get() {
        if (_clockClockwise != null) return _clockClockwise!!
        _clockClockwise = phosphorBoldIcon(
            name = "ClockClockwise",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(140.0f, 80.0f),
                    PathNode.LineTo(140.0f, 121.21f),
                    PathNode.LineTo(174.17f, 141.71f),
                    PathNode.CurveTo(177.9309f, 143.87367f, 180.23088f, 147.899f, 180.18529f, 152.23764f),
                    PathNode.CurveTo(180.13966f, 156.57626f, 177.75555f, 160.55235f, 173.95f, 162.63647f),
                    PathNode.CurveTo(170.14445f, 164.72061f, 165.51027f, 164.58813f, 161.83f, 162.29f),
                    PathNode.LineTo(121.83f, 138.29f),
                    PathNode.CurveTo(118.214f, 136.12228f, 116.0008f, 132.21599f, 116.0f, 128.0f),
                    PathNode.LineTo(116.0f, 80.0f),
                    PathNode.CurveTo(116.0f, 73.37258f, 121.37258f, 68.0f, 128.0f, 68.0f),
                    PathNode.CurveTo(134.62741f, 68.0f, 140.0f, 73.37258f, 140.0f, 80.0f),
                    PathNode.Close,
                    PathNode.MoveTo(224.0f, 52.0f),
                    PathNode.CurveTo(217.37259f, 52.0f, 212.0f, 57.37258f, 212.0f, 64.0f),
                    PathNode.LineTo(212.0f, 71.37f),
                    PathNode.CurveTo(207.79f, 66.7f, 203.42f, 62.06f, 198.71f, 57.29f),
                    PathNode.CurveTo(159.92184f, 18.506094f, 97.13138f, 18.206364f, 57.97472f, 56.618202f),
                    PathNode.CurveTo(18.818066f, 95.03004f, 17.912014f, 157.81468f, 55.943943f, 197.34042f),
                    PathNode.CurveTo(93.97587f, 236.86618f, 156.74886f, 238.37848f, 196.64f, 200.73f),
                    PathNode.CurveTo(201.46144f, 196.17917f, 201.68083f, 188.58145f, 197.13f, 183.76f),
                    PathNode.CurveTo(192.57918f, 178.93855f, 184.98145f, 178.71918f, 180.16f, 183.27f),
                    PathNode.CurveTo(149.84816f, 211.87639f, 102.15225f, 210.733f, 73.24598f, 180.707f),
                    PathNode.CurveTo(44.339706f, 150.68098f, 45.00896f, 102.97608f, 74.746155f, 73.77279f),
                    PathNode.CurveTo(104.48335f, 44.569496f, 152.19257f, 44.76454f, 181.69f, 74.21f),
                    PathNode.CurveTo(187.61f, 80.2f, 193.0f, 86.0f, 198.23f, 92.0f),
                    PathNode.LineTo(184.0f, 92.0f),
                    PathNode.CurveTo(177.37259f, 92.0f, 172.0f, 97.37258f, 172.0f, 104.0f),
                    PathNode.CurveTo(172.0f, 110.62742f, 177.37259f, 116.0f, 184.0f, 116.0f),
                    PathNode.LineTo(224.0f, 116.0f),
                    PathNode.CurveTo(230.62741f, 116.0f, 236.0f, 110.62742f, 236.0f, 104.0f),
                    PathNode.LineTo(236.0f, 64.0f),
                    PathNode.CurveTo(236.0f, 57.37258f, 230.62741f, 52.0f, 224.0f, 52.0f),
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
        return _clockClockwise!!
    }

private var _clockClockwise: ImageVector? = null
