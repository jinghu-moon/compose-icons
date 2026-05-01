package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.SubtractSquare: ImageVector
    get() {
        if (_subtractSquare != null) return _subtractSquare!!
        _subtractSquare = phosphorLightIcon(
            name = "SubtractSquare",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(216.0f, 90.0f),
                    PathNode.LineTo(166.0f, 90.0f),
                    PathNode.LineTo(166.0f, 40.0f),
                    PathNode.CurveTo(166.0f, 36.68629f, 163.3137f, 34.0f, 160.0f, 34.0f),
                    PathNode.LineTo(40.0f, 34.0f),
                    PathNode.CurveTo(36.68629f, 34.0f, 34.0f, 36.68629f, 34.0f, 40.0f),
                    PathNode.LineTo(34.0f, 160.0f),
                    PathNode.CurveTo(34.0f, 163.3137f, 36.68629f, 166.0f, 40.0f, 166.0f),
                    PathNode.LineTo(90.0f, 166.0f),
                    PathNode.LineTo(90.0f, 216.0f),
                    PathNode.CurveTo(90.0f, 219.3137f, 92.686295f, 222.0f, 96.0f, 222.0f),
                    PathNode.LineTo(216.0f, 222.0f),
                    PathNode.CurveTo(219.3137f, 222.0f, 222.0f, 219.3137f, 222.0f, 216.0f),
                    PathNode.LineTo(222.0f, 96.0f),
                    PathNode.CurveTo(222.0f, 92.686295f, 219.3137f, 90.0f, 216.0f, 90.0f),
                    PathNode.Close,
                    PathNode.MoveTo(162.48f, 210.0f),
                    PathNode.LineTo(118.48f, 166.0f),
                    PathNode.LineTo(157.48f, 166.0f),
                    PathNode.LineTo(201.48f, 210.0f),
                    PathNode.Close,
                    PathNode.MoveTo(166.0f, 157.52f),
                    PathNode.LineTo(166.0f, 118.52f),
                    PathNode.LineTo(210.0f, 162.52f),
                    PathNode.LineTo(210.0f, 201.52f),
                    PathNode.Close,
                    PathNode.MoveTo(210.0f, 145.52f),
                    PathNode.LineTo(166.48f, 102.0f),
                    PathNode.LineTo(210.0f, 102.0f),
                    PathNode.Close,
                    PathNode.MoveTo(46.0f, 46.0f),
                    PathNode.LineTo(154.0f, 46.0f),
                    PathNode.LineTo(154.0f, 154.0f),
                    PathNode.LineTo(46.0f, 154.0f),
                    PathNode.Close,
                    PathNode.MoveTo(102.0f, 166.48f),
                    PathNode.LineTo(145.52f, 210.0f),
                    PathNode.LineTo(102.0f, 210.0f),
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
        return _subtractSquare!!
    }

private var _subtractSquare: ImageVector? = null
