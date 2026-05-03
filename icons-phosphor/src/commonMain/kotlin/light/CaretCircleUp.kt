package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.CaretCircleUp: ImageVector
    get() {
        if (_caretCircleUp != null) return _caretCircleUp!!
        _caretCircleUp = phosphorLightIcon(
            name = "CaretCircleUp",
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
                    PathNode.MoveTo(172.24f, 139.76f),
                    PathNode.CurveTo(173.84523f, 141.25575f, 174.506f, 143.50844f, 173.96309f, 145.63431f),
                    PathNode.CurveTo(173.42018f, 147.76018f, 171.76018f, 149.42018f, 169.63431f, 149.96309f),
                    PathNode.CurveTo(167.50844f, 150.506f, 165.25575f, 149.84523f, 163.76f, 148.24f),
                    PathNode.LineTo(128.0f, 112.49f),
                    PathNode.LineTo(92.24f, 148.24f),
                    PathNode.CurveTo(89.87592f, 150.44287f, 86.191925f, 150.37787f, 83.90703f, 148.09297f),
                    PathNode.CurveTo(81.62213f, 145.80807f, 81.55713f, 142.12408f, 83.76f, 139.76f),
                    PathNode.LineTo(123.76f, 99.76f),
                    PathNode.CurveTo(126.10254f, 97.42038f, 129.89746f, 97.42038f, 132.24f, 99.76f),
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
        return _caretCircleUp!!
    }

private var _caretCircleUp: ImageVector? = null
