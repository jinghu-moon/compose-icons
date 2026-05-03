package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Power: ImageVector
    get() {
        if (_power != null) return _power!!
        _power = phosphorFillIcon(
            name = "Power",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(128.0f, 24.0f),
                    PathNode.CurveTo(70.562386f, 24.0f, 24.0f, 70.562386f, 24.0f, 128.0f),
                    PathNode.CurveTo(24.0f, 185.4376f, 70.562386f, 232.0f, 128.0f, 232.0f),
                    PathNode.CurveTo(185.4376f, 232.0f, 232.0f, 185.4376f, 232.0f, 128.0f),
                    PathNode.CurveTo(232.0f, 70.562386f, 185.4376f, 24.0f, 128.0f, 24.0f),
                    PathNode.Close,
                    PathNode.MoveTo(120.0f, 64.0f),
                    PathNode.CurveTo(120.0f, 59.581722f, 123.58172f, 56.0f, 128.0f, 56.0f),
                    PathNode.CurveTo(132.41827f, 56.0f, 136.0f, 59.581722f, 136.0f, 64.0f),
                    PathNode.LineTo(136.0f, 128.0f),
                    PathNode.CurveTo(136.0f, 132.41827f, 132.41827f, 136.0f, 128.0f, 136.0f),
                    PathNode.CurveTo(123.58172f, 136.0f, 120.0f, 132.41827f, 120.0f, 128.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 208.0f),
                    PathNode.CurveTo(92.7598f, 208.00354f, 61.66774f, 184.94705f, 51.437283f, 151.22452f),
                    PathNode.CurveTo(41.206825f, 117.50198f, 54.247776f, 81.0568f, 83.55f, 61.48f),
                    PathNode.CurveTo(85.923195f, 59.801674f, 89.02f, 59.542618f, 91.63905f, 60.803337f),
                    PathNode.CurveTo(94.2581f, 62.064053f, 95.987274f, 64.64615f, 96.15576f, 67.54796f),
                    PathNode.CurveTo(96.32425f, 70.44976f, 94.90554f, 73.21464f, 92.45f, 74.77f),
                    PathNode.CurveTo(69.0075f, 90.42965f, 58.572693f, 119.58453f, 66.754684f, 146.56288f),
                    PathNode.CurveTo(74.93668f, 173.54121f, 99.80823f, 191.98839f, 128.0f, 191.98839f),
                    PathNode.CurveTo(156.19177f, 191.98839f, 181.06332f, 173.54121f, 189.24532f, 146.56288f),
                    PathNode.CurveTo(197.4273f, 119.58453f, 186.99251f, 90.42965f, 163.55f, 74.77f),
                    PathNode.CurveTo(161.09445f, 73.21464f, 159.67575f, 70.44976f, 159.84424f, 67.54796f),
                    PathNode.CurveTo(160.01273f, 64.64615f, 161.7419f, 62.064053f, 164.36095f, 60.803337f),
                    PathNode.CurveTo(166.98001f, 59.542618f, 170.0768f, 59.801674f, 172.45f, 61.48f),
                    PathNode.CurveTo(201.75223f, 81.0568f, 214.79318f, 117.50198f, 204.56271f, 151.22452f),
                    PathNode.CurveTo(194.33226f, 184.94705f, 163.2402f, 208.00354f, 128.0f, 208.0f),
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
        return _power!!
    }

private var _power: ImageVector? = null
