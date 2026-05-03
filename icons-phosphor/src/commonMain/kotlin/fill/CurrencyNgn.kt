package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.CurrencyNgn: ImageVector
    get() {
        if (_currencyNgn != null) return _currencyNgn!!
        _currencyNgn = phosphorFillIcon(
            name = "CurrencyNgn",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(143.55f, 136.0f),
                    PathNode.LineTo(160.0f, 136.0f),
                    PathNode.LineTo(160.0f, 159.0f),
                    PathNode.Close,
                    PathNode.MoveTo(96.0f, 120.0f),
                    PathNode.LineTo(112.45f, 120.0f),
                    PathNode.LineTo(96.0f, 97.0f),
                    PathNode.Close,
                    PathNode.MoveTo(232.0f, 128.0f),
                    PathNode.CurveTo(232.0f, 185.4376f, 185.4376f, 232.0f, 128.0f, 232.0f),
                    PathNode.CurveTo(70.562386f, 232.0f, 24.0f, 185.4376f, 24.0f, 128.0f),
                    PathNode.CurveTo(24.0f, 70.562386f, 70.562386f, 24.0f, 128.0f, 24.0f),
                    PathNode.CurveTo(185.41248f, 24.060629f, 231.93938f, 70.58752f, 232.0f, 128.0f),
                    PathNode.Close,
                    PathNode.MoveTo(200.0f, 128.0f),
                    PathNode.CurveTo(200.0f, 123.58172f, 196.41827f, 120.0f, 192.0f, 120.0f),
                    PathNode.LineTo(176.0f, 120.0f),
                    PathNode.LineTo(176.0f, 72.0f),
                    PathNode.CurveTo(176.0f, 67.58172f, 172.41827f, 64.0f, 168.0f, 64.0f),
                    PathNode.CurveTo(163.58173f, 64.0f, 160.0f, 67.58172f, 160.0f, 72.0f),
                    PathNode.LineTo(160.0f, 120.0f),
                    PathNode.LineTo(132.12f, 120.0f),
                    PathNode.LineTo(94.51f, 67.35f),
                    PathNode.CurveTo(92.48865f, 64.519936f, 88.870445f, 63.320007f, 85.558556f, 64.38136f),
                    PathNode.CurveTo(82.246666f, 65.44272f, 79.99988f, 68.5222f, 80.0f, 72.0f),
                    PathNode.LineTo(80.0f, 120.0f),
                    PathNode.LineTo(64.0f, 120.0f),
                    PathNode.CurveTo(59.581722f, 120.0f, 56.0f, 123.58172f, 56.0f, 128.0f),
                    PathNode.CurveTo(56.0f, 132.41827f, 59.581722f, 136.0f, 64.0f, 136.0f),
                    PathNode.LineTo(80.0f, 136.0f),
                    PathNode.LineTo(80.0f, 184.0f),
                    PathNode.CurveTo(80.0f, 188.41827f, 83.58172f, 192.0f, 88.0f, 192.0f),
                    PathNode.CurveTo(92.41828f, 192.0f, 96.0f, 188.41827f, 96.0f, 184.0f),
                    PathNode.LineTo(96.0f, 136.0f),
                    PathNode.LineTo(123.88f, 136.0f),
                    PathNode.LineTo(161.49f, 188.65f),
                    PathNode.CurveTo(162.99174f, 190.75237f, 165.41637f, 192.00006f, 168.0f, 192.0f),
                    PathNode.CurveTo(168.82822f, 192.00186f, 169.65158f, 191.87363f, 170.44f, 191.62f),
                    PathNode.CurveTo(173.75294f, 190.559f, 176.00052f, 187.4787f, 176.0f, 184.0f),
                    PathNode.LineTo(176.0f, 136.0f),
                    PathNode.LineTo(192.0f, 136.0f),
                    PathNode.CurveTo(196.41827f, 136.0f, 200.0f, 132.41827f, 200.0f, 128.0f),
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
        return _currencyNgn!!
    }

private var _currencyNgn: ImageVector? = null
