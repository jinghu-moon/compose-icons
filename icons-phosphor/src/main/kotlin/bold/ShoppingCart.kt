package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ShoppingCart: ImageVector
    get() {
        if (_shoppingCart != null) return _shoppingCart!!
        _shoppingCart = phosphorBoldIcon(
            name = "ShoppingCart",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(233.21f, 56.31f),
                    PathNode.CurveTo(230.93053f, 53.57932f, 227.55705f, 52.00064f, 224.0f, 52.0f),
                    PathNode.LineTo(66.0f, 52.0f),
                    PathNode.LineTo(60.53f, 21.85f),
                    PathNode.CurveTo(59.49156f, 16.147842f, 54.525944f, 12.002813f, 48.73f, 12.0f),
                    PathNode.LineTo(24.0f, 12.0f),
                    PathNode.CurveTo(17.372583f, 12.0f, 12.0f, 17.372583f, 12.0f, 24.0f),
                    PathNode.CurveTo(12.0f, 30.627417f, 17.372583f, 36.0f, 24.0f, 36.0f),
                    PathNode.LineTo(38.71f, 36.0f),
                    PathNode.LineTo(63.62f, 173.0f),
                    PathNode.CurveTo(64.288795f, 176.63881f, 65.67211f, 180.10898f, 67.69f, 183.21f),
                    PathNode.CurveTo(57.828453f, 194.74876f, 57.429913f, 211.62794f, 66.73588f, 223.61928f),
                    PathNode.CurveTo(76.04185f, 235.61061f, 92.49166f, 239.4145f, 106.11722f, 232.7259f),
                    PathNode.CurveTo(119.742775f, 226.03731f, 126.79481f, 210.69669f, 123.0f, 196.0f),
                    PathNode.LineTo(157.0f, 196.0f),
                    PathNode.CurveTo(153.57982f, 209.2463f, 158.95876f, 223.2017f, 170.38464f, 230.72577f),
                    PathNode.CurveTo(181.81053f, 238.24985f, 196.75574f, 237.67813f, 207.57341f, 229.30316f),
                    PathNode.CurveTo(218.39108f, 220.92818f, 222.68817f, 206.60263f, 218.26602f, 193.65633f),
                    PathNode.CurveTo(213.84386f, 180.71002f, 201.68073f, 172.0069f, 188.0f, 172.0f),
                    PathNode.LineTo(91.17f, 172.0f),
                    PathNode.CurveTo(89.240326f, 171.99774f, 87.58734f, 170.61816f, 87.24f, 168.72f),
                    PathNode.LineTo(84.92f, 156.0f),
                    PathNode.LineTo(196.1f, 156.0f),
                    PathNode.CurveTo(209.6354f, 156.00002f, 221.23297f, 146.31784f, 223.65f, 133.0f),
                    PathNode.LineTo(235.81f, 66.14f),
                    PathNode.CurveTo(236.44298f, 62.63994f, 235.49066f, 59.039413f, 233.21f, 56.31f),
                    PathNode.Close,
                    PathNode.MoveTo(100.0f, 204.0f),
                    PathNode.CurveTo(100.0f, 208.41827f, 96.41828f, 212.0f, 92.0f, 212.0f),
                    PathNode.CurveTo(87.58172f, 212.0f, 84.0f, 208.41827f, 84.0f, 204.0f),
                    PathNode.CurveTo(84.0f, 199.58173f, 87.58172f, 196.0f, 92.0f, 196.0f),
                    PathNode.CurveTo(96.41828f, 196.0f, 100.0f, 199.58173f, 100.0f, 204.0f),
                    PathNode.Close,
                    PathNode.MoveTo(188.0f, 212.0f),
                    PathNode.CurveTo(183.58173f, 212.0f, 180.0f, 208.41827f, 180.0f, 204.0f),
                    PathNode.CurveTo(180.0f, 199.58173f, 183.58173f, 196.0f, 188.0f, 196.0f),
                    PathNode.CurveTo(192.41827f, 196.0f, 196.0f, 199.58173f, 196.0f, 204.0f),
                    PathNode.CurveTo(196.0f, 208.41827f, 192.41827f, 212.0f, 188.0f, 212.0f),
                    PathNode.Close,
                    PathNode.MoveTo(200.0f, 128.72f),
                    PathNode.CurveTo(199.65475f, 130.6071f, 198.01836f, 131.98337f, 196.1f, 132.0f),
                    PathNode.LineTo(80.56f, 132.0f),
                    PathNode.LineTo(70.38f, 76.0f),
                    PathNode.LineTo(209.62f, 76.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 24.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _shoppingCart!!
    }

private var _shoppingCart: ImageVector? = null
