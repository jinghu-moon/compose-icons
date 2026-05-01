package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.TextSubscript: ImageVector
    get() {
        if (_textSubscript != null) return _textSubscript!!
        _textSubscript = phosphorThinIcon(
            name = "TextSubscript",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(244.0f, 208.0f),
                    PathNode.CurveTo(244.0f, 210.20914f, 242.20914f, 212.0f, 240.0f, 212.0f),
                    PathNode.LineTo(192.0f, 212.0f),
                    PathNode.CurveTo(190.48491f, 212.0f, 189.09985f, 211.144f, 188.42229f, 209.78885f),
                    PathNode.CurveTo(187.74472f, 208.43372f, 187.89095f, 206.81207f, 188.8f, 205.6f),
                    PathNode.LineTo(232.0f, 148.0f),
                    PathNode.CurveTo(238.62741f, 139.16344f, 236.83656f, 126.62742f, 228.0f, 120.0f),
                    PathNode.CurveTo(219.16344f, 113.37258f, 206.62741f, 115.163445f, 200.0f, 124.0f),
                    PathNode.CurveTo(198.77086f, 125.63368f, 197.79645f, 127.44426f, 197.11f, 129.37f),
                    PathNode.CurveTo(196.37546f, 131.45488f, 194.08987f, 132.54955f, 192.005f, 131.815f),
                    PathNode.CurveTo(189.92014f, 131.08046f, 188.82545f, 128.79488f, 189.56f, 126.71f),
                    PathNode.CurveTo(190.50688f, 124.016136f, 191.85544f, 121.48084f, 193.56f, 119.19f),
                    PathNode.CurveTo(202.93257f, 107.051506f, 220.32587f, 104.711266f, 232.57347f, 113.94079f),
                    PathNode.CurveTo(244.82108f, 123.17033f, 247.3652f, 140.53496f, 238.28f, 152.89f),
                    PathNode.LineTo(200.0f, 204.0f),
                    PathNode.LineTo(240.0f, 204.0f),
                    PathNode.CurveTo(242.20914f, 204.0f, 244.0f, 205.79086f, 244.0f, 208.0f),
                    PathNode.Close,
                    PathNode.MoveTo(146.62f, 53.0f),
                    PathNode.CurveTo(144.95174f, 51.554092f, 142.42749f, 51.733116f, 140.98f, 53.4f),
                    PathNode.LineTo(92.0f, 109.89f),
                    PathNode.LineTo(43.0f, 53.38f),
                    PathNode.CurveTo(42.1114f, 52.150173f, 40.603477f, 51.528973f, 39.10646f, 51.776024f),
                    PathNode.CurveTo(37.609447f, 52.02308f, 36.381084f, 53.09585f, 35.934757f, 54.545982f),
                    PathNode.CurveTo(35.488434f, 55.996113f, 35.900986f, 57.573933f, 37.0f, 58.62f),
                    PathNode.LineTo(86.71f, 116.0f),
                    PathNode.LineTo(37.0f, 173.38f),
                    PathNode.CurveTo(35.900986f, 174.42607f, 35.488434f, 176.00389f, 35.934757f, 177.45403f),
                    PathNode.CurveTo(36.381084f, 178.90414f, 37.609447f, 179.97693f, 39.10646f, 180.22397f),
                    PathNode.CurveTo(40.603477f, 180.47102f, 42.1114f, 179.84982f, 43.0f, 178.62f),
                    PathNode.LineTo(92.0f, 122.11f),
                    PathNode.LineTo(141.0f, 178.62f),
                    PathNode.CurveTo(142.49683f, 180.04471f, 144.83249f, 180.09474f, 146.38895f, 178.73544f),
                    PathNode.CurveTo(147.9454f, 177.37613f, 148.21025f, 175.055f, 147.0f, 173.38f),
                    PathNode.LineTo(97.29f, 116.0f),
                    PathNode.LineTo(147.0f, 58.62f),
                    PathNode.CurveTo(148.43744f, 56.95994f, 148.26782f, 54.45145f, 146.62f, 53.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 8.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _textSubscript!!
    }

private var _textSubscript: ImageVector? = null
