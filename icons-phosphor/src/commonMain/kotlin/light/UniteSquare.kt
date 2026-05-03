package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.UniteSquare: ImageVector
    get() {
        if (_uniteSquare != null) return _uniteSquare!!
        _uniteSquare = phosphorLightIcon(
            name = "UniteSquare",
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
                    PathNode.MoveTo(154.48f, 210.0f),
                    PathNode.LineTo(46.0f, 101.52f),
                    PathNode.LineTo(46.0f, 54.52f),
                    PathNode.LineTo(201.52f, 210.0f),
                    PathNode.Close,
                    PathNode.MoveTo(54.48f, 46.0f),
                    PathNode.LineTo(101.48f, 46.0f),
                    PathNode.LineTo(210.0f, 154.48f),
                    PathNode.LineTo(210.0f, 201.48f),
                    PathNode.Close,
                    PathNode.MoveTo(210.0f, 137.52f),
                    PathNode.LineTo(174.48f, 102.0f),
                    PathNode.LineTo(210.0f, 102.0f),
                    PathNode.Close,
                    PathNode.MoveTo(154.0f, 81.52f),
                    PathNode.LineTo(118.48f, 46.0f),
                    PathNode.LineTo(154.0f, 46.0f),
                    PathNode.Close,
                    PathNode.MoveTo(46.0f, 118.52f),
                    PathNode.LineTo(81.52f, 154.0f),
                    PathNode.LineTo(46.0f, 154.0f),
                    PathNode.Close,
                    PathNode.MoveTo(102.0f, 174.52f),
                    PathNode.LineTo(137.52f, 210.0f),
                    PathNode.LineTo(102.0f, 210.0f),
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
        return _uniteSquare!!
    }

private var _uniteSquare: ImageVector? = null
