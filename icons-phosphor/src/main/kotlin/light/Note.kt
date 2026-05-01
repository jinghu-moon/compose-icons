package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Note: ImageVector
    get() {
        if (_note != null) return _note!!
        _note = phosphorLightIcon(
            name = "Note",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(90.0f, 96.0f),
                    PathNode.CurveTo(90.0f, 92.686295f, 92.686295f, 90.0f, 96.0f, 90.0f),
                    PathNode.LineTo(160.0f, 90.0f),
                    PathNode.CurveTo(163.3137f, 90.0f, 166.0f, 92.686295f, 166.0f, 96.0f),
                    PathNode.CurveTo(166.0f, 99.313705f, 163.3137f, 102.0f, 160.0f, 102.0f),
                    PathNode.LineTo(96.0f, 102.0f),
                    PathNode.CurveTo(92.686295f, 102.0f, 90.0f, 99.313705f, 90.0f, 96.0f),
                    PathNode.Close,
                    PathNode.MoveTo(96.0f, 134.0f),
                    PathNode.LineTo(160.0f, 134.0f),
                    PathNode.CurveTo(163.3137f, 134.0f, 166.0f, 131.3137f, 166.0f, 128.0f),
                    PathNode.CurveTo(166.0f, 124.686295f, 163.3137f, 122.0f, 160.0f, 122.0f),
                    PathNode.LineTo(96.0f, 122.0f),
                    PathNode.CurveTo(92.686295f, 122.0f, 90.0f, 124.686295f, 90.0f, 128.0f),
                    PathNode.CurveTo(90.0f, 131.3137f, 92.686295f, 134.0f, 96.0f, 134.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 154.0f),
                    PathNode.LineTo(96.0f, 154.0f),
                    PathNode.CurveTo(92.686295f, 154.0f, 90.0f, 156.6863f, 90.0f, 160.0f),
                    PathNode.CurveTo(90.0f, 163.3137f, 92.686295f, 166.0f, 96.0f, 166.0f),
                    PathNode.LineTo(128.0f, 166.0f),
                    PathNode.CurveTo(131.3137f, 166.0f, 134.0f, 163.3137f, 134.0f, 160.0f),
                    PathNode.CurveTo(134.0f, 156.6863f, 131.3137f, 154.0f, 128.0f, 154.0f),
                    PathNode.Close,
                    PathNode.MoveTo(222.0f, 48.0f),
                    PathNode.LineTo(222.0f, 156.69f),
                    PathNode.CurveTo(222.0069f, 160.40445f, 220.53107f, 163.96803f, 217.9f, 166.59f),
                    PathNode.LineTo(166.59f, 217.9f),
                    PathNode.CurveTo(163.96803f, 220.53107f, 160.40445f, 222.0069f, 156.69f, 222.0f),
                    PathNode.LineTo(48.0f, 222.0f),
                    PathNode.CurveTo(40.268013f, 222.0f, 34.0f, 215.73198f, 34.0f, 208.0f),
                    PathNode.LineTo(34.0f, 48.0f),
                    PathNode.CurveTo(34.0f, 40.268013f, 40.268013f, 34.0f, 48.0f, 34.0f),
                    PathNode.LineTo(208.0f, 34.0f),
                    PathNode.CurveTo(215.73198f, 34.0f, 222.0f, 40.268013f, 222.0f, 48.0f),
                    PathNode.Close,
                    PathNode.MoveTo(48.0f, 210.0f),
                    PathNode.LineTo(154.0f, 210.0f),
                    PathNode.LineTo(154.0f, 160.0f),
                    PathNode.CurveTo(154.0f, 156.6863f, 156.6863f, 154.0f, 160.0f, 154.0f),
                    PathNode.LineTo(210.0f, 154.0f),
                    PathNode.LineTo(210.0f, 48.0f),
                    PathNode.CurveTo(210.0f, 46.89543f, 209.10457f, 46.0f, 208.0f, 46.0f),
                    PathNode.LineTo(48.0f, 46.0f),
                    PathNode.CurveTo(46.89543f, 46.0f, 46.0f, 46.89543f, 46.0f, 48.0f),
                    PathNode.LineTo(46.0f, 208.0f),
                    PathNode.CurveTo(46.0f, 209.10457f, 46.89543f, 210.0f, 48.0f, 210.0f),
                    PathNode.Close,
                    PathNode.MoveTo(201.52f, 166.0f),
                    PathNode.LineTo(166.0f, 166.0f),
                    PathNode.LineTo(166.0f, 201.52f),
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
        return _note!!
    }

private var _note: ImageVector? = null
