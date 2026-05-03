package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.CurrencyEur: ImageVector
    get() {
        if (_currencyEur != null) return _currencyEur!!
        _currencyEur = phosphorRegularIcon(
            name = "CurrencyEur",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(190.0f, 192.33f),
                    PathNode.CurveTo(191.41562f, 193.9117f, 192.14459f, 195.99117f, 192.02643f, 198.11053f),
                    PathNode.CurveTo(191.90828f, 200.22992f, 190.95267f, 202.21545f, 189.37f, 203.63f),
                    PathNode.CurveTo(166.93509f, 223.71973f, 135.11899f, 229.5083f, 107.045784f, 218.60796f),
                    PathNode.CurveTo(78.97259f, 207.70761f, 59.39934f, 181.96541f, 56.4f, 152.0f),
                    PathNode.LineTo(40.0f, 152.0f),
                    PathNode.CurveTo(35.581722f, 152.0f, 32.0f, 148.41827f, 32.0f, 144.0f),
                    PathNode.CurveTo(32.0f, 139.58173f, 35.581722f, 136.0f, 40.0f, 136.0f),
                    PathNode.LineTo(56.0f, 136.0f),
                    PathNode.LineTo(56.0f, 120.0f),
                    PathNode.LineTo(40.0f, 120.0f),
                    PathNode.CurveTo(35.581722f, 120.0f, 32.0f, 116.41828f, 32.0f, 112.0f),
                    PathNode.CurveTo(32.0f, 107.58172f, 35.581722f, 104.0f, 40.0f, 104.0f),
                    PathNode.LineTo(56.4f, 104.0f),
                    PathNode.CurveTo(59.40751f, 74.04656f, 78.97562f, 48.317352f, 107.037636f, 37.418888f),
                    PathNode.CurveTo(135.09966f, 26.520424f, 166.9041f, 32.298042f, 189.34f, 52.37f),
                    PathNode.CurveTo(192.63438f, 55.319202f, 192.91418f, 60.380623f, 189.965f, 63.675f),
                    PathNode.CurveTo(187.0158f, 66.969376f, 181.95439f, 67.2492f, 178.66f, 64.3f),
                    PathNode.CurveTo(160.9267f, 48.45348f, 135.8689f, 43.74672f, 113.59407f, 52.078266f),
                    PathNode.CurveTo(91.319244f, 60.409813f, 75.50105f, 80.4056f, 72.52f, 104.0f),
                    PathNode.LineTo(136.0f, 104.0f),
                    PathNode.CurveTo(140.41827f, 104.0f, 144.0f, 107.58172f, 144.0f, 112.0f),
                    PathNode.CurveTo(144.0f, 116.41828f, 140.41827f, 120.0f, 136.0f, 120.0f),
                    PathNode.LineTo(72.0f, 120.0f),
                    PathNode.LineTo(72.0f, 136.0f),
                    PathNode.LineTo(120.0f, 136.0f),
                    PathNode.CurveTo(124.41828f, 136.0f, 128.0f, 139.58173f, 128.0f, 144.0f),
                    PathNode.CurveTo(128.0f, 148.41827f, 124.41828f, 152.0f, 120.0f, 152.0f),
                    PathNode.LineTo(72.52f, 152.0f),
                    PathNode.CurveTo(75.49788f, 175.59616f, 91.31485f, 195.595f, 113.590256f, 203.92886f),
                    PathNode.CurveTo(135.86566f, 212.26273f, 160.92531f, 207.557f, 178.66f, 191.71f),
                    PathNode.CurveTo(180.2424f, 190.2807f, 182.32994f, 189.54228f, 184.4591f, 189.65869f),
                    PathNode.CurveTo(186.58827f, 189.7751f, 188.58286f, 190.7367f, 190.0f, 192.33f),
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
        return _currencyEur!!
    }

private var _currencyEur: ImageVector? = null
