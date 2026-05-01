package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.ShoppingCartSimple: ImageVector
    get() {
        if (_shoppingCartSimple != null) return _shoppingCartSimple!!
        _shoppingCartSimple = phosphorFillIcon(
            name = "ShoppingCartSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(239.71f, 74.14f),
                    PathNode.LineTo(214.07f, 166.42f),
                    PathNode.CurveTo(211.1735f, 176.77757f, 201.75485f, 183.95485f, 191.0f, 184.0f),
                    PathNode.LineTo(92.16f, 184.0f),
                    PathNode.CurveTo(81.37173f, 183.99509f, 71.90557f, 176.80963f, 69.0f, 166.42f),
                    PathNode.LineTo(33.92f, 40.0f),
                    PathNode.LineTo(16.0f, 40.0f),
                    PathNode.CurveTo(11.581722f, 40.0f, 8.0f, 36.418278f, 8.0f, 32.0f),
                    PathNode.CurveTo(8.0f, 27.581722f, 11.581722f, 24.0f, 16.0f, 24.0f),
                    PathNode.LineTo(40.0f, 24.0f),
                    PathNode.CurveTo(43.594677f, 23.99931f, 46.748425f, 26.396322f, 47.71f, 29.86f),
                    PathNode.LineTo(57.19f, 64.0f),
                    PathNode.LineTo(232.0f, 64.0f),
                    PathNode.CurveTo(234.50005f, 63.99952f, 236.85657f, 65.1678f, 238.36975f, 67.1579f),
                    PathNode.CurveTo(239.88292f, 69.147995f, 240.37875f, 71.731064f, 239.71f, 74.14f),
                    PathNode.Close,
                    PathNode.MoveTo(88.0f, 200.0f),
                    PathNode.CurveTo(79.163445f, 200.0f, 72.0f, 207.16344f, 72.0f, 216.0f),
                    PathNode.CurveTo(72.0f, 224.83656f, 79.163445f, 232.0f, 88.0f, 232.0f),
                    PathNode.CurveTo(96.836555f, 232.0f, 104.0f, 224.83656f, 104.0f, 216.0f),
                    PathNode.CurveTo(104.0f, 207.16344f, 96.836555f, 200.0f, 88.0f, 200.0f),
                    PathNode.Close,
                    PathNode.MoveTo(192.0f, 200.0f),
                    PathNode.CurveTo(183.16344f, 200.0f, 176.0f, 207.16344f, 176.0f, 216.0f),
                    PathNode.CurveTo(176.0f, 224.83656f, 183.16344f, 232.0f, 192.0f, 232.0f),
                    PathNode.CurveTo(200.83656f, 232.0f, 208.0f, 224.83656f, 208.0f, 216.0f),
                    PathNode.CurveTo(208.0f, 207.16344f, 200.83656f, 200.0f, 192.0f, 200.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
        }
        return _shoppingCartSimple!!
    }

private var _shoppingCartSimple: ImageVector? = null
