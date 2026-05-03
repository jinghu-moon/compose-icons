package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.BehanceLogo: ImageVector
    get() {
        if (_behanceLogo != null) return _behanceLogo!!
        _behanceLogo = phosphorRegularIcon(
            name = "BehanceLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(160.0f, 80.0f),
                    PathNode.CurveTo(160.0f, 75.58172f, 163.58173f, 72.0f, 168.0f, 72.0f),
                    PathNode.LineTo(232.0f, 72.0f),
                    PathNode.CurveTo(236.41827f, 72.0f, 240.0f, 75.58172f, 240.0f, 80.0f),
                    PathNode.CurveTo(240.0f, 84.41828f, 236.41827f, 88.0f, 232.0f, 88.0f),
                    PathNode.LineTo(168.0f, 88.0f),
                    PathNode.CurveTo(163.58173f, 88.0f, 160.0f, 84.41828f, 160.0f, 80.0f),
                    PathNode.Close,
                    PathNode.MoveTo(136.0f, 158.0f),
                    PathNode.CurveTo(136.0f, 181.19595f, 117.19596f, 200.0f, 94.0f, 200.0f),
                    PathNode.LineTo(32.0f, 200.0f),
                    PathNode.CurveTo(27.581722f, 200.0f, 24.0f, 196.41827f, 24.0f, 192.0f),
                    PathNode.LineTo(24.0f, 64.0f),
                    PathNode.CurveTo(24.0f, 59.581722f, 27.581722f, 56.0f, 32.0f, 56.0f),
                    PathNode.LineTo(90.0f, 56.0f),
                    PathNode.CurveTo(105.65999f, 56.016666f, 119.706055f, 65.63836f, 125.37875f, 80.23479f),
                    PathNode.CurveTo(131.05147f, 94.83122f, 127.18895f, 111.41284f, 115.65f, 122.0f),
                    PathNode.CurveTo(128.28033f, 129.59785f, 136.00352f, 143.26051f, 136.0f, 158.0f),
                    PathNode.Close,
                    PathNode.MoveTo(40.0f, 116.0f),
                    PathNode.LineTo(90.0f, 116.0f),
                    PathNode.CurveTo(102.15026f, 116.0f, 112.0f, 106.15026f, 112.0f, 94.0f),
                    PathNode.CurveTo(112.0f, 81.84974f, 102.15026f, 72.0f, 90.0f, 72.0f),
                    PathNode.LineTo(40.0f, 72.0f),
                    PathNode.Close,
                    PathNode.MoveTo(120.0f, 158.0f),
                    PathNode.CurveTo(120.0f, 143.6406f, 108.359406f, 132.0f, 94.0f, 132.0f),
                    PathNode.LineTo(40.0f, 132.0f),
                    PathNode.LineTo(40.0f, 184.0f),
                    PathNode.LineTo(94.0f, 184.0f),
                    PathNode.CurveTo(108.359406f, 184.0f, 120.0f, 172.3594f, 120.0f, 158.0f),
                    PathNode.Close,
                    PathNode.MoveTo(248.0f, 152.0f),
                    PathNode.CurveTo(248.0f, 156.41827f, 244.41827f, 160.0f, 240.0f, 160.0f),
                    PathNode.LineTo(169.0f, 160.0f),
                    PathNode.CurveTo(172.07335f, 171.91269f, 181.70403f, 181.00862f, 193.77267f, 183.39719f),
                    PathNode.CurveTo(205.84132f, 185.78575f, 218.2107f, 181.04395f, 225.59f, 171.2f),
                    PathNode.CurveTo(228.24373f, 167.66537f, 233.26036f, 166.95128f, 236.795f, 169.605f),
                    PathNode.CurveTo(240.32962f, 172.25874f, 241.04373f, 177.27538f, 238.39f, 180.81f),
                    PathNode.CurveTo(224.2591f, 199.63759f, 198.55983f, 205.43904f, 177.71107f, 194.50789f),
                    PathNode.CurveTo(156.86232f, 183.57675f, 147.01752f, 159.1393f, 154.46637f, 136.80826f),
                    PathNode.CurveTo(161.9152f, 114.47722f, 184.4592f, 100.84353f, 207.69533f, 104.61754f),
                    PathNode.CurveTo(230.93144f, 108.391556f, 248.00163f, 128.45938f, 248.0f, 152.0f),
                    PathNode.Close,
                    PathNode.MoveTo(231.0f, 144.0f),
                    PathNode.CurveTo(227.37465f, 129.84068f, 214.61607f, 119.937256f, 200.0f, 119.937256f),
                    PathNode.CurveTo(185.38393f, 119.937256f, 172.62535f, 129.84068f, 169.0f, 144.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _behanceLogo!!
    }

private var _behanceLogo: ImageVector? = null
