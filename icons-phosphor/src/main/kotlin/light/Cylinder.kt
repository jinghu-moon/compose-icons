package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Cylinder: ImageVector
    get() {
        if (_cylinder != null) return _cylinder!!
        _cylinder = phosphorLightIcon(
            name = "Cylinder",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(128.0f, 18.0f),
                    PathNode.CurveTo(88.75f, 18.0f, 58.0f, 36.45f, 58.0f, 60.0f),
                    PathNode.LineTo(58.0f, 196.0f),
                    PathNode.CurveTo(58.0f, 219.55f, 88.75f, 238.0f, 128.0f, 238.0f),
                    PathNode.CurveTo(167.25f, 238.0f, 198.0f, 219.55f, 198.0f, 196.0f),
                    PathNode.LineTo(198.0f, 60.0f),
                    PathNode.CurveTo(198.0f, 36.45f, 167.25f, 18.0f, 128.0f, 18.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 30.0f),
                    PathNode.CurveTo(159.44f, 30.0f, 186.0f, 43.74f, 186.0f, 60.0f),
                    PathNode.CurveTo(186.0f, 76.26f, 159.44f, 90.0f, 128.0f, 90.0f),
                    PathNode.CurveTo(96.56f, 90.0f, 70.0f, 76.26f, 70.0f, 60.0f),
                    PathNode.CurveTo(70.0f, 43.74f, 96.56f, 30.0f, 128.0f, 30.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 226.0f),
                    PathNode.CurveTo(96.56f, 226.0f, 70.0f, 212.26f, 70.0f, 196.0f),
                    PathNode.LineTo(70.0f, 83.81f),
                    PathNode.CurveTo(82.48f, 94.87f, 103.59f, 102.0f, 128.0f, 102.0f),
                    PathNode.CurveTo(152.41f, 102.0f, 173.52f, 94.87f, 186.0f, 83.81f),
                    PathNode.LineTo(186.0f, 196.0f),
                    PathNode.CurveTo(186.0f, 212.26f, 159.44f, 226.0f, 128.0f, 226.0f),
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
        return _cylinder!!
    }

private var _cylinder: ImageVector? = null
