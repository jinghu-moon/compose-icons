package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Password: ImageVector
    get() {
        if (_password != null) return _password!!
        _password = phosphorDuotoneIcon(
            name = "Password",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(256.0f, 72.0f),
                    PathNode.LineTo(256.0f, 184.0f),
                    PathNode.CurveTo(256.0f, 192.83656f, 248.83656f, 200.0f, 240.0f, 200.0f),
                    PathNode.LineTo(16.0f, 200.0f),
                    PathNode.CurveTo(7.163444f, 200.0f, 0f, 192.83656f, 0f, 184.0f),
                    PathNode.LineTo(0f, 72.0f),
                    PathNode.CurveTo(0f, 63.163445f, 7.163444f, 56.0f, 16.0f, 56.0f),
                    PathNode.LineTo(240.0f, 56.0f),
                    PathNode.CurveTo(248.83656f, 56.0f, 256.0f, 63.163445f, 256.0f, 72.0f),
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
                    PathNode.MoveTo(48.0f, 56.0f),
                    PathNode.LineTo(48.0f, 200.0f),
                    PathNode.CurveTo(48.0f, 204.41827f, 44.418278f, 208.0f, 40.0f, 208.0f),
                    PathNode.CurveTo(35.581722f, 208.0f, 32.0f, 204.41827f, 32.0f, 200.0f),
                    PathNode.LineTo(32.0f, 56.0f),
                    PathNode.CurveTo(32.0f, 51.581722f, 35.581722f, 48.0f, 40.0f, 48.0f),
                    PathNode.CurveTo(44.418278f, 48.0f, 48.0f, 51.581722f, 48.0f, 56.0f),
                    PathNode.Close,
                    PathNode.MoveTo(140.0f, 110.5f),
                    PathNode.LineTo(120.0f, 117.0f),
                    PathNode.LineTo(120.0f, 96.0f),
                    PathNode.CurveTo(120.0f, 91.58172f, 116.41828f, 88.0f, 112.0f, 88.0f),
                    PathNode.CurveTo(107.58172f, 88.0f, 104.0f, 91.58172f, 104.0f, 96.0f),
                    PathNode.LineTo(104.0f, 117.0f),
                    PathNode.LineTo(84.0f, 110.5f),
                    PathNode.CurveTo(79.79711f, 109.119286f, 75.27071f, 111.40711f, 73.89f, 115.61f),
                    PathNode.CurveTo(72.509285f, 119.81289f, 74.79711f, 124.33929f, 79.0f, 125.72f),
                    PathNode.LineTo(99.0f, 132.21f),
                    PathNode.LineTo(86.66f, 149.21f),
                    PathNode.CurveTo(84.88457f, 151.51686f, 84.50231f, 154.60605f, 85.6619f, 157.2761f),
                    PathNode.CurveTo(86.821495f, 159.94614f, 89.3399f, 161.77557f, 92.23763f, 162.05289f),
                    PathNode.CurveTo(95.13536f, 162.33022f, 97.95504f, 161.01164f, 99.6f, 158.61f),
                    PathNode.LineTo(111.94f, 141.61f),
                    PathNode.LineTo(124.28f, 158.61f),
                    PathNode.CurveTo(125.924965f, 161.01164f, 128.74463f, 162.33022f, 131.64236f, 162.05289f),
                    PathNode.CurveTo(134.5401f, 161.77557f, 137.0585f, 159.94614f, 138.2181f, 157.2761f),
                    PathNode.CurveTo(139.37769f, 154.60605f, 138.99544f, 151.51686f, 137.22f, 149.21f),
                    PathNode.LineTo(124.88f, 132.21f),
                    PathNode.LineTo(144.88f, 125.72f),
                    PathNode.CurveTo(148.88754f, 124.22937f, 151.01451f, 119.85094f, 149.70903f, 115.77933f),
                    PathNode.CurveTo(148.40355f, 111.70772f, 144.12714f, 109.3824f, 140.0f, 110.5f),
                    PathNode.Close,
                    PathNode.MoveTo(246.0f, 115.64f),
                    PathNode.CurveTo(244.63564f, 111.47817f, 240.17834f, 109.18713f, 236.0f, 110.5f),
                    PathNode.LineTo(216.0f, 117.0f),
                    PathNode.LineTo(216.0f, 96.0f),
                    PathNode.CurveTo(216.0f, 91.58172f, 212.41827f, 88.0f, 208.0f, 88.0f),
                    PathNode.CurveTo(203.58173f, 88.0f, 200.0f, 91.58172f, 200.0f, 96.0f),
                    PathNode.LineTo(200.0f, 117.0f),
                    PathNode.LineTo(180.0f, 110.51f),
                    PathNode.CurveTo(175.79712f, 109.1431f, 171.2819f, 111.442116f, 169.915f, 115.645f),
                    PathNode.CurveTo(168.5481f, 119.847885f, 170.8471f, 124.3631f, 175.05f, 125.73f),
                    PathNode.LineTo(195.05f, 132.22f),
                    PathNode.LineTo(182.71f, 149.22f),
                    PathNode.CurveTo(180.93457f, 151.52686f, 180.55232f, 154.61604f, 181.7119f, 157.28609f),
                    PathNode.CurveTo(182.87149f, 159.95613f, 185.3899f, 161.78557f, 188.28763f, 162.0629f),
                    PathNode.CurveTo(191.18536f, 162.34021f, 194.00504f, 161.02164f, 195.65f, 158.62f),
                    PathNode.LineTo(207.99f, 141.62f),
                    PathNode.LineTo(220.33f, 158.62f),
                    PathNode.CurveTo(221.97496f, 161.02164f, 224.79462f, 162.34021f, 227.69237f, 162.0629f),
                    PathNode.CurveTo(230.5901f, 161.78557f, 233.1085f, 159.95613f, 234.2681f, 157.28609f),
                    PathNode.CurveTo(235.42769f, 154.61604f, 235.04543f, 151.52686f, 233.27f, 149.22f),
                    PathNode.LineTo(220.93f, 132.22f),
                    PathNode.LineTo(240.93f, 125.73f),
                    PathNode.CurveTo(245.11038f, 124.3369f, 247.37718f, 119.82565f, 246.0f, 115.64f),
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
        return _password!!
    }

private var _password: ImageVector? = null
