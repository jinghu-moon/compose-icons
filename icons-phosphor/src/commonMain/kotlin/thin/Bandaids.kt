package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Bandaids: ImageVector
    get() {
        if (_bandaids != null) return _bandaids!!
        _bandaids = phosphorThinIcon(
            name = "Bandaids",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(178.91f, 128.0f),
                    PathNode.LineTo(209.46f, 97.46f),
                    PathNode.CurveTo(223.52116f, 83.39883f, 223.52116f, 60.60117f, 209.46f, 46.54f),
                    PathNode.CurveTo(195.39883f, 32.478832f, 172.60117f, 32.478832f, 158.54f, 46.54f),
                    PathNode.LineTo(128.0f, 77.09f),
                    PathNode.LineTo(97.46f, 46.54f),
                    PathNode.CurveTo(83.39883f, 32.478832f, 60.60117f, 32.478832f, 46.54f, 46.54f),
                    PathNode.CurveTo(32.478832f, 60.60117f, 32.478832f, 83.39883f, 46.54f, 97.46f),
                    PathNode.LineTo(77.09f, 128.0f),
                    PathNode.LineTo(46.54f, 158.54f),
                    PathNode.CurveTo(32.478832f, 172.60117f, 32.478832f, 195.39883f, 46.54f, 209.46f),
                    PathNode.CurveTo(60.60117f, 223.52116f, 83.39883f, 223.52116f, 97.46f, 209.46f),
                    PathNode.LineTo(128.0f, 178.91f),
                    PathNode.LineTo(158.54f, 209.46f),
                    PathNode.CurveTo(172.60117f, 223.52116f, 195.39883f, 223.52116f, 209.46f, 209.46f),
                    PathNode.CurveTo(223.52116f, 195.39883f, 223.52116f, 172.60117f, 209.46f, 158.54f),
                    PathNode.Close,
                    PathNode.MoveTo(164.2f, 52.2f),
                    PathNode.CurveTo(175.13524f, 41.264763f, 192.86476f, 41.264763f, 203.8f, 52.2f),
                    PathNode.CurveTo(214.73524f, 63.13524f, 214.73524f, 80.86476f, 203.8f, 91.8f),
                    PathNode.LineTo(173.25f, 122.34f),
                    PathNode.LineTo(133.66f, 82.75f),
                    PathNode.Close,
                    PathNode.MoveTo(167.6f, 128.0f),
                    PathNode.LineTo(128.0f, 167.6f),
                    PathNode.LineTo(88.4f, 128.0f),
                    PathNode.LineTo(128.0f, 88.4f),
                    PathNode.Close,
                    PathNode.MoveTo(52.2f, 91.8f),
                    PathNode.CurveTo(41.264763f, 80.86476f, 41.264763f, 63.13524f, 52.2f, 52.2f),
                    PathNode.CurveTo(63.13524f, 41.264763f, 80.86476f, 41.264763f, 91.8f, 52.2f),
                    PathNode.LineTo(122.34f, 82.75f),
                    PathNode.LineTo(82.75f, 122.34f),
                    PathNode.Close,
                    PathNode.MoveTo(91.8f, 203.8f),
                    PathNode.CurveTo(80.86476f, 214.73524f, 63.13524f, 214.73524f, 52.2f, 203.8f),
                    PathNode.CurveTo(41.264763f, 192.86476f, 41.264763f, 175.13524f, 52.2f, 164.2f),
                    PathNode.LineTo(82.75f, 133.66f),
                    PathNode.LineTo(122.34f, 173.25f),
                    PathNode.Close,
                    PathNode.MoveTo(203.8f, 203.8f),
                    PathNode.CurveTo(198.5489f, 209.05164f, 191.42656f, 212.00201f, 184.0f, 212.00201f),
                    PathNode.CurveTo(176.57344f, 212.00201f, 169.4511f, 209.05164f, 164.2f, 203.8f),
                    PathNode.LineTo(133.66f, 173.25f),
                    PathNode.LineTo(173.25f, 133.66f),
                    PathNode.LineTo(203.8f, 164.2f),
                    PathNode.CurveTo(209.05164f, 169.4511f, 212.00201f, 176.57344f, 212.00201f, 184.0f),
                    PathNode.CurveTo(212.00201f, 191.42656f, 209.05164f, 198.5489f, 203.8f, 203.8f),
                    PathNode.Close,
                    PathNode.MoveTo(120.0f, 128.0f),
                    PathNode.CurveTo(120.0f, 123.58172f, 123.58172f, 120.0f, 128.0f, 120.0f),
                    PathNode.CurveTo(132.41827f, 120.0f, 136.0f, 123.58172f, 136.0f, 128.0f),
                    PathNode.CurveTo(136.0f, 132.41827f, 132.41827f, 136.0f, 128.0f, 136.0f),
                    PathNode.CurveTo(123.58172f, 136.0f, 120.0f, 132.41827f, 120.0f, 128.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 8.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _bandaids!!
    }

private var _bandaids: ImageVector? = null
