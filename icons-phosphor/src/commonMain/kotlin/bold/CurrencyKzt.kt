package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.CurrencyKzt: ImageVector
    get() {
        if (_currencyKzt != null) return _currencyKzt!!
        _currencyKzt = phosphorBoldIcon(
            name = "CurrencyKzt",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(212.0f, 100.0f),
                    PathNode.CurveTo(212.0f, 106.62742f, 206.62741f, 112.0f, 200.0f, 112.0f),
                    PathNode.LineTo(140.0f, 112.0f),
                    PathNode.LineTo(140.0f, 212.0f),
                    PathNode.CurveTo(140.0f, 218.62741f, 134.62741f, 224.0f, 128.0f, 224.0f),
                    PathNode.CurveTo(121.37258f, 224.0f, 116.0f, 218.62741f, 116.0f, 212.0f),
                    PathNode.LineTo(116.0f, 112.0f),
                    PathNode.LineTo(56.0f, 112.0f),
                    PathNode.CurveTo(49.37258f, 112.0f, 44.0f, 106.62742f, 44.0f, 100.0f),
                    PathNode.CurveTo(44.0f, 93.37258f, 49.37258f, 88.0f, 56.0f, 88.0f),
                    PathNode.LineTo(200.0f, 88.0f),
                    PathNode.CurveTo(206.62741f, 88.0f, 212.0f, 93.37258f, 212.0f, 100.0f),
                    PathNode.Close,
                    PathNode.MoveTo(56.0f, 64.0f),
                    PathNode.LineTo(200.0f, 64.0f),
                    PathNode.CurveTo(206.62741f, 64.0f, 212.0f, 58.62742f, 212.0f, 52.0f),
                    PathNode.CurveTo(212.0f, 45.37258f, 206.62741f, 40.0f, 200.0f, 40.0f),
                    PathNode.LineTo(56.0f, 40.0f),
                    PathNode.CurveTo(49.37258f, 40.0f, 44.0f, 45.37258f, 44.0f, 52.0f),
                    PathNode.CurveTo(44.0f, 58.62742f, 49.37258f, 64.0f, 56.0f, 64.0f),
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
        return _currencyKzt!!
    }

private var _currencyKzt: ImageVector? = null
