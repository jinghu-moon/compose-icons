package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Kanban: ImageVector
    get() {
        if (_kanban != null) return _kanban!!
        _kanban = phosphorLightIcon(
            name = "Kanban",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(216.0f, 50.0f),
                    PathNode.LineTo(40.0f, 50.0f),
                    PathNode.CurveTo(36.68629f, 50.0f, 34.0f, 52.68629f, 34.0f, 56.0f),
                    PathNode.LineTo(34.0f, 208.0f),
                    PathNode.CurveTo(34.0f, 215.73198f, 40.268013f, 222.0f, 48.0f, 222.0f),
                    PathNode.LineTo(88.0f, 222.0f),
                    PathNode.CurveTo(95.73199f, 222.0f, 102.0f, 215.73198f, 102.0f, 208.0f),
                    PathNode.LineTo(102.0f, 158.0f),
                    PathNode.LineTo(154.0f, 158.0f),
                    PathNode.LineTo(154.0f, 176.0f),
                    PathNode.CurveTo(154.0f, 183.73198f, 160.26802f, 190.0f, 168.0f, 190.0f),
                    PathNode.LineTo(208.0f, 190.0f),
                    PathNode.CurveTo(215.73198f, 190.0f, 222.0f, 183.73198f, 222.0f, 176.0f),
                    PathNode.LineTo(222.0f, 56.0f),
                    PathNode.CurveTo(222.0f, 52.68629f, 219.3137f, 50.0f, 216.0f, 50.0f),
                    PathNode.Close,
                    PathNode.MoveTo(210.0f, 114.0f),
                    PathNode.LineTo(166.0f, 114.0f),
                    PathNode.LineTo(166.0f, 62.0f),
                    PathNode.LineTo(210.0f, 62.0f),
                    PathNode.Close,
                    PathNode.MoveTo(90.0f, 62.0f),
                    PathNode.LineTo(90.0f, 114.0f),
                    PathNode.LineTo(46.0f, 114.0f),
                    PathNode.LineTo(46.0f, 62.0f),
                    PathNode.Close,
                    PathNode.MoveTo(90.0f, 208.0f),
                    PathNode.CurveTo(90.0f, 209.10457f, 89.10457f, 210.0f, 88.0f, 210.0f),
                    PathNode.LineTo(48.0f, 210.0f),
                    PathNode.CurveTo(46.89543f, 210.0f, 46.0f, 209.10457f, 46.0f, 208.0f),
                    PathNode.LineTo(46.0f, 126.0f),
                    PathNode.LineTo(90.0f, 126.0f),
                    PathNode.Close,
                    PathNode.MoveTo(102.0f, 146.0f),
                    PathNode.LineTo(102.0f, 62.0f),
                    PathNode.LineTo(154.0f, 62.0f),
                    PathNode.LineTo(154.0f, 146.0f),
                    PathNode.Close,
                    PathNode.MoveTo(208.0f, 178.0f),
                    PathNode.LineTo(168.0f, 178.0f),
                    PathNode.CurveTo(166.89543f, 178.0f, 166.0f, 177.10457f, 166.0f, 176.0f),
                    PathNode.LineTo(166.0f, 126.0f),
                    PathNode.LineTo(210.0f, 126.0f),
                    PathNode.LineTo(210.0f, 176.0f),
                    PathNode.CurveTo(210.0f, 177.10457f, 209.10457f, 178.0f, 208.0f, 178.0f),
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
        return _kanban!!
    }

private var _kanban: ImageVector? = null
