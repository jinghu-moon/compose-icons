package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.CurrencyEur: ImageVector
    get() {
        if (_currencyEur != null) return _currencyEur!!
        _currencyEur = phosphorLightIcon(
            name = "CurrencyEur",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(188.47f, 193.66f),
                    PathNode.CurveTo(189.53357f, 194.8462f, 190.0817f, 196.40671f, 189.99353f, 197.99747f),
                    PathNode.CurveTo(189.90536f, 199.58823f, 189.18814f, 201.0786f, 188.0f, 202.14f),
                    PathNode.CurveTo(165.88138f, 221.91129f, 134.46161f, 227.42319f, 106.93398f, 216.36122f),
                    PathNode.CurveTo(79.40636f, 205.29926f, 60.5373f, 179.57881f, 58.25f, 150.0f),
                    PathNode.LineTo(40.0f, 150.0f),
                    PathNode.CurveTo(36.68629f, 150.0f, 34.0f, 147.3137f, 34.0f, 144.0f),
                    PathNode.CurveTo(34.0f, 140.6863f, 36.68629f, 138.0f, 40.0f, 138.0f),
                    PathNode.LineTo(58.0f, 138.0f),
                    PathNode.LineTo(58.0f, 118.0f),
                    PathNode.LineTo(40.0f, 118.0f),
                    PathNode.CurveTo(36.68629f, 118.0f, 34.0f, 115.313705f, 34.0f, 112.0f),
                    PathNode.CurveTo(34.0f, 108.686295f, 36.68629f, 106.0f, 40.0f, 106.0f),
                    PathNode.LineTo(58.25f, 106.0f),
                    PathNode.CurveTo(60.5373f, 76.42119f, 79.40636f, 50.700752f, 106.93398f, 39.638783f),
                    PathNode.CurveTo(134.46161f, 28.576813f, 165.88138f, 34.088707f, 188.0f, 53.86f),
                    PathNode.CurveTo(190.48528f, 56.069138f, 190.70914f, 59.874718f, 188.5f, 62.36f),
                    PathNode.CurveTo(186.29086f, 64.84528f, 182.48528f, 65.06914f, 180.0f, 62.86f),
                    PathNode.CurveTo(161.41628f, 46.245625f, 135.0573f, 41.519054f, 111.85862f, 50.641205f),
                    PathNode.CurveTo(88.65994f, 59.76335f, 72.58005f, 81.17767f, 70.29f, 106.0f),
                    PathNode.LineTo(136.0f, 106.0f),
                    PathNode.CurveTo(139.3137f, 106.0f, 142.0f, 108.686295f, 142.0f, 112.0f),
                    PathNode.CurveTo(142.0f, 115.313705f, 139.3137f, 118.0f, 136.0f, 118.0f),
                    PathNode.LineTo(70.0f, 118.0f),
                    PathNode.LineTo(70.0f, 138.0f),
                    PathNode.LineTo(120.0f, 138.0f),
                    PathNode.CurveTo(123.313705f, 138.0f, 126.0f, 140.6863f, 126.0f, 144.0f),
                    PathNode.CurveTo(126.0f, 147.3137f, 123.313705f, 150.0f, 120.0f, 150.0f),
                    PathNode.LineTo(70.29f, 150.0f),
                    PathNode.CurveTo(72.559906f, 174.83301f, 88.63209f, 196.26645f, 111.834625f, 205.4028f),
                    PathNode.CurveTo(135.03717f, 214.53915f, 161.408f, 209.81831f, 180.0f, 193.2f),
                    PathNode.CurveTo(182.46634f, 190.98921f, 186.25758f, 191.19511f, 188.47f, 193.66f),
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
        return _currencyEur!!
    }

private var _currencyEur: ImageVector? = null
