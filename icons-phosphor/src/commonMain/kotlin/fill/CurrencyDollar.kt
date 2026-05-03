package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.CurrencyDollar: ImageVector
    get() {
        if (_currencyDollar != null) return _currencyDollar!!
        _currencyDollar = phosphorFillIcon(
            name = "CurrencyDollar",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(160.0f, 152.0f),
                    PathNode.CurveTo(160.0f, 160.83656f, 152.83656f, 168.0f, 144.0f, 168.0f),
                    PathNode.LineTo(136.0f, 168.0f),
                    PathNode.LineTo(136.0f, 136.0f),
                    PathNode.LineTo(144.0f, 136.0f),
                    PathNode.CurveTo(152.83656f, 136.0f, 160.0f, 143.16344f, 160.0f, 152.0f),
                    PathNode.Close,
                    PathNode.MoveTo(232.0f, 128.0f),
                    PathNode.CurveTo(232.0f, 185.4376f, 185.4376f, 232.0f, 128.0f, 232.0f),
                    PathNode.CurveTo(70.562386f, 232.0f, 24.0f, 185.4376f, 24.0f, 128.0f),
                    PathNode.CurveTo(24.0f, 70.562386f, 70.562386f, 24.0f, 128.0f, 24.0f),
                    PathNode.CurveTo(185.41248f, 24.060629f, 231.93938f, 70.58752f, 232.0f, 128.0f),
                    PathNode.Close,
                    PathNode.MoveTo(176.0f, 152.0f),
                    PathNode.CurveTo(176.0f, 134.32689f, 161.67311f, 120.0f, 144.0f, 120.0f),
                    PathNode.LineTo(136.0f, 120.0f),
                    PathNode.LineTo(136.0f, 88.0f),
                    PathNode.LineTo(140.0f, 88.0f),
                    PathNode.CurveTo(148.83656f, 88.0f, 156.0f, 95.163445f, 156.0f, 104.0f),
                    PathNode.CurveTo(156.0f, 108.41828f, 159.58173f, 112.0f, 164.0f, 112.0f),
                    PathNode.CurveTo(168.41827f, 112.0f, 172.0f, 108.41828f, 172.0f, 104.0f),
                    PathNode.CurveTo(172.0f, 86.32689f, 157.67311f, 72.0f, 140.0f, 72.0f),
                    PathNode.LineTo(136.0f, 72.0f),
                    PathNode.LineTo(136.0f, 64.0f),
                    PathNode.CurveTo(136.0f, 59.581722f, 132.41827f, 56.0f, 128.0f, 56.0f),
                    PathNode.CurveTo(123.58172f, 56.0f, 120.0f, 59.581722f, 120.0f, 64.0f),
                    PathNode.LineTo(120.0f, 72.0f),
                    PathNode.LineTo(116.0f, 72.0f),
                    PathNode.CurveTo(98.32689f, 72.0f, 84.0f, 86.32689f, 84.0f, 104.0f),
                    PathNode.CurveTo(84.0f, 121.67311f, 98.32689f, 136.0f, 116.0f, 136.0f),
                    PathNode.LineTo(120.0f, 136.0f),
                    PathNode.LineTo(120.0f, 168.0f),
                    PathNode.LineTo(112.0f, 168.0f),
                    PathNode.CurveTo(103.163445f, 168.0f, 96.0f, 160.83656f, 96.0f, 152.0f),
                    PathNode.CurveTo(96.0f, 147.58173f, 92.41828f, 144.0f, 88.0f, 144.0f),
                    PathNode.CurveTo(83.58172f, 144.0f, 80.0f, 147.58173f, 80.0f, 152.0f),
                    PathNode.CurveTo(80.0f, 169.67311f, 94.32689f, 184.0f, 112.0f, 184.0f),
                    PathNode.LineTo(120.0f, 184.0f),
                    PathNode.LineTo(120.0f, 192.0f),
                    PathNode.CurveTo(120.0f, 196.41827f, 123.58172f, 200.0f, 128.0f, 200.0f),
                    PathNode.CurveTo(132.41827f, 200.0f, 136.0f, 196.41827f, 136.0f, 192.0f),
                    PathNode.LineTo(136.0f, 184.0f),
                    PathNode.LineTo(144.0f, 184.0f),
                    PathNode.CurveTo(161.67311f, 184.0f, 176.0f, 169.67311f, 176.0f, 152.0f),
                    PathNode.Close,
                    PathNode.MoveTo(100.0f, 104.0f),
                    PathNode.CurveTo(100.0f, 112.836555f, 107.163445f, 120.0f, 116.0f, 120.0f),
                    PathNode.LineTo(120.0f, 120.0f),
                    PathNode.LineTo(120.0f, 88.0f),
                    PathNode.LineTo(116.0f, 88.0f),
                    PathNode.CurveTo(107.163445f, 88.0f, 100.0f, 95.163445f, 100.0f, 104.0f),
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
        return _currencyDollar!!
    }

private var _currencyDollar: ImageVector? = null
