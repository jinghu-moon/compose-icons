package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.BugDroid: ImageVector
    get() {
        if (_bugDroid != null) return _bugDroid!!
        _bugDroid = phosphorLightIcon(
            name = "BugDroid",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(189.0f, 51.47f),
                    PathNode.LineTo(204.22f, 36.24f),
                    PathNode.CurveTo(205.82523f, 34.744236f, 206.486f, 32.491554f, 205.94308f, 30.365688f),
                    PathNode.CurveTo(205.40018f, 28.239822f, 203.74017f, 26.579824f, 201.61432f, 26.036915f),
                    PathNode.CurveTo(199.48845f, 25.494007f, 197.23576f, 26.154774f, 195.74f, 27.76f),
                    PathNode.LineTo(180.0f, 43.54f),
                    PathNode.CurveTo(149.28812f, 20.122147f, 106.71189f, 20.122147f, 76.0f, 43.54f),
                    PathNode.LineTo(60.24f, 27.76f),
                    PathNode.CurveTo(57.875923f, 25.557129f, 54.19192f, 25.62213f, 51.907024f, 27.907026f),
                    PathNode.CurveTo(49.622128f, 30.191923f, 49.55713f, 33.875923f, 51.76f, 36.24f),
                    PathNode.LineTo(67.0f, 51.47f),
                    PathNode.CurveTo(50.982056f, 67.54144f, 41.991512f, 89.30935f, 42.0f, 112.0f),
                    PathNode.LineTo(42.0f, 152.0f),
                    PathNode.CurveTo(42.0f, 199.49649f, 80.50351f, 238.0f, 128.0f, 238.0f),
                    PathNode.CurveTo(175.49649f, 238.0f, 214.0f, 199.49649f, 214.0f, 152.0f),
                    PathNode.LineTo(214.0f, 112.0f),
                    PathNode.CurveTo(214.00848f, 89.30935f, 205.01796f, 67.54144f, 189.0f, 51.47f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 38.0f),
                    PathNode.CurveTo(168.84851f, 38.04959f, 201.95041f, 71.15149f, 202.0f, 112.0f),
                    PathNode.LineTo(202.0f, 122.0f),
                    PathNode.LineTo(54.0f, 122.0f),
                    PathNode.LineTo(54.0f, 112.0f),
                    PathNode.CurveTo(54.04959f, 71.15149f, 87.15149f, 38.04959f, 128.0f, 38.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 226.0f),
                    PathNode.CurveTo(87.15149f, 225.95041f, 54.04959f, 192.84851f, 54.0f, 152.0f),
                    PathNode.LineTo(54.0f, 134.0f),
                    PathNode.LineTo(202.0f, 134.0f),
                    PathNode.LineTo(202.0f, 152.0f),
                    PathNode.CurveTo(201.95041f, 192.84851f, 168.84851f, 225.95041f, 128.0f, 226.0f),
                    PathNode.Close,
                    PathNode.MoveTo(146.0f, 92.0f),
                    PathNode.CurveTo(146.0f, 86.47715f, 150.47716f, 82.0f, 156.0f, 82.0f),
                    PathNode.CurveTo(161.52284f, 82.0f, 166.0f, 86.47715f, 166.0f, 92.0f),
                    PathNode.CurveTo(166.0f, 97.52285f, 161.52284f, 102.0f, 156.0f, 102.0f),
                    PathNode.CurveTo(150.47716f, 102.0f, 146.0f, 97.52285f, 146.0f, 92.0f),
                    PathNode.Close,
                    PathNode.MoveTo(90.0f, 92.0f),
                    PathNode.CurveTo(90.0f, 86.47715f, 94.47715f, 82.0f, 100.0f, 82.0f),
                    PathNode.CurveTo(105.52285f, 82.0f, 110.0f, 86.47715f, 110.0f, 92.0f),
                    PathNode.CurveTo(110.0f, 97.52285f, 105.52285f, 102.0f, 100.0f, 102.0f),
                    PathNode.CurveTo(94.47715f, 102.0f, 90.0f, 97.52285f, 90.0f, 92.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 12.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _bugDroid!!
    }

private var _bugDroid: ImageVector? = null
