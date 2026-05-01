package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.CurrencyKrw: ImageVector
    get() {
        if (_currencyKrw != null) return _currencyKrw!!
        _currencyKrw = phosphorRegularIcon(
            name = "CurrencyKrw",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(240.0f, 128.0f),
                    PathNode.LineTo(217.89f, 128.0f),
                    PathNode.LineTo(239.41f, 75.0f),
                    PathNode.CurveTo(240.61186f, 72.32732f, 240.25623f, 69.211426f, 238.48305f, 66.8783f),
                    PathNode.CurveTo(236.70984f, 64.54519f, 233.80292f, 63.368294f, 230.90604f, 63.810696f),
                    PathNode.CurveTo(228.00916f, 64.2531f, 225.586f, 66.24398f, 224.59f, 69.0f),
                    PathNode.LineTo(200.59f, 128.0f),
                    PathNode.LineTo(159.38f, 128.0f),
                    PathNode.LineTo(135.38f, 69.0f),
                    PathNode.CurveTo(134.15358f, 65.98609f, 131.22388f, 64.015274f, 127.97f, 64.015274f),
                    PathNode.CurveTo(124.71612f, 64.015274f, 121.78642f, 65.98609f, 120.56f, 69.0f),
                    PathNode.LineTo(96.56f, 128.0f),
                    PathNode.LineTo(55.38f, 128.0f),
                    PathNode.LineTo(31.38f, 69.0f),
                    PathNode.CurveTo(29.616335f, 65.07798f, 25.067642f, 63.25189f, 21.081606f, 64.86567f),
                    PathNode.CurveTo(17.095572f, 66.47945f, 15.098425f, 70.95567f, 16.56f, 75.0f),
                    PathNode.LineTo(38.08f, 128.0f),
                    PathNode.LineTo(16.0f, 128.0f),
                    PathNode.CurveTo(11.581722f, 128.0f, 8.0f, 131.58173f, 8.0f, 136.0f),
                    PathNode.CurveTo(8.0f, 140.41827f, 11.581722f, 144.0f, 16.0f, 144.0f),
                    PathNode.LineTo(44.61f, 144.0f),
                    PathNode.LineTo(68.61f, 203.0f),
                    PathNode.CurveTo(69.83642f, 206.0139f, 72.76612f, 207.98473f, 76.02f, 207.98473f),
                    PathNode.CurveTo(79.27388f, 207.98473f, 82.20358f, 206.0139f, 83.43f, 203.0f),
                    PathNode.LineTo(107.43f, 144.0f),
                    PathNode.LineTo(148.67f, 144.0f),
                    PathNode.LineTo(172.67f, 203.0f),
                    PathNode.CurveTo(173.89642f, 206.0139f, 176.82611f, 207.98473f, 180.08f, 207.98473f),
                    PathNode.CurveTo(183.33388f, 207.98473f, 186.26358f, 206.0139f, 187.49f, 203.0f),
                    PathNode.LineTo(211.49f, 144.0f),
                    PathNode.LineTo(240.0f, 144.0f),
                    PathNode.CurveTo(244.41827f, 144.0f, 248.0f, 140.41827f, 248.0f, 136.0f),
                    PathNode.CurveTo(248.0f, 131.58173f, 244.41827f, 128.0f, 240.0f, 128.0f),
                    PathNode.Close,
                    PathNode.MoveTo(76.0f, 178.75f),
                    PathNode.LineTo(61.88f, 144.0f),
                    PathNode.LineTo(90.12f, 144.0f),
                    PathNode.Close,
                    PathNode.MoveTo(113.88f, 128.0f),
                    PathNode.LineTo(128.0f, 93.26f),
                    PathNode.LineTo(142.12f, 128.0f),
                    PathNode.Close,
                    PathNode.MoveTo(180.0f, 178.75f),
                    PathNode.LineTo(165.88f, 144.0f),
                    PathNode.LineTo(194.12f, 144.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _currencyKrw!!
    }

private var _currencyKrw: ImageVector? = null
