package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.TextSubscript: ImageVector
    get() {
        if (_textSubscript != null) return _textSubscript!!
        _textSubscript = phosphorDuotoneIcon(
            name = "TextSubscript",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(240.0f, 72.0f),
                    PathNode.LineTo(240.0f, 208.0f),
                    PathNode.LineTo(56.0f, 208.0f),
                    PathNode.CurveTo(47.163445f, 208.0f, 40.0f, 200.83656f, 40.0f, 192.0f),
                    PathNode.LineTo(40.0f, 56.0f),
                    PathNode.LineTo(224.0f, 56.0f),
                    PathNode.CurveTo(232.83656f, 56.0f, 240.0f, 63.163445f, 240.0f, 72.0f),
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
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(248.0f, 208.0f),
                    PathNode.CurveTo(248.0f, 212.41827f, 244.41827f, 216.0f, 240.0f, 216.0f),
                    PathNode.LineTo(192.0f, 216.0f),
                    PathNode.CurveTo(188.96982f, 216.0f, 186.19972f, 214.28798f, 184.84459f, 211.57771f),
                    PathNode.CurveTo(183.48944f, 208.86742f, 183.78189f, 205.62415f, 185.6f, 203.2f),
                    PathNode.LineTo(228.77f, 145.64f),
                    PathNode.CurveTo(232.54596f, 140.60791f, 233.02252f, 133.83005f, 229.98785f, 128.31909f),
                    PathNode.CurveTo(226.95319f, 122.80814f, 220.9706f, 119.58708f, 214.6993f, 120.08764f),
                    PathNode.CurveTo(208.428f, 120.588196f, 203.03209f, 124.71745f, 200.91f, 130.64f),
                    PathNode.CurveTo(199.4354f, 134.80699f, 194.86198f, 136.9896f, 190.695f, 135.515f),
                    PathNode.CurveTo(186.52802f, 134.0404f, 184.3454f, 129.467f, 185.82f, 125.3f),
                    PathNode.CurveTo(186.9177f, 122.21795f, 188.47897f, 119.32132f, 190.45f, 116.71f),
                    PathNode.CurveTo(201.087f, 102.59637f, 221.15137f, 99.778f, 235.265f, 110.415f),
                    PathNode.CurveTo(249.37863f, 121.052f, 252.197f, 141.11636f, 241.56f, 155.23f),
                    PathNode.LineTo(208.0f, 200.0f),
                    PathNode.LineTo(240.0f, 200.0f),
                    PathNode.CurveTo(244.41827f, 200.0f, 248.0f, 203.58173f, 248.0f, 208.0f),
                    PathNode.Close,
                    PathNode.MoveTo(149.24f, 50.0f),
                    PathNode.CurveTo(147.63588f, 48.60931f, 145.54472f, 47.913284f, 143.42714f, 48.065212f),
                    PathNode.CurveTo(141.30954f, 48.217136f, 139.33919f, 49.204556f, 137.95f, 50.81f),
                    PathNode.LineTo(92.0f, 103.78f),
                    PathNode.LineTo(46.05f, 50.78f),
                    PathNode.CurveTo(43.078037f, 47.826557f, 38.33075f, 47.666534f, 35.16664f, 50.413136f),
                    PathNode.CurveTo(32.002537f, 53.159737f, 31.49365f, 57.88238f, 34.0f, 61.24f),
                    PathNode.LineTo(81.41f, 116.0f),
                    PathNode.LineTo(34.0f, 170.76f),
                    PathNode.CurveTo(31.106028f, 174.10132f, 31.468678f, 179.15602f, 34.81f, 182.05f),
                    PathNode.CurveTo(38.15132f, 184.94397f, 43.206028f, 184.58133f, 46.1f, 181.24f),
                    PathNode.LineTo(92.1f, 128.24f),
                    PathNode.LineTo(138.05f, 181.24f),
                    PathNode.CurveTo(140.94397f, 184.58133f, 145.99867f, 184.94397f, 149.34f, 182.05f),
                    PathNode.CurveTo(152.68134f, 179.15602f, 153.04396f, 174.10132f, 150.15f, 170.76f),
                    PathNode.LineTo(102.59f, 116.0f),
                    PathNode.LineTo(150.05f, 61.24f),
                    PathNode.CurveTo(152.91241f, 57.906605f, 152.55078f, 52.88853f, 149.24f, 50.0f),
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
        return _textSubscript!!
    }

private var _textSubscript: ImageVector? = null
