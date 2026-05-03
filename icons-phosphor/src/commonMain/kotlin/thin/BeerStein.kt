package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.BeerStein: ImageVector
    get() {
        if (_beerStein != null) return _beerStein!!
        _beerStein = phosphorThinIcon(
            name = "BeerStein",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(216.0f, 92.0f),
                    PathNode.LineTo(196.0f, 92.0f),
                    PathNode.LineTo(196.0f, 72.0f),
                    PathNode.CurveTo(196.0f, 52.11775f, 179.88223f, 36.0f, 160.0f, 36.0f),
                    PathNode.LineTo(147.31f, 36.0f),
                    PathNode.CurveTo(136.0f, 25.81f, 120.34f, 20.0f, 104.0f, 20.0f),
                    PathNode.CurveTo(70.92f, 20.0f, 44.0f, 43.33f, 44.0f, 72.0f),
                    PathNode.LineTo(44.0f, 208.0f),
                    PathNode.CurveTo(44.0f, 214.62741f, 49.37258f, 220.0f, 56.0f, 220.0f),
                    PathNode.LineTo(184.0f, 220.0f),
                    PathNode.CurveTo(190.62741f, 220.0f, 196.0f, 214.62741f, 196.0f, 208.0f),
                    PathNode.LineTo(196.0f, 196.0f),
                    PathNode.LineTo(216.0f, 196.0f),
                    PathNode.CurveTo(227.0457f, 196.0f, 236.0f, 187.0457f, 236.0f, 176.0f),
                    PathNode.LineTo(236.0f, 112.0f),
                    PathNode.CurveTo(236.0f, 100.95431f, 227.0457f, 92.0f, 216.0f, 92.0f),
                    PathNode.Close,
                    PathNode.MoveTo(104.0f, 28.0f),
                    PathNode.CurveTo(118.89f, 28.0f, 133.09f, 33.43f, 143.0f, 42.89f),
                    PathNode.CurveTo(143.73808f, 43.596317f, 144.71843f, 43.99347f, 145.74f, 44.0f),
                    PathNode.LineTo(160.0f, 44.0f),
                    PathNode.CurveTo(173.91772f, 44.0014f, 185.72176f, 54.22503f, 187.71f, 68.0f),
                    PathNode.LineTo(52.22f, 68.0f),
                    PathNode.CurveTo(54.62f, 45.61f, 76.92f, 28.0f, 104.0f, 28.0f),
                    PathNode.Close,
                    PathNode.MoveTo(188.0f, 208.0f),
                    PathNode.CurveTo(188.0f, 210.20914f, 186.20914f, 212.0f, 184.0f, 212.0f),
                    PathNode.LineTo(56.0f, 212.0f),
                    PathNode.CurveTo(53.79086f, 212.0f, 52.0f, 210.20914f, 52.0f, 208.0f),
                    PathNode.LineTo(52.0f, 76.0f),
                    PathNode.LineTo(188.0f, 76.0f),
                    PathNode.Close,
                    PathNode.MoveTo(228.0f, 176.0f),
                    PathNode.CurveTo(228.0f, 182.62741f, 222.62741f, 188.0f, 216.0f, 188.0f),
                    PathNode.LineTo(196.0f, 188.0f),
                    PathNode.LineTo(196.0f, 100.0f),
                    PathNode.LineTo(216.0f, 100.0f),
                    PathNode.CurveTo(222.62741f, 100.0f, 228.0f, 105.37258f, 228.0f, 112.0f),
                    PathNode.Close,
                    PathNode.MoveTo(100.0f, 104.0f),
                    PathNode.LineTo(100.0f, 184.0f),
                    PathNode.CurveTo(100.0f, 186.20914f, 98.20914f, 188.0f, 96.0f, 188.0f),
                    PathNode.CurveTo(93.79086f, 188.0f, 92.0f, 186.20914f, 92.0f, 184.0f),
                    PathNode.LineTo(92.0f, 104.0f),
                    PathNode.CurveTo(92.0f, 101.79086f, 93.79086f, 100.0f, 96.0f, 100.0f),
                    PathNode.CurveTo(98.20914f, 100.0f, 100.0f, 101.79086f, 100.0f, 104.0f),
                    PathNode.Close,
                    PathNode.MoveTo(148.0f, 104.0f),
                    PathNode.LineTo(148.0f, 184.0f),
                    PathNode.CurveTo(148.0f, 186.20914f, 146.20914f, 188.0f, 144.0f, 188.0f),
                    PathNode.CurveTo(141.79086f, 188.0f, 140.0f, 186.20914f, 140.0f, 184.0f),
                    PathNode.LineTo(140.0f, 104.0f),
                    PathNode.CurveTo(140.0f, 101.79086f, 141.79086f, 100.0f, 144.0f, 100.0f),
                    PathNode.CurveTo(146.20914f, 100.0f, 148.0f, 101.79086f, 148.0f, 104.0f),
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
        return _beerStein!!
    }

private var _beerStein: ImageVector? = null
