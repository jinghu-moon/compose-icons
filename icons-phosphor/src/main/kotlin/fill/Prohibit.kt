package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Prohibit: ImageVector
    get() {
        if (_prohibit != null) return _prohibit!!
        _prohibit = phosphorFillIcon(
            name = "Prohibit",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(200.0f, 128.0f),
                    PathNode.CurveTo(200.00858f, 144.33034f, 194.44154f, 160.17421f, 184.22f, 172.91f),
                    PathNode.LineTo(83.09f, 71.78f),
                    PathNode.CurveTo(104.692184f, 54.48992f, 134.29543f, 51.119366f, 159.23152f, 63.110706f),
                    PathNode.CurveTo(184.16763f, 75.10204f, 200.0181f, 100.330505f, 200.0f, 128.0f),
                    PathNode.Close,
                    PathNode.MoveTo(56.0f, 128.0f),
                    PathNode.CurveTo(55.981903f, 155.6695f, 71.832375f, 180.89795f, 96.76847f, 192.8893f),
                    PathNode.CurveTo(121.70457f, 204.88063f, 151.30782f, 201.51007f, 172.91f, 184.22f),
                    PathNode.LineTo(71.78f, 83.09f),
                    PathNode.CurveTo(61.55848f, 95.82579f, 55.99143f, 111.66966f, 56.0f, 128.0f),
                    PathNode.Close,
                    PathNode.MoveTo(236.0f, 128.0f),
                    PathNode.CurveTo(236.0f, 187.64676f, 187.64676f, 236.0f, 128.0f, 236.0f),
                    PathNode.CurveTo(68.35325f, 236.0f, 20.0f, 187.64676f, 20.0f, 128.0f),
                    PathNode.CurveTo(20.0f, 68.35325f, 68.35325f, 20.0f, 128.0f, 20.0f),
                    PathNode.CurveTo(187.61934f, 20.066133f, 235.93387f, 68.38066f, 236.0f, 128.0f),
                    PathNode.Close,
                    PathNode.MoveTo(216.0f, 128.0f),
                    PathNode.CurveTo(216.0f, 79.39894f, 176.60106f, 40.0f, 128.0f, 40.0f),
                    PathNode.CurveTo(79.39894f, 40.0f, 40.0f, 79.39894f, 40.0f, 128.0f),
                    PathNode.CurveTo(40.0f, 176.60106f, 79.39894f, 216.0f, 128.0f, 216.0f),
                    PathNode.CurveTo(176.57822f, 215.94489f, 215.94489f, 176.57822f, 216.0f, 128.0f),
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
        return _prohibit!!
    }

private var _prohibit: ImageVector? = null
