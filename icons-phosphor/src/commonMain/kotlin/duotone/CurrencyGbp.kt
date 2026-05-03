package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.CurrencyGbp: ImageVector
    get() {
        if (_currencyGbp != null) return _currencyGbp!!
        _currencyGbp = phosphorDuotoneIcon(
            name = "CurrencyGbp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(168.0f, 208.0f),
                    PathNode.LineTo(60.0f, 208.0f),
                    PathNode.CurveTo(79.88225f, 208.0f, 96.0f, 191.88223f, 96.0f, 172.0f),
                    PathNode.LineTo(96.0f, 84.0f),
                    PathNode.CurveTo(95.99657f, 66.96509f, 105.8264f, 51.458782f, 121.23432f, 44.19352f),
                    PathNode.CurveTo(136.64224f, 36.928257f, 154.85945f, 39.209602f, 168.0f, 50.05f),
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
                    PathNode.MoveTo(192.0f, 208.0f),
                    PathNode.CurveTo(192.0f, 212.41827f, 188.41827f, 216.0f, 184.0f, 216.0f),
                    PathNode.LineTo(56.0f, 216.0f),
                    PathNode.CurveTo(51.581722f, 216.0f, 48.0f, 212.41827f, 48.0f, 208.0f),
                    PathNode.CurveTo(48.0f, 203.58173f, 51.581722f, 200.0f, 56.0f, 200.0f),
                    PathNode.LineTo(60.0f, 200.0f),
                    PathNode.CurveTo(75.463974f, 200.0f, 88.0f, 187.46397f, 88.0f, 172.0f),
                    PathNode.LineTo(88.0f, 136.0f),
                    PathNode.LineTo(56.0f, 136.0f),
                    PathNode.CurveTo(51.581722f, 136.0f, 48.0f, 132.41827f, 48.0f, 128.0f),
                    PathNode.CurveTo(48.0f, 123.58172f, 51.581722f, 120.0f, 56.0f, 120.0f),
                    PathNode.LineTo(88.0f, 120.0f),
                    PathNode.LineTo(88.0f, 84.0f),
                    PathNode.CurveTo(88.00048f, 63.87251f, 99.61635f, 45.552868f, 117.82129f, 36.96822f),
                    PathNode.CurveTo(136.02623f, 28.383568f, 157.55038f, 31.07582f, 173.08f, 43.88f),
                    PathNode.CurveTo(175.34712f, 45.67916f, 176.4657f, 48.562553f, 176.00499f, 51.41993f),
                    PathNode.CurveTo(175.54428f, 54.27731f, 173.57616f, 56.663025f, 170.85844f, 57.658463f),
                    PathNode.CurveTo(168.14073f, 58.6539f, 165.09729f, 58.10381f, 162.9f, 56.22f),
                    PathNode.CurveTo(152.14807f, 47.356007f, 137.24629f, 45.49307f, 124.64309f, 51.43733f),
                    PathNode.CurveTo(112.039894f, 57.381584f, 103.99904f, 70.06534f, 104.0f, 84.0f),
                    PathNode.LineTo(104.0f, 120.0f),
                    PathNode.LineTo(136.0f, 120.0f),
                    PathNode.CurveTo(140.41827f, 120.0f, 144.0f, 123.58172f, 144.0f, 128.0f),
                    PathNode.CurveTo(144.0f, 132.41827f, 140.41827f, 136.0f, 136.0f, 136.0f),
                    PathNode.LineTo(104.0f, 136.0f),
                    PathNode.LineTo(104.0f, 172.0f),
                    PathNode.CurveTo(104.00915f, 182.22343f, 100.4434f, 192.12828f, 93.92f, 200.0f),
                    PathNode.LineTo(184.0f, 200.0f),
                    PathNode.CurveTo(188.41827f, 200.0f, 192.0f, 203.58173f, 192.0f, 208.0f),
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
        return _currencyGbp!!
    }

private var _currencyGbp: ImageVector? = null
