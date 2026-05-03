package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.AsteriskSimple: ImageVector
    get() {
        if (_asteriskSimple != null) return _asteriskSimple!!
        _asteriskSimple = phosphorBoldIcon(
            name = "AsteriskSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(212.45f, 107.14f),
                    PathNode.LineTo(147.26f, 133.22f),
                    PathNode.LineTo(193.47f, 192.63f),
                    PathNode.CurveTo(196.12317f, 196.01181f, 196.76491f, 200.5544f, 195.15237f, 204.53882f),
                    PathNode.CurveTo(193.53984f, 208.52324f, 189.91936f, 211.34088f, 185.66093f, 211.9255f),
                    PathNode.CurveTo(181.40253f, 212.51013f, 177.15665f, 210.77245f, 174.53f, 207.37f),
                    PathNode.LineTo(128.0f, 147.55f),
                    PathNode.LineTo(81.47f, 207.37f),
                    PathNode.CurveTo(77.39052f, 212.56982f, 69.87448f, 213.49219f, 64.65875f, 209.43306f),
                    PathNode.CurveTo(59.443024f, 205.37393f, 58.491295f, 197.86156f, 62.53f, 192.63f),
                    PathNode.LineTo(108.74f, 133.22f),
                    PathNode.LineTo(43.55f, 107.14f),
                    PathNode.CurveTo(39.48789f, 105.60556f, 36.571625f, 101.99635f, 35.924496f, 97.702576f),
                    PathNode.CurveTo(35.277367f, 93.408806f, 37.00034f, 89.1004f, 40.42976f, 86.43689f),
                    PathNode.CurveTo(43.85918f, 83.77337f, 48.459972f, 83.17031f, 52.46f, 84.86f),
                    PathNode.LineTo(116.0f, 110.28f),
                    PathNode.LineTo(116.0f, 40.0f),
                    PathNode.CurveTo(116.0f, 33.37258f, 121.37258f, 28.0f, 128.0f, 28.0f),
                    PathNode.CurveTo(134.62741f, 28.0f, 140.0f, 33.37258f, 140.0f, 40.0f),
                    PathNode.LineTo(140.0f, 110.28f),
                    PathNode.LineTo(203.54f, 84.86f),
                    PathNode.CurveTo(207.54001f, 83.17031f, 212.14082f, 83.77337f, 215.57024f, 86.43689f),
                    PathNode.CurveTo(218.99966f, 89.1004f, 220.72264f, 93.408806f, 220.0755f, 97.702576f),
                    PathNode.CurveTo(219.42838f, 101.99635f, 216.51212f, 105.60556f, 212.45f, 107.14f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 24.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _asteriskSimple!!
    }

private var _asteriskSimple: ImageVector? = null
