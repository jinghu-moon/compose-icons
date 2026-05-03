package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.TumblrLogo: ImageVector
    get() {
        if (_tumblrLogo != null) return _tumblrLogo!!
        _tumblrLogo = phosphorThinIcon(
            name = "TumblrLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(192.0f, 116.0f),
                    PathNode.CurveTo(194.20914f, 116.0f, 196.0f, 114.20914f, 196.0f, 112.0f),
                    PathNode.LineTo(196.0f, 72.0f),
                    PathNode.CurveTo(196.0f, 69.79086f, 194.20914f, 68.0f, 192.0f, 68.0f),
                    PathNode.LineTo(148.0f, 68.0f),
                    PathNode.LineTo(148.0f, 24.0f),
                    PathNode.CurveTo(148.0f, 21.790861f, 146.20914f, 20.0f, 144.0f, 20.0f),
                    PathNode.LineTo(112.0f, 20.0f),
                    PathNode.CurveTo(109.79086f, 20.0f, 108.0f, 21.790861f, 108.0f, 24.0f),
                    PathNode.CurveTo(107.97244f, 48.28911f, 88.28911f, 67.97244f, 64.0f, 68.0f),
                    PathNode.CurveTo(61.79086f, 68.0f, 60.0f, 69.79086f, 60.0f, 72.0f),
                    PathNode.LineTo(60.0f, 112.0f),
                    PathNode.CurveTo(60.0f, 114.20914f, 61.79086f, 116.0f, 64.0f, 116.0f),
                    PathNode.LineTo(92.0f, 116.0f),
                    PathNode.LineTo(92.0f, 176.0f),
                    PathNode.CurveTo(92.038574f, 209.1211f, 118.87891f, 235.96143f, 152.0f, 236.0f),
                    PathNode.LineTo(192.0f, 236.0f),
                    PathNode.CurveTo(194.20914f, 236.0f, 196.0f, 234.20914f, 196.0f, 232.0f),
                    PathNode.LineTo(196.0f, 184.0f),
                    PathNode.CurveTo(196.0f, 181.79086f, 194.20914f, 180.0f, 192.0f, 180.0f),
                    PathNode.LineTo(160.0f, 180.0f),
                    PathNode.CurveTo(153.37259f, 180.0f, 148.0f, 174.62741f, 148.0f, 168.0f),
                    PathNode.LineTo(148.0f, 116.0f),
                    PathNode.Close,
                    PathNode.MoveTo(160.0f, 188.0f),
                    PathNode.LineTo(188.0f, 188.0f),
                    PathNode.LineTo(188.0f, 228.0f),
                    PathNode.LineTo(152.0f, 228.0f),
                    PathNode.CurveTo(123.2949f, 227.96693f, 100.033066f, 204.7051f, 100.0f, 176.0f),
                    PathNode.LineTo(100.0f, 112.0f),
                    PathNode.CurveTo(100.0f, 109.79086f, 98.20914f, 108.0f, 96.0f, 108.0f),
                    PathNode.LineTo(68.0f, 108.0f),
                    PathNode.LineTo(68.0f, 75.85f),
                    PathNode.CurveTo(93.54925f, 73.842674f, 113.842674f, 53.549244f, 115.85f, 28.0f),
                    PathNode.LineTo(140.0f, 28.0f),
                    PathNode.LineTo(140.0f, 72.0f),
                    PathNode.CurveTo(140.0f, 74.20914f, 141.79086f, 76.0f, 144.0f, 76.0f),
                    PathNode.LineTo(188.0f, 76.0f),
                    PathNode.LineTo(188.0f, 108.0f),
                    PathNode.LineTo(144.0f, 108.0f),
                    PathNode.CurveTo(141.79086f, 108.0f, 140.0f, 109.79086f, 140.0f, 112.0f),
                    PathNode.LineTo(140.0f, 168.0f),
                    PathNode.CurveTo(140.0f, 179.0457f, 148.9543f, 188.0f, 160.0f, 188.0f),
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
        return _tumblrLogo!!
    }

private var _tumblrLogo: ImageVector? = null
