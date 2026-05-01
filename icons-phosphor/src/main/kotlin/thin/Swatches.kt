package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Swatches: ImageVector
    get() {
        if (_swatches != null) return _swatches!!
        _swatches = phosphorThinIcon(
            name = "Swatches",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(235.27f, 152.07f),
                    PathNode.LineTo(216.19f, 99.85f),
                    PathNode.CurveTo(213.906f, 93.66059f, 207.05392f, 90.47576f, 200.85f, 92.72f),
                    PathNode.LineTo(126.55f, 119.64f),
                    PathNode.LineTo(139.82f, 43.81f),
                    PathNode.CurveTo(140.97212f, 37.30146f, 136.64415f, 31.086695f, 130.14f, 29.91f),
                    PathNode.LineTo(75.47f, 20.19f),
                    PathNode.CurveTo(72.35828f, 19.633707f, 69.15367f, 20.354654f, 66.58f, 22.19f),
                    PathNode.CurveTo(63.957466f, 24.012236f, 62.177387f, 26.812073f, 61.64f, 29.96f),
                    PathNode.LineTo(36.64f, 173.09f),
                    PathNode.CurveTo(32.815445f, 194.73862f, 47.17824f, 215.4164f, 68.8f, 219.39f),
                    PathNode.CurveTo(71.17844f, 219.7965f, 73.587074f, 220.00056f, 76.0f, 220.0f),
                    PathNode.LineTo(224.0f, 220.0f),
                    PathNode.CurveTo(230.62741f, 220.0f, 236.0f, 214.62741f, 236.0f, 208.0f),
                    PathNode.LineTo(236.0f, 156.19f),
                    PathNode.CurveTo(235.96442f, 154.78786f, 235.71834f, 153.39902f, 235.27f, 152.07f),
                    PathNode.Close,
                    PathNode.MoveTo(203.57f, 100.24f),
                    PathNode.CurveTo(205.62936f, 99.498924f, 207.90193f, 100.55055f, 208.67f, 102.6f),
                    PathNode.LineTo(227.76f, 154.81f),
                    PathNode.CurveTo(228.1188f, 155.78726f, 228.072f, 156.86742f, 227.63f, 157.81f),
                    PathNode.CurveTo(227.17662f, 158.74623f, 226.37141f, 159.46516f, 225.39f, 159.81f),
                    PathNode.LineTo(108.78f, 202.11f),
                    PathNode.CurveTo(111.80086f, 197.5192f, 113.84333f, 192.35515f, 114.78f, 186.94f),
                    PathNode.LineTo(125.0f, 128.73f),
                    PathNode.Close,
                    PathNode.MoveTo(93.75f, 206.29f),
                    PathNode.CurveTo(86.91496f, 211.11165f, 78.43225f, 212.9919f, 70.2f, 211.51f),
                    PathNode.CurveTo(52.89144f, 208.32306f, 41.40513f, 191.75703f, 44.49f, 174.43f),
                    PathNode.LineTo(69.49f, 31.3f),
                    PathNode.CurveTo(69.67102f, 30.253132f, 70.26107f, 29.321283f, 71.13f, 28.71f),
                    PathNode.CurveTo(71.78722f, 28.243694f, 72.57418f, 27.995363f, 73.38f, 28.0f),
                    PathNode.CurveTo(73.611305f, 28.000013f, 73.84217f, 28.020088f, 74.07f, 28.06f),
                    PathNode.LineTo(128.74f, 37.79f),
                    PathNode.CurveTo(130.9003f, 38.19483f, 132.32927f, 40.266846f, 131.94f, 42.43f),
                    PathNode.LineTo(106.94f, 185.56f),
                    PathNode.LineTo(106.94f, 185.56f),
                    PathNode.CurveTo(105.49931f, 193.9585f, 100.74727f, 201.42703f, 93.75f, 206.29f),
                    PathNode.Close,
                    PathNode.MoveTo(228.0f, 208.0f),
                    PathNode.CurveTo(228.0f, 210.20914f, 226.20914f, 212.0f, 224.0f, 212.0f),
                    PathNode.LineTo(105.0f, 212.0f),
                    PathNode.LineTo(228.0f, 167.41f),
                    PathNode.Close,
                    PathNode.MoveTo(84.0f, 180.0f),
                    PathNode.CurveTo(84.0f, 184.41827f, 80.41828f, 188.0f, 76.0f, 188.0f),
                    PathNode.CurveTo(71.58172f, 188.0f, 68.0f, 184.41827f, 68.0f, 180.0f),
                    PathNode.CurveTo(68.0f, 175.58173f, 71.58172f, 172.0f, 76.0f, 172.0f),
                    PathNode.CurveTo(80.41828f, 172.0f, 84.0f, 175.58173f, 84.0f, 180.0f),
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
        return _swatches!!
    }

private var _swatches: ImageVector? = null
