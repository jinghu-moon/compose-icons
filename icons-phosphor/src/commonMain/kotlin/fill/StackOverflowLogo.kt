package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.StackOverflowLogo: ImageVector
    get() {
        if (_stackOverflowLogo != null) return _stackOverflowLogo!!
        _stackOverflowLogo = phosphorFillIcon(
            name = "StackOverflowLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(208.0f, 32.0f),
                    PathNode.LineTo(48.0f, 32.0f),
                    PathNode.CurveTo(39.163445f, 32.0f, 32.0f, 39.163445f, 32.0f, 48.0f),
                    PathNode.LineTo(32.0f, 208.0f),
                    PathNode.CurveTo(32.0f, 216.83656f, 39.163445f, 224.0f, 48.0f, 224.0f),
                    PathNode.LineTo(208.0f, 224.0f),
                    PathNode.CurveTo(216.83656f, 224.0f, 224.0f, 216.83656f, 224.0f, 208.0f),
                    PathNode.LineTo(224.0f, 48.0f),
                    PathNode.CurveTo(224.0f, 39.163445f, 216.83656f, 32.0f, 208.0f, 32.0f),
                    PathNode.Close,
                    PathNode.MoveTo(134.86f, 46.86f),
                    PathNode.CurveTo(136.36055f, 45.357784f, 138.39673f, 44.513706f, 140.52f, 44.513706f),
                    PathNode.CurveTo(142.64328f, 44.513706f, 144.67946f, 45.357784f, 146.18f, 46.86f),
                    PathNode.LineTo(191.43f, 92.12f),
                    PathNode.CurveTo(194.41823f, 95.26531f, 194.35481f, 100.219246f, 191.28703f, 103.287025f),
                    PathNode.CurveTo(188.21925f, 106.354805f, 183.2653f, 106.418236f, 180.12f, 103.43f),
                    PathNode.LineTo(134.86f, 58.18f),
                    PathNode.CurveTo(133.35779f, 56.679455f, 132.5137f, 54.643272f, 132.5137f, 52.52f),
                    PathNode.CurveTo(132.5137f, 50.396725f, 133.35779f, 48.360546f, 134.86f, 46.86f),
                    PathNode.Close,
                    PathNode.MoveTo(100.18f, 98.77f),
                    PathNode.CurveTo(101.87063f, 94.689255f, 106.548615f, 92.750916f, 110.63f, 94.44f),
                    PathNode.LineTo(169.76f, 118.93f),
                    PathNode.CurveTo(173.298f, 120.383286f, 175.31235f, 124.13765f, 174.56693f, 127.88915f),
                    PathNode.CurveTo(173.8215f, 131.64067f, 170.52484f, 134.33972f, 166.7f, 134.33f),
                    PathNode.CurveTo(165.64888f, 134.32921f, 164.60852f, 134.11844f, 163.64f, 133.71f),
                    PathNode.LineTo(104.51f, 109.22f),
                    PathNode.CurveTo(100.42926f, 107.529366f, 98.49091f, 102.85139f, 100.18f, 98.77f),
                    PathNode.Close,
                    PathNode.MoveTo(96.0f, 152.0f),
                    PathNode.LineTo(160.0f, 152.0f),
                    PathNode.CurveTo(164.41827f, 152.0f, 168.0f, 155.58173f, 168.0f, 160.0f),
                    PathNode.CurveTo(168.0f, 164.41827f, 164.41827f, 168.0f, 160.0f, 168.0f),
                    PathNode.LineTo(96.0f, 168.0f),
                    PathNode.CurveTo(91.58172f, 168.0f, 88.0f, 164.41827f, 88.0f, 160.0f),
                    PathNode.CurveTo(88.0f, 155.58173f, 91.58172f, 152.0f, 96.0f, 152.0f),
                    PathNode.Close,
                    PathNode.MoveTo(200.0f, 192.0f),
                    PathNode.CurveTo(200.0f, 196.41827f, 196.41827f, 200.0f, 192.0f, 200.0f),
                    PathNode.LineTo(64.0f, 200.0f),
                    PathNode.CurveTo(59.581722f, 200.0f, 56.0f, 196.41827f, 56.0f, 192.0f),
                    PathNode.LineTo(56.0f, 144.0f),
                    PathNode.CurveTo(56.0f, 139.58173f, 59.581722f, 136.0f, 64.0f, 136.0f),
                    PathNode.CurveTo(68.41828f, 136.0f, 72.0f, 139.58173f, 72.0f, 144.0f),
                    PathNode.LineTo(72.0f, 184.0f),
                    PathNode.LineTo(184.0f, 184.0f),
                    PathNode.LineTo(184.0f, 144.0f),
                    PathNode.CurveTo(184.0f, 139.58173f, 187.58173f, 136.0f, 192.0f, 136.0f),
                    PathNode.CurveTo(196.41827f, 136.0f, 200.0f, 139.58173f, 200.0f, 144.0f),
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
        return _stackOverflowLogo!!
    }

private var _stackOverflowLogo: ImageVector? = null
