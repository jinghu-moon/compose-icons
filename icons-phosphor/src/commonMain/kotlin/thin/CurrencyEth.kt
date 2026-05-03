package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.CurrencyEth: ImageVector
    get() {
        if (_currencyEth != null) return _currencyEth!!
        _currencyEth = phosphorThinIcon(
            name = "CurrencyEth",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(219.15f, 125.53f),
                    PathNode.LineTo(131.15f, 13.53f),
                    PathNode.CurveTo(130.39185f, 12.561271f, 129.23013f, 11.995258f, 128.0f, 11.995258f),
                    PathNode.CurveTo(126.76987f, 11.995258f, 125.60815f, 12.561271f, 124.85f, 13.53f),
                    PathNode.LineTo(36.85f, 125.53f),
                    PathNode.CurveTo(35.71171f, 126.97995f, 35.71171f, 129.02005f, 36.85f, 130.47f),
                    PathNode.LineTo(124.85f, 242.47f),
                    PathNode.CurveTo(125.60815f, 243.43874f, 126.76987f, 244.00475f, 128.0f, 244.00475f),
                    PathNode.CurveTo(129.23013f, 244.00475f, 130.39185f, 243.43874f, 131.15f, 242.47f),
                    PathNode.LineTo(219.15f, 130.47f),
                    PathNode.CurveTo(220.28828f, 129.02005f, 220.28828f, 126.97995f, 219.15f, 125.53f),
                    PathNode.Close,
                    PathNode.MoveTo(132.0f, 27.57f),
                    PathNode.LineTo(209.71f, 126.47f),
                    PathNode.LineTo(132.0f, 161.79f),
                    PathNode.Close,
                    PathNode.MoveTo(124.0f, 161.79f),
                    PathNode.LineTo(46.29f, 126.47f),
                    PathNode.LineTo(124.0f, 27.57f),
                    PathNode.Close,
                    PathNode.MoveTo(124.0f, 170.58f),
                    PathNode.LineTo(124.0f, 228.43f),
                    PathNode.LineTo(53.28f, 138.43f),
                    PathNode.Close,
                    PathNode.MoveTo(132.0f, 170.58f),
                    PathNode.LineTo(202.72f, 138.43f),
                    PathNode.LineTo(132.0f, 228.43f),
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
        return _currencyEth!!
    }

private var _currencyEth: ImageVector? = null
