package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.ShoppingCart: ImageVector
    get() {
        if (_shoppingCart != null) return _shoppingCart!!
        _shoppingCart = phosphorRegularIcon(
            name = "ShoppingCart",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(230.14f, 58.87f),
                    PathNode.CurveTo(228.6197f, 57.05079f, 226.37082f, 55.999603f, 224.0f, 56.0f),
                    PathNode.LineTo(62.68f, 56.0f),
                    PathNode.LineTo(56.6f, 22.57f),
                    PathNode.CurveTo(55.908905f, 18.765999f, 52.596268f, 16.000559f, 48.73f, 16.0f),
                    PathNode.LineTo(24.0f, 16.0f),
                    PathNode.CurveTo(19.581722f, 16.0f, 16.0f, 19.581722f, 16.0f, 24.0f),
                    PathNode.CurveTo(16.0f, 28.418278f, 19.581722f, 32.0f, 24.0f, 32.0f),
                    PathNode.LineTo(42.0f, 32.0f),
                    PathNode.LineTo(67.56f, 172.29f),
                    PathNode.CurveTo(68.31291f, 176.45058f, 70.15161f, 180.33842f, 72.89f, 183.56f),
                    PathNode.CurveTo(62.39953f, 193.35835f, 61.01824f, 209.50296f, 69.69179f, 220.94093f),
                    PathNode.CurveTo(78.36532f, 232.3789f, 94.28385f, 235.40486f, 106.54928f, 227.94717f),
                    PathNode.CurveTo(118.8147f, 220.48949f, 123.45355f, 204.96411f, 117.29f, 192.0f),
                    PathNode.LineTo(162.71f, 192.0f),
                    PathNode.CurveTo(160.92023f, 195.74686f, 159.99414f, 199.84763f, 160.0f, 204.0f),
                    PathNode.CurveTo(160.0f, 219.46397f, 172.53603f, 232.0f, 188.0f, 232.0f),
                    PathNode.CurveTo(203.46397f, 232.0f, 216.0f, 219.46397f, 216.0f, 204.0f),
                    PathNode.CurveTo(216.0f, 188.53603f, 203.46397f, 176.0f, 188.0f, 176.0f),
                    PathNode.LineTo(91.17f, 176.0f),
                    PathNode.CurveTo(87.303734f, 175.99944f, 83.9911f, 173.234f, 83.3f, 169.43f),
                    PathNode.LineTo(80.13f, 152.0f),
                    PathNode.LineTo(196.13f, 152.0f),
                    PathNode.CurveTo(207.7288f, 151.99832f, 217.66672f, 143.702f, 219.74f, 132.29f),
                    PathNode.LineTo(231.9f, 65.43f),
                    PathNode.CurveTo(232.31676f, 63.09046f, 231.67186f, 60.686737f, 230.14f, 58.87f),
                    PathNode.Close,
                    PathNode.MoveTo(104.0f, 204.0f),
                    PathNode.CurveTo(104.0f, 210.62741f, 98.62742f, 216.0f, 92.0f, 216.0f),
                    PathNode.CurveTo(85.37258f, 216.0f, 80.0f, 210.62741f, 80.0f, 204.0f),
                    PathNode.CurveTo(80.0f, 197.37259f, 85.37258f, 192.0f, 92.0f, 192.0f),
                    PathNode.CurveTo(98.62742f, 192.0f, 104.0f, 197.37259f, 104.0f, 204.0f),
                    PathNode.Close,
                    PathNode.MoveTo(200.0f, 204.0f),
                    PathNode.CurveTo(200.0f, 210.62741f, 194.62741f, 216.0f, 188.0f, 216.0f),
                    PathNode.CurveTo(181.37259f, 216.0f, 176.0f, 210.62741f, 176.0f, 204.0f),
                    PathNode.CurveTo(176.0f, 197.37259f, 181.37259f, 192.0f, 188.0f, 192.0f),
                    PathNode.CurveTo(194.62741f, 192.0f, 200.0f, 197.37259f, 200.0f, 204.0f),
                    PathNode.Close,
                    PathNode.MoveTo(204.0f, 129.43f),
                    PathNode.CurveTo(203.3069f, 133.24516f, 199.97758f, 136.01398f, 196.1f, 136.0f),
                    PathNode.LineTo(77.22f, 136.0f),
                    PathNode.LineTo(65.59f, 72.0f),
                    PathNode.LineTo(214.41f, 72.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _shoppingCart!!
    }

private var _shoppingCart: ImageVector? = null
