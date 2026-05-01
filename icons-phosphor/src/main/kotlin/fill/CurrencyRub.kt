package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.CurrencyRub: ImageVector
    get() {
        if (_currencyRub != null) return _currencyRub!!
        _currencyRub = phosphorFillIcon(
            name = "CurrencyRub",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(168.0f, 104.0f),
                    PathNode.CurveTo(168.0f, 117.25484f, 157.25484f, 128.0f, 144.0f, 128.0f),
                    PathNode.LineTo(112.0f, 128.0f),
                    PathNode.LineTo(112.0f, 80.0f),
                    PathNode.LineTo(144.0f, 80.0f),
                    PathNode.CurveTo(157.25484f, 80.0f, 168.0f, 90.74516f, 168.0f, 104.0f),
                    PathNode.Close,
                    PathNode.MoveTo(232.0f, 128.0f),
                    PathNode.CurveTo(232.0f, 185.4376f, 185.4376f, 232.0f, 128.0f, 232.0f),
                    PathNode.CurveTo(70.562386f, 232.0f, 24.0f, 185.4376f, 24.0f, 128.0f),
                    PathNode.CurveTo(24.0f, 70.562386f, 70.562386f, 24.0f, 128.0f, 24.0f),
                    PathNode.CurveTo(185.41248f, 24.060629f, 231.93938f, 70.58752f, 232.0f, 128.0f),
                    PathNode.Close,
                    PathNode.MoveTo(184.0f, 104.0f),
                    PathNode.CurveTo(184.0f, 81.90861f, 166.09138f, 64.0f, 144.0f, 64.0f),
                    PathNode.LineTo(104.0f, 64.0f),
                    PathNode.CurveTo(99.58172f, 64.0f, 96.0f, 67.58172f, 96.0f, 72.0f),
                    PathNode.LineTo(96.0f, 128.0f),
                    PathNode.LineTo(88.0f, 128.0f),
                    PathNode.CurveTo(83.58172f, 128.0f, 80.0f, 131.58173f, 80.0f, 136.0f),
                    PathNode.CurveTo(80.0f, 140.41827f, 83.58172f, 144.0f, 88.0f, 144.0f),
                    PathNode.LineTo(96.0f, 144.0f),
                    PathNode.LineTo(96.0f, 160.0f),
                    PathNode.LineTo(88.0f, 160.0f),
                    PathNode.CurveTo(83.58172f, 160.0f, 80.0f, 163.58173f, 80.0f, 168.0f),
                    PathNode.CurveTo(80.0f, 172.41827f, 83.58172f, 176.0f, 88.0f, 176.0f),
                    PathNode.LineTo(96.0f, 176.0f),
                    PathNode.LineTo(96.0f, 192.0f),
                    PathNode.CurveTo(96.0f, 196.41827f, 99.58172f, 200.0f, 104.0f, 200.0f),
                    PathNode.CurveTo(108.41828f, 200.0f, 112.0f, 196.41827f, 112.0f, 192.0f),
                    PathNode.LineTo(112.0f, 176.0f),
                    PathNode.LineTo(152.0f, 176.0f),
                    PathNode.CurveTo(156.41827f, 176.0f, 160.0f, 172.41827f, 160.0f, 168.0f),
                    PathNode.CurveTo(160.0f, 163.58173f, 156.41827f, 160.0f, 152.0f, 160.0f),
                    PathNode.LineTo(112.0f, 160.0f),
                    PathNode.LineTo(112.0f, 144.0f),
                    PathNode.LineTo(144.0f, 144.0f),
                    PathNode.CurveTo(166.09138f, 144.0f, 184.0f, 126.09139f, 184.0f, 104.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
        }
        return _currencyRub!!
    }

private var _currencyRub: ImageVector? = null
