package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.CurrencyEur: ImageVector
    get() {
        if (_currencyEur != null) return _currencyEur!!
        _currencyEur = phosphorBoldIcon(
            name = "CurrencyEur",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(192.94f, 189.66f),
                    PathNode.CurveTo(195.0796f, 192.0344f, 196.18356f, 195.16426f, 196.00711f, 198.35558f),
                    PathNode.CurveTo(195.83064f, 201.5469f, 194.38834f, 204.53596f, 192.0f, 206.66f),
                    PathNode.CurveTo(169.46239f, 226.80621f, 137.83798f, 233.28874f, 109.19171f, 223.63446f),
                    PathNode.CurveTo(80.54545f, 213.98018f, 59.29593f, 189.67824f, 53.55f, 160.0f),
                    PathNode.LineTo(40.0f, 160.0f),
                    PathNode.CurveTo(33.37258f, 160.0f, 28.0f, 154.62741f, 28.0f, 148.0f),
                    PathNode.CurveTo(28.0f, 141.37259f, 33.37258f, 136.0f, 40.0f, 136.0f),
                    PathNode.LineTo(52.0f, 136.0f),
                    PathNode.LineTo(52.0f, 120.0f),
                    PathNode.LineTo(40.0f, 120.0f),
                    PathNode.CurveTo(33.37258f, 120.0f, 28.0f, 114.62742f, 28.0f, 108.0f),
                    PathNode.CurveTo(28.0f, 101.37258f, 33.37258f, 96.0f, 40.0f, 96.0f),
                    PathNode.LineTo(53.55f, 96.0f),
                    PathNode.CurveTo(59.31016f, 66.33041f, 80.56535f, 42.0426f, 109.20927f, 32.399456f),
                    PathNode.CurveTo(137.85318f, 22.756315f, 169.46936f, 29.244673f, 192.0f, 49.39f),
                    PathNode.CurveTo(196.94019f, 53.808277f, 197.36328f, 61.394814f, 192.945f, 66.335f),
                    PathNode.CurveTo(188.52672f, 71.275185f, 180.94019f, 71.69828f, 176.0f, 67.28f),
                    PathNode.CurveTo(160.53137f, 53.447906f, 139.01361f, 48.590595f, 119.103f, 54.43636f),
                    PathNode.CurveTo(99.19239f, 60.282124f, 83.715805f, 76.001f, 78.18f, 96.0f),
                    PathNode.LineTo(136.0f, 96.0f),
                    PathNode.CurveTo(142.62741f, 96.0f, 148.0f, 101.37258f, 148.0f, 108.0f),
                    PathNode.CurveTo(148.0f, 114.62742f, 142.62741f, 120.0f, 136.0f, 120.0f),
                    PathNode.LineTo(76.0f, 120.0f),
                    PathNode.LineTo(76.0f, 136.0f),
                    PathNode.LineTo(120.0f, 136.0f),
                    PathNode.CurveTo(126.62742f, 136.0f, 132.0f, 141.37259f, 132.0f, 148.0f),
                    PathNode.CurveTo(132.0f, 154.62741f, 126.62742f, 160.0f, 120.0f, 160.0f),
                    PathNode.LineTo(78.18f, 160.0f),
                    PathNode.CurveTo(83.715805f, 179.99901f, 99.19239f, 195.7179f, 119.103f, 201.56364f),
                    PathNode.CurveTo(139.01361f, 207.40941f, 160.53137f, 202.5521f, 176.0f, 188.72f),
                    PathNode.CurveTo(180.93805f, 184.30351f, 188.5209f, 184.72429f, 192.94f, 189.66f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 24.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _currencyEur!!
    }

private var _currencyEur: ImageVector? = null
