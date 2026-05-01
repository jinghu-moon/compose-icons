package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.CurrencyEur: ImageVector
    get() {
        if (_currencyEur != null) return _currencyEur!!
        _currencyEur = phosphorFillIcon(
            name = "CurrencyEur",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(128.0f, 24.0f),
                    PathNode.CurveTo(70.562386f, 24.0f, 24.0f, 70.562386f, 24.0f, 128.0f),
                    PathNode.CurveTo(24.0f, 185.4376f, 70.562386f, 232.0f, 128.0f, 232.0f),
                    PathNode.CurveTo(185.4376f, 232.0f, 232.0f, 185.4376f, 232.0f, 128.0f),
                    PathNode.CurveTo(231.93938f, 70.58752f, 185.41248f, 24.060629f, 128.0f, 24.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 104.0f),
                    PathNode.CurveTo(132.41827f, 104.0f, 136.0f, 107.58172f, 136.0f, 112.0f),
                    PathNode.CurveTo(136.0f, 116.41828f, 132.41827f, 120.0f, 128.0f, 120.0f),
                    PathNode.LineTo(88.0f, 120.0f),
                    PathNode.LineTo(88.0f, 136.0f),
                    PathNode.LineTo(112.0f, 136.0f),
                    PathNode.CurveTo(116.41828f, 136.0f, 120.0f, 139.58173f, 120.0f, 144.0f),
                    PathNode.CurveTo(120.0f, 148.41827f, 116.41828f, 152.0f, 112.0f, 152.0f),
                    PathNode.LineTo(88.81f, 152.0f),
                    PathNode.CurveTo(91.67303f, 166.03688f, 101.82419f, 177.47089f, 115.42316f, 181.97633f),
                    PathNode.CurveTo(129.02211f, 186.4818f, 143.9922f, 183.37068f, 154.67f, 173.82f),
                    PathNode.CurveTo(156.782f, 171.80212f, 159.8259f, 171.09573f, 162.61073f, 171.97723f),
                    PathNode.CurveTo(165.39557f, 172.85873f, 167.47859f, 175.18797f, 168.04478f, 178.05359f),
                    PathNode.CurveTo(168.61098f, 180.9192f, 167.57031f, 183.86562f, 165.33f, 185.74f),
                    PathNode.CurveTo(149.94841f, 199.49245f, 128.25056f, 203.67262f, 108.86062f, 196.61908f),
                    PathNode.CurveTo(89.47067f, 189.56552f, 75.530174f, 172.42105f, 72.58f, 152.0f),
                    PathNode.LineTo(64.0f, 152.0f),
                    PathNode.CurveTo(59.581722f, 152.0f, 56.0f, 148.41827f, 56.0f, 144.0f),
                    PathNode.CurveTo(56.0f, 139.58173f, 59.581722f, 136.0f, 64.0f, 136.0f),
                    PathNode.LineTo(72.0f, 136.0f),
                    PathNode.LineTo(72.0f, 120.0f),
                    PathNode.LineTo(64.0f, 120.0f),
                    PathNode.CurveTo(59.581722f, 120.0f, 56.0f, 116.41828f, 56.0f, 112.0f),
                    PathNode.CurveTo(56.0f, 107.58172f, 59.581722f, 104.0f, 64.0f, 104.0f),
                    PathNode.LineTo(72.58f, 104.0f),
                    PathNode.CurveTo(75.530174f, 83.57895f, 89.47067f, 66.43448f, 108.86062f, 59.380928f),
                    PathNode.CurveTo(128.25056f, 52.327374f, 149.94841f, 56.50756f, 165.33f, 70.26f),
                    PathNode.CurveTo(167.57031f, 72.13438f, 168.61098f, 75.080795f, 168.04478f, 77.94641f),
                    PathNode.CurveTo(167.47859f, 80.812035f, 165.39557f, 83.141266f, 162.61073f, 84.022766f),
                    PathNode.CurveTo(159.8259f, 84.90427f, 156.782f, 84.19788f, 154.67f, 82.18f),
                    PathNode.CurveTo(143.9922f, 72.62932f, 129.02211f, 69.51821f, 115.42316f, 74.02367f),
                    PathNode.CurveTo(101.82419f, 78.52912f, 91.67303f, 89.96313f, 88.81f, 104.0f),
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
        return _currencyEur!!
    }

private var _currencyEur: ImageVector? = null
