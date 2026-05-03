package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Hash: ImageVector
    get() {
        if (_hash != null) return _hash!!
        _hash = phosphorThinIcon(
            name = "Hash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(224.0f, 92.0f),
                    PathNode.LineTo(170.61f, 92.0f),
                    PathNode.LineTo(179.94f, 40.72f),
                    PathNode.CurveTo(180.33765f, 38.544f, 178.896f, 36.457645f, 176.72f, 36.06f),
                    PathNode.CurveTo(174.54399f, 35.662354f, 172.45764f, 37.103996f, 172.06f, 39.28f),
                    PathNode.LineTo(162.48f, 92.0f),
                    PathNode.LineTo(106.61f, 92.0f),
                    PathNode.LineTo(115.94f, 40.72f),
                    PathNode.CurveTo(116.33765f, 38.544f, 114.896f, 36.457645f, 112.72f, 36.06f),
                    PathNode.CurveTo(110.544f, 35.662354f, 108.45764f, 37.103996f, 108.06f, 39.28f),
                    PathNode.LineTo(98.48f, 92.0f),
                    PathNode.LineTo(48.0f, 92.0f),
                    PathNode.CurveTo(45.79086f, 92.0f, 44.0f, 93.79086f, 44.0f, 96.0f),
                    PathNode.CurveTo(44.0f, 98.20914f, 45.79086f, 100.0f, 48.0f, 100.0f),
                    PathNode.LineTo(97.0f, 100.0f),
                    PathNode.LineTo(86.84f, 156.0f),
                    PathNode.LineTo(32.0f, 156.0f),
                    PathNode.CurveTo(29.790861f, 156.0f, 28.0f, 157.79086f, 28.0f, 160.0f),
                    PathNode.CurveTo(28.0f, 162.20914f, 29.790861f, 164.0f, 32.0f, 164.0f),
                    PathNode.LineTo(85.39f, 164.0f),
                    PathNode.LineTo(76.06f, 215.28f),
                    PathNode.CurveTo(75.66545f, 217.45317f, 77.10694f, 219.53484f, 79.28f, 219.93f),
                    PathNode.CurveTo(79.51709f, 219.9771f, 79.75828f, 220.00056f, 80.0f, 220.0f),
                    PathNode.CurveTo(81.93659f, 220.00171f, 83.59625f, 218.61584f, 83.94f, 216.71f),
                    PathNode.LineTo(93.52f, 164.0f),
                    PathNode.LineTo(149.39f, 164.0f),
                    PathNode.LineTo(140.06f, 215.28f),
                    PathNode.CurveTo(139.66545f, 217.45317f, 141.10695f, 219.53484f, 143.28f, 219.93f),
                    PathNode.CurveTo(143.51709f, 219.9771f, 143.75827f, 220.00056f, 144.0f, 220.0f),
                    PathNode.CurveTo(145.93658f, 220.00171f, 147.59625f, 218.61584f, 147.94f, 216.71f),
                    PathNode.LineTo(157.52f, 164.0f),
                    PathNode.LineTo(208.0f, 164.0f),
                    PathNode.CurveTo(210.20914f, 164.0f, 212.0f, 162.20914f, 212.0f, 160.0f),
                    PathNode.CurveTo(212.0f, 157.79086f, 210.20914f, 156.0f, 208.0f, 156.0f),
                    PathNode.LineTo(159.0f, 156.0f),
                    PathNode.LineTo(169.19f, 100.0f),
                    PathNode.LineTo(224.0f, 100.0f),
                    PathNode.CurveTo(226.20914f, 100.0f, 228.0f, 98.20914f, 228.0f, 96.0f),
                    PathNode.CurveTo(228.0f, 93.79086f, 226.20914f, 92.0f, 224.0f, 92.0f),
                    PathNode.Close,
                    PathNode.MoveTo(150.84f, 156.0f),
                    PathNode.LineTo(95.0f, 156.0f),
                    PathNode.LineTo(105.19f, 100.0f),
                    PathNode.LineTo(161.0f, 100.0f),
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
        return _hash!!
    }

private var _hash: ImageVector? = null
