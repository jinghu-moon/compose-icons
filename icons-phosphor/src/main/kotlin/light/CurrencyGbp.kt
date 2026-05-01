package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.CurrencyGbp: ImageVector
    get() {
        if (_currencyGbp != null) return _currencyGbp!!
        _currencyGbp = phosphorLightIcon(
            name = "CurrencyGbp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(190.0f, 208.0f),
                    PathNode.CurveTo(190.0f, 211.3137f, 187.3137f, 214.0f, 184.0f, 214.0f),
                    PathNode.LineTo(56.0f, 214.0f),
                    PathNode.CurveTo(52.68629f, 214.0f, 50.0f, 211.3137f, 50.0f, 208.0f),
                    PathNode.CurveTo(50.0f, 204.6863f, 52.68629f, 202.0f, 56.0f, 202.0f),
                    PathNode.LineTo(60.0f, 202.0f),
                    PathNode.CurveTo(76.56854f, 202.0f, 90.0f, 188.56854f, 90.0f, 172.0f),
                    PathNode.LineTo(90.0f, 134.0f),
                    PathNode.LineTo(56.0f, 134.0f),
                    PathNode.CurveTo(52.68629f, 134.0f, 50.0f, 131.3137f, 50.0f, 128.0f),
                    PathNode.CurveTo(50.0f, 124.686295f, 52.68629f, 122.0f, 56.0f, 122.0f),
                    PathNode.LineTo(90.0f, 122.0f),
                    PathNode.LineTo(90.0f, 84.0f),
                    PathNode.CurveTo(89.998535f, 64.6452f, 101.167534f, 47.02801f, 118.673416f, 38.772575f),
                    PathNode.CurveTo(136.1793f, 30.517143f, 156.87732f, 33.10648f, 171.81f, 45.42f),
                    PathNode.CurveTo(174.36708f, 47.529728f, 174.72972f, 51.312923f, 172.62f, 53.87f),
                    PathNode.CurveTo(170.51027f, 56.42708f, 166.72708f, 56.789726f, 164.17f, 54.68f),
                    PathNode.CurveTo(152.82114f, 45.325348f, 137.09322f, 43.359493f, 123.79096f, 49.63297f),
                    PathNode.CurveTo(110.48872f, 55.906445f, 102.000984f, 69.29265f, 102.0f, 84.0f),
                    PathNode.LineTo(102.0f, 122.0f),
                    PathNode.LineTo(136.0f, 122.0f),
                    PathNode.CurveTo(139.3137f, 122.0f, 142.0f, 124.686295f, 142.0f, 128.0f),
                    PathNode.CurveTo(142.0f, 131.3137f, 139.3137f, 134.0f, 136.0f, 134.0f),
                    PathNode.LineTo(102.0f, 134.0f),
                    PathNode.LineTo(102.0f, 172.0f),
                    PathNode.CurveTo(102.00732f, 183.29391f, 97.45288f, 194.11206f, 89.37f, 202.0f),
                    PathNode.LineTo(184.0f, 202.0f),
                    PathNode.CurveTo(187.3137f, 202.0f, 190.0f, 204.6863f, 190.0f, 208.0f),
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
        return _currencyGbp!!
    }

private var _currencyGbp: ImageVector? = null
