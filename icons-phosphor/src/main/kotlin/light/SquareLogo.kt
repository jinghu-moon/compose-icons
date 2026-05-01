package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.SquareLogo: ImageVector
    get() {
        if (_squareLogo != null) return _squareLogo!!
        _squareLogo = phosphorLightIcon(
            name = "SquareLogo",
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
                    PathNode.MoveTo(160.0f, 90.0f),
                    PathNode.LineTo(96.0f, 90.0f),
                    PathNode.CurveTo(92.686295f, 90.0f, 90.0f, 92.686295f, 90.0f, 96.0f),
                    PathNode.LineTo(90.0f, 160.0f),
                    PathNode.CurveTo(90.0f, 163.3137f, 92.686295f, 166.0f, 96.0f, 166.0f),
                    PathNode.LineTo(160.0f, 166.0f),
                    PathNode.CurveTo(163.3137f, 166.0f, 166.0f, 163.3137f, 166.0f, 160.0f),
                    PathNode.LineTo(166.0f, 96.0f),
                    PathNode.CurveTo(166.0f, 92.686295f, 163.3137f, 90.0f, 160.0f, 90.0f),
                    PathNode.Close,
                    PathNode.MoveTo(154.0f, 154.0f),
                    PathNode.LineTo(102.0f, 154.0f),
                    PathNode.LineTo(102.0f, 102.0f),
                    PathNode.LineTo(154.0f, 102.0f),
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
        return _squareLogo!!
    }

private var _squareLogo: ImageVector? = null
