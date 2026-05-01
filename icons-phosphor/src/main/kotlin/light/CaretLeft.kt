package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.CaretLeft: ImageVector
    get() {
        if (_caretLeft != null) return _caretLeft!!
        _caretLeft = phosphorLightIcon(
            name = "CaretLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(164.24f, 203.76f),
                    PathNode.CurveTo(165.84523f, 205.25575f, 166.506f, 207.50844f, 165.96309f, 209.63431f),
                    PathNode.CurveTo(165.42018f, 211.76018f, 163.76018f, 213.42018f, 161.63431f, 213.96309f),
                    PathNode.CurveTo(159.50844f, 214.506f, 157.25575f, 213.84523f, 155.76f, 212.24f),
                    PathNode.LineTo(75.76f, 132.24f),
                    PathNode.CurveTo(73.42038f, 129.89746f, 73.42038f, 126.10254f, 75.76f, 123.76f),
                    PathNode.LineTo(155.76f, 43.76f),
                    PathNode.CurveTo(158.12408f, 41.55713f, 161.80807f, 41.622128f, 164.09297f, 43.907024f),
                    PathNode.CurveTo(166.37787f, 46.19192f, 166.44287f, 49.875923f, 164.24f, 52.24f),
                    PathNode.LineTo(88.49f, 128.0f),
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
        return _caretLeft!!
    }

private var _caretLeft: ImageVector? = null
