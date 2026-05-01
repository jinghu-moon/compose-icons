package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.CurrencyBtc: ImageVector
    get() {
        if (_currencyBtc != null) return _currencyBtc!!
        _currencyBtc = phosphorRegularIcon(
            name = "CurrencyBtc",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(178.48f, 115.7f),
                    PathNode.CurveTo(190.87979f, 103.76074f, 195.17871f, 85.687164f, 189.4824f, 69.44363f),
                    PathNode.CurveTo(183.78609f, 53.20009f, 169.14073f, 41.769928f, 152.0f, 40.19f),
                    PathNode.LineTo(152.0f, 24.0f),
                    PathNode.CurveTo(152.0f, 19.581722f, 148.41827f, 16.0f, 144.0f, 16.0f),
                    PathNode.CurveTo(139.58173f, 16.0f, 136.0f, 19.581722f, 136.0f, 24.0f),
                    PathNode.LineTo(136.0f, 40.0f),
                    PathNode.LineTo(120.0f, 40.0f),
                    PathNode.LineTo(120.0f, 24.0f),
                    PathNode.CurveTo(120.0f, 19.581722f, 116.41828f, 16.0f, 112.0f, 16.0f),
                    PathNode.CurveTo(107.58172f, 16.0f, 104.0f, 19.581722f, 104.0f, 24.0f),
                    PathNode.LineTo(104.0f, 40.0f),
                    PathNode.LineTo(72.0f, 40.0f),
                    PathNode.CurveTo(67.58172f, 40.0f, 64.0f, 43.581722f, 64.0f, 48.0f),
                    PathNode.CurveTo(64.0f, 52.418278f, 67.58172f, 56.0f, 72.0f, 56.0f),
                    PathNode.LineTo(80.0f, 56.0f),
                    PathNode.LineTo(80.0f, 192.0f),
                    PathNode.LineTo(72.0f, 192.0f),
                    PathNode.CurveTo(67.58172f, 192.0f, 64.0f, 195.58173f, 64.0f, 200.0f),
                    PathNode.CurveTo(64.0f, 204.41827f, 67.58172f, 208.0f, 72.0f, 208.0f),
                    PathNode.LineTo(104.0f, 208.0f),
                    PathNode.LineTo(104.0f, 224.0f),
                    PathNode.CurveTo(104.0f, 228.41827f, 107.58172f, 232.0f, 112.0f, 232.0f),
                    PathNode.CurveTo(116.41828f, 232.0f, 120.0f, 228.41827f, 120.0f, 224.0f),
                    PathNode.LineTo(120.0f, 208.0f),
                    PathNode.LineTo(136.0f, 208.0f),
                    PathNode.LineTo(136.0f, 224.0f),
                    PathNode.CurveTo(136.0f, 228.41827f, 139.58173f, 232.0f, 144.0f, 232.0f),
                    PathNode.CurveTo(148.41827f, 232.0f, 152.0f, 228.41827f, 152.0f, 224.0f),
                    PathNode.LineTo(152.0f, 208.0f),
                    PathNode.LineTo(160.0f, 208.0f),
                    PathNode.CurveTo(182.87694f, 208.0f, 202.5747f, 191.85512f, 207.06592f, 169.42339f),
                    PathNode.CurveTo(211.55713f, 146.99164f, 199.5935f, 124.507614f, 178.48f, 115.7f),
                    PathNode.Close,
                    PathNode.MoveTo(176.0f, 84.0f),
                    PathNode.CurveTo(176.0f, 99.463974f, 163.46397f, 112.0f, 148.0f, 112.0f),
                    PathNode.LineTo(96.0f, 112.0f),
                    PathNode.LineTo(96.0f, 56.0f),
                    PathNode.LineTo(148.0f, 56.0f),
                    PathNode.CurveTo(163.46397f, 56.0f, 176.0f, 68.536026f, 176.0f, 84.0f),
                    PathNode.Close,
                    PathNode.MoveTo(160.0f, 192.0f),
                    PathNode.LineTo(96.0f, 192.0f),
                    PathNode.LineTo(96.0f, 128.0f),
                    PathNode.LineTo(160.0f, 128.0f),
                    PathNode.CurveTo(177.67311f, 128.0f, 192.0f, 142.32689f, 192.0f, 160.0f),
                    PathNode.CurveTo(192.0f, 177.67311f, 177.67311f, 192.0f, 160.0f, 192.0f),
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
        return _currencyBtc!!
    }

private var _currencyBtc: ImageVector? = null
