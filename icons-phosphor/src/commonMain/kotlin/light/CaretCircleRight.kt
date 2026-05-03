package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.CaretCircleRight: ImageVector
    get() {
        if (_caretCircleRight != null) return _caretCircleRight!!
        _caretCircleRight = phosphorLightIcon(
            name = "CaretCircleRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(128.0f, 26.0f),
                    PathNode.CurveTo(71.666954f, 26.0f, 26.0f, 71.666954f, 26.0f, 128.0f),
                    PathNode.CurveTo(26.0f, 184.33304f, 71.666954f, 230.0f, 128.0f, 230.0f),
                    PathNode.CurveTo(184.33304f, 230.0f, 230.0f, 184.33304f, 230.0f, 128.0f),
                    PathNode.CurveTo(229.93387f, 71.69437f, 184.30563f, 26.066126f, 128.0f, 26.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 218.0f),
                    PathNode.CurveTo(78.29437f, 218.0f, 38.0f, 177.70563f, 38.0f, 128.0f),
                    PathNode.CurveTo(38.0f, 78.29437f, 78.29437f, 38.0f, 128.0f, 38.0f),
                    PathNode.CurveTo(177.70563f, 38.0f, 218.0f, 78.29437f, 218.0f, 128.0f),
                    PathNode.CurveTo(217.94489f, 177.68279f, 177.68279f, 217.94489f, 128.0f, 218.0f),
                    PathNode.Close,
                    PathNode.MoveTo(156.24f, 123.76f),
                    PathNode.CurveTo(158.57962f, 126.10254f, 158.57962f, 129.89746f, 156.24f, 132.24f),
                    PathNode.LineTo(116.24f, 172.24f),
                    PathNode.CurveTo(113.87592f, 174.44287f, 110.191925f, 174.37787f, 107.90703f, 172.09297f),
                    PathNode.CurveTo(105.62213f, 169.80807f, 105.55713f, 166.12408f, 107.76f, 163.76f),
                    PathNode.LineTo(143.51f, 128.0f),
                    PathNode.LineTo(107.76f, 92.24f),
                    PathNode.CurveTo(105.55713f, 89.87592f, 105.62213f, 86.191925f, 107.90703f, 83.90703f),
                    PathNode.CurveTo(110.191925f, 81.62213f, 113.87592f, 81.55713f, 116.24f, 83.76f),
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
        return _caretCircleRight!!
    }

private var _caretCircleRight: ImageVector? = null
