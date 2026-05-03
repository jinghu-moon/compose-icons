package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.TwitchLogo: ImageVector
    get() {
        if (_twitchLogo != null) return _twitchLogo!!
        _twitchLogo = phosphorThinIcon(
            name = "TwitchLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(208.0f, 36.0f),
                    PathNode.LineTo(48.0f, 36.0f),
                    PathNode.CurveTo(41.37258f, 36.0f, 36.0f, 41.37258f, 36.0f, 48.0f),
                    PathNode.LineTo(36.0f, 192.0f),
                    PathNode.CurveTo(36.0f, 198.62741f, 41.37258f, 204.0f, 48.0f, 204.0f),
                    PathNode.LineTo(68.0f, 204.0f),
                    PathNode.LineTo(68.0f, 240.0f),
                    PathNode.CurveTo(68.0003f, 241.55045f, 68.89655f, 242.96106f, 70.3f, 243.62f),
                    PathNode.CurveTo(70.83077f, 243.87321f, 71.411934f, 244.00314f, 72.0f, 244.0f),
                    PathNode.CurveTo(72.93586f, 243.99902f, 73.841736f, 243.66992f, 74.56f, 243.07f),
                    PathNode.LineTo(121.45f, 204.0f),
                    PathNode.LineTo(165.1f, 204.0f),
                    PathNode.CurveTo(167.90886f, 203.99713f, 170.62863f, 203.01392f, 172.79f, 201.22f),
                    PathNode.LineTo(215.68f, 165.47f),
                    PathNode.CurveTo(218.42505f, 163.19633f, 220.00966f, 159.81436f, 220.0f, 156.25f),
                    PathNode.LineTo(220.0f, 48.0f),
                    PathNode.CurveTo(220.0f, 41.37258f, 214.62741f, 36.0f, 208.0f, 36.0f),
                    PathNode.Close,
                    PathNode.MoveTo(212.0f, 156.25f),
                    PathNode.CurveTo(212.00194f, 157.43973f, 211.47417f, 158.56857f, 210.56f, 159.33f),
                    PathNode.LineTo(167.66f, 195.07f),
                    PathNode.CurveTo(166.94173f, 195.66992f, 166.03586f, 195.99902f, 165.1f, 196.0f),
                    PathNode.LineTo(120.0f, 196.0f),
                    PathNode.CurveTo(119.06414f, 196.00098f, 118.158264f, 196.33008f, 117.44f, 196.93f),
                    PathNode.LineTo(76.0f, 231.46f),
                    PathNode.LineTo(76.0f, 200.0f),
                    PathNode.CurveTo(76.0f, 197.79086f, 74.20914f, 196.0f, 72.0f, 196.0f),
                    PathNode.LineTo(48.0f, 196.0f),
                    PathNode.CurveTo(45.79086f, 196.0f, 44.0f, 194.20914f, 44.0f, 192.0f),
                    PathNode.LineTo(44.0f, 48.0f),
                    PathNode.CurveTo(44.0f, 45.79086f, 45.79086f, 44.0f, 48.0f, 44.0f),
                    PathNode.LineTo(208.0f, 44.0f),
                    PathNode.CurveTo(210.20914f, 44.0f, 212.0f, 45.79086f, 212.0f, 48.0f),
                    PathNode.Close,
                    PathNode.MoveTo(172.0f, 88.0f),
                    PathNode.LineTo(172.0f, 136.0f),
                    PathNode.CurveTo(172.0f, 138.20914f, 170.20914f, 140.0f, 168.0f, 140.0f),
                    PathNode.CurveTo(165.79086f, 140.0f, 164.0f, 138.20914f, 164.0f, 136.0f),
                    PathNode.LineTo(164.0f, 88.0f),
                    PathNode.CurveTo(164.0f, 85.79086f, 165.79086f, 84.0f, 168.0f, 84.0f),
                    PathNode.CurveTo(170.20914f, 84.0f, 172.0f, 85.79086f, 172.0f, 88.0f),
                    PathNode.Close,
                    PathNode.MoveTo(124.0f, 88.0f),
                    PathNode.LineTo(124.0f, 136.0f),
                    PathNode.CurveTo(124.0f, 138.20914f, 122.20914f, 140.0f, 120.0f, 140.0f),
                    PathNode.CurveTo(117.79086f, 140.0f, 116.0f, 138.20914f, 116.0f, 136.0f),
                    PathNode.LineTo(116.0f, 88.0f),
                    PathNode.CurveTo(116.0f, 85.79086f, 117.79086f, 84.0f, 120.0f, 84.0f),
                    PathNode.CurveTo(122.20914f, 84.0f, 124.0f, 85.79086f, 124.0f, 88.0f),
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
        return _twitchLogo!!
    }

private var _twitchLogo: ImageVector? = null
