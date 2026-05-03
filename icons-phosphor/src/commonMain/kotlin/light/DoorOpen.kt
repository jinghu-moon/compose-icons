package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.DoorOpen: ImageVector
    get() {
        if (_doorOpen != null) return _doorOpen!!
        _doorOpen = phosphorLightIcon(
            name = "DoorOpen",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(232.0f, 218.0f),
                    PathNode.LineTo(206.0f, 218.0f),
                    PathNode.LineTo(206.0f, 40.0f),
                    PathNode.CurveTo(206.0f, 32.268013f, 199.73198f, 26.0f, 192.0f, 26.0f),
                    PathNode.LineTo(64.0f, 26.0f),
                    PathNode.CurveTo(56.268013f, 26.0f, 50.0f, 32.268013f, 50.0f, 40.0f),
                    PathNode.LineTo(50.0f, 218.0f),
                    PathNode.LineTo(24.0f, 218.0f),
                    PathNode.CurveTo(20.68629f, 218.0f, 18.0f, 220.6863f, 18.0f, 224.0f),
                    PathNode.CurveTo(18.0f, 227.3137f, 20.68629f, 230.0f, 24.0f, 230.0f),
                    PathNode.LineTo(232.0f, 230.0f),
                    PathNode.CurveTo(235.3137f, 230.0f, 238.0f, 227.3137f, 238.0f, 224.0f),
                    PathNode.CurveTo(238.0f, 220.6863f, 235.3137f, 218.0f, 232.0f, 218.0f),
                    PathNode.Close,
                    PathNode.MoveTo(194.0f, 40.0f),
                    PathNode.LineTo(194.0f, 218.0f),
                    PathNode.LineTo(174.0f, 218.0f),
                    PathNode.LineTo(174.0f, 38.0f),
                    PathNode.LineTo(192.0f, 38.0f),
                    PathNode.CurveTo(193.10457f, 38.0f, 194.0f, 38.89543f, 194.0f, 40.0f),
                    PathNode.Close,
                    PathNode.MoveTo(62.0f, 40.0f),
                    PathNode.CurveTo(62.0f, 38.89543f, 62.89543f, 38.0f, 64.0f, 38.0f),
                    PathNode.LineTo(162.0f, 38.0f),
                    PathNode.LineTo(162.0f, 218.0f),
                    PathNode.LineTo(62.0f, 218.0f),
                    PathNode.Close,
                    PathNode.MoveTo(142.0f, 132.0f),
                    PathNode.CurveTo(142.0f, 137.52284f, 137.52284f, 142.0f, 132.0f, 142.0f),
                    PathNode.CurveTo(126.47715f, 142.0f, 122.0f, 137.52284f, 122.0f, 132.0f),
                    PathNode.CurveTo(122.0f, 126.47715f, 126.47715f, 122.0f, 132.0f, 122.0f),
                    PathNode.CurveTo(137.52284f, 122.0f, 142.0f, 126.47715f, 142.0f, 132.0f),
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
        return _doorOpen!!
    }

private var _doorOpen: ImageVector? = null
