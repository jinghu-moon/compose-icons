package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.NotePencil: ImageVector
    get() {
        if (_notePencil != null) return _notePencil!!
        _notePencil = phosphorLightIcon(
            name = "NotePencil",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(228.24f, 59.76f),
                    PathNode.LineTo(196.24f, 27.76f),
                    PathNode.CurveTo(193.89746f, 25.420374f, 190.10254f, 25.420374f, 187.76f, 27.76f),
                    PathNode.LineTo(91.76f, 123.76f),
                    PathNode.CurveTo(90.63446f, 124.88415f, 90.0014f, 126.40924f, 90.0f, 128.0f),
                    PathNode.LineTo(90.0f, 160.0f),
                    PathNode.CurveTo(90.0f, 163.3137f, 92.686295f, 166.0f, 96.0f, 166.0f),
                    PathNode.LineTo(128.0f, 166.0f),
                    PathNode.CurveTo(129.59076f, 165.9986f, 131.11586f, 165.36554f, 132.24f, 164.24f),
                    PathNode.LineTo(228.24f, 68.24f),
                    PathNode.CurveTo(230.57962f, 65.89746f, 230.57962f, 62.10254f, 228.24f, 59.76f),
                    PathNode.Close,
                    PathNode.MoveTo(125.51f, 154.0f),
                    PathNode.LineTo(102.0f, 154.0f),
                    PathNode.LineTo(102.0f, 130.49f),
                    PathNode.LineTo(168.0f, 64.49f),
                    PathNode.LineTo(191.51f, 88.0f),
                    PathNode.Close,
                    PathNode.MoveTo(200.0f, 79.51f),
                    PathNode.LineTo(176.49f, 56.0f),
                    PathNode.LineTo(192.0f, 40.49f),
                    PathNode.LineTo(215.51f, 64.0f),
                    PathNode.Close,
                    PathNode.MoveTo(222.0f, 128.0f),
                    PathNode.LineTo(222.0f, 208.0f),
                    PathNode.CurveTo(222.0f, 215.73198f, 215.73198f, 222.0f, 208.0f, 222.0f),
                    PathNode.LineTo(48.0f, 222.0f),
                    PathNode.CurveTo(40.268013f, 222.0f, 34.0f, 215.73198f, 34.0f, 208.0f),
                    PathNode.LineTo(34.0f, 48.0f),
                    PathNode.CurveTo(34.0f, 40.268013f, 40.268013f, 34.0f, 48.0f, 34.0f),
                    PathNode.LineTo(128.0f, 34.0f),
                    PathNode.CurveTo(131.3137f, 34.0f, 134.0f, 36.68629f, 134.0f, 40.0f),
                    PathNode.CurveTo(134.0f, 43.31371f, 131.3137f, 46.0f, 128.0f, 46.0f),
                    PathNode.LineTo(48.0f, 46.0f),
                    PathNode.CurveTo(46.89543f, 46.0f, 46.0f, 46.89543f, 46.0f, 48.0f),
                    PathNode.LineTo(46.0f, 208.0f),
                    PathNode.CurveTo(46.0f, 209.10457f, 46.89543f, 210.0f, 48.0f, 210.0f),
                    PathNode.LineTo(208.0f, 210.0f),
                    PathNode.CurveTo(209.10457f, 210.0f, 210.0f, 209.10457f, 210.0f, 208.0f),
                    PathNode.LineTo(210.0f, 128.0f),
                    PathNode.CurveTo(210.0f, 124.686295f, 212.6863f, 122.0f, 216.0f, 122.0f),
                    PathNode.CurveTo(219.3137f, 122.0f, 222.0f, 124.686295f, 222.0f, 128.0f),
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
        return _notePencil!!
    }

private var _notePencil: ImageVector? = null
