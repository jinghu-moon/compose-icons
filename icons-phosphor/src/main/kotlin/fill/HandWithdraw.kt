package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.HandWithdraw: ImageVector
    get() {
        if (_handWithdraw != null) return _handWithdraw!!
        _handWithdraw = phosphorFillIcon(
            name = "HandWithdraw",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(128.0f, 56.0f),
                    PathNode.LineTo(112.0f, 56.0f),
                    PathNode.LineTo(112.0f, 16.0f),
                    PathNode.CurveTo(112.0f, 11.581722f, 115.58172f, 8.0f, 120.0f, 8.0f),
                    PathNode.CurveTo(124.41828f, 8.0f, 128.0f, 11.581722f, 128.0f, 16.0f),
                    PathNode.Close,
                    PathNode.MoveTo(192.0f, 123.62f),
                    PathNode.LineTo(192.0f, 72.0f),
                    PathNode.CurveTo(192.0f, 63.163445f, 184.83656f, 56.0f, 176.0f, 56.0f),
                    PathNode.LineTo(128.0f, 56.0f),
                    PathNode.LineTo(128.0f, 116.69f),
                    PathNode.LineTo(146.34f, 98.34f),
                    PathNode.CurveTo(149.46593f, 95.214066f, 154.53407f, 95.214066f, 157.66f, 98.34f),
                    PathNode.CurveTo(160.78593f, 101.465935f, 160.78593f, 106.534065f, 157.66f, 109.66f),
                    PathNode.LineTo(125.66f, 141.66f),
                    PathNode.CurveTo(124.159454f, 143.16223f, 122.123276f, 144.00629f, 120.0f, 144.00629f),
                    PathNode.CurveTo(117.876724f, 144.00629f, 115.840546f, 143.16223f, 114.34f, 141.66f),
                    PathNode.LineTo(82.34f, 109.66f),
                    PathNode.CurveTo(79.214066f, 106.534065f, 79.214066f, 101.465935f, 82.34f, 98.34f),
                    PathNode.CurveTo(85.465935f, 95.214066f, 90.534065f, 95.214066f, 93.66f, 98.34f),
                    PathNode.LineTo(112.0f, 116.69f),
                    PathNode.LineTo(112.0f, 56.0f),
                    PathNode.LineTo(64.0f, 56.0f),
                    PathNode.CurveTo(55.163445f, 56.0f, 48.0f, 63.163445f, 48.0f, 72.0f),
                    PathNode.LineTo(48.0f, 200.0f),
                    PathNode.CurveTo(48.0f, 204.41827f, 51.581722f, 208.0f, 56.0f, 208.0f),
                    PathNode.LineTo(130.7f, 208.0f),
                    PathNode.CurveTo(131.02f, 208.67f, 131.37f, 209.34f, 131.75f, 210.0f),
                    PathNode.LineTo(131.99f, 210.38f),
                    PathNode.LineTo(154.25f, 244.38f),
                    PathNode.CurveTo(156.669f, 248.07755f, 161.62746f, 249.11401f, 165.325f, 246.695f),
                    PathNode.CurveTo(169.02255f, 244.27599f, 170.059f, 239.31755f, 167.64f, 235.62f),
                    PathNode.LineTo(145.51f, 201.83f),
                    PathNode.CurveTo(142.24326f, 196.06139f, 144.2714f, 188.73677f, 150.04f, 185.47f),
                    PathNode.CurveTo(155.80861f, 182.20323f, 163.13322f, 184.2314f, 166.4f, 190.0f),
                    PathNode.CurveTo(166.47f, 190.13f, 166.55f, 190.26f, 166.63f, 190.38f),
                    PathNode.LineTo(177.31f, 206.69f),
                    PathNode.CurveTo(179.2486f, 209.64644f, 182.89789f, 210.97986f, 186.28586f, 209.9697f),
                    PathNode.CurveTo(189.67381f, 208.95953f, 191.99701f, 205.84537f, 192.0f, 202.31f),
                    PathNode.LineTo(192.0f, 144.0f),
                    PathNode.CurveTo(207.24255f, 158.10974f, 215.93579f, 177.91943f, 216.0f, 198.69f),
                    PathNode.LineTo(216.0f, 240.0f),
                    PathNode.CurveTo(216.0f, 244.41827f, 219.58173f, 248.0f, 224.0f, 248.0f),
                    PathNode.CurveTo(228.41827f, 248.0f, 232.0f, 244.41827f, 232.0f, 240.0f),
                    PathNode.LineTo(232.0f, 198.65f),
                    PathNode.CurveTo(231.90808f, 168.56076f, 216.9308f, 140.46713f, 192.0f, 123.62f),
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
        return _handWithdraw!!
    }

private var _handWithdraw: ImageVector? = null
