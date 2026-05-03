package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.CaretUpDown: ImageVector
    get() {
        if (_caretUpDown != null) return _caretUpDown!!
        _caretUpDown = phosphorLightIcon(
            name = "CaretUpDown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(180.24f, 171.76f),
                    PathNode.CurveTo(182.57962f, 174.10254f, 182.57962f, 177.89746f, 180.24f, 180.24f),
                    PathNode.LineTo(132.24f, 228.24f),
                    PathNode.CurveTo(129.89746f, 230.57962f, 126.10254f, 230.57962f, 123.76f, 228.24f),
                    PathNode.LineTo(75.76f, 180.24f),
                    PathNode.CurveTo(73.55713f, 177.87592f, 73.62213f, 174.19193f, 75.90703f, 171.90703f),
                    PathNode.CurveTo(78.191925f, 169.62213f, 81.87592f, 169.55713f, 84.24f, 171.76f),
                    PathNode.LineTo(128.0f, 215.51f),
                    PathNode.LineTo(171.76f, 171.76f),
                    PathNode.CurveTo(174.10254f, 169.42038f, 177.89746f, 169.42038f, 180.24f, 171.76f),
                    PathNode.Close,
                    PathNode.MoveTo(84.24f, 84.24f),
                    PathNode.LineTo(128.0f, 40.49f),
                    PathNode.LineTo(171.76f, 84.24f),
                    PathNode.CurveTo(174.12408f, 86.44287f, 177.80807f, 86.37787f, 180.09297f, 84.09297f),
                    PathNode.CurveTo(182.37787f, 81.808075f, 182.44287f, 78.12408f, 180.24f, 75.76f),
                    PathNode.LineTo(132.24f, 27.76f),
                    PathNode.CurveTo(129.89746f, 25.420374f, 126.10254f, 25.420374f, 123.76f, 27.76f),
                    PathNode.LineTo(75.76f, 75.76f),
                    PathNode.CurveTo(73.55713f, 78.12408f, 73.62213f, 81.808075f, 75.90703f, 84.09297f),
                    PathNode.CurveTo(78.191925f, 86.37787f, 81.87592f, 86.44287f, 84.24f, 84.24f),
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
        return _caretUpDown!!
    }

private var _caretUpDown: ImageVector? = null
