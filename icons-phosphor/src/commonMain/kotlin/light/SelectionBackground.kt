package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.SelectionBackground: ImageVector
    get() {
        if (_selectionBackground != null) return _selectionBackground!!
        _selectionBackground = phosphorLightIcon(
            name = "SelectionBackground",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(160.0f, 82.0f),
                    PathNode.LineTo(48.0f, 82.0f),
                    PathNode.CurveTo(40.268013f, 82.0f, 34.0f, 88.26801f, 34.0f, 96.0f),
                    PathNode.LineTo(34.0f, 208.0f),
                    PathNode.CurveTo(34.0f, 215.73198f, 40.268013f, 222.0f, 48.0f, 222.0f),
                    PathNode.LineTo(160.0f, 222.0f),
                    PathNode.CurveTo(167.73198f, 222.0f, 174.0f, 215.73198f, 174.0f, 208.0f),
                    PathNode.LineTo(174.0f, 96.0f),
                    PathNode.CurveTo(174.0f, 88.26801f, 167.73198f, 82.0f, 160.0f, 82.0f),
                    PathNode.Close,
                    PathNode.MoveTo(162.0f, 208.0f),
                    PathNode.CurveTo(162.0f, 209.10457f, 161.10457f, 210.0f, 160.0f, 210.0f),
                    PathNode.LineTo(48.0f, 210.0f),
                    PathNode.CurveTo(46.89543f, 210.0f, 46.0f, 209.10457f, 46.0f, 208.0f),
                    PathNode.LineTo(46.0f, 96.0f),
                    PathNode.CurveTo(46.0f, 94.89543f, 46.89543f, 94.0f, 48.0f, 94.0f),
                    PathNode.LineTo(160.0f, 94.0f),
                    PathNode.CurveTo(161.10457f, 94.0f, 162.0f, 94.89543f, 162.0f, 96.0f),
                    PathNode.Close,
                    PathNode.MoveTo(138.0f, 40.0f),
                    PathNode.CurveTo(138.0f, 36.68629f, 140.6863f, 34.0f, 144.0f, 34.0f),
                    PathNode.LineTo(160.0f, 34.0f),
                    PathNode.CurveTo(163.3137f, 34.0f, 166.0f, 36.68629f, 166.0f, 40.0f),
                    PathNode.CurveTo(166.0f, 43.31371f, 163.3137f, 46.0f, 160.0f, 46.0f),
                    PathNode.LineTo(144.0f, 46.0f),
                    PathNode.CurveTo(140.6863f, 46.0f, 138.0f, 43.31371f, 138.0f, 40.0f),
                    PathNode.Close,
                    PathNode.MoveTo(222.0f, 48.0f),
                    PathNode.LineTo(222.0f, 56.0f),
                    PathNode.CurveTo(222.0f, 59.31371f, 219.3137f, 62.0f, 216.0f, 62.0f),
                    PathNode.CurveTo(212.6863f, 62.0f, 210.0f, 59.31371f, 210.0f, 56.0f),
                    PathNode.LineTo(210.0f, 48.0f),
                    PathNode.CurveTo(210.0f, 46.89543f, 209.10457f, 46.0f, 208.0f, 46.0f),
                    PathNode.LineTo(200.0f, 46.0f),
                    PathNode.CurveTo(196.6863f, 46.0f, 194.0f, 43.31371f, 194.0f, 40.0f),
                    PathNode.CurveTo(194.0f, 36.68629f, 196.6863f, 34.0f, 200.0f, 34.0f),
                    PathNode.LineTo(208.0f, 34.0f),
                    PathNode.CurveTo(215.73198f, 34.0f, 222.0f, 40.268013f, 222.0f, 48.0f),
                    PathNode.Close,
                    PathNode.MoveTo(222.0f, 96.0f),
                    PathNode.LineTo(222.0f, 112.0f),
                    PathNode.CurveTo(222.0f, 115.313705f, 219.3137f, 118.0f, 216.0f, 118.0f),
                    PathNode.CurveTo(212.6863f, 118.0f, 210.0f, 115.313705f, 210.0f, 112.0f),
                    PathNode.LineTo(210.0f, 96.0f),
                    PathNode.CurveTo(210.0f, 92.686295f, 212.6863f, 90.0f, 216.0f, 90.0f),
                    PathNode.CurveTo(219.3137f, 90.0f, 222.0f, 92.686295f, 222.0f, 96.0f),
                    PathNode.Close,
                    PathNode.MoveTo(222.0f, 152.0f),
                    PathNode.LineTo(222.0f, 160.0f),
                    PathNode.CurveTo(222.0f, 167.73198f, 215.73198f, 174.0f, 208.0f, 174.0f),
                    PathNode.LineTo(200.0f, 174.0f),
                    PathNode.CurveTo(196.6863f, 174.0f, 194.0f, 171.3137f, 194.0f, 168.0f),
                    PathNode.CurveTo(194.0f, 164.6863f, 196.6863f, 162.0f, 200.0f, 162.0f),
                    PathNode.LineTo(208.0f, 162.0f),
                    PathNode.CurveTo(209.10457f, 162.0f, 210.0f, 161.10457f, 210.0f, 160.0f),
                    PathNode.LineTo(210.0f, 152.0f),
                    PathNode.CurveTo(210.0f, 148.6863f, 212.6863f, 146.0f, 216.0f, 146.0f),
                    PathNode.CurveTo(219.3137f, 146.0f, 222.0f, 148.6863f, 222.0f, 152.0f),
                    PathNode.Close,
                    PathNode.MoveTo(82.0f, 56.0f),
                    PathNode.LineTo(82.0f, 48.0f),
                    PathNode.CurveTo(82.0f, 40.268013f, 88.26801f, 34.0f, 96.0f, 34.0f),
                    PathNode.LineTo(104.0f, 34.0f),
                    PathNode.CurveTo(107.313705f, 34.0f, 110.0f, 36.68629f, 110.0f, 40.0f),
                    PathNode.CurveTo(110.0f, 43.31371f, 107.313705f, 46.0f, 104.0f, 46.0f),
                    PathNode.LineTo(96.0f, 46.0f),
                    PathNode.CurveTo(94.89543f, 46.0f, 94.0f, 46.89543f, 94.0f, 48.0f),
                    PathNode.LineTo(94.0f, 56.0f),
                    PathNode.CurveTo(94.0f, 59.31371f, 91.313705f, 62.0f, 88.0f, 62.0f),
                    PathNode.CurveTo(84.686295f, 62.0f, 82.0f, 59.31371f, 82.0f, 56.0f),
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
        return _selectionBackground!!
    }

private var _selectionBackground: ImageVector? = null
