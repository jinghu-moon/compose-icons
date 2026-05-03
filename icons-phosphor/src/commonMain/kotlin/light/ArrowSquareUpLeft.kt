package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ArrowSquareUpLeft: ImageVector
    get() {
        if (_arrowSquareUpLeft != null) return _arrowSquareUpLeft!!
        _arrowSquareUpLeft = phosphorLightIcon(
            name = "ArrowSquareUpLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(208.0f, 34.0f),
                    PathNode.LineTo(48.0f, 34.0f),
                    PathNode.CurveTo(40.268013f, 34.0f, 34.0f, 40.268013f, 34.0f, 48.0f),
                    PathNode.LineTo(34.0f, 208.0f),
                    PathNode.CurveTo(34.0f, 215.73198f, 40.268013f, 222.0f, 48.0f, 222.0f),
                    PathNode.LineTo(208.0f, 222.0f),
                    PathNode.CurveTo(215.73198f, 222.0f, 222.0f, 215.73198f, 222.0f, 208.0f),
                    PathNode.LineTo(222.0f, 48.0f),
                    PathNode.CurveTo(222.0f, 40.268013f, 215.73198f, 34.0f, 208.0f, 34.0f),
                    PathNode.Close,
                    PathNode.MoveTo(210.0f, 208.0f),
                    PathNode.CurveTo(210.0f, 209.10457f, 209.10457f, 210.0f, 208.0f, 210.0f),
                    PathNode.LineTo(48.0f, 210.0f),
                    PathNode.CurveTo(46.89543f, 210.0f, 46.0f, 209.10457f, 46.0f, 208.0f),
                    PathNode.LineTo(46.0f, 48.0f),
                    PathNode.CurveTo(46.0f, 46.89543f, 46.89543f, 46.0f, 48.0f, 46.0f),
                    PathNode.LineTo(208.0f, 46.0f),
                    PathNode.CurveTo(209.10457f, 46.0f, 210.0f, 46.89543f, 210.0f, 48.0f),
                    PathNode.Close,
                    PathNode.MoveTo(164.24f, 155.76f),
                    PathNode.CurveTo(165.84523f, 157.25575f, 166.506f, 159.50844f, 165.96309f, 161.63431f),
                    PathNode.CurveTo(165.42018f, 163.76018f, 163.76018f, 165.42018f, 161.63431f, 165.96309f),
                    PathNode.CurveTo(159.50844f, 166.506f, 157.25575f, 165.84523f, 155.76f, 164.24f),
                    PathNode.LineTo(102.0f, 110.48f),
                    PathNode.LineTo(102.0f, 144.0f),
                    PathNode.CurveTo(102.0f, 147.3137f, 99.313705f, 150.0f, 96.0f, 150.0f),
                    PathNode.CurveTo(92.686295f, 150.0f, 90.0f, 147.3137f, 90.0f, 144.0f),
                    PathNode.LineTo(90.0f, 96.0f),
                    PathNode.CurveTo(90.0f, 92.686295f, 92.686295f, 90.0f, 96.0f, 90.0f),
                    PathNode.LineTo(144.0f, 90.0f),
                    PathNode.CurveTo(147.3137f, 90.0f, 150.0f, 92.686295f, 150.0f, 96.0f),
                    PathNode.CurveTo(150.0f, 99.313705f, 147.3137f, 102.0f, 144.0f, 102.0f),
                    PathNode.LineTo(110.48f, 102.0f),
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
        return _arrowSquareUpLeft!!
    }

private var _arrowSquareUpLeft: ImageVector? = null
