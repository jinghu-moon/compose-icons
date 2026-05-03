package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Percent: ImageVector
    get() {
        if (_percent != null) return _percent!!
        _percent = phosphorBoldIcon(
            name = "Percent",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(208.49f, 64.47f),
                    PathNode.LineTo(64.49f, 208.47f),
                    PathNode.CurveTo(59.79558f, 213.16441f, 52.18442f, 213.16441f, 47.49f, 208.47f),
                    PathNode.CurveTo(42.79558f, 203.77557f, 42.79558f, 196.16441f, 47.49f, 191.47f),
                    PathNode.LineTo(191.49f, 47.47f),
                    PathNode.CurveTo(196.18442f, 42.77558f, 203.79558f, 42.77558f, 208.49f, 47.47f),
                    PathNode.CurveTo(213.18442f, 52.16442f, 213.18442f, 59.77558f, 208.49f, 64.47f),
                    PathNode.Close,
                    PathNode.MoveTo(47.72f, 104.27f),
                    PathNode.CurveTo(34.23322f, 90.7696f, 32.161057f, 69.6223f, 42.770744f, 53.760757f),
                    PathNode.CurveTo(53.380432f, 37.899216f, 73.71708f, 31.741026f, 91.343765f, 39.05224f),
                    PathNode.CurveTo(108.97045f, 46.36345f, 118.97799f, 65.10782f, 115.24625f, 83.822205f),
                    PathNode.CurveTo(111.51451f, 102.53658f, 95.08282f, 116.00884f, 76.0f, 116.0f),
                    PathNode.CurveTo(65.38461f, 116.02611f, 55.200474f, 111.80191f, 47.72f, 104.27f),
                    PathNode.Close,
                    PathNode.MoveTo(60.0f, 76.0f),
                    PathNode.CurveTo(59.99646f, 83.63339f, 65.385735f, 90.20622f, 72.87181f, 91.69864f),
                    PathNode.CurveTo(80.35789f, 93.191055f, 87.85568f, 89.18738f, 90.77965f, 82.1362f),
                    PathNode.CurveTo(93.70361f, 75.08502f, 91.239334f, 66.9503f, 84.893936f, 62.70712f),
                    PathNode.CurveTo(78.54854f, 58.46394f, 70.08939f, 59.294147f, 64.69f, 64.69f),
                    PathNode.CurveTo(61.67676f, 67.680885f, 59.987556f, 71.754425f, 60.0f, 76.0f),
                    PathNode.Close,
                    PathNode.MoveTo(220.0f, 180.0f),
                    PathNode.CurveTo(219.9993f, 199.08226f, 206.5196f, 215.50691f, 187.80402f, 219.22987f),
                    PathNode.CurveTo(169.08846f, 222.95284f, 150.34917f, 212.93729f, 143.0457f, 195.308f),
                    PathNode.CurveTo(135.74222f, 177.67868f, 141.90851f, 157.34526f, 157.77373f, 146.74207f),
                    PathNode.CurveTo(173.63895f, 136.13889f, 194.78476f, 138.21884f, 208.28f, 151.71f),
                    PathNode.CurveTo(215.81166f, 159.19392f, 220.03253f, 169.38237f, 220.0f, 180.0f),
                    PathNode.Close,
                    PathNode.MoveTo(196.0f, 180.0f),
                    PathNode.CurveTo(196.01512f, 175.75096f, 194.32571f, 171.67332f, 191.31f, 168.68f),
                    PathNode.LineTo(191.31f, 168.68f),
                    PathNode.CurveTo(185.91127f, 163.2848f, 177.45343f, 162.45404f, 171.10814f, 166.69572f),
                    PathNode.CurveTo(164.76286f, 170.9374f, 162.29704f, 179.07036f, 165.21843f, 186.12158f),
                    PathNode.CurveTo(168.13983f, 193.1728f, 175.63498f, 197.17883f, 183.12083f, 195.69011f),
                    PathNode.CurveTo(190.60669f, 194.20139f, 195.99876f, 187.63245f, 196.0f, 180.0f),
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
        return _percent!!
    }

private var _percent: ImageVector? = null
