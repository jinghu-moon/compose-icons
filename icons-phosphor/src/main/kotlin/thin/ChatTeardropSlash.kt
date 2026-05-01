package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.ChatTeardropSlash: ImageVector
    get() {
        if (_chatTeardropSlash != null) return _chatTeardropSlash!!
        _chatTeardropSlash = phosphorThinIcon(
            name = "ChatTeardropSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(51.0f, 37.31f),
                    PathNode.CurveTo(49.514355f, 35.653145f, 46.966854f, 35.514355f, 45.31f, 37.0f),
                    PathNode.CurveTo(43.653145f, 38.485645f, 43.514355f, 41.033146f, 45.0f, 42.69f),
                    PathNode.LineTo(60.62f, 59.83f),
                    PathNode.CurveTo(44.726376f, 77.41865f, 35.94975f, 100.2942f, 36.0f, 124.0f),
                    PathNode.LineTo(36.0f, 208.0f),
                    PathNode.CurveTo(36.0f, 214.62741f, 41.37258f, 220.0f, 48.0f, 220.0f),
                    PathNode.LineTo(132.0f, 220.0f),
                    PathNode.CurveTo(152.55815f, 219.97751f, 172.57002f, 213.3793f, 189.11f, 201.17f),
                    PathNode.LineTo(205.0f, 218.69f),
                    PathNode.CurveTo(205.95595f, 219.76758f, 207.41747f, 220.24792f, 208.8263f, 219.94757f),
                    PathNode.CurveTo(210.23512f, 219.64722f, 211.37364f, 218.61255f, 211.80698f, 217.23878f),
                    PathNode.CurveTo(212.24031f, 215.865f, 211.9015f, 214.36435f, 210.92f, 213.31f),
                    PathNode.Close,
                    PathNode.MoveTo(132.0f, 212.0f),
                    PathNode.LineTo(48.0f, 212.0f),
                    PathNode.CurveTo(45.79086f, 212.0f, 44.0f, 210.20914f, 44.0f, 208.0f),
                    PathNode.LineTo(44.0f, 124.0f),
                    PathNode.CurveTo(43.94698f, 102.54935f, 51.776245f, 81.82671f, 66.0f, 65.77f),
                    PathNode.LineTo(183.7f, 195.21f),
                    PathNode.CurveTo(168.70488f, 206.19f, 150.58517f, 212.07454f, 132.0f, 212.0f),
                    PathNode.Close,
                    PathNode.MoveTo(228.0f, 124.0f),
                    PathNode.CurveTo(228.0149f, 141.4742f, 223.24959f, 158.61958f, 214.22f, 173.58f),
                    PathNode.CurveTo(213.50633f, 174.85562f, 212.15369f, 175.64038f, 210.69206f, 175.62682f),
                    PathNode.CurveTo(209.23044f, 175.61325f, 207.8926f, 174.8035f, 207.20274f, 173.51485f),
                    PathNode.CurveTo(206.51286f, 172.2262f, 206.58083f, 170.66388f, 207.38f, 169.44f),
                    PathNode.CurveTo(227.49811f, 136.12444f, 223.34293f, 93.55058f, 197.16269f, 64.75371f),
                    PathNode.CurveTo(170.98245f, 35.95683f, 128.99568f, 27.776981f, 93.92f, 44.64f),
                    PathNode.CurveTo(92.62599f, 45.303417f, 91.073875f, 45.212315f, 89.86636f, 44.402073f),
                    PathNode.CurveTo(88.65885f, 43.59183f, 87.986176f, 42.190098f, 88.10954f, 40.74118f),
                    PathNode.CurveTo(88.23291f, 39.292263f, 89.13289f, 38.024433f, 90.46f, 37.43f),
                    PathNode.CurveTo(103.41435f, 31.182825f, 117.61804f, 27.958447f, 132.0f, 28.0f),
                    PathNode.CurveTo(184.9942f, 28.060617f, 227.93938f, 71.00579f, 228.0f, 124.0f),
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
        return _chatTeardropSlash!!
    }

private var _chatTeardropSlash: ImageVector? = null
