package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.CurrencyNgn: ImageVector
    get() {
        if (_currencyNgn != null) return _currencyNgn!!
        _currencyNgn = phosphorRegularIcon(
            name = "CurrencyNgn",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(216.0f, 136.0f),
                    PathNode.LineTo(200.0f, 136.0f),
                    PathNode.LineTo(200.0f, 120.0f),
                    PathNode.LineTo(216.0f, 120.0f),
                    PathNode.CurveTo(220.41827f, 120.0f, 224.0f, 116.41828f, 224.0f, 112.0f),
                    PathNode.CurveTo(224.0f, 107.58172f, 220.41827f, 104.0f, 216.0f, 104.0f),
                    PathNode.LineTo(200.0f, 104.0f),
                    PathNode.LineTo(200.0f, 46.0f),
                    PathNode.CurveTo(200.0f, 41.581722f, 196.41827f, 38.0f, 192.0f, 38.0f),
                    PathNode.CurveTo(187.58173f, 38.0f, 184.0f, 41.581722f, 184.0f, 46.0f),
                    PathNode.LineTo(184.0f, 104.0f),
                    PathNode.LineTo(119.42f, 104.0f),
                    PathNode.LineTo(70.31f, 41.08f),
                    PathNode.CurveTo(68.20976f, 38.385147f, 64.6299f, 37.32151f, 61.39892f, 38.432373f),
                    PathNode.CurveTo(58.16794f, 39.543232f, 55.999023f, 42.583385f, 56.0f, 46.0f),
                    PathNode.LineTo(56.0f, 104.0f),
                    PathNode.LineTo(40.0f, 104.0f),
                    PathNode.CurveTo(35.581722f, 104.0f, 32.0f, 107.58172f, 32.0f, 112.0f),
                    PathNode.CurveTo(32.0f, 116.41828f, 35.581722f, 120.0f, 40.0f, 120.0f),
                    PathNode.LineTo(56.0f, 120.0f),
                    PathNode.LineTo(56.0f, 136.0f),
                    PathNode.LineTo(40.0f, 136.0f),
                    PathNode.CurveTo(35.581722f, 136.0f, 32.0f, 139.58173f, 32.0f, 144.0f),
                    PathNode.CurveTo(32.0f, 148.41827f, 35.581722f, 152.0f, 40.0f, 152.0f),
                    PathNode.LineTo(56.0f, 152.0f),
                    PathNode.LineTo(56.0f, 210.0f),
                    PathNode.CurveTo(56.0f, 214.41827f, 59.581722f, 218.0f, 64.0f, 218.0f),
                    PathNode.CurveTo(68.41828f, 218.0f, 72.0f, 214.41827f, 72.0f, 210.0f),
                    PathNode.LineTo(72.0f, 152.0f),
                    PathNode.LineTo(136.58f, 152.0f),
                    PathNode.LineTo(185.69f, 214.92f),
                    PathNode.CurveTo(187.20633f, 216.86418f, 189.53441f, 218.00055f, 192.0f, 218.0f),
                    PathNode.CurveTo(192.88536f, 218.00195f, 193.76459f, 217.85316f, 194.6f, 217.56f),
                    PathNode.CurveTo(197.82875f, 216.45044f, 199.99756f, 213.4141f, 200.0f, 210.0f),
                    PathNode.LineTo(200.0f, 152.0f),
                    PathNode.LineTo(216.0f, 152.0f),
                    PathNode.CurveTo(220.41827f, 152.0f, 224.0f, 148.41827f, 224.0f, 144.0f),
                    PathNode.CurveTo(224.0f, 139.58173f, 220.41827f, 136.0f, 216.0f, 136.0f),
                    PathNode.Close,
                    PathNode.MoveTo(184.0f, 120.0f),
                    PathNode.LineTo(184.0f, 136.0f),
                    PathNode.LineTo(144.39f, 136.0f),
                    PathNode.LineTo(131.9f, 120.0f),
                    PathNode.Close,
                    PathNode.MoveTo(72.0f, 69.25f),
                    PathNode.LineTo(99.12f, 104.0f),
                    PathNode.LineTo(72.0f, 104.0f),
                    PathNode.Close,
                    PathNode.MoveTo(72.0f, 136.0f),
                    PathNode.LineTo(72.0f, 120.0f),
                    PathNode.LineTo(111.61f, 120.0f),
                    PathNode.LineTo(124.1f, 136.0f),
                    PathNode.Close,
                    PathNode.MoveTo(184.0f, 186.75f),
                    PathNode.LineTo(156.88f, 152.0f),
                    PathNode.LineTo(184.0f, 152.0f),
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
        return _currencyNgn!!
    }

private var _currencyNgn: ImageVector? = null
