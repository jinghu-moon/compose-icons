package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.CurrencyCny: ImageVector
    get() {
        if (_currencyCny != null) return _currencyCny!!
        _currencyCny = phosphorRegularIcon(
            name = "CurrencyCny",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(56.0f, 56.0f),
                    PathNode.CurveTo(56.0f, 51.581722f, 59.581722f, 48.0f, 64.0f, 48.0f),
                    PathNode.LineTo(192.0f, 48.0f),
                    PathNode.CurveTo(196.41827f, 48.0f, 200.0f, 51.581722f, 200.0f, 56.0f),
                    PathNode.CurveTo(200.0f, 60.418278f, 196.41827f, 64.0f, 192.0f, 64.0f),
                    PathNode.LineTo(64.0f, 64.0f),
                    PathNode.CurveTo(59.581722f, 64.0f, 56.0f, 60.418278f, 56.0f, 56.0f),
                    PathNode.Close,
                    PathNode.MoveTo(216.0f, 160.0f),
                    PathNode.CurveTo(211.58173f, 160.0f, 208.0f, 163.58173f, 208.0f, 168.0f),
                    PathNode.LineTo(208.0f, 184.0f),
                    PathNode.LineTo(176.0f, 184.0f),
                    PathNode.CurveTo(167.16344f, 184.0f, 160.0f, 176.83656f, 160.0f, 168.0f),
                    PathNode.LineTo(160.0f, 120.0f),
                    PathNode.LineTo(208.0f, 120.0f),
                    PathNode.CurveTo(212.41827f, 120.0f, 216.0f, 116.41828f, 216.0f, 112.0f),
                    PathNode.CurveTo(216.0f, 107.58172f, 212.41827f, 104.0f, 208.0f, 104.0f),
                    PathNode.LineTo(48.0f, 104.0f),
                    PathNode.CurveTo(43.581722f, 104.0f, 40.0f, 107.58172f, 40.0f, 112.0f),
                    PathNode.CurveTo(40.0f, 116.41828f, 43.581722f, 120.0f, 48.0f, 120.0f),
                    PathNode.LineTo(96.0f, 120.0f),
                    PathNode.LineTo(96.0f, 128.0f),
                    PathNode.CurveTo(95.966934f, 158.91423f, 70.91424f, 183.96693f, 40.0f, 184.0f),
                    PathNode.CurveTo(35.581722f, 184.0f, 32.0f, 187.58173f, 32.0f, 192.0f),
                    PathNode.CurveTo(32.0f, 196.41827f, 35.581722f, 200.0f, 40.0f, 200.0f),
                    PathNode.CurveTo(79.74622f, 199.95592f, 111.95591f, 167.74623f, 112.0f, 128.0f),
                    PathNode.LineTo(112.0f, 120.0f),
                    PathNode.LineTo(144.0f, 120.0f),
                    PathNode.LineTo(144.0f, 168.0f),
                    PathNode.CurveTo(144.0f, 185.67311f, 158.32689f, 200.0f, 176.0f, 200.0f),
                    PathNode.LineTo(216.0f, 200.0f),
                    PathNode.CurveTo(220.41827f, 200.0f, 224.0f, 196.41827f, 224.0f, 192.0f),
                    PathNode.LineTo(224.0f, 168.0f),
                    PathNode.CurveTo(224.0f, 163.58173f, 220.41827f, 160.0f, 216.0f, 160.0f),
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
        return _currencyCny!!
    }

private var _currencyCny: ImageVector? = null
