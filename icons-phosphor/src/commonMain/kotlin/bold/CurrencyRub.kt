package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.CurrencyRub: ImageVector
    get() {
        if (_currencyRub != null) return _currencyRub!!
        _currencyRub = phosphorBoldIcon(
            name = "CurrencyRub",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(148.0f, 156.0f),
                    PathNode.CurveTo(183.34622f, 156.0f, 212.0f, 127.34622f, 212.0f, 92.0f),
                    PathNode.CurveTo(212.0f, 56.653774f, 183.34622f, 28.0f, 148.0f, 28.0f),
                    PathNode.LineTo(88.0f, 28.0f),
                    PathNode.CurveTo(81.37258f, 28.0f, 76.0f, 33.37258f, 76.0f, 40.0f),
                    PathNode.LineTo(76.0f, 132.0f),
                    PathNode.LineTo(56.0f, 132.0f),
                    PathNode.CurveTo(49.37258f, 132.0f, 44.0f, 137.37259f, 44.0f, 144.0f),
                    PathNode.CurveTo(44.0f, 150.62741f, 49.37258f, 156.0f, 56.0f, 156.0f),
                    PathNode.LineTo(76.0f, 156.0f),
                    PathNode.LineTo(76.0f, 172.0f),
                    PathNode.LineTo(56.0f, 172.0f),
                    PathNode.CurveTo(49.37258f, 172.0f, 44.0f, 177.37259f, 44.0f, 184.0f),
                    PathNode.CurveTo(44.0f, 190.62741f, 49.37258f, 196.0f, 56.0f, 196.0f),
                    PathNode.LineTo(76.0f, 196.0f),
                    PathNode.LineTo(76.0f, 216.0f),
                    PathNode.CurveTo(76.0f, 222.62741f, 81.37258f, 228.0f, 88.0f, 228.0f),
                    PathNode.CurveTo(94.62742f, 228.0f, 100.0f, 222.62741f, 100.0f, 216.0f),
                    PathNode.LineTo(100.0f, 196.0f),
                    PathNode.LineTo(144.0f, 196.0f),
                    PathNode.CurveTo(150.62741f, 196.0f, 156.0f, 190.62741f, 156.0f, 184.0f),
                    PathNode.CurveTo(156.0f, 177.37259f, 150.62741f, 172.0f, 144.0f, 172.0f),
                    PathNode.LineTo(100.0f, 172.0f),
                    PathNode.LineTo(100.0f, 156.0f),
                    PathNode.Close,
                    PathNode.MoveTo(100.0f, 52.0f),
                    PathNode.LineTo(148.0f, 52.0f),
                    PathNode.CurveTo(170.09138f, 52.0f, 188.0f, 69.90861f, 188.0f, 92.0f),
                    PathNode.CurveTo(188.0f, 114.09139f, 170.09138f, 132.0f, 148.0f, 132.0f),
                    PathNode.LineTo(100.0f, 132.0f),
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
        return _currencyRub!!
    }

private var _currencyRub: ImageVector? = null
