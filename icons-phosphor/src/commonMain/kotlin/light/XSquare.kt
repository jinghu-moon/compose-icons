package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.XSquare: ImageVector
    get() {
        if (_xSquare != null) return _xSquare!!
        _xSquare = phosphorLightIcon(
            name = "XSquare",
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
                    PathNode.MoveTo(164.24f, 100.24f),
                    PathNode.LineTo(136.48f, 128.0f),
                    PathNode.LineTo(164.24f, 155.76f),
                    PathNode.CurveTo(165.84523f, 157.25575f, 166.506f, 159.50844f, 165.96309f, 161.63431f),
                    PathNode.CurveTo(165.42018f, 163.76018f, 163.76018f, 165.42018f, 161.63431f, 165.96309f),
                    PathNode.CurveTo(159.50844f, 166.506f, 157.25575f, 165.84523f, 155.76f, 164.24f),
                    PathNode.LineTo(128.0f, 136.48f),
                    PathNode.LineTo(100.24f, 164.24f),
                    PathNode.CurveTo(97.87592f, 166.44287f, 94.191925f, 166.37787f, 91.90703f, 164.09297f),
                    PathNode.CurveTo(89.62213f, 161.80807f, 89.55713f, 158.12408f, 91.76f, 155.76f),
                    PathNode.LineTo(119.52f, 128.0f),
                    PathNode.LineTo(91.76f, 100.24f),
                    PathNode.CurveTo(89.55713f, 97.87592f, 89.62213f, 94.191925f, 91.90703f, 91.90703f),
                    PathNode.CurveTo(94.191925f, 89.62213f, 97.87592f, 89.55713f, 100.24f, 91.76f),
                    PathNode.LineTo(128.0f, 119.52f),
                    PathNode.LineTo(155.76f, 91.76f),
                    PathNode.CurveTo(158.12408f, 89.55713f, 161.80807f, 89.62213f, 164.09297f, 91.90703f),
                    PathNode.CurveTo(166.37787f, 94.191925f, 166.44287f, 97.87592f, 164.24f, 100.24f),
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
        return _xSquare!!
    }

private var _xSquare: ImageVector? = null
