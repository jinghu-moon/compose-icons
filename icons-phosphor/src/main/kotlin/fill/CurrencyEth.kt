package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.CurrencyEth: ImageVector
    get() {
        if (_currencyEth != null) return _currencyEth!!
        _currencyEth = phosphorFillIcon(
            name = "CurrencyEth",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(222.29f, 123.06f),
                    PathNode.LineTo(134.29f, 11.06f),
                    PathNode.CurveTo(132.7733f, 9.130089f, 130.45457f, 8.003268f, 128.0f, 8.003268f),
                    PathNode.CurveTo(125.545425f, 8.003268f, 123.22671f, 9.130089f, 121.71f, 11.06f),
                    PathNode.LineTo(33.71f, 123.06f),
                    PathNode.CurveTo(31.433422f, 125.95989f, 31.433422f, 130.0401f, 33.71f, 132.94f),
                    PathNode.LineTo(121.71f, 244.94f),
                    PathNode.CurveTo(123.22671f, 246.8699f, 125.545425f, 247.99673f, 128.0f, 247.99673f),
                    PathNode.CurveTo(130.45457f, 247.99673f, 132.7733f, 246.8699f, 134.29f, 244.94f),
                    PathNode.LineTo(222.29f, 132.94f),
                    PathNode.CurveTo(224.56657f, 130.0401f, 224.56657f, 125.95989f, 222.29f, 123.06f),
                    PathNode.Close,
                    PathNode.MoveTo(136.0f, 155.58f),
                    PathNode.LineTo(136.0f, 39.13f),
                    PathNode.LineTo(203.42f, 124.93f),
                    PathNode.Close,
                    PathNode.MoveTo(120.0f, 155.58f),
                    PathNode.LineTo(52.58f, 124.93f),
                    PathNode.LineTo(120.0f, 39.13f),
                    PathNode.Close,
                    PathNode.MoveTo(120.0f, 173.15f),
                    PathNode.LineTo(120.0f, 216.87f),
                    PathNode.LineTo(66.57f, 148.87f),
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
        return _currencyEth!!
    }

private var _currencyEth: ImageVector? = null
