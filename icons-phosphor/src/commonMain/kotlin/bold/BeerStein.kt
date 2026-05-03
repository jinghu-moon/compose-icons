package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.BeerStein: ImageVector
    get() {
        if (_beerStein != null) return _beerStein!!
        _beerStein = phosphorBoldIcon(
            name = "BeerStein",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(216.0f, 84.0f),
                    PathNode.LineTo(204.0f, 84.0f),
                    PathNode.LineTo(204.0f, 72.0f),
                    PathNode.CurveTo(203.97244f, 47.71089f, 184.28911f, 28.027554f, 160.0f, 28.0f),
                    PathNode.LineTo(150.27f, 28.0f),
                    PathNode.CurveTo(137.77f, 17.78f, 121.18f, 12.0f, 104.0f, 12.0f),
                    PathNode.CurveTo(66.5f, 12.0f, 36.0f, 38.92f, 36.0f, 72.0f),
                    PathNode.LineTo(36.0f, 208.0f),
                    PathNode.CurveTo(36.0f, 219.0457f, 44.954304f, 228.0f, 56.0f, 228.0f),
                    PathNode.LineTo(184.0f, 228.0f),
                    PathNode.CurveTo(195.0457f, 228.0f, 204.0f, 219.0457f, 204.0f, 208.0f),
                    PathNode.LineTo(204.0f, 204.0f),
                    PathNode.LineTo(216.0f, 204.0f),
                    PathNode.CurveTo(231.46397f, 204.0f, 244.0f, 191.46397f, 244.0f, 176.0f),
                    PathNode.LineTo(244.0f, 112.0f),
                    PathNode.CurveTo(244.0f, 96.536026f, 231.46397f, 84.0f, 216.0f, 84.0f),
                    PathNode.Close,
                    PathNode.MoveTo(104.0f, 36.0f),
                    PathNode.CurveTo(116.85f, 36.0f, 129.0f, 40.62f, 137.44f, 48.67f),
                    PathNode.CurveTo(139.67426f, 50.807987f, 142.64761f, 52.000916f, 145.74f, 52.0f),
                    PathNode.LineTo(160.0f, 52.0f),
                    PathNode.CurveTo(169.50537f, 51.99806f, 177.69893f, 58.686676f, 179.6f, 68.0f),
                    PathNode.LineTo(60.28f, 68.0f),
                    PathNode.CurveTo(62.72f, 50.0f, 81.39f, 36.0f, 104.0f, 36.0f),
                    PathNode.Close,
                    PathNode.MoveTo(180.0f, 204.0f),
                    PathNode.LineTo(60.0f, 204.0f),
                    PathNode.LineTo(60.0f, 92.0f),
                    PathNode.LineTo(180.0f, 92.0f),
                    PathNode.Close,
                    PathNode.MoveTo(220.0f, 176.0f),
                    PathNode.CurveTo(220.0f, 178.20914f, 218.20914f, 180.0f, 216.0f, 180.0f),
                    PathNode.LineTo(204.0f, 180.0f),
                    PathNode.LineTo(204.0f, 108.0f),
                    PathNode.LineTo(216.0f, 108.0f),
                    PathNode.CurveTo(218.20914f, 108.0f, 220.0f, 109.79086f, 220.0f, 112.0f),
                    PathNode.Close,
                    PathNode.MoveTo(108.0f, 120.0f),
                    PathNode.LineTo(108.0f, 176.0f),
                    PathNode.CurveTo(108.0f, 182.62741f, 102.62742f, 188.0f, 96.0f, 188.0f),
                    PathNode.CurveTo(89.37258f, 188.0f, 84.0f, 182.62741f, 84.0f, 176.0f),
                    PathNode.LineTo(84.0f, 120.0f),
                    PathNode.CurveTo(84.0f, 113.37258f, 89.37258f, 108.0f, 96.0f, 108.0f),
                    PathNode.CurveTo(102.62742f, 108.0f, 108.0f, 113.37258f, 108.0f, 120.0f),
                    PathNode.Close,
                    PathNode.MoveTo(156.0f, 120.0f),
                    PathNode.LineTo(156.0f, 176.0f),
                    PathNode.CurveTo(156.0f, 182.62741f, 150.62741f, 188.0f, 144.0f, 188.0f),
                    PathNode.CurveTo(137.37259f, 188.0f, 132.0f, 182.62741f, 132.0f, 176.0f),
                    PathNode.LineTo(132.0f, 120.0f),
                    PathNode.CurveTo(132.0f, 113.37258f, 137.37259f, 108.0f, 144.0f, 108.0f),
                    PathNode.CurveTo(150.62741f, 108.0f, 156.0f, 113.37258f, 156.0f, 120.0f),
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
        return _beerStein!!
    }

private var _beerStein: ImageVector? = null
