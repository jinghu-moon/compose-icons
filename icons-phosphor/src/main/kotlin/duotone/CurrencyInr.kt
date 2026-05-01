package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.CurrencyInr: ImageVector
    get() {
        if (_currencyInr != null) return _currencyInr!!
        _currencyInr = phosphorDuotoneIcon(
            name = "CurrencyInr",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(160.0f, 92.0f),
                    PathNode.CurveTo(160.0f, 120.7188f, 136.71881f, 144.0f, 108.0f, 144.0f),
                    PathNode.LineTo(72.0f, 144.0f),
                    PathNode.LineTo(72.0f, 40.0f),
                    PathNode.LineTo(108.0f, 40.0f),
                    PathNode.CurveTo(136.71881f, 40.0f, 160.0f, 63.281193f, 160.0f, 92.0f),
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
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(208.0f, 80.0f),
                    PathNode.CurveTo(208.0f, 84.41828f, 204.41827f, 88.0f, 200.0f, 88.0f),
                    PathNode.LineTo(167.85f, 88.0f),
                    PathNode.CurveTo(167.94f, 89.32f, 168.0f, 90.65f, 168.0f, 92.0f),
                    PathNode.CurveTo(167.96143f, 125.12109f, 141.1211f, 151.96143f, 108.0f, 152.0f),
                    PathNode.LineTo(92.69f, 152.0f),
                    PathNode.LineTo(165.38f, 218.08f),
                    PathNode.CurveTo(167.53516f, 219.9919f, 168.49586f, 222.91493f, 167.89514f, 225.73259f),
                    PathNode.CurveTo(167.29443f, 228.55025f, 165.2251f, 230.82729f, 162.47755f, 231.69395f),
                    PathNode.CurveTo(159.73003f, 232.56061f, 156.7287f, 231.88303f, 154.62f, 229.92f),
                    PathNode.LineTo(66.62f, 149.92f),
                    PathNode.CurveTo(64.17424f, 147.69698f, 63.347298f, 144.19879f, 64.538795f, 141.11595f),
                    PathNode.CurveTo(65.73029f, 138.03313f, 68.69492f, 136.00035f, 72.0f, 136.0f),
                    PathNode.LineTo(108.0f, 136.0f),
                    PathNode.CurveTo(132.28911f, 135.97244f, 151.97244f, 116.28911f, 152.0f, 92.0f),
                    PathNode.CurveTo(152.0f, 90.65f, 151.93f, 89.32f, 151.81f, 88.0f),
                    PathNode.LineTo(72.0f, 88.0f),
                    PathNode.CurveTo(67.58172f, 88.0f, 64.0f, 84.41828f, 64.0f, 80.0f),
                    PathNode.CurveTo(64.0f, 75.58172f, 67.58172f, 72.0f, 72.0f, 72.0f),
                    PathNode.LineTo(147.17f, 72.0f),
                    PathNode.CurveTo(139.65729f, 57.278126f, 124.52799f, 48.0082f, 108.0f, 48.0f),
                    PathNode.LineTo(72.0f, 48.0f),
                    PathNode.CurveTo(67.58172f, 48.0f, 64.0f, 44.418278f, 64.0f, 40.0f),
                    PathNode.CurveTo(64.0f, 35.581722f, 67.58172f, 32.0f, 72.0f, 32.0f),
                    PathNode.LineTo(200.0f, 32.0f),
                    PathNode.CurveTo(204.41827f, 32.0f, 208.0f, 35.581722f, 208.0f, 40.0f),
                    PathNode.CurveTo(208.0f, 44.418278f, 204.41827f, 48.0f, 200.0f, 48.0f),
                    PathNode.LineTo(148.74f, 48.0f),
                    PathNode.CurveTo(155.87608f, 54.603363f, 161.3045f, 62.838665f, 164.56f, 72.0f),
                    PathNode.LineTo(200.0f, 72.0f),
                    PathNode.CurveTo(204.41827f, 72.0f, 208.0f, 75.58172f, 208.0f, 80.0f),
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
        return _currencyInr!!
    }

private var _currencyInr: ImageVector? = null
