package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.CurrencyCircleDollar: ImageVector
    get() {
        if (_currencyCircleDollar != null) return _currencyCircleDollar!!
        _currencyCircleDollar = phosphorBoldIcon(
            name = "CurrencyCircleDollar",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(128.0f, 20.0f),
                    PathNode.CurveTo(68.35325f, 20.0f, 20.0f, 68.35325f, 20.0f, 128.0f),
                    PathNode.CurveTo(20.0f, 187.64676f, 68.35325f, 236.0f, 128.0f, 236.0f),
                    PathNode.CurveTo(187.64676f, 236.0f, 236.0f, 187.64676f, 236.0f, 128.0f),
                    PathNode.CurveTo(235.93387f, 68.38066f, 187.61934f, 20.066133f, 128.0f, 20.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 212.0f),
                    PathNode.CurveTo(81.60808f, 212.0f, 44.0f, 174.39192f, 44.0f, 128.0f),
                    PathNode.CurveTo(44.0f, 81.60808f, 81.60808f, 44.0f, 128.0f, 44.0f),
                    PathNode.CurveTo(174.39192f, 44.0f, 212.0f, 81.60808f, 212.0f, 128.0f),
                    PathNode.CurveTo(211.9504f, 174.37135f, 174.37135f, 211.9504f, 128.0f, 212.0f),
                    PathNode.Close,
                    PathNode.MoveTo(172.0f, 148.0f),
                    PathNode.CurveTo(172.0f, 165.67311f, 157.67311f, 180.0f, 140.0f, 180.0f),
                    PathNode.LineTo(140.0f, 184.0f),
                    PathNode.CurveTo(140.0f, 190.62741f, 134.62741f, 196.0f, 128.0f, 196.0f),
                    PathNode.CurveTo(121.37258f, 196.0f, 116.0f, 190.62741f, 116.0f, 184.0f),
                    PathNode.LineTo(116.0f, 180.0f),
                    PathNode.LineTo(104.0f, 180.0f),
                    PathNode.CurveTo(97.37258f, 180.0f, 92.0f, 174.62741f, 92.0f, 168.0f),
                    PathNode.CurveTo(92.0f, 161.37259f, 97.37258f, 156.0f, 104.0f, 156.0f),
                    PathNode.LineTo(140.0f, 156.0f),
                    PathNode.CurveTo(144.41827f, 156.0f, 148.0f, 152.41827f, 148.0f, 148.0f),
                    PathNode.CurveTo(148.0f, 143.58173f, 144.41827f, 140.0f, 140.0f, 140.0f),
                    PathNode.LineTo(116.0f, 140.0f),
                    PathNode.CurveTo(98.32689f, 140.0f, 84.0f, 125.67311f, 84.0f, 108.0f),
                    PathNode.CurveTo(84.0f, 90.32689f, 98.32689f, 76.0f, 116.0f, 76.0f),
                    PathNode.LineTo(116.0f, 72.0f),
                    PathNode.CurveTo(116.0f, 65.37258f, 121.37258f, 60.0f, 128.0f, 60.0f),
                    PathNode.CurveTo(134.62741f, 60.0f, 140.0f, 65.37258f, 140.0f, 72.0f),
                    PathNode.LineTo(140.0f, 76.0f),
                    PathNode.LineTo(152.0f, 76.0f),
                    PathNode.CurveTo(158.62741f, 76.0f, 164.0f, 81.37258f, 164.0f, 88.0f),
                    PathNode.CurveTo(164.0f, 94.62742f, 158.62741f, 100.0f, 152.0f, 100.0f),
                    PathNode.LineTo(116.0f, 100.0f),
                    PathNode.CurveTo(111.58172f, 100.0f, 108.0f, 103.58172f, 108.0f, 108.0f),
                    PathNode.CurveTo(108.0f, 112.41828f, 111.58172f, 116.0f, 116.0f, 116.0f),
                    PathNode.LineTo(140.0f, 116.0f),
                    PathNode.CurveTo(157.67311f, 116.0f, 172.0f, 130.32689f, 172.0f, 148.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 24.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _currencyCircleDollar!!
    }

private var _currencyCircleDollar: ImageVector? = null
