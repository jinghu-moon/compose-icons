package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Archive: ImageVector
    get() {
        if (_archive != null) return _archive!!
        _archive = phosphorLightIcon(
            name = "Archive",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(224.0f, 50.0f),
                    PathNode.LineTo(32.0f, 50.0f),
                    PathNode.CurveTo(24.268015f, 50.0f, 18.0f, 56.268013f, 18.0f, 64.0f),
                    PathNode.LineTo(18.0f, 88.0f),
                    PathNode.CurveTo(18.0f, 95.73199f, 24.268015f, 102.0f, 32.0f, 102.0f),
                    PathNode.LineTo(34.0f, 102.0f),
                    PathNode.LineTo(34.0f, 192.0f),
                    PathNode.CurveTo(34.0f, 199.73198f, 40.268013f, 206.0f, 48.0f, 206.0f),
                    PathNode.LineTo(208.0f, 206.0f),
                    PathNode.CurveTo(215.73198f, 206.0f, 222.0f, 199.73198f, 222.0f, 192.0f),
                    PathNode.LineTo(222.0f, 102.0f),
                    PathNode.LineTo(224.0f, 102.0f),
                    PathNode.CurveTo(231.73198f, 102.0f, 238.0f, 95.73199f, 238.0f, 88.0f),
                    PathNode.LineTo(238.0f, 64.0f),
                    PathNode.CurveTo(238.0f, 56.268013f, 231.73198f, 50.0f, 224.0f, 50.0f),
                    PathNode.Close,
                    PathNode.MoveTo(210.0f, 192.0f),
                    PathNode.CurveTo(210.0f, 193.10457f, 209.10457f, 194.0f, 208.0f, 194.0f),
                    PathNode.LineTo(48.0f, 194.0f),
                    PathNode.CurveTo(46.89543f, 194.0f, 46.0f, 193.10457f, 46.0f, 192.0f),
                    PathNode.LineTo(46.0f, 102.0f),
                    PathNode.LineTo(210.0f, 102.0f),
                    PathNode.Close,
                    PathNode.MoveTo(226.0f, 88.0f),
                    PathNode.CurveTo(226.0f, 89.10457f, 225.10457f, 90.0f, 224.0f, 90.0f),
                    PathNode.LineTo(32.0f, 90.0f),
                    PathNode.CurveTo(30.89543f, 90.0f, 30.0f, 89.10457f, 30.0f, 88.0f),
                    PathNode.LineTo(30.0f, 64.0f),
                    PathNode.CurveTo(30.0f, 62.89543f, 30.89543f, 62.0f, 32.0f, 62.0f),
                    PathNode.LineTo(224.0f, 62.0f),
                    PathNode.CurveTo(225.10457f, 62.0f, 226.0f, 62.89543f, 226.0f, 64.0f),
                    PathNode.Close,
                    PathNode.MoveTo(98.0f, 136.0f),
                    PathNode.CurveTo(98.0f, 132.6863f, 100.686295f, 130.0f, 104.0f, 130.0f),
                    PathNode.LineTo(152.0f, 130.0f),
                    PathNode.CurveTo(155.3137f, 130.0f, 158.0f, 132.6863f, 158.0f, 136.0f),
                    PathNode.CurveTo(158.0f, 139.3137f, 155.3137f, 142.0f, 152.0f, 142.0f),
                    PathNode.LineTo(104.0f, 142.0f),
                    PathNode.CurveTo(100.686295f, 142.0f, 98.0f, 139.3137f, 98.0f, 136.0f),
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
        return _archive!!
    }

private var _archive: ImageVector? = null
