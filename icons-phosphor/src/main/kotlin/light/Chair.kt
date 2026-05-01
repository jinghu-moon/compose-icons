package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Chair: ImageVector
    get() {
        if (_chair != null) return _chair!!
        _chair = phosphorLightIcon(
            name = "Chair",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(208.0f, 138.0f),
                    PathNode.LineTo(174.0f, 138.0f),
                    PathNode.LineTo(174.0f, 102.0f),
                    PathNode.LineTo(192.0f, 102.0f),
                    PathNode.CurveTo(199.73198f, 102.0f, 206.0f, 95.73199f, 206.0f, 88.0f),
                    PathNode.LineTo(206.0f, 40.0f),
                    PathNode.CurveTo(206.0f, 32.268013f, 199.73198f, 26.0f, 192.0f, 26.0f),
                    PathNode.LineTo(64.0f, 26.0f),
                    PathNode.CurveTo(56.268013f, 26.0f, 50.0f, 32.268013f, 50.0f, 40.0f),
                    PathNode.LineTo(50.0f, 88.0f),
                    PathNode.CurveTo(50.0f, 95.73199f, 56.268013f, 102.0f, 64.0f, 102.0f),
                    PathNode.LineTo(82.0f, 102.0f),
                    PathNode.LineTo(82.0f, 138.0f),
                    PathNode.LineTo(48.0f, 138.0f),
                    PathNode.CurveTo(40.268013f, 138.0f, 34.0f, 144.26802f, 34.0f, 152.0f),
                    PathNode.LineTo(34.0f, 168.0f),
                    PathNode.CurveTo(34.0f, 175.73198f, 40.268013f, 182.0f, 48.0f, 182.0f),
                    PathNode.LineTo(58.0f, 182.0f),
                    PathNode.LineTo(58.0f, 224.0f),
                    PathNode.CurveTo(58.0f, 227.3137f, 60.68629f, 230.0f, 64.0f, 230.0f),
                    PathNode.CurveTo(67.313705f, 230.0f, 70.0f, 227.3137f, 70.0f, 224.0f),
                    PathNode.LineTo(70.0f, 182.0f),
                    PathNode.LineTo(186.0f, 182.0f),
                    PathNode.LineTo(186.0f, 224.0f),
                    PathNode.CurveTo(186.0f, 227.3137f, 188.6863f, 230.0f, 192.0f, 230.0f),
                    PathNode.CurveTo(195.3137f, 230.0f, 198.0f, 227.3137f, 198.0f, 224.0f),
                    PathNode.LineTo(198.0f, 182.0f),
                    PathNode.LineTo(208.0f, 182.0f),
                    PathNode.CurveTo(215.73198f, 182.0f, 222.0f, 175.73198f, 222.0f, 168.0f),
                    PathNode.LineTo(222.0f, 152.0f),
                    PathNode.CurveTo(222.0f, 144.26802f, 215.73198f, 138.0f, 208.0f, 138.0f),
                    PathNode.Close,
                    PathNode.MoveTo(62.0f, 88.0f),
                    PathNode.LineTo(62.0f, 40.0f),
                    PathNode.CurveTo(62.0f, 38.89543f, 62.89543f, 38.0f, 64.0f, 38.0f),
                    PathNode.LineTo(192.0f, 38.0f),
                    PathNode.CurveTo(193.10457f, 38.0f, 194.0f, 38.89543f, 194.0f, 40.0f),
                    PathNode.LineTo(194.0f, 88.0f),
                    PathNode.CurveTo(194.0f, 89.10457f, 193.10457f, 90.0f, 192.0f, 90.0f),
                    PathNode.LineTo(64.0f, 90.0f),
                    PathNode.CurveTo(62.89543f, 90.0f, 62.0f, 89.10457f, 62.0f, 88.0f),
                    PathNode.Close,
                    PathNode.MoveTo(94.0f, 102.0f),
                    PathNode.LineTo(162.0f, 102.0f),
                    PathNode.LineTo(162.0f, 138.0f),
                    PathNode.LineTo(94.0f, 138.0f),
                    PathNode.Close,
                    PathNode.MoveTo(210.0f, 168.0f),
                    PathNode.CurveTo(210.0f, 169.10457f, 209.10457f, 170.0f, 208.0f, 170.0f),
                    PathNode.LineTo(48.0f, 170.0f),
                    PathNode.CurveTo(46.89543f, 170.0f, 46.0f, 169.10457f, 46.0f, 168.0f),
                    PathNode.LineTo(46.0f, 152.0f),
                    PathNode.CurveTo(46.0f, 150.89543f, 46.89543f, 150.0f, 48.0f, 150.0f),
                    PathNode.LineTo(208.0f, 150.0f),
                    PathNode.CurveTo(209.10457f, 150.0f, 210.0f, 150.89543f, 210.0f, 152.0f),
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
        return _chair!!
    }

private var _chair: ImageVector? = null
