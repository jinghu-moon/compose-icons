package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ShoppingCartSimple: ImageVector
    get() {
        if (_shoppingCartSimple != null) return _shoppingCartSimple!!
        _shoppingCartSimple = phosphorLightIcon(
            name = "ShoppingCartSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(236.78f, 68.37f),
                    PathNode.CurveTo(235.64487f, 66.87608f, 233.87625f, 65.999176f, 232.0f, 66.0f),
                    PathNode.LineTo(55.67f, 66.0f),
                    PathNode.LineTo(45.78f, 30.39f),
                    PathNode.CurveTo(45.057198f, 27.795118f, 42.69367f, 25.99998f, 40.0f, 26.0f),
                    PathNode.LineTo(16.0f, 26.0f),
                    PathNode.CurveTo(12.686292f, 26.0f, 10.0f, 28.68629f, 10.0f, 32.0f),
                    PathNode.CurveTo(10.0f, 35.31371f, 12.686292f, 38.0f, 16.0f, 38.0f),
                    PathNode.LineTo(35.44f, 38.0f),
                    PathNode.LineTo(71.0f, 165.89f),
                    PathNode.CurveTo(73.66561f, 175.38193f, 82.301f, 181.95639f, 92.16f, 182.0f),
                    PathNode.LineTo(191.0f, 182.0f),
                    PathNode.CurveTo(200.87386f, 181.97423f, 209.53033f, 175.39613f, 212.2f, 165.89f),
                    PathNode.LineTo(237.83f, 73.61f),
                    PathNode.CurveTo(238.32014f, 71.79529f, 237.93149f, 69.85576f, 236.78f, 68.37f),
                    PathNode.Close,
                    PathNode.MoveTo(200.58f, 162.68f),
                    PathNode.CurveTo(199.38193f, 166.98712f, 195.47058f, 169.97575f, 191.0f, 170.0f),
                    PathNode.LineTo(92.16f, 170.0f),
                    PathNode.CurveTo(87.670845f, 169.99812f, 83.73309f, 167.00493f, 82.53f, 162.68f),
                    PathNode.LineTo(59.0f, 78.0f),
                    PathNode.LineTo(224.11f, 78.0f),
                    PathNode.Close,
                    PathNode.MoveTo(102.0f, 216.0f),
                    PathNode.CurveTo(102.0f, 223.73198f, 95.73199f, 230.0f, 88.0f, 230.0f),
                    PathNode.CurveTo(80.26801f, 230.0f, 74.0f, 223.73198f, 74.0f, 216.0f),
                    PathNode.CurveTo(74.0f, 208.26802f, 80.26801f, 202.0f, 88.0f, 202.0f),
                    PathNode.CurveTo(95.73199f, 202.0f, 102.0f, 208.26802f, 102.0f, 216.0f),
                    PathNode.Close,
                    PathNode.MoveTo(206.0f, 216.0f),
                    PathNode.CurveTo(206.0f, 223.73198f, 199.73198f, 230.0f, 192.0f, 230.0f),
                    PathNode.CurveTo(184.26802f, 230.0f, 178.0f, 223.73198f, 178.0f, 216.0f),
                    PathNode.CurveTo(178.0f, 208.26802f, 184.26802f, 202.0f, 192.0f, 202.0f),
                    PathNode.CurveTo(199.73198f, 202.0f, 206.0f, 208.26802f, 206.0f, 216.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 12.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _shoppingCartSimple!!
    }

private var _shoppingCartSimple: ImageVector? = null
