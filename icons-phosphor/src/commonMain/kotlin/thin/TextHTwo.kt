package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.TextHTwo: ImageVector
    get() {
        if (_textHTwo != null) return _textHTwo!!
        _textHTwo = phosphorThinIcon(
            name = "TextHTwo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(148.0f, 56.0f),
                    PathNode.LineTo(148.0f, 176.0f),
                    PathNode.CurveTo(148.0f, 178.20914f, 146.20914f, 180.0f, 144.0f, 180.0f),
                    PathNode.CurveTo(141.79086f, 180.0f, 140.0f, 178.20914f, 140.0f, 176.0f),
                    PathNode.LineTo(140.0f, 120.0f),
                    PathNode.LineTo(44.0f, 120.0f),
                    PathNode.LineTo(44.0f, 176.0f),
                    PathNode.CurveTo(44.0f, 178.20914f, 42.20914f, 180.0f, 40.0f, 180.0f),
                    PathNode.CurveTo(37.79086f, 180.0f, 36.0f, 178.20914f, 36.0f, 176.0f),
                    PathNode.LineTo(36.0f, 56.0f),
                    PathNode.CurveTo(36.0f, 53.79086f, 37.79086f, 52.0f, 40.0f, 52.0f),
                    PathNode.CurveTo(42.20914f, 52.0f, 44.0f, 53.79086f, 44.0f, 56.0f),
                    PathNode.LineTo(44.0f, 112.0f),
                    PathNode.LineTo(140.0f, 112.0f),
                    PathNode.LineTo(140.0f, 56.0f),
                    PathNode.CurveTo(140.0f, 53.79086f, 141.79086f, 52.0f, 144.0f, 52.0f),
                    PathNode.CurveTo(146.20914f, 52.0f, 148.0f, 53.79086f, 148.0f, 56.0f),
                    PathNode.Close,
                    PathNode.MoveTo(240.0f, 204.0f),
                    PathNode.LineTo(200.0f, 204.0f),
                    PathNode.LineTo(238.36f, 152.85f),
                    PathNode.CurveTo(244.98744f, 144.0385f, 245.82678f, 132.1579f, 240.50401f, 122.50214f),
                    PathNode.CurveTo(235.18124f, 112.84637f, 224.68742f, 107.21323f, 213.69849f, 108.112785f),
                    PathNode.CurveTo(202.70956f, 109.01235f, 193.27156f, 116.27713f, 189.59f, 126.67f),
                    PathNode.CurveTo(189.05766f, 128.03084f, 189.30974f, 129.57365f, 190.24751f, 130.69429f),
                    PathNode.CurveTo(191.1853f, 131.81493f, 192.65953f, 132.335f, 194.0929f, 132.05087f),
                    PathNode.CurveTo(195.52625f, 131.76675f, 196.69061f, 130.72362f, 197.13f, 129.33f),
                    PathNode.CurveTo(197.81572f, 127.42024f, 198.78308f, 125.623726f, 200.0f, 124.0f),
                    PathNode.CurveTo(206.62741f, 115.163445f, 219.16344f, 113.37258f, 228.0f, 120.0f),
                    PathNode.CurveTo(236.83656f, 126.62742f, 238.62741f, 139.16344f, 232.0f, 148.0f),
                    PathNode.LineTo(188.8f, 205.6f),
                    PathNode.CurveTo(187.89095f, 206.81207f, 187.74472f, 208.43372f, 188.42229f, 209.78885f),
                    PathNode.CurveTo(189.09985f, 211.144f, 190.48491f, 212.0f, 192.0f, 212.0f),
                    PathNode.LineTo(240.0f, 212.0f),
                    PathNode.CurveTo(242.20914f, 212.0f, 244.0f, 210.20914f, 244.0f, 208.0f),
                    PathNode.CurveTo(244.0f, 205.79086f, 242.20914f, 204.0f, 240.0f, 204.0f),
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
        return _textHTwo!!
    }

private var _textHTwo: ImageVector? = null
