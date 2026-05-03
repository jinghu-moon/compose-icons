package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Cube: ImageVector
    get() {
        if (_cube != null) return _cube!!
        _cube = phosphorFillIcon(
            name = "Cube",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(223.68f, 66.15f),
                    PathNode.LineTo(135.68f, 18.0f),
                    PathNode.CurveTo(130.90053f, 15.359137f, 125.099464f, 15.359137f, 120.32f, 18.0f),
                    PathNode.LineTo(32.32f, 66.17f),
                    PathNode.CurveTo(27.201473f, 68.9706f, 24.013245f, 74.3354f, 24.0f, 80.17f),
                    PathNode.LineTo(24.0f, 175.81f),
                    PathNode.CurveTo(24.013245f, 181.64459f, 27.201473f, 187.0094f, 32.32f, 189.81f),
                    PathNode.LineTo(120.32f, 237.98f),
                    PathNode.CurveTo(125.099464f, 240.62086f, 130.90053f, 240.62086f, 135.68f, 237.98f),
                    PathNode.LineTo(223.68f, 189.81f),
                    PathNode.CurveTo(228.79852f, 187.0094f, 231.98676f, 181.64459f, 232.0f, 175.81f),
                    PathNode.LineTo(232.0f, 80.18f),
                    PathNode.CurveTo(231.9977f, 74.33465f, 228.80794f, 68.955765f, 223.68f, 66.15f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 120.0f),
                    PathNode.LineTo(47.65f, 76.0f),
                    PathNode.LineTo(128.0f, 32.0f),
                    PathNode.LineTo(208.35f, 76.0f),
                    PathNode.Close,
                    PathNode.MoveTo(136.0f, 219.64f),
                    PathNode.LineTo(136.0f, 133.83f),
                    PathNode.LineTo(216.0f, 90.05f),
                    PathNode.LineTo(216.0f, 175.81f),
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
        return _cube!!
    }

private var _cube: ImageVector? = null
