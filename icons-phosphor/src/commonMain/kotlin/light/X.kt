package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.X: ImageVector
    get() {
        if (_x != null) return _x!!
        _x = phosphorLightIcon(
            name = "X",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(204.24f, 195.76f),
                    PathNode.CurveTo(205.84523f, 197.25575f, 206.506f, 199.50844f, 205.96309f, 201.63431f),
                    PathNode.CurveTo(205.42018f, 203.76018f, 203.76018f, 205.42018f, 201.63431f, 205.96309f),
                    PathNode.CurveTo(199.50844f, 206.506f, 197.25575f, 205.84523f, 195.76f, 204.24f),
                    PathNode.LineTo(128.0f, 136.49f),
                    PathNode.LineTo(60.24f, 204.24f),
                    PathNode.CurveTo(57.875923f, 206.44287f, 54.19192f, 206.37787f, 51.907024f, 204.09297f),
                    PathNode.CurveTo(49.622128f, 201.80807f, 49.55713f, 198.12408f, 51.76f, 195.76f),
                    PathNode.LineTo(119.51f, 128.0f),
                    PathNode.LineTo(51.76f, 60.24f),
                    PathNode.CurveTo(49.55713f, 57.875923f, 49.622128f, 54.19192f, 51.907024f, 51.907024f),
                    PathNode.CurveTo(54.19192f, 49.622128f, 57.875923f, 49.55713f, 60.24f, 51.76f),
                    PathNode.LineTo(128.0f, 119.51f),
                    PathNode.LineTo(195.76f, 51.76f),
                    PathNode.CurveTo(198.12408f, 49.55713f, 201.80807f, 49.622128f, 204.09297f, 51.907024f),
                    PathNode.CurveTo(206.37787f, 54.19192f, 206.44287f, 57.875923f, 204.24f, 60.24f),
                    PathNode.LineTo(136.49f, 128.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 12.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _x!!
    }

private var _x: ImageVector? = null
