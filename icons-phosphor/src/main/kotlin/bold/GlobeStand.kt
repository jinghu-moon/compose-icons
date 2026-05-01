package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.GlobeStand: ImageVector
    get() {
        if (_globeStand != null) return _globeStand!!
        _globeStand = phosphorBoldIcon(
            name = "GlobeStand",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(136.0f, 176.0f),
                    PathNode.CurveTo(175.7645f, 176.0f, 208.0f, 143.7645f, 208.0f, 104.0f),
                    PathNode.CurveTo(208.0f, 64.2355f, 175.7645f, 32.0f, 136.0f, 32.0f),
                    PathNode.CurveTo(96.2355f, 32.0f, 64.0f, 64.2355f, 64.0f, 104.0f),
                    PathNode.CurveTo(64.04409f, 143.74623f, 96.25378f, 175.95592f, 136.0f, 176.0f),
                    PathNode.Close,
                    PathNode.MoveTo(136.0f, 56.0f),
                    PathNode.CurveTo(162.50967f, 56.0f, 184.0f, 77.49033f, 184.0f, 104.0f),
                    PathNode.CurveTo(184.0f, 130.50967f, 162.50967f, 152.0f, 136.0f, 152.0f),
                    PathNode.CurveTo(109.49033f, 152.0f, 88.0f, 130.50967f, 88.0f, 104.0f),
                    PathNode.CurveTo(88.02756f, 77.501755f, 109.501755f, 56.02756f, 136.0f, 56.0f),
                    PathNode.Close,
                    PathNode.MoveTo(148.0f, 215.35f),
                    PathNode.LineTo(148.0f, 228.0f),
                    PathNode.LineTo(168.0f, 228.0f),
                    PathNode.CurveTo(174.62741f, 228.0f, 180.0f, 233.37259f, 180.0f, 240.0f),
                    PathNode.CurveTo(180.0f, 246.62741f, 174.62741f, 252.0f, 168.0f, 252.0f),
                    PathNode.LineTo(104.0f, 252.0f),
                    PathNode.CurveTo(97.37258f, 252.0f, 92.0f, 246.62741f, 92.0f, 240.0f),
                    PathNode.CurveTo(92.0f, 233.37259f, 97.37258f, 228.0f, 104.0f, 228.0f),
                    PathNode.LineTo(124.0f, 228.0f),
                    PathNode.LineTo(124.0f, 215.36f),
                    PathNode.CurveTo(81.881676f, 210.8228f, 45.92738f, 182.91064f, 31.090199f, 143.23198f),
                    PathNode.CurveTo(16.253014f, 103.5533f, 25.072227f, 58.89884f, 53.88f, 27.84f),
                    PathNode.CurveTo(56.76946f, 24.592678f, 61.189087f, 23.161777f, 65.43348f, 24.099445f),
                    PathNode.CurveTo(69.67787f, 25.037113f, 73.08337f, 28.196732f, 74.33589f, 32.359097f),
                    PathNode.CurveTo(75.5884f, 36.52146f, 74.492096f, 41.03574f, 71.47f, 44.16f),
                    PathNode.CurveTo(39.204742f, 78.838646f, 40.177734f, 132.83488f, 73.671425f, 166.32857f),
                    PathNode.CurveTo(107.16512f, 199.82227f, 161.16136f, 200.79526f, 195.84f, 168.53f),
                    PathNode.CurveTo(198.96425f, 165.5079f, 203.47855f, 164.41159f, 207.6409f, 165.66411f),
                    PathNode.CurveTo(211.80327f, 166.91663f, 214.96289f, 170.32213f, 215.90056f, 174.56651f),
                    PathNode.CurveTo(216.83823f, 178.81091f, 215.40732f, 183.23055f, 212.16f, 186.12f),
                    PathNode.CurveTo(194.49747f, 202.54596f, 171.98509f, 212.80212f, 148.0f, 215.35f),
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
        return _globeStand!!
    }

private var _globeStand: ImageVector? = null
