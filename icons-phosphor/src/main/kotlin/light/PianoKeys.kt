package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.PianoKeys: ImageVector
    get() {
        if (_pianoKeys != null) return _pianoKeys!!
        _pianoKeys = phosphorLightIcon(
            name = "PianoKeys",
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
                    PathNode.MoveTo(78.0f, 46.0f),
                    PathNode.LineTo(106.0f, 46.0f),
                    PathNode.LineTo(106.0f, 138.0f),
                    PathNode.LineTo(78.0f, 138.0f),
                    PathNode.Close,
                    PathNode.MoveTo(112.0f, 150.0f),
                    PathNode.CurveTo(115.313705f, 150.0f, 118.0f, 147.3137f, 118.0f, 144.0f),
                    PathNode.LineTo(118.0f, 46.0f),
                    PathNode.LineTo(138.0f, 46.0f),
                    PathNode.LineTo(138.0f, 144.0f),
                    PathNode.CurveTo(138.0f, 147.3137f, 140.6863f, 150.0f, 144.0f, 150.0f),
                    PathNode.LineTo(154.0f, 150.0f),
                    PathNode.LineTo(154.0f, 210.0f),
                    PathNode.LineTo(102.0f, 210.0f),
                    PathNode.LineTo(102.0f, 150.0f),
                    PathNode.Close,
                    PathNode.MoveTo(150.0f, 138.0f),
                    PathNode.LineTo(150.0f, 46.0f),
                    PathNode.LineTo(178.0f, 46.0f),
                    PathNode.LineTo(178.0f, 138.0f),
                    PathNode.Close,
                    PathNode.MoveTo(46.0f, 208.0f),
                    PathNode.LineTo(46.0f, 48.0f),
                    PathNode.CurveTo(46.0f, 46.89543f, 46.89543f, 46.0f, 48.0f, 46.0f),
                    PathNode.LineTo(66.0f, 46.0f),
                    PathNode.LineTo(66.0f, 144.0f),
                    PathNode.CurveTo(66.0f, 147.3137f, 68.686295f, 150.0f, 72.0f, 150.0f),
                    PathNode.LineTo(90.0f, 150.0f),
                    PathNode.LineTo(90.0f, 210.0f),
                    PathNode.LineTo(48.0f, 210.0f),
                    PathNode.CurveTo(46.89543f, 210.0f, 46.0f, 209.10457f, 46.0f, 208.0f),
                    PathNode.Close,
                    PathNode.MoveTo(210.0f, 208.0f),
                    PathNode.CurveTo(210.0f, 209.10457f, 209.10457f, 210.0f, 208.0f, 210.0f),
                    PathNode.LineTo(166.0f, 210.0f),
                    PathNode.LineTo(166.0f, 150.0f),
                    PathNode.LineTo(184.0f, 150.0f),
                    PathNode.CurveTo(187.3137f, 150.0f, 190.0f, 147.3137f, 190.0f, 144.0f),
                    PathNode.LineTo(190.0f, 46.0f),
                    PathNode.LineTo(208.0f, 46.0f),
                    PathNode.CurveTo(209.10457f, 46.0f, 210.0f, 46.89543f, 210.0f, 48.0f),
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
        return _pianoKeys!!
    }

private var _pianoKeys: ImageVector? = null
