package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.CurrencyEth: ImageVector
    get() {
        if (_currencyEth != null) return _currencyEth!!
        _currencyEth = phosphorDuotoneIcon(
            name = "CurrencyEth",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(216.0f, 128.0f),
                    PathNode.LineTo(128.0f, 240.0f),
                    PathNode.LineTo(40.0f, 128.0f),
                    PathNode.LineTo(128.0f, 168.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 0.2f,
                stroke = null,
                strokeAlpha = 0.2f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
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
                    PathNode.MoveTo(136.0f, 39.13f),
                    PathNode.LineTo(203.42f, 124.93f),
                    PathNode.LineTo(136.0f, 155.58f),
                    PathNode.Close,
                    PathNode.MoveTo(120.0f, 155.58f),
                    PathNode.LineTo(52.58f, 124.93f),
                    PathNode.LineTo(120.0f, 39.13f),
                    PathNode.Close,
                    PathNode.MoveTo(120.0f, 173.15f),
                    PathNode.LineTo(120.0f, 216.87f),
                    PathNode.LineTo(66.57f, 148.87f),
                    PathNode.Close,
                    PathNode.MoveTo(136.0f, 173.15f),
                    PathNode.LineTo(189.43f, 148.86f),
                    PathNode.LineTo(136.0f, 216.86f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _currencyEth!!
    }

private var _currencyEth: ImageVector? = null
