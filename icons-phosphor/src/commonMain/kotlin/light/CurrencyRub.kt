package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.CurrencyRub: ImageVector
    get() {
        if (_currencyRub != null) return _currencyRub!!
        _currencyRub = phosphorLightIcon(
            name = "CurrencyRub",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(148.0f, 150.0f),
                    PathNode.CurveTo(180.03252f, 150.0f, 206.0f, 124.03252f, 206.0f, 92.0f),
                    PathNode.CurveTo(206.0f, 59.967484f, 180.03252f, 34.0f, 148.0f, 34.0f),
                    PathNode.LineTo(88.0f, 34.0f),
                    PathNode.CurveTo(84.686295f, 34.0f, 82.0f, 36.68629f, 82.0f, 40.0f),
                    PathNode.LineTo(82.0f, 138.0f),
                    PathNode.LineTo(56.0f, 138.0f),
                    PathNode.CurveTo(52.68629f, 138.0f, 50.0f, 140.6863f, 50.0f, 144.0f),
                    PathNode.CurveTo(50.0f, 147.3137f, 52.68629f, 150.0f, 56.0f, 150.0f),
                    PathNode.LineTo(82.0f, 150.0f),
                    PathNode.LineTo(82.0f, 170.0f),
                    PathNode.LineTo(56.0f, 170.0f),
                    PathNode.CurveTo(52.68629f, 170.0f, 50.0f, 172.6863f, 50.0f, 176.0f),
                    PathNode.CurveTo(50.0f, 179.3137f, 52.68629f, 182.0f, 56.0f, 182.0f),
                    PathNode.LineTo(82.0f, 182.0f),
                    PathNode.LineTo(82.0f, 216.0f),
                    PathNode.CurveTo(82.0f, 219.3137f, 84.686295f, 222.0f, 88.0f, 222.0f),
                    PathNode.CurveTo(91.313705f, 222.0f, 94.0f, 219.3137f, 94.0f, 216.0f),
                    PathNode.LineTo(94.0f, 182.0f),
                    PathNode.LineTo(144.0f, 182.0f),
                    PathNode.CurveTo(147.3137f, 182.0f, 150.0f, 179.3137f, 150.0f, 176.0f),
                    PathNode.CurveTo(150.0f, 172.6863f, 147.3137f, 170.0f, 144.0f, 170.0f),
                    PathNode.LineTo(94.0f, 170.0f),
                    PathNode.LineTo(94.0f, 150.0f),
                    PathNode.Close,
                    PathNode.MoveTo(94.0f, 46.0f),
                    PathNode.LineTo(148.0f, 46.0f),
                    PathNode.CurveTo(173.4051f, 46.0f, 194.0f, 66.5949f, 194.0f, 92.0f),
                    PathNode.CurveTo(194.0f, 117.4051f, 173.4051f, 138.0f, 148.0f, 138.0f),
                    PathNode.LineTo(94.0f, 138.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 12.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _currencyRub!!
    }

private var _currencyRub: ImageVector? = null
