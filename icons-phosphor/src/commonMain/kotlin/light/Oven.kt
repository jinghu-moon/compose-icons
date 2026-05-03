package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Oven: ImageVector
    get() {
        if (_oven != null) return _oven!!
        _oven = phosphorLightIcon(
            name = "Oven",
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
                    PathNode.MoveTo(210.0f, 208.0f),
                    PathNode.CurveTo(210.0f, 209.10457f, 209.10457f, 210.0f, 208.0f, 210.0f),
                    PathNode.LineTo(48.0f, 210.0f),
                    PathNode.CurveTo(46.89543f, 210.0f, 46.0f, 209.10457f, 46.0f, 208.0f),
                    PathNode.LineTo(46.0f, 48.0f),
                    PathNode.CurveTo(46.0f, 46.89543f, 46.89543f, 46.0f, 48.0f, 46.0f),
                    PathNode.LineTo(208.0f, 46.0f),
                    PathNode.CurveTo(209.10457f, 46.0f, 210.0f, 46.89543f, 210.0f, 48.0f),
                    PathNode.Close,
                    PathNode.MoveTo(74.0f, 76.0f),
                    PathNode.CurveTo(74.0f, 70.47715f, 78.47715f, 66.0f, 84.0f, 66.0f),
                    PathNode.CurveTo(89.52285f, 66.0f, 94.0f, 70.47715f, 94.0f, 76.0f),
                    PathNode.CurveTo(94.0f, 81.52285f, 89.52285f, 86.0f, 84.0f, 86.0f),
                    PathNode.CurveTo(78.47715f, 86.0f, 74.0f, 81.52285f, 74.0f, 76.0f),
                    PathNode.Close,
                    PathNode.MoveTo(118.0f, 76.0f),
                    PathNode.CurveTo(118.0f, 70.47715f, 122.47715f, 66.0f, 128.0f, 66.0f),
                    PathNode.CurveTo(133.52284f, 66.0f, 138.0f, 70.47715f, 138.0f, 76.0f),
                    PathNode.CurveTo(138.0f, 81.52285f, 133.52284f, 86.0f, 128.0f, 86.0f),
                    PathNode.CurveTo(122.47715f, 86.0f, 118.0f, 81.52285f, 118.0f, 76.0f),
                    PathNode.Close,
                    PathNode.MoveTo(162.0f, 76.0f),
                    PathNode.CurveTo(162.0f, 70.47715f, 166.47716f, 66.0f, 172.0f, 66.0f),
                    PathNode.CurveTo(177.52284f, 66.0f, 182.0f, 70.47715f, 182.0f, 76.0f),
                    PathNode.CurveTo(182.0f, 81.52285f, 177.52284f, 86.0f, 172.0f, 86.0f),
                    PathNode.CurveTo(166.47716f, 86.0f, 162.0f, 81.52285f, 162.0f, 76.0f),
                    PathNode.Close,
                    PathNode.MoveTo(184.0f, 106.0f),
                    PathNode.LineTo(72.0f, 106.0f),
                    PathNode.CurveTo(68.686295f, 106.0f, 66.0f, 108.686295f, 66.0f, 112.0f),
                    PathNode.LineTo(66.0f, 184.0f),
                    PathNode.CurveTo(66.0f, 187.3137f, 68.686295f, 190.0f, 72.0f, 190.0f),
                    PathNode.LineTo(184.0f, 190.0f),
                    PathNode.CurveTo(187.3137f, 190.0f, 190.0f, 187.3137f, 190.0f, 184.0f),
                    PathNode.LineTo(190.0f, 112.0f),
                    PathNode.CurveTo(190.0f, 108.686295f, 187.3137f, 106.0f, 184.0f, 106.0f),
                    PathNode.Close,
                    PathNode.MoveTo(178.0f, 178.0f),
                    PathNode.LineTo(78.0f, 178.0f),
                    PathNode.LineTo(78.0f, 118.0f),
                    PathNode.LineTo(178.0f, 118.0f),
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
        return _oven!!
    }

private var _oven: ImageVector? = null
