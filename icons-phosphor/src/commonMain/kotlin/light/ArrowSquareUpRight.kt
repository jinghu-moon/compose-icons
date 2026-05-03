package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ArrowSquareUpRight: ImageVector
    get() {
        if (_arrowSquareUpRight != null) return _arrowSquareUpRight!!
        _arrowSquareUpRight = phosphorLightIcon(
            name = "ArrowSquareUpRight",
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
                    PathNode.MoveTo(166.0f, 96.0f),
                    PathNode.LineTo(166.0f, 144.0f),
                    PathNode.CurveTo(166.0f, 147.3137f, 163.3137f, 150.0f, 160.0f, 150.0f),
                    PathNode.CurveTo(156.6863f, 150.0f, 154.0f, 147.3137f, 154.0f, 144.0f),
                    PathNode.LineTo(154.0f, 110.48f),
                    PathNode.LineTo(100.24f, 164.24f),
                    PathNode.CurveTo(97.87592f, 166.44287f, 94.191925f, 166.37787f, 91.90703f, 164.09297f),
                    PathNode.CurveTo(89.62213f, 161.80807f, 89.55713f, 158.12408f, 91.76f, 155.76f),
                    PathNode.LineTo(145.52f, 102.0f),
                    PathNode.LineTo(112.0f, 102.0f),
                    PathNode.CurveTo(108.686295f, 102.0f, 106.0f, 99.313705f, 106.0f, 96.0f),
                    PathNode.CurveTo(106.0f, 92.686295f, 108.686295f, 90.0f, 112.0f, 90.0f),
                    PathNode.LineTo(160.0f, 90.0f),
                    PathNode.CurveTo(163.3137f, 90.0f, 166.0f, 92.686295f, 166.0f, 96.0f),
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
        return _arrowSquareUpRight!!
    }

private var _arrowSquareUpRight: ImageVector? = null
