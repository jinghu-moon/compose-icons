package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Panorama: ImageVector
    get() {
        if (_panorama != null) return _panorama!!
        _panorama = phosphorBoldIcon(
            name = "Panorama",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(244.18f, 48.15f),
                    PathNode.CurveTo(239.26805f, 44.345837f, 232.85652f, 43.065014f, 226.86f, 44.69f),
                    PathNode.LineTo(223.37f, 45.63f),
                    PathNode.CurveTo(204.74f, 50.65f, 170.08f, 60.0f, 128.0f, 60.0f),
                    PathNode.CurveTo(85.92f, 60.0f, 51.26f, 50.65f, 32.63f, 45.63f),
                    PathNode.LineTo(29.14f, 44.69f),
                    PathNode.CurveTo(23.140541f, 43.094547f, 16.740345f, 44.375504f, 11.817061f, 48.15707f),
                    PathNode.CurveTo(6.893777f, 51.93864f, 4.005657f, 57.792027f, 4.0f, 64.0f),
                    PathNode.LineTo(4.0f, 192.0f),
                    PathNode.CurveTo(3.999951f, 203.02231f, 12.917744f, 211.96693f, 23.94f, 212.0f),
                    PathNode.CurveTo(25.705833f, 211.9971f, 27.463835f, 211.76517f, 29.17f, 211.31f),
                    PathNode.LineTo(32.36f, 210.44f),
                    PathNode.CurveTo(51.0f, 205.39f, 85.7f, 196.0f, 128.0f, 196.0f),
                    PathNode.CurveTo(170.3f, 196.0f, 205.0f, 205.4f, 223.64f, 210.45f),
                    PathNode.LineTo(226.83f, 211.32f),
                    PathNode.CurveTo(232.8353f, 212.92699f, 239.24641f, 211.65012f, 244.17776f, 207.8649f),
                    PathNode.CurveTo(249.10912f, 204.0797f, 251.99992f, 198.2166f, 252.0f, 192.0f),
                    PathNode.LineTo(252.0f, 64.0f),
                    PathNode.CurveTo(252.019f, 57.783646f, 249.12473f, 51.91738f, 244.18f, 48.15f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 84.0f),
                    PathNode.CurveTo(172.0f, 84.0f, 209.14f, 74.31f, 228.0f, 69.23f),
                    PathNode.LineTo(228.0f, 177.08f),
                    PathNode.LineTo(176.77f, 125.86f),
                    PathNode.CurveTo(168.96f, 118.05236f, 156.3f, 118.05236f, 148.49f, 125.86f),
                    PathNode.LineTo(131.31f, 143.0f),
                    PathNode.LineTo(90.14f, 101.86f),
                    PathNode.CurveTo(82.33f, 94.05236f, 69.67f, 94.05236f, 61.86f, 101.86f),
                    PathNode.LineTo(28.0f, 135.71f),
                    PathNode.LineTo(28.0f, 69.23f),
                    PathNode.CurveTo(46.86f, 74.31f, 84.0f, 84.0f, 128.0f, 84.0f),
                    PathNode.Close,
                    PathNode.MoveTo(148.28f, 160.0f),
                    PathNode.LineTo(162.63f, 145.65f),
                    PathNode.LineTo(196.09f, 179.11f),
                    PathNode.CurveTo(186.0f, 177.11f, 174.57f, 175.18f, 162.15f, 173.86f),
                    PathNode.Close,
                    PathNode.MoveTo(28.0f, 186.76f),
                    PathNode.LineTo(28.0f, 169.65f),
                    PathNode.LineTo(76.0f, 121.65f),
                    PathNode.LineTo(126.35f, 172.0f),
                    PathNode.CurveTo(83.12f, 172.24f, 46.74f, 181.7f, 28.0f, 186.76f),
                    PathNode.Close,
                    PathNode.MoveTo(184.0f, 108.0f),
                    PathNode.CurveTo(184.0f, 99.163445f, 191.16344f, 92.0f, 200.0f, 92.0f),
                    PathNode.CurveTo(208.83656f, 92.0f, 216.0f, 99.163445f, 216.0f, 108.0f),
                    PathNode.CurveTo(216.0f, 116.836555f, 208.83656f, 124.0f, 200.0f, 124.0f),
                    PathNode.CurveTo(191.16344f, 124.0f, 184.0f, 116.836555f, 184.0f, 108.0f),
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
        return _panorama!!
    }

private var _panorama: ImageVector? = null
