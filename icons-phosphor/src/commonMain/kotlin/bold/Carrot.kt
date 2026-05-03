package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Carrot: ImageVector
    get() {
        if (_carrot != null) return _carrot!!
        _carrot = phosphorBoldIcon(
            name = "Carrot",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(232.0f, 60.0f),
                    PathNode.LineTo(213.0f, 60.0f),
                    PathNode.LineTo(232.51f, 40.49f),
                    PathNode.CurveTo(237.20442f, 35.79558f, 237.20442f, 28.18442f, 232.51f, 23.49f),
                    PathNode.CurveTo(227.81558f, 18.79558f, 220.20442f, 18.79558f, 215.51f, 23.49f),
                    PathNode.LineTo(196.0f, 43.0f),
                    PathNode.LineTo(196.0f, 24.0f),
                    PathNode.CurveTo(196.0f, 17.372583f, 190.62741f, 12.0f, 184.0f, 12.0f),
                    PathNode.CurveTo(177.37259f, 12.0f, 172.0f, 17.372583f, 172.0f, 24.0f),
                    PathNode.LineTo(172.0f, 50.0f),
                    PathNode.CurveTo(146.24516f, 38.38643f, 115.99222f, 43.907593f, 96.0f, 63.87f),
                    PathNode.LineTo(96.0f, 63.87f),
                    PathNode.LineTo(96.0f, 63.87f),
                    PathNode.LineTo(96.0f, 63.87f),
                    PathNode.CurveTo(55.45f, 103.68f, 25.18f, 197.0f, 21.78f, 207.77f),
                    PathNode.CurveTo(18.986103f, 213.95805f, 19.52238f, 221.14095f, 23.204185f, 226.84552f),
                    PathNode.CurveTo(26.885992f, 232.5501f, 33.210457f, 235.99722f, 40.0f, 236.0f),
                    PathNode.CurveTo(42.841545f, 235.9952f, 45.649845f, 235.38855f, 48.24f, 234.22f),
                    PathNode.CurveTo(55.88f, 231.8f, 105.03f, 215.88f, 147.15f, 192.4f),
                    PathNode.LineTo(147.69f, 192.1f),
                    PathNode.CurveTo(164.79f, 182.53f, 180.69f, 171.71f, 192.13f, 160.1f),
                    PathNode.CurveTo(212.13626f, 140.08978f, 217.6602f, 109.78176f, 206.0f, 84.0f),
                    PathNode.LineTo(232.0f, 84.0f),
                    PathNode.CurveTo(238.62741f, 84.0f, 244.0f, 78.62742f, 244.0f, 72.0f),
                    PathNode.CurveTo(244.0f, 65.37258f, 238.62741f, 60.0f, 232.0f, 60.0f),
                    PathNode.Close,
                    PathNode.MoveTo(175.11f, 143.12f),
                    PathNode.LineTo(175.02f, 143.21f),
                    PathNode.CurveTo(166.91f, 151.49f, 155.91f, 159.41f, 143.69f, 166.73f),
                    PathNode.LineTo(120.48f, 143.52f),
                    PathNode.CurveTo(115.785576f, 138.82558f, 108.17442f, 138.82558f, 103.48f, 143.52f),
                    PathNode.CurveTo(98.785576f, 148.21442f, 98.785576f, 155.82558f, 103.48f, 160.52f),
                    PathNode.LineTo(121.7f, 178.74f),
                    PathNode.CurveTo(91.41f, 193.91f, 59.57f, 205.16f, 46.44f, 209.56f),
                    PathNode.CurveTo(53.21f, 189.34f, 76.23f, 124.76f, 104.78f, 89.82f),
                    PathNode.LineTo(135.48f, 120.52f),
                    PathNode.CurveTo(140.17442f, 125.214424f, 147.78558f, 125.214424f, 152.48f, 120.52f),
                    PathNode.CurveTo(157.17442f, 115.82558f, 157.17442f, 108.214424f, 152.48f, 103.52f),
                    PathNode.LineTo(122.54f, 73.58f),
                    PathNode.CurveTo(141.71802f, 62.84654f, 165.87502f, 67.91019f, 179.12827f, 85.44171f),
                    PathNode.CurveTo(192.38153f, 102.97324f, 190.66618f, 127.595535f, 175.11f, 143.12f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 24.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _carrot!!
    }

private var _carrot: ImageVector? = null
