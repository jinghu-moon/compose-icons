package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.CurrencyRub: ImageVector
    get() {
        if (_currencyRub != null) return _currencyRub!!
        _currencyRub = phosphorRegularIcon(
            name = "CurrencyRub",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(148.0f, 152.0f),
                    PathNode.CurveTo(181.13708f, 152.0f, 208.0f, 125.137085f, 208.0f, 92.0f),
                    PathNode.CurveTo(208.0f, 58.862915f, 181.13708f, 32.0f, 148.0f, 32.0f),
                    PathNode.LineTo(88.0f, 32.0f),
                    PathNode.CurveTo(83.58172f, 32.0f, 80.0f, 35.581722f, 80.0f, 40.0f),
                    PathNode.LineTo(80.0f, 136.0f),
                    PathNode.LineTo(56.0f, 136.0f),
                    PathNode.CurveTo(51.581722f, 136.0f, 48.0f, 139.58173f, 48.0f, 144.0f),
                    PathNode.CurveTo(48.0f, 148.41827f, 51.581722f, 152.0f, 56.0f, 152.0f),
                    PathNode.LineTo(80.0f, 152.0f),
                    PathNode.LineTo(80.0f, 168.0f),
                    PathNode.LineTo(56.0f, 168.0f),
                    PathNode.CurveTo(51.581722f, 168.0f, 48.0f, 171.58173f, 48.0f, 176.0f),
                    PathNode.CurveTo(48.0f, 180.41827f, 51.581722f, 184.0f, 56.0f, 184.0f),
                    PathNode.LineTo(80.0f, 184.0f),
                    PathNode.LineTo(80.0f, 216.0f),
                    PathNode.CurveTo(80.0f, 220.41827f, 83.58172f, 224.0f, 88.0f, 224.0f),
                    PathNode.CurveTo(92.41828f, 224.0f, 96.0f, 220.41827f, 96.0f, 216.0f),
                    PathNode.LineTo(96.0f, 184.0f),
                    PathNode.LineTo(144.0f, 184.0f),
                    PathNode.CurveTo(148.41827f, 184.0f, 152.0f, 180.41827f, 152.0f, 176.0f),
                    PathNode.CurveTo(152.0f, 171.58173f, 148.41827f, 168.0f, 144.0f, 168.0f),
                    PathNode.LineTo(96.0f, 168.0f),
                    PathNode.LineTo(96.0f, 152.0f),
                    PathNode.Close,
                    PathNode.MoveTo(96.0f, 48.0f),
                    PathNode.LineTo(148.0f, 48.0f),
                    PathNode.CurveTo(172.30052f, 48.0f, 192.0f, 67.69947f, 192.0f, 92.0f),
                    PathNode.CurveTo(192.0f, 116.30053f, 172.30052f, 136.0f, 148.0f, 136.0f),
                    PathNode.LineTo(96.0f, 136.0f),
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
        return _currencyRub!!
    }

private var _currencyRub: ImageVector? = null
