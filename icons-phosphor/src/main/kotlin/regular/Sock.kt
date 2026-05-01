package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Sock: ImageVector
    get() {
        if (_sock != null) return _sock!!
        _sock = phosphorRegularIcon(
            name = "Sock",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(192.0f, 16.0f),
                    PathNode.LineTo(104.0f, 16.0f),
                    PathNode.CurveTo(95.163445f, 16.0f, 88.0f, 23.163445f, 88.0f, 32.0f),
                    PathNode.LineTo(88.0f, 108.69f),
                    PathNode.LineTo(49.25f, 147.43f),
                    PathNode.CurveTo(26.68925f, 170.51346f, 26.900745f, 207.45206f, 49.724342f, 230.27565f),
                    PathNode.CurveTo(72.54794f, 253.09926f, 109.48655f, 253.31075f, 132.57f, 230.75f),
                    PathNode.LineTo(201.0f, 162.34f),
                    PathNode.CurveTo(205.51141f, 157.8365f, 208.03226f, 151.71443f, 208.0f, 145.34f),
                    PathNode.LineTo(208.0f, 32.0f),
                    PathNode.CurveTo(208.0f, 23.163445f, 200.83656f, 16.0f, 192.0f, 16.0f),
                    PathNode.Close,
                    PathNode.MoveTo(192.0f, 32.0f),
                    PathNode.LineTo(192.0f, 32.0f),
                    PathNode.LineTo(192.0f, 48.0f),
                    PathNode.LineTo(104.0f, 48.0f),
                    PathNode.LineTo(104.0f, 32.0f),
                    PathNode.Close,
                    PathNode.MoveTo(121.25f, 219.43f),
                    PathNode.CurveTo(110.45244f, 230.47534f, 94.55165f, 234.86508f, 79.61671f, 230.92374f),
                    PathNode.CurveTo(64.68176f, 226.98239f, 53.017605f, 215.31824f, 49.07626f, 200.3833f),
                    PathNode.CurveTo(45.13492f, 185.44835f, 49.524666f, 169.54756f, 60.57f, 158.75f),
                    PathNode.LineTo(101.66f, 117.66f),
                    PathNode.CurveTo(103.15991f, 116.158424f, 104.00167f, 114.12237f, 104.0f, 112.0f),
                    PathNode.LineTo(104.0f, 64.0f),
                    PathNode.LineTo(192.0f, 64.0f),
                    PathNode.LineTo(192.0f, 104.58f),
                    PathNode.CurveTo(164.46985f, 108.59267f, 144.04143f, 132.17899f, 144.0f, 160.0f),
                    PathNode.CurveTo(143.9638f, 170.13142f, 146.70659f, 180.0788f, 151.93f, 188.76f),
                    PathNode.Close,
                    PathNode.MoveTo(189.66f, 151.0f),
                    PathNode.LineTo(163.75f, 176.91f),
                    PathNode.CurveTo(161.26749f, 171.61911f, 159.98686f, 165.84433f, 160.0f, 160.0f),
                    PathNode.CurveTo(160.02023f, 140.99992f, 173.38766f, 124.62898f, 192.0f, 120.81f),
                    PathNode.LineTo(192.0f, 145.37f),
                    PathNode.CurveTo(191.99373f, 147.48198f, 191.15257f, 149.50578f, 189.66f, 151.0f),
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
        return _sock!!
    }

private var _sock: ImageVector? = null
