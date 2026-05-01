package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Log: ImageVector
    get() {
        if (_log != null) return _log!!
        _log = phosphorBoldIcon(
            name = "Log",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(216.0f, 136.0f),
                    PathNode.CurveTo(216.0f, 144.83656f, 208.83656f, 152.0f, 200.0f, 152.0f),
                    PathNode.CurveTo(191.16344f, 152.0f, 184.0f, 144.83656f, 184.0f, 136.0f),
                    PathNode.CurveTo(184.0f, 127.163445f, 191.16344f, 120.0f, 200.0f, 120.0f),
                    PathNode.CurveTo(208.83656f, 120.0f, 216.0f, 127.163445f, 216.0f, 136.0f),
                    PathNode.Close,
                    PathNode.MoveTo(252.0f, 136.0f),
                    PathNode.CurveTo(252.0f, 178.62f, 229.16f, 212.0f, 200.0f, 212.0f),
                    PathNode.LineTo(56.0f, 212.0f),
                    PathNode.CurveTo(26.84f, 212.0f, 4.0f, 178.62f, 4.0f, 136.0f),
                    PathNode.CurveTo(4.0f, 93.38f, 26.84f, 60.0f, 56.0f, 60.0f),
                    PathNode.LineTo(91.0f, 60.0f),
                    PathNode.LineTo(127.48f, 23.51f),
                    PathNode.CurveTo(129.73972f, 21.252768f, 132.80606f, 19.98952f, 136.0f, 20.0f),
                    PathNode.LineTo(168.0f, 20.0f),
                    PathNode.CurveTo(174.62741f, 20.0f, 180.0f, 25.372583f, 180.0f, 32.0f),
                    PathNode.CurveTo(180.0f, 38.62742f, 174.62741f, 44.0f, 168.0f, 44.0f),
                    PathNode.LineTo(141.0f, 44.0f),
                    PathNode.LineTo(125.0f, 60.0f),
                    PathNode.LineTo(200.0f, 60.0f),
                    PathNode.CurveTo(229.16f, 60.0f, 252.0f, 93.38f, 252.0f, 136.0f),
                    PathNode.Close,
                    PathNode.MoveTo(56.0f, 188.0f),
                    PathNode.LineTo(161.77f, 188.0f),
                    PathNode.CurveTo(157.87033f, 181.76387f, 154.81375f, 175.03874f, 152.68f, 168.0f),
                    PathNode.LineTo(80.0f, 168.0f),
                    PathNode.CurveTo(73.37258f, 168.0f, 68.0f, 162.62741f, 68.0f, 156.0f),
                    PathNode.CurveTo(68.0f, 149.37259f, 73.37258f, 144.0f, 80.0f, 144.0f),
                    PathNode.LineTo(148.27f, 144.0f),
                    PathNode.CurveTo(148.09f, 141.37f, 148.0f, 138.71f, 148.0f, 136.0f),
                    PathNode.CurveTo(148.0f, 115.7f, 153.19f, 97.5f, 161.77f, 84.0f),
                    PathNode.LineTo(56.0f, 84.0f),
                    PathNode.CurveTo(48.15f, 84.0f, 39.77f, 91.51f, 34.24f, 104.0f),
                    PathNode.LineTo(104.0f, 104.0f),
                    PathNode.CurveTo(110.62742f, 104.0f, 116.0f, 109.37258f, 116.0f, 116.0f),
                    PathNode.CurveTo(116.0f, 122.62742f, 110.62742f, 128.0f, 104.0f, 128.0f),
                    PathNode.LineTo(28.35f, 128.0f),
                    PathNode.CurveTo(28.12f, 130.59f, 28.0f, 133.25f, 28.0f, 136.0f),
                    PathNode.CurveTo(28.0f, 166.64f, 42.76f, 188.0f, 56.0f, 188.0f),
                    PathNode.Close,
                    PathNode.MoveTo(228.0f, 136.0f),
                    PathNode.CurveTo(228.0f, 105.36f, 213.24f, 84.0f, 200.0f, 84.0f),
                    PathNode.CurveTo(186.76f, 84.0f, 172.0f, 105.36f, 172.0f, 136.0f),
                    PathNode.CurveTo(172.0f, 166.64f, 186.76f, 188.0f, 200.0f, 188.0f),
                    PathNode.CurveTo(213.24f, 188.0f, 228.0f, 166.64f, 228.0f, 136.0f),
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
        return _log!!
    }

private var _log: ImageVector? = null
