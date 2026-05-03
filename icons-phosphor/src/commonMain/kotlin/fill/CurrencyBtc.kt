package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.CurrencyBtc: ImageVector
    get() {
        if (_currencyBtc != null) return _currencyBtc!!
        _currencyBtc = phosphorFillIcon(
            name = "CurrencyBtc",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(176.0f, 152.0f),
                    PathNode.CurveTo(176.0f, 160.83656f, 168.83656f, 168.0f, 160.0f, 168.0f),
                    PathNode.LineTo(112.0f, 168.0f),
                    PathNode.LineTo(112.0f, 136.0f),
                    PathNode.LineTo(160.0f, 136.0f),
                    PathNode.CurveTo(168.83656f, 136.0f, 176.0f, 143.16344f, 176.0f, 152.0f),
                    PathNode.Close,
                    PathNode.MoveTo(240.0f, 128.0f),
                    PathNode.CurveTo(240.0f, 185.4376f, 193.4376f, 232.0f, 136.0f, 232.0f),
                    PathNode.CurveTo(78.562386f, 232.0f, 32.0f, 185.4376f, 32.0f, 128.0f),
                    PathNode.CurveTo(32.0f, 70.562386f, 78.562386f, 24.0f, 136.0f, 24.0f),
                    PathNode.CurveTo(193.41248f, 24.060629f, 239.93938f, 70.58752f, 240.0f, 128.0f),
                    PathNode.Close,
                    PathNode.MoveTo(192.0f, 152.0f),
                    PathNode.CurveTo(191.99857f, 140.77191f, 186.1125f, 130.36598f, 176.49f, 124.58f),
                    PathNode.CurveTo(183.56555f, 116.16661f, 185.82715f, 104.71026f, 182.47958f, 94.239235f),
                    PathNode.CurveTo(179.13203f, 83.76821f, 170.64398f, 75.748505f, 160.0f, 73.0f),
                    PathNode.LineTo(160.0f, 64.0f),
                    PathNode.CurveTo(160.0f, 59.581722f, 156.41827f, 56.0f, 152.0f, 56.0f),
                    PathNode.CurveTo(147.58173f, 56.0f, 144.0f, 59.581722f, 144.0f, 64.0f),
                    PathNode.LineTo(144.0f, 72.0f),
                    PathNode.LineTo(128.0f, 72.0f),
                    PathNode.LineTo(128.0f, 64.0f),
                    PathNode.CurveTo(128.0f, 59.581722f, 124.41828f, 56.0f, 120.0f, 56.0f),
                    PathNode.CurveTo(115.58172f, 56.0f, 112.0f, 59.581722f, 112.0f, 64.0f),
                    PathNode.LineTo(112.0f, 72.0f),
                    PathNode.LineTo(96.0f, 72.0f),
                    PathNode.CurveTo(91.58172f, 72.0f, 88.0f, 75.58172f, 88.0f, 80.0f),
                    PathNode.CurveTo(88.0f, 84.41828f, 91.58172f, 88.0f, 96.0f, 88.0f),
                    PathNode.LineTo(96.0f, 168.0f),
                    PathNode.CurveTo(91.58172f, 168.0f, 88.0f, 171.58173f, 88.0f, 176.0f),
                    PathNode.CurveTo(88.0f, 180.41827f, 91.58172f, 184.0f, 96.0f, 184.0f),
                    PathNode.LineTo(112.0f, 184.0f),
                    PathNode.LineTo(112.0f, 192.0f),
                    PathNode.CurveTo(112.0f, 196.41827f, 115.58172f, 200.0f, 120.0f, 200.0f),
                    PathNode.CurveTo(124.41828f, 200.0f, 128.0f, 196.41827f, 128.0f, 192.0f),
                    PathNode.LineTo(128.0f, 184.0f),
                    PathNode.LineTo(144.0f, 184.0f),
                    PathNode.LineTo(144.0f, 192.0f),
                    PathNode.CurveTo(144.0f, 196.41827f, 147.58173f, 200.0f, 152.0f, 200.0f),
                    PathNode.CurveTo(156.41827f, 200.0f, 160.0f, 196.41827f, 160.0f, 192.0f),
                    PathNode.LineTo(160.0f, 184.0f),
                    PathNode.CurveTo(177.67311f, 184.0f, 192.0f, 169.67311f, 192.0f, 152.0f),
                    PathNode.Close,
                    PathNode.MoveTo(168.0f, 104.0f),
                    PathNode.CurveTo(168.0f, 95.163445f, 160.83656f, 88.0f, 152.0f, 88.0f),
                    PathNode.LineTo(112.0f, 88.0f),
                    PathNode.LineTo(112.0f, 120.0f),
                    PathNode.LineTo(152.0f, 120.0f),
                    PathNode.CurveTo(160.83656f, 120.0f, 168.0f, 112.836555f, 168.0f, 104.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
        }
        return _currencyBtc!!
    }

private var _currencyBtc: ImageVector? = null
