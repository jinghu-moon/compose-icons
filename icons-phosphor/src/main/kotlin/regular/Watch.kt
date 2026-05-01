package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Watch: ImageVector
    get() {
        if (_watch != null) return _watch!!
        _watch = phosphorRegularIcon(
            name = "Watch",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(208.0f, 128.0f),
                    PathNode.CurveTo(207.99406f, 102.52752f, 195.84897f, 78.58279f, 175.3f, 63.53f),
                    PathNode.LineTo(169.06f, 29.15f),
                    PathNode.CurveTo(167.68208f, 21.538025f, 161.05568f, 16.001995f, 153.32f, 16.0f),
                    PathNode.LineTo(102.68f, 16.0f),
                    PathNode.CurveTo(94.94431f, 16.001995f, 88.31792f, 21.538025f, 86.94f, 29.15f),
                    PathNode.LineTo(80.7f, 63.53f),
                    PathNode.CurveTo(60.145103f, 78.57801f, 47.997765f, 102.52557f, 47.997765f, 128.0f),
                    PathNode.CurveTo(47.997765f, 153.47443f, 60.145103f, 177.42198f, 80.7f, 192.47f),
                    PathNode.LineTo(86.94f, 226.85f),
                    PathNode.CurveTo(88.31792f, 234.46198f, 94.94431f, 239.998f, 102.68f, 240.0f),
                    PathNode.LineTo(153.32f, 240.0f),
                    PathNode.CurveTo(161.05568f, 239.998f, 167.68208f, 234.46198f, 169.06f, 226.85f),
                    PathNode.LineTo(175.3f, 192.47f),
                    PathNode.CurveTo(195.84897f, 177.4172f, 207.99406f, 153.47249f, 208.0f, 128.0f),
                    PathNode.Close,
                    PathNode.MoveTo(102.68f, 32.0f),
                    PathNode.LineTo(153.32f, 32.0f),
                    PathNode.LineTo(157.23f, 53.55f),
                    PathNode.CurveTo(138.44583f, 46.150265f, 117.554184f, 46.150265f, 98.77f, 53.55f),
                    PathNode.Close,
                    PathNode.MoveTo(64.0f, 128.0f),
                    PathNode.CurveTo(64.0f, 92.65378f, 92.65378f, 64.0f, 128.0f, 64.0f),
                    PathNode.CurveTo(163.34622f, 64.0f, 192.0f, 92.65378f, 192.0f, 128.0f),
                    PathNode.CurveTo(192.0f, 163.34622f, 163.34622f, 192.0f, 128.0f, 192.0f),
                    PathNode.CurveTo(92.66977f, 191.96143f, 64.03858f, 163.33023f, 64.0f, 128.0f),
                    PathNode.Close,
                    PathNode.MoveTo(153.32f, 224.0f),
                    PathNode.LineTo(102.68f, 224.0f),
                    PathNode.LineTo(98.77f, 202.45f),
                    PathNode.CurveTo(117.554184f, 209.84973f, 138.44583f, 209.84973f, 157.23f, 202.45f),
                    PathNode.Close,
                    PathNode.MoveTo(120.0f, 128.0f),
                    PathNode.LineTo(120.0f, 88.0f),
                    PathNode.CurveTo(120.0f, 83.58172f, 123.58172f, 80.0f, 128.0f, 80.0f),
                    PathNode.CurveTo(132.41827f, 80.0f, 136.0f, 83.58172f, 136.0f, 88.0f),
                    PathNode.LineTo(136.0f, 120.0f),
                    PathNode.LineTo(168.0f, 120.0f),
                    PathNode.CurveTo(172.41827f, 120.0f, 176.0f, 123.58172f, 176.0f, 128.0f),
                    PathNode.CurveTo(176.0f, 132.41827f, 172.41827f, 136.0f, 168.0f, 136.0f),
                    PathNode.LineTo(128.0f, 136.0f),
                    PathNode.CurveTo(123.58172f, 136.0f, 120.0f, 132.41827f, 120.0f, 128.0f),
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
        return _watch!!
    }

private var _watch: ImageVector? = null
