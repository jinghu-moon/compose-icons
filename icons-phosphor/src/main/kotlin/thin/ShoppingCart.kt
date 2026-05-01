package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.ShoppingCart: ImageVector
    get() {
        if (_shoppingCart != null) return _shoppingCart!!
        _shoppingCart = phosphorThinIcon(
            name = "ShoppingCart",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(227.07f, 61.44f),
                    PathNode.CurveTo(226.3108f, 60.52853f, 225.18623f, 60.001038f, 224.0f, 60.0f),
                    PathNode.LineTo(59.34f, 60.0f),
                    PathNode.LineTo(52.66f, 23.28f),
                    PathNode.CurveTo(52.31266f, 21.38184f, 50.659676f, 20.00225f, 48.73f, 20.0f),
                    PathNode.LineTo(24.0f, 20.0f),
                    PathNode.CurveTo(21.790861f, 20.0f, 20.0f, 21.790861f, 20.0f, 24.0f),
                    PathNode.CurveTo(20.0f, 26.209139f, 21.790861f, 28.0f, 24.0f, 28.0f),
                    PathNode.LineTo(45.39f, 28.0f),
                    PathNode.LineTo(52.08f, 64.8f),
                    PathNode.LineTo(52.08f, 64.8f),
                    PathNode.LineTo(71.49f, 171.58f),
                    PathNode.CurveTo(72.38481f, 176.45992f, 75.06145f, 180.83305f, 79.0f, 183.85f),
                    PathNode.CurveTo(70.54896f, 189.29692f, 66.38888f, 199.4342f, 68.57755f, 209.24739f),
                    PathNode.CurveTo(70.76623f, 219.0606f, 78.83967f, 226.46938f, 88.80434f, 227.80898f),
                    PathNode.CurveTo(98.769005f, 229.14857f, 108.51245f, 224.135f, 113.21505f, 215.24823f),
                    PathNode.CurveTo(117.91765f, 206.36147f, 116.58248f, 195.48543f, 109.87f, 188.0f),
                    PathNode.LineTo(170.13f, 188.0f),
                    PathNode.CurveTo(162.57928f, 196.44197f, 161.95816f, 209.01361f, 168.63997f, 218.15875f),
                    PathNode.CurveTo(175.32178f, 227.3039f, 187.48752f, 230.53296f, 197.82498f, 225.9051f),
                    PathNode.CurveTo(208.16245f, 221.27725f, 213.85747f, 210.05234f, 211.48705f, 198.97708f),
                    PathNode.CurveTo(209.11664f, 187.90182f, 199.32608f, 179.99124f, 188.0f, 180.0f),
                    PathNode.LineTo(91.17f, 180.0f),
                    PathNode.CurveTo(85.374054f, 179.9972f, 80.40844f, 175.85216f, 79.37f, 170.15f),
                    PathNode.LineTo(75.37f, 148.0f),
                    PathNode.LineTo(196.1f, 148.0f),
                    PathNode.CurveTo(205.76596f, 148.00146f, 214.04979f, 141.08987f, 215.78f, 131.58f),
                    PathNode.LineTo(227.94f, 64.72f),
                    PathNode.CurveTo(228.15112f, 63.551735f, 227.83238f, 62.35005f, 227.07f, 61.44f),
                    PathNode.Close,
                    PathNode.MoveTo(108.0f, 204.0f),
                    PathNode.CurveTo(108.0f, 212.83656f, 100.836555f, 220.0f, 92.0f, 220.0f),
                    PathNode.CurveTo(83.163445f, 220.0f, 76.0f, 212.83656f, 76.0f, 204.0f),
                    PathNode.CurveTo(76.0f, 195.16344f, 83.163445f, 188.0f, 92.0f, 188.0f),
                    PathNode.CurveTo(100.836555f, 188.0f, 108.0f, 195.16344f, 108.0f, 204.0f),
                    PathNode.Close,
                    PathNode.MoveTo(204.0f, 204.0f),
                    PathNode.CurveTo(204.0f, 212.83656f, 196.83656f, 220.0f, 188.0f, 220.0f),
                    PathNode.CurveTo(179.16344f, 220.0f, 172.0f, 212.83656f, 172.0f, 204.0f),
                    PathNode.CurveTo(172.0f, 195.16344f, 179.16344f, 188.0f, 188.0f, 188.0f),
                    PathNode.CurveTo(196.83656f, 188.0f, 204.0f, 195.16344f, 204.0f, 204.0f),
                    PathNode.Close,
                    PathNode.MoveTo(207.91f, 130.15f),
                    PathNode.CurveTo(206.87088f, 135.85587f, 201.89972f, 140.00201f, 196.1f, 140.0f),
                    PathNode.LineTo(73.88f, 140.0f),
                    PathNode.LineTo(60.79f, 68.0f),
                    PathNode.LineTo(219.21f, 68.0f),
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
        return _shoppingCart!!
    }

private var _shoppingCart: ImageVector? = null
