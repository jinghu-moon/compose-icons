package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.CaretUp: ImageVector
    get() {
        if (_caretUp != null) return _caretUp!!
        _caretUp = phosphorLightIcon(
            name = "CaretUp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(212.24f, 164.24f),
                    PathNode.CurveTo(209.89746f, 166.57962f, 206.10254f, 166.57962f, 203.76f, 164.24f),
                    PathNode.LineTo(128.0f, 88.49f),
                    PathNode.LineTo(52.24f, 164.24f),
                    PathNode.CurveTo(49.875923f, 166.44287f, 46.19192f, 166.37787f, 43.907024f, 164.09297f),
                    PathNode.CurveTo(41.622128f, 161.80807f, 41.55713f, 158.12408f, 43.76f, 155.76f),
                    PathNode.LineTo(123.76f, 75.76f),
                    PathNode.CurveTo(126.10254f, 73.42038f, 129.89746f, 73.42038f, 132.24f, 75.76f),
                    PathNode.LineTo(212.24f, 155.76f),
                    PathNode.CurveTo(214.57962f, 158.10254f, 214.57962f, 161.89746f, 212.24f, 164.24f),
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
        return _caretUp!!
    }

private var _caretUp: ImageVector? = null
