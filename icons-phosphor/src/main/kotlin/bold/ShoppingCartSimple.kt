package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ShoppingCartSimple: ImageVector
    get() {
        if (_shoppingCartSimple != null) return _shoppingCartSimple!!
        _shoppingCartSimple = phosphorBoldIcon(
            name = "ShoppingCartSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(241.55f, 64.74f),
                    PathNode.CurveTo(239.28186f, 61.75496f, 235.749f, 60.00147f, 232.0f, 60.0f),
                    PathNode.LineTo(60.23f, 60.0f),
                    PathNode.LineTo(51.56f, 28.79f),
                    PathNode.CurveTo(50.118134f, 23.59627f, 45.39016f, 20.001211f, 40.0f, 20.0f),
                    PathNode.LineTo(20.0f, 20.0f),
                    PathNode.CurveTo(13.372583f, 20.0f, 8.0f, 25.372583f, 8.0f, 32.0f),
                    PathNode.CurveTo(8.0f, 38.62742f, 13.372583f, 44.0f, 20.0f, 44.0f),
                    PathNode.LineTo(30.88f, 44.0f),
                    PathNode.LineTo(65.18f, 167.49f),
                    PathNode.CurveTo(68.573746f, 179.60008f, 79.60339f, 187.97853f, 92.18f, 188.0f),
                    PathNode.LineTo(191.0f, 188.0f),
                    PathNode.CurveTo(203.57661f, 187.97853f, 214.60625f, 179.60008f, 218.0f, 167.49f),
                    PathNode.LineTo(243.63f, 75.21f),
                    PathNode.CurveTo(244.61255f, 71.58678f, 243.84288f, 67.71252f, 241.55f, 64.74f),
                    PathNode.Close,
                    PathNode.MoveTo(194.8f, 161.07f),
                    PathNode.CurveTo(194.3248f, 162.78233f, 192.77689f, 163.97586f, 191.0f, 164.0f),
                    PathNode.LineTo(92.16f, 164.0f),
                    PathNode.CurveTo(90.36452f, 163.99811f, 88.79029f, 162.80005f, 88.31f, 161.07f),
                    PathNode.LineTo(66.9f, 84.0f),
                    PathNode.LineTo(216.21f, 84.0f),
                    PathNode.Close,
                    PathNode.MoveTo(108.0f, 220.0f),
                    PathNode.CurveTo(108.0f, 231.0457f, 99.04569f, 240.0f, 88.0f, 240.0f),
                    PathNode.CurveTo(76.95431f, 240.0f, 68.0f, 231.0457f, 68.0f, 220.0f),
                    PathNode.CurveTo(68.0f, 208.9543f, 76.95431f, 200.0f, 88.0f, 200.0f),
                    PathNode.CurveTo(99.04569f, 200.0f, 108.0f, 208.9543f, 108.0f, 220.0f),
                    PathNode.Close,
                    PathNode.MoveTo(212.0f, 220.0f),
                    PathNode.CurveTo(212.0f, 231.0457f, 203.0457f, 240.0f, 192.0f, 240.0f),
                    PathNode.CurveTo(180.9543f, 240.0f, 172.0f, 231.0457f, 172.0f, 220.0f),
                    PathNode.CurveTo(172.0f, 208.9543f, 180.9543f, 200.0f, 192.0f, 200.0f),
                    PathNode.CurveTo(203.0457f, 200.0f, 212.0f, 208.9543f, 212.0f, 220.0f),
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
        return _shoppingCartSimple!!
    }

private var _shoppingCartSimple: ImageVector? = null
