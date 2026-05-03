package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Sun: ImageVector
    get() {
        if (_sun != null) return _sun!!
        _sun = phosphorThinIcon(
            name = "Sun",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(124.0f, 40.0f),
                    PathNode.LineTo(124.0f, 16.0f),
                    PathNode.CurveTo(124.0f, 13.790861f, 125.79086f, 12.0f, 128.0f, 12.0f),
                    PathNode.CurveTo(130.20914f, 12.0f, 132.0f, 13.790861f, 132.0f, 16.0f),
                    PathNode.LineTo(132.0f, 40.0f),
                    PathNode.CurveTo(132.0f, 42.20914f, 130.20914f, 44.0f, 128.0f, 44.0f),
                    PathNode.CurveTo(125.79086f, 44.0f, 124.0f, 42.20914f, 124.0f, 40.0f),
                    PathNode.Close,
                    PathNode.MoveTo(188.0f, 128.0f),
                    PathNode.CurveTo(188.0f, 161.13708f, 161.13708f, 188.0f, 128.0f, 188.0f),
                    PathNode.CurveTo(94.862915f, 188.0f, 68.0f, 161.13708f, 68.0f, 128.0f),
                    PathNode.CurveTo(68.0f, 94.862915f, 94.862915f, 68.0f, 128.0f, 68.0f),
                    PathNode.CurveTo(161.1211f, 68.038574f, 187.96143f, 94.87891f, 188.0f, 128.0f),
                    PathNode.Close,
                    PathNode.MoveTo(180.0f, 128.0f),
                    PathNode.CurveTo(180.0f, 99.2812f, 156.71881f, 76.0f, 128.0f, 76.0f),
                    PathNode.CurveTo(99.2812f, 76.0f, 76.0f, 99.2812f, 76.0f, 128.0f),
                    PathNode.CurveTo(76.0f, 156.71881f, 99.2812f, 180.0f, 128.0f, 180.0f),
                    PathNode.CurveTo(156.7051f, 179.96693f, 179.96693f, 156.7051f, 180.0f, 128.0f),
                    PathNode.Close,
                    PathNode.MoveTo(61.17f, 66.83f),
                    PathNode.CurveTo(62.732967f, 68.39297f, 65.26704f, 68.39297f, 66.83f, 66.83f),
                    PathNode.CurveTo(68.39297f, 65.26704f, 68.39297f, 62.732967f, 66.83f, 61.17f),
                    PathNode.LineTo(50.83f, 45.17f),
                    PathNode.CurveTo(49.267033f, 43.607033f, 46.732967f, 43.607033f, 45.17f, 45.17f),
                    PathNode.CurveTo(43.607033f, 46.732967f, 43.607033f, 49.267033f, 45.17f, 50.83f),
                    PathNode.Close,
                    PathNode.MoveTo(61.17f, 189.17f),
                    PathNode.LineTo(45.17f, 205.17f),
                    PathNode.CurveTo(43.607033f, 206.73297f, 43.607033f, 209.26703f, 45.17f, 210.83f),
                    PathNode.CurveTo(46.732967f, 212.39296f, 49.267033f, 212.39296f, 50.83f, 210.83f),
                    PathNode.LineTo(66.83f, 194.83f),
                    PathNode.CurveTo(68.39297f, 193.26703f, 68.39297f, 190.73297f, 66.83f, 189.17f),
                    PathNode.CurveTo(65.26704f, 187.60704f, 62.732967f, 187.60704f, 61.17f, 189.17f),
                    PathNode.Close,
                    PathNode.MoveTo(192.0f, 68.0f),
                    PathNode.CurveTo(193.06119f, 68.00083f, 194.07921f, 67.57996f, 194.83f, 66.83f),
                    PathNode.LineTo(210.83f, 50.83f),
                    PathNode.CurveTo(212.39296f, 49.267033f, 212.39296f, 46.732967f, 210.83f, 45.17f),
                    PathNode.CurveTo(209.26703f, 43.607033f, 206.73297f, 43.607033f, 205.17f, 45.17f),
                    PathNode.LineTo(189.17f, 61.17f),
                    PathNode.CurveTo(188.02467f, 62.314045f, 187.68184f, 64.03563f, 188.30151f, 65.53116f),
                    PathNode.CurveTo(188.92119f, 67.02669f, 190.38118f, 68.001274f, 192.0f, 68.0f),
                    PathNode.Close,
                    PathNode.MoveTo(194.83f, 189.17f),
                    PathNode.CurveTo(193.26703f, 187.60704f, 190.73297f, 187.60704f, 189.17f, 189.17f),
                    PathNode.CurveTo(187.60704f, 190.73297f, 187.60704f, 193.26703f, 189.17f, 194.83f),
                    PathNode.LineTo(205.17f, 210.83f),
                    PathNode.CurveTo(206.73297f, 212.39296f, 209.26703f, 212.39296f, 210.83f, 210.83f),
                    PathNode.CurveTo(212.39296f, 209.26703f, 212.39296f, 206.73297f, 210.83f, 205.17f),
                    PathNode.Close,
                    PathNode.MoveTo(40.0f, 124.0f),
                    PathNode.LineTo(16.0f, 124.0f),
                    PathNode.CurveTo(13.790861f, 124.0f, 12.0f, 125.79086f, 12.0f, 128.0f),
                    PathNode.CurveTo(12.0f, 130.20914f, 13.790861f, 132.0f, 16.0f, 132.0f),
                    PathNode.LineTo(40.0f, 132.0f),
                    PathNode.CurveTo(42.20914f, 132.0f, 44.0f, 130.20914f, 44.0f, 128.0f),
                    PathNode.CurveTo(44.0f, 125.79086f, 42.20914f, 124.0f, 40.0f, 124.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 212.0f),
                    PathNode.CurveTo(125.79086f, 212.0f, 124.0f, 213.79086f, 124.0f, 216.0f),
                    PathNode.LineTo(124.0f, 240.0f),
                    PathNode.CurveTo(124.0f, 242.20914f, 125.79086f, 244.0f, 128.0f, 244.0f),
                    PathNode.CurveTo(130.20914f, 244.0f, 132.0f, 242.20914f, 132.0f, 240.0f),
                    PathNode.LineTo(132.0f, 216.0f),
                    PathNode.CurveTo(132.0f, 213.79086f, 130.20914f, 212.0f, 128.0f, 212.0f),
                    PathNode.Close,
                    PathNode.MoveTo(240.0f, 124.0f),
                    PathNode.LineTo(216.0f, 124.0f),
                    PathNode.CurveTo(213.79086f, 124.0f, 212.0f, 125.79086f, 212.0f, 128.0f),
                    PathNode.CurveTo(212.0f, 130.20914f, 213.79086f, 132.0f, 216.0f, 132.0f),
                    PathNode.LineTo(240.0f, 132.0f),
                    PathNode.CurveTo(242.20914f, 132.0f, 244.0f, 130.20914f, 244.0f, 128.0f),
                    PathNode.CurveTo(244.0f, 125.79086f, 242.20914f, 124.0f, 240.0f, 124.0f),
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
        return _sun!!
    }

private var _sun: ImageVector? = null
