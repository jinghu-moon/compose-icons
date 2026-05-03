package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Elevator: ImageVector
    get() {
        if (_elevator != null) return _elevator!!
        _elevator = phosphorLightIcon(
            name = "Elevator",
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
                    PathNode.MoveTo(178.0f, 110.0f),
                    PathNode.LineTo(178.0f, 210.0f),
                    PathNode.LineTo(134.0f, 210.0f),
                    PathNode.LineTo(134.0f, 110.0f),
                    PathNode.Close,
                    PathNode.MoveTo(122.0f, 210.0f),
                    PathNode.LineTo(78.0f, 210.0f),
                    PathNode.LineTo(78.0f, 110.0f),
                    PathNode.LineTo(122.0f, 110.0f),
                    PathNode.Close,
                    PathNode.MoveTo(210.0f, 208.0f),
                    PathNode.CurveTo(210.0f, 209.10457f, 209.10457f, 210.0f, 208.0f, 210.0f),
                    PathNode.LineTo(190.0f, 210.0f),
                    PathNode.LineTo(190.0f, 104.0f),
                    PathNode.CurveTo(190.0f, 100.686295f, 187.3137f, 98.0f, 184.0f, 98.0f),
                    PathNode.LineTo(72.0f, 98.0f),
                    PathNode.CurveTo(68.686295f, 98.0f, 66.0f, 100.686295f, 66.0f, 104.0f),
                    PathNode.LineTo(66.0f, 210.0f),
                    PathNode.LineTo(48.0f, 210.0f),
                    PathNode.CurveTo(46.89543f, 210.0f, 46.0f, 209.10457f, 46.0f, 208.0f),
                    PathNode.LineTo(46.0f, 48.0f),
                    PathNode.CurveTo(46.0f, 46.89543f, 46.89543f, 46.0f, 48.0f, 46.0f),
                    PathNode.LineTo(208.0f, 46.0f),
                    PathNode.CurveTo(209.10457f, 46.0f, 210.0f, 46.89543f, 210.0f, 48.0f),
                    PathNode.Close,
                    PathNode.MoveTo(150.0f, 72.0f),
                    PathNode.CurveTo(150.0f, 75.313705f, 147.3137f, 78.0f, 144.0f, 78.0f),
                    PathNode.LineTo(112.0f, 78.0f),
                    PathNode.CurveTo(108.686295f, 78.0f, 106.0f, 75.313705f, 106.0f, 72.0f),
                    PathNode.CurveTo(106.0f, 68.686295f, 108.686295f, 66.0f, 112.0f, 66.0f),
                    PathNode.LineTo(144.0f, 66.0f),
                    PathNode.CurveTo(147.3137f, 66.0f, 150.0f, 68.686295f, 150.0f, 72.0f),
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
        return _elevator!!
    }

private var _elevator: ImageVector? = null
