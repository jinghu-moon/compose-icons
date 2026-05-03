package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.TextStrikethrough: ImageVector
    get() {
        if (_textStrikethrough != null) return _textStrikethrough!!
        _textStrikethrough = phosphorFillIcon(
            name = "TextStrikethrough",
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
                    PathNode.MoveTo(82.71f, 94.58f),
                    PathNode.CurveTo(86.0f, 76.57f, 104.58f, 64.0f, 128.0f, 64.0f),
                    PathNode.CurveTo(146.2f, 64.0f, 161.59f, 71.41f, 169.18f, 83.83f),
                    PathNode.CurveTo(171.48305f, 87.602104f, 170.2921f, 92.52697f, 166.52f, 94.83f),
                    PathNode.CurveTo(162.7479f, 97.133026f, 157.82303f, 95.942116f, 155.52f, 92.17f),
                    PathNode.CurveTo(150.94f, 84.66f, 140.39f, 80.0f, 128.0f, 80.0f),
                    PathNode.CurveTo(112.7f, 80.0f, 100.27f, 87.33f, 98.45f, 97.42f),
                    PathNode.CurveTo(97.763855f, 101.224266f, 94.45564f, 103.99374f, 90.59f, 104.0f),
                    PathNode.CurveTo(90.11034f, 104.00095f, 89.63162f, 103.957436f, 89.16f, 103.87f),
                    PathNode.CurveTo(84.81446f, 103.08429f, 81.92746f, 98.92611f, 82.71f, 94.58f),
                    PathNode.Close,
                    PathNode.MoveTo(192.0f, 136.0f),
                    PathNode.LineTo(168.29f, 136.0f),
                    PathNode.CurveTo(173.36914f, 141.40656f, 176.13571f, 148.58311f, 176.0f, 156.0f),
                    PathNode.CurveTo(176.0f, 176.19f, 154.92f, 192.0f, 128.0f, 192.0f),
                    PathNode.CurveTo(104.11f, 192.0f, 84.17f, 179.22f, 80.57f, 161.6f),
                    PathNode.CurveTo(79.90546f, 158.7639f, 80.834984f, 155.79074f, 82.99663f, 153.8382f),
                    PathNode.CurveTo(85.15827f, 151.88567f, 88.21036f, 151.26239f, 90.96447f, 152.21107f),
                    PathNode.CurveTo(93.718575f, 153.15974f, 95.73937f, 155.53043f, 96.24f, 158.4f),
                    PathNode.CurveTo(98.24f, 168.27f, 112.24f, 176.0f, 128.0f, 176.0f),
                    PathNode.CurveTo(145.35f, 176.0f, 160.0f, 166.84f, 160.0f, 156.0f),
                    PathNode.CurveTo(160.0f, 146.86f, 153.24f, 141.57f, 134.28f, 136.0f),
                    PathNode.LineTo(64.0f, 136.0f),
                    PathNode.CurveTo(59.581722f, 136.0f, 56.0f, 132.41827f, 56.0f, 128.0f),
                    PathNode.CurveTo(56.0f, 123.58172f, 59.581722f, 120.0f, 64.0f, 120.0f),
                    PathNode.LineTo(192.0f, 120.0f),
                    PathNode.CurveTo(196.41827f, 120.0f, 200.0f, 123.58172f, 200.0f, 128.0f),
                    PathNode.CurveTo(200.0f, 132.41827f, 196.41827f, 136.0f, 192.0f, 136.0f),
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
        return _textStrikethrough!!
    }

private var _textStrikethrough: ImageVector? = null
