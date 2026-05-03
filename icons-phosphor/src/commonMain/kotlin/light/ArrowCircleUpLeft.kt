package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ArrowCircleUpLeft: ImageVector
    get() {
        if (_arrowCircleUpLeft != null) return _arrowCircleUpLeft!!
        _arrowCircleUpLeft = phosphorLightIcon(
            name = "ArrowCircleUpLeft",
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
                    PathNode.MoveTo(164.24f, 155.76f),
                    PathNode.CurveTo(165.84523f, 157.25575f, 166.506f, 159.50844f, 165.96309f, 161.63431f),
                    PathNode.CurveTo(165.42018f, 163.76018f, 163.76018f, 165.42018f, 161.63431f, 165.96309f),
                    PathNode.CurveTo(159.50844f, 166.506f, 157.25575f, 165.84523f, 155.76f, 164.24f),
                    PathNode.LineTo(102.0f, 110.49f),
                    PathNode.LineTo(102.0f, 144.0f),
                    PathNode.CurveTo(102.0f, 147.3137f, 99.313705f, 150.0f, 96.0f, 150.0f),
                    PathNode.CurveTo(92.686295f, 150.0f, 90.0f, 147.3137f, 90.0f, 144.0f),
                    PathNode.LineTo(90.0f, 96.0f),
                    PathNode.CurveTo(90.0f, 92.686295f, 92.686295f, 90.0f, 96.0f, 90.0f),
                    PathNode.LineTo(144.0f, 90.0f),
                    PathNode.CurveTo(147.3137f, 90.0f, 150.0f, 92.686295f, 150.0f, 96.0f),
                    PathNode.CurveTo(150.0f, 99.313705f, 147.3137f, 102.0f, 144.0f, 102.0f),
                    PathNode.LineTo(110.49f, 102.0f),
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
        return _arrowCircleUpLeft!!
    }

private var _arrowCircleUpLeft: ImageVector? = null
