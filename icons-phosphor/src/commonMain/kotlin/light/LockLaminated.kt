package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.LockLaminated: ImageVector
    get() {
        if (_lockLaminated != null) return _lockLaminated!!
        _lockLaminated = phosphorLightIcon(
            name = "LockLaminated",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(208.0f, 82.0f),
                    PathNode.LineTo(174.0f, 82.0f),
                    PathNode.LineTo(174.0f, 56.0f),
                    PathNode.CurveTo(174.0f, 30.594902f, 153.4051f, 10.0f, 128.0f, 10.0f),
                    PathNode.CurveTo(102.5949f, 10.0f, 82.0f, 30.594902f, 82.0f, 56.0f),
                    PathNode.LineTo(82.0f, 82.0f),
                    PathNode.LineTo(48.0f, 82.0f),
                    PathNode.CurveTo(40.268013f, 82.0f, 34.0f, 88.26801f, 34.0f, 96.0f),
                    PathNode.LineTo(34.0f, 208.0f),
                    PathNode.CurveTo(34.0f, 215.73198f, 40.268013f, 222.0f, 48.0f, 222.0f),
                    PathNode.LineTo(208.0f, 222.0f),
                    PathNode.CurveTo(215.73198f, 222.0f, 222.0f, 215.73198f, 222.0f, 208.0f),
                    PathNode.LineTo(222.0f, 96.0f),
                    PathNode.CurveTo(222.0f, 88.26801f, 215.73198f, 82.0f, 208.0f, 82.0f),
                    PathNode.Close,
                    PathNode.MoveTo(46.0f, 126.0f),
                    PathNode.LineTo(210.0f, 126.0f),
                    PathNode.LineTo(210.0f, 146.0f),
                    PathNode.LineTo(46.0f, 146.0f),
                    PathNode.Close,
                    PathNode.MoveTo(46.0f, 158.0f),
                    PathNode.LineTo(210.0f, 158.0f),
                    PathNode.LineTo(210.0f, 178.0f),
                    PathNode.LineTo(46.0f, 178.0f),
                    PathNode.Close,
                    PathNode.MoveTo(94.0f, 56.0f),
                    PathNode.CurveTo(94.0f, 37.222317f, 109.22232f, 22.0f, 128.0f, 22.0f),
                    PathNode.CurveTo(146.77768f, 22.0f, 162.0f, 37.222317f, 162.0f, 56.0f),
                    PathNode.LineTo(162.0f, 82.0f),
                    PathNode.LineTo(94.0f, 82.0f),
                    PathNode.Close,
                    PathNode.MoveTo(48.0f, 94.0f),
                    PathNode.LineTo(208.0f, 94.0f),
                    PathNode.CurveTo(209.10457f, 94.0f, 210.0f, 94.89543f, 210.0f, 96.0f),
                    PathNode.LineTo(210.0f, 114.0f),
                    PathNode.LineTo(46.0f, 114.0f),
                    PathNode.LineTo(46.0f, 96.0f),
                    PathNode.CurveTo(46.0f, 94.89543f, 46.89543f, 94.0f, 48.0f, 94.0f),
                    PathNode.Close,
                    PathNode.MoveTo(208.0f, 210.0f),
                    PathNode.LineTo(48.0f, 210.0f),
                    PathNode.CurveTo(46.89543f, 210.0f, 46.0f, 209.10457f, 46.0f, 208.0f),
                    PathNode.LineTo(46.0f, 190.0f),
                    PathNode.LineTo(210.0f, 190.0f),
                    PathNode.LineTo(210.0f, 208.0f),
                    PathNode.CurveTo(210.0f, 209.10457f, 209.10457f, 210.0f, 208.0f, 210.0f),
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
        return _lockLaminated!!
    }

private var _lockLaminated: ImageVector? = null
