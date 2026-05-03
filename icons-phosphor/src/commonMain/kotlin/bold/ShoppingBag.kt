package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ShoppingBag: ImageVector
    get() {
        if (_shoppingBag != null) return _shoppingBag!!
        _shoppingBag = phosphorBoldIcon(
            name = "ShoppingBag",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(216.0f, 36.0f),
                    PathNode.LineTo(40.0f, 36.0f),
                    PathNode.CurveTo(28.954306f, 36.0f, 20.0f, 44.954304f, 20.0f, 56.0f),
                    PathNode.LineTo(20.0f, 200.0f),
                    PathNode.CurveTo(20.0f, 211.0457f, 28.954306f, 220.0f, 40.0f, 220.0f),
                    PathNode.LineTo(216.0f, 220.0f),
                    PathNode.CurveTo(227.0457f, 220.0f, 236.0f, 211.0457f, 236.0f, 200.0f),
                    PathNode.LineTo(236.0f, 56.0f),
                    PathNode.CurveTo(236.0f, 44.954304f, 227.0457f, 36.0f, 216.0f, 36.0f),
                    PathNode.Close,
                    PathNode.MoveTo(212.0f, 196.0f),
                    PathNode.LineTo(44.0f, 196.0f),
                    PathNode.LineTo(44.0f, 60.0f),
                    PathNode.LineTo(212.0f, 60.0f),
                    PathNode.Close,
                    PathNode.MoveTo(76.0f, 88.0f),
                    PathNode.CurveTo(76.0f, 81.37258f, 81.37258f, 76.0f, 88.0f, 76.0f),
                    PathNode.CurveTo(94.62742f, 76.0f, 100.0f, 81.37258f, 100.0f, 88.0f),
                    PathNode.CurveTo(100.0f, 103.463974f, 112.536026f, 116.0f, 128.0f, 116.0f),
                    PathNode.CurveTo(143.46397f, 116.0f, 156.0f, 103.463974f, 156.0f, 88.0f),
                    PathNode.CurveTo(156.0f, 81.37258f, 161.37259f, 76.0f, 168.0f, 76.0f),
                    PathNode.CurveTo(174.62741f, 76.0f, 180.0f, 81.37258f, 180.0f, 88.0f),
                    PathNode.CurveTo(180.0f, 116.7188f, 156.71881f, 140.0f, 128.0f, 140.0f),
                    PathNode.CurveTo(99.2812f, 140.0f, 76.0f, 116.7188f, 76.0f, 88.0f),
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
        return _shoppingBag!!
    }

private var _shoppingBag: ImageVector? = null
