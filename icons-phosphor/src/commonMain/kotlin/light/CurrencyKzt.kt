package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.CurrencyKzt: ImageVector
    get() {
        if (_currencyKzt != null) return _currencyKzt!!
        _currencyKzt = phosphorLightIcon(
            name = "CurrencyKzt",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(206.0f, 96.0f),
                    PathNode.CurveTo(206.0f, 99.313705f, 203.3137f, 102.0f, 200.0f, 102.0f),
                    PathNode.LineTo(134.0f, 102.0f),
                    PathNode.LineTo(134.0f, 216.0f),
                    PathNode.CurveTo(134.0f, 219.3137f, 131.3137f, 222.0f, 128.0f, 222.0f),
                    PathNode.CurveTo(124.686295f, 222.0f, 122.0f, 219.3137f, 122.0f, 216.0f),
                    PathNode.LineTo(122.0f, 102.0f),
                    PathNode.LineTo(56.0f, 102.0f),
                    PathNode.CurveTo(52.68629f, 102.0f, 50.0f, 99.313705f, 50.0f, 96.0f),
                    PathNode.CurveTo(50.0f, 92.686295f, 52.68629f, 90.0f, 56.0f, 90.0f),
                    PathNode.LineTo(200.0f, 90.0f),
                    PathNode.CurveTo(203.3137f, 90.0f, 206.0f, 92.686295f, 206.0f, 96.0f),
                    PathNode.Close,
                    PathNode.MoveTo(56.0f, 62.0f),
                    PathNode.LineTo(200.0f, 62.0f),
                    PathNode.CurveTo(203.3137f, 62.0f, 206.0f, 59.31371f, 206.0f, 56.0f),
                    PathNode.CurveTo(206.0f, 52.68629f, 203.3137f, 50.0f, 200.0f, 50.0f),
                    PathNode.LineTo(56.0f, 50.0f),
                    PathNode.CurveTo(52.68629f, 50.0f, 50.0f, 52.68629f, 50.0f, 56.0f),
                    PathNode.CurveTo(50.0f, 59.31371f, 52.68629f, 62.0f, 56.0f, 62.0f),
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
        return _currencyKzt!!
    }

private var _currencyKzt: ImageVector? = null
