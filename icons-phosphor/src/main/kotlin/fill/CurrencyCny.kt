package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.CurrencyCny: ImageVector
    get() {
        if (_currencyCny != null) return _currencyCny!!
        _currencyCny = phosphorFillIcon(
            name = "CurrencyCny",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(128.0f, 16.0f),
                    PathNode.CurveTo(70.562386f, 16.0f, 24.0f, 62.562386f, 24.0f, 120.0f),
                    PathNode.CurveTo(24.0f, 177.4376f, 70.562386f, 224.0f, 128.0f, 224.0f),
                    PathNode.CurveTo(185.4376f, 224.0f, 232.0f, 177.4376f, 232.0f, 120.0f),
                    PathNode.CurveTo(231.93938f, 62.587517f, 185.41248f, 16.060629f, 128.0f, 16.0f),
                    PathNode.Close,
                    PathNode.MoveTo(88.0f, 72.0f),
                    PathNode.LineTo(168.0f, 72.0f),
                    PathNode.CurveTo(172.41827f, 72.0f, 176.0f, 75.58172f, 176.0f, 80.0f),
                    PathNode.CurveTo(176.0f, 84.41828f, 172.41827f, 88.0f, 168.0f, 88.0f),
                    PathNode.LineTo(88.0f, 88.0f),
                    PathNode.CurveTo(83.58172f, 88.0f, 80.0f, 84.41828f, 80.0f, 80.0f),
                    PathNode.CurveTo(80.0f, 75.58172f, 83.58172f, 72.0f, 88.0f, 72.0f),
                    PathNode.Close,
                    PathNode.MoveTo(192.0f, 160.0f),
                    PathNode.CurveTo(192.0f, 164.41827f, 188.41827f, 168.0f, 184.0f, 168.0f),
                    PathNode.LineTo(160.0f, 168.0f),
                    PathNode.CurveTo(146.74516f, 168.0f, 136.0f, 157.25484f, 136.0f, 144.0f),
                    PathNode.LineTo(136.0f, 120.0f),
                    PathNode.LineTo(120.0f, 120.0f),
                    PathNode.CurveTo(119.97244f, 146.49825f, 98.498245f, 167.97244f, 72.0f, 168.0f),
                    PathNode.CurveTo(67.58172f, 168.0f, 64.0f, 164.41827f, 64.0f, 160.0f),
                    PathNode.CurveTo(64.0f, 155.58173f, 67.58172f, 152.0f, 72.0f, 152.0f),
                    PathNode.CurveTo(89.67311f, 152.0f, 104.0f, 137.67311f, 104.0f, 120.0f),
                    PathNode.LineTo(80.0f, 120.0f),
                    PathNode.CurveTo(75.58172f, 120.0f, 72.0f, 116.41828f, 72.0f, 112.0f),
                    PathNode.CurveTo(72.0f, 107.58172f, 75.58172f, 104.0f, 80.0f, 104.0f),
                    PathNode.LineTo(176.0f, 104.0f),
                    PathNode.CurveTo(180.41827f, 104.0f, 184.0f, 107.58172f, 184.0f, 112.0f),
                    PathNode.CurveTo(184.0f, 116.41828f, 180.41827f, 120.0f, 176.0f, 120.0f),
                    PathNode.LineTo(152.0f, 120.0f),
                    PathNode.LineTo(152.0f, 144.0f),
                    PathNode.CurveTo(152.0f, 148.41827f, 155.58173f, 152.0f, 160.0f, 152.0f),
                    PathNode.LineTo(176.0f, 152.0f),
                    PathNode.LineTo(176.0f, 144.0f),
                    PathNode.CurveTo(176.0f, 139.58173f, 179.58173f, 136.0f, 184.0f, 136.0f),
                    PathNode.CurveTo(188.41827f, 136.0f, 192.0f, 139.58173f, 192.0f, 144.0f),
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
        return _currencyCny!!
    }

private var _currencyCny: ImageVector? = null
