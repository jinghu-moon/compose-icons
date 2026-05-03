package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.ShoppingCartSimple: ImageVector
    get() {
        if (_shoppingCartSimple != null) return _shoppingCartSimple!!
        _shoppingCartSimple = phosphorThinIcon(
            name = "ShoppingCartSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(235.18f, 69.58f),
                    PathNode.CurveTo(234.42467f, 68.58592f, 233.24849f, 68.00153f, 232.0f, 68.0f),
                    PathNode.LineTo(54.15f, 68.0f),
                    PathNode.LineTo(43.85f, 30.93f),
                    PathNode.CurveTo(43.36971f, 29.199947f, 41.795483f, 28.0019f, 40.0f, 28.0f),
                    PathNode.LineTo(16.0f, 28.0f),
                    PathNode.CurveTo(13.790861f, 28.0f, 12.0f, 29.790861f, 12.0f, 32.0f),
                    PathNode.CurveTo(12.0f, 34.20914f, 13.790861f, 36.0f, 16.0f, 36.0f),
                    PathNode.LineTo(37.0f, 36.0f),
                    PathNode.LineTo(72.89f, 165.35f),
                    PathNode.CurveTo(75.31126f, 173.99532f, 83.18205f, 179.9791f, 92.16f, 180.0f),
                    PathNode.LineTo(191.0f, 180.0f),
                    PathNode.CurveTo(199.97795f, 179.9791f, 207.84874f, 173.99532f, 210.27f, 165.35f),
                    PathNode.LineTo(235.9f, 73.07f),
                    PathNode.CurveTo(236.22008f, 71.85812f, 235.95355f, 70.56627f, 235.18f, 69.58f),
                    PathNode.Close,
                    PathNode.MoveTo(202.51f, 163.21f),
                    PathNode.CurveTo(201.07314f, 168.3859f, 196.37158f, 171.9764f, 191.0f, 172.0f),
                    PathNode.LineTo(92.16f, 172.0f),
                    PathNode.CurveTo(86.76985f, 171.9988f, 82.04187f, 168.40373f, 80.6f, 163.21f),
                    PathNode.LineTo(56.37f, 76.0f),
                    PathNode.LineTo(226.74f, 76.0f),
                    PathNode.Close,
                    PathNode.MoveTo(100.0f, 216.0f),
                    PathNode.CurveTo(100.0f, 222.62741f, 94.62742f, 228.0f, 88.0f, 228.0f),
                    PathNode.CurveTo(81.37258f, 228.0f, 76.0f, 222.62741f, 76.0f, 216.0f),
                    PathNode.CurveTo(76.0f, 209.37259f, 81.37258f, 204.0f, 88.0f, 204.0f),
                    PathNode.CurveTo(94.62742f, 204.0f, 100.0f, 209.37259f, 100.0f, 216.0f),
                    PathNode.Close,
                    PathNode.MoveTo(204.0f, 216.0f),
                    PathNode.CurveTo(204.0f, 222.62741f, 198.62741f, 228.0f, 192.0f, 228.0f),
                    PathNode.CurveTo(185.37259f, 228.0f, 180.0f, 222.62741f, 180.0f, 216.0f),
                    PathNode.CurveTo(180.0f, 209.37259f, 185.37259f, 204.0f, 192.0f, 204.0f),
                    PathNode.CurveTo(198.62741f, 204.0f, 204.0f, 209.37259f, 204.0f, 216.0f),
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
        return _shoppingCartSimple!!
    }

private var _shoppingCartSimple: ImageVector? = null
