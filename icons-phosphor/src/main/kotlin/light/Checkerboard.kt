package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Checkerboard: ImageVector
    get() {
        if (_checkerboard != null) return _checkerboard!!
        _checkerboard = phosphorLightIcon(
            name = "Checkerboard",
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
                    PathNode.MoveTo(194.48f, 122.0f),
                    PathNode.LineTo(134.0f, 61.52f),
                    PathNode.LineTo(134.0f, 46.0f),
                    PathNode.LineTo(149.52f, 46.0f),
                    PathNode.LineTo(210.0f, 106.48f),
                    PathNode.LineTo(210.0f, 122.0f),
                    PathNode.Close,
                    PathNode.MoveTo(134.0f, 78.48f),
                    PathNode.LineTo(177.52f, 122.0f),
                    PathNode.LineTo(134.0f, 122.0f),
                    PathNode.Close,
                    PathNode.MoveTo(210.0f, 48.0f),
                    PathNode.LineTo(210.0f, 89.52f),
                    PathNode.LineTo(166.48f, 46.0f),
                    PathNode.LineTo(208.0f, 46.0f),
                    PathNode.CurveTo(209.10457f, 46.0f, 210.0f, 46.89543f, 210.0f, 48.0f),
                    PathNode.Close,
                    PathNode.MoveTo(48.0f, 46.0f),
                    PathNode.LineTo(122.0f, 46.0f),
                    PathNode.LineTo(122.0f, 122.0f),
                    PathNode.LineTo(46.0f, 122.0f),
                    PathNode.LineTo(46.0f, 48.0f),
                    PathNode.CurveTo(46.0f, 46.89543f, 46.89543f, 46.0f, 48.0f, 46.0f),
                    PathNode.Close,
                    PathNode.MoveTo(106.48f, 210.0f),
                    PathNode.LineTo(46.0f, 149.52f),
                    PathNode.LineTo(46.0f, 134.0f),
                    PathNode.LineTo(61.52f, 134.0f),
                    PathNode.LineTo(122.0f, 194.48f),
                    PathNode.LineTo(122.0f, 210.0f),
                    PathNode.Close,
                    PathNode.MoveTo(122.0f, 177.52f),
                    PathNode.LineTo(78.48f, 134.0f),
                    PathNode.LineTo(122.0f, 134.0f),
                    PathNode.Close,
                    PathNode.MoveTo(46.0f, 208.0f),
                    PathNode.LineTo(46.0f, 166.48f),
                    PathNode.LineTo(89.52f, 210.0f),
                    PathNode.LineTo(48.0f, 210.0f),
                    PathNode.CurveTo(46.89543f, 210.0f, 46.0f, 209.10457f, 46.0f, 208.0f),
                    PathNode.Close,
                    PathNode.MoveTo(208.0f, 210.0f),
                    PathNode.LineTo(134.0f, 210.0f),
                    PathNode.LineTo(134.0f, 192.0f),
                    PathNode.LineTo(134.0f, 192.0f),
                    PathNode.LineTo(134.0f, 134.0f),
                    PathNode.LineTo(210.0f, 134.0f),
                    PathNode.LineTo(210.0f, 208.0f),
                    PathNode.CurveTo(210.0f, 209.10457f, 209.10457f, 210.0f, 208.0f, 210.0f),
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
        return _checkerboard!!
    }

private var _checkerboard: ImageVector? = null
