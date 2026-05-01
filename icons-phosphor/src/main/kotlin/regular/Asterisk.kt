package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Asterisk: ImageVector
    get() {
        if (_asterisk != null) return _asterisk!!
        _asterisk = phosphorRegularIcon(
            name = "Asterisk",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(214.86f, 180.12f),
                    PathNode.CurveTo(213.76761f, 181.94531f, 211.99323f, 183.2604f, 209.92906f, 183.77457f),
                    PathNode.CurveTo(207.86491f, 184.28873f, 205.68097f, 183.95963f, 203.86f, 182.86f),
                    PathNode.LineTo(136.0f, 142.13f),
                    PathNode.LineTo(136.0f, 216.0f),
                    PathNode.CurveTo(136.0f, 220.41827f, 132.41827f, 224.0f, 128.0f, 224.0f),
                    PathNode.CurveTo(123.58172f, 224.0f, 120.0f, 220.41827f, 120.0f, 216.0f),
                    PathNode.LineTo(120.0f, 142.13f),
                    PathNode.LineTo(52.12f, 182.86f),
                    PathNode.CurveTo(49.667526f, 184.36667f, 46.594727f, 184.43973f, 44.073418f, 183.05133f),
                    PathNode.CurveTo(41.55211f, 181.66292f, 39.971004f, 179.0271f, 39.933056f, 176.14903f),
                    PathNode.CurveTo(39.89511f, 173.27098f, 41.406174f, 170.59439f, 43.89f, 169.14f),
                    PathNode.LineTo(112.45f, 128.0f),
                    PathNode.LineTo(43.89f, 86.86f),
                    PathNode.CurveTo(41.406174f, 85.4056f, 39.89511f, 82.72902f, 39.933056f, 79.85096f),
                    PathNode.CurveTo(39.971004f, 76.9729f, 41.55211f, 74.33708f, 44.073418f, 72.94868f),
                    PathNode.CurveTo(46.594727f, 71.56027f, 49.667526f, 71.63333f, 52.12f, 73.14f),
                    PathNode.LineTo(120.0f, 113.87f),
                    PathNode.LineTo(120.0f, 40.0f),
                    PathNode.CurveTo(120.0f, 35.581722f, 123.58172f, 32.0f, 128.0f, 32.0f),
                    PathNode.CurveTo(132.41827f, 32.0f, 136.0f, 35.581722f, 136.0f, 40.0f),
                    PathNode.LineTo(136.0f, 113.87f),
                    PathNode.LineTo(203.88f, 73.14f),
                    PathNode.CurveTo(206.33247f, 71.63333f, 209.40527f, 71.56027f, 211.92657f, 72.94868f),
                    PathNode.CurveTo(214.44789f, 74.33708f, 216.02899f, 76.9729f, 216.06694f, 79.85096f),
                    PathNode.CurveTo(216.10489f, 82.72902f, 214.59383f, 85.4056f, 212.11f, 86.86f),
                    PathNode.LineTo(143.55f, 128.0f),
                    PathNode.LineTo(212.11f, 169.14f),
                    PathNode.CurveTo(213.9315f, 170.23065f, 215.24478f, 172.00061f, 215.76057f, 174.06007f),
                    PathNode.CurveTo(216.27638f, 176.11952f, 215.9524f, 178.29955f, 214.86f, 180.12f),
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
        return _asterisk!!
    }

private var _asterisk: ImageVector? = null
