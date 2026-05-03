package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ComputerTower: ImageVector
    get() {
        if (_computerTower != null) return _computerTower!!
        _computerTower = phosphorLightIcon(
            name = "ComputerTower",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(166.0f, 72.0f),
                    PathNode.CurveTo(166.0f, 75.313705f, 163.3137f, 78.0f, 160.0f, 78.0f),
                    PathNode.LineTo(96.0f, 78.0f),
                    PathNode.CurveTo(92.686295f, 78.0f, 90.0f, 75.313705f, 90.0f, 72.0f),
                    PathNode.CurveTo(90.0f, 68.686295f, 92.686295f, 66.0f, 96.0f, 66.0f),
                    PathNode.LineTo(160.0f, 66.0f),
                    PathNode.CurveTo(163.3137f, 66.0f, 166.0f, 68.686295f, 166.0f, 72.0f),
                    PathNode.Close,
                    PathNode.MoveTo(160.0f, 98.0f),
                    PathNode.LineTo(96.0f, 98.0f),
                    PathNode.CurveTo(92.686295f, 98.0f, 90.0f, 100.686295f, 90.0f, 104.0f),
                    PathNode.CurveTo(90.0f, 107.313705f, 92.686295f, 110.0f, 96.0f, 110.0f),
                    PathNode.LineTo(160.0f, 110.0f),
                    PathNode.CurveTo(163.3137f, 110.0f, 166.0f, 107.313705f, 166.0f, 104.0f),
                    PathNode.CurveTo(166.0f, 100.686295f, 163.3137f, 98.0f, 160.0f, 98.0f),
                    PathNode.Close,
                    PathNode.MoveTo(206.0f, 40.0f),
                    PathNode.LineTo(206.0f, 216.0f),
                    PathNode.CurveTo(206.0f, 223.73198f, 199.73198f, 230.0f, 192.0f, 230.0f),
                    PathNode.LineTo(64.0f, 230.0f),
                    PathNode.CurveTo(56.268013f, 230.0f, 50.0f, 223.73198f, 50.0f, 216.0f),
                    PathNode.LineTo(50.0f, 40.0f),
                    PathNode.CurveTo(50.0f, 32.268013f, 56.268013f, 26.0f, 64.0f, 26.0f),
                    PathNode.LineTo(192.0f, 26.0f),
                    PathNode.CurveTo(199.73198f, 26.0f, 206.0f, 32.268013f, 206.0f, 40.0f),
                    PathNode.Close,
                    PathNode.MoveTo(194.0f, 40.0f),
                    PathNode.CurveTo(194.0f, 38.89543f, 193.10457f, 38.0f, 192.0f, 38.0f),
                    PathNode.LineTo(64.0f, 38.0f),
                    PathNode.CurveTo(62.89543f, 38.0f, 62.0f, 38.89543f, 62.0f, 40.0f),
                    PathNode.LineTo(62.0f, 216.0f),
                    PathNode.CurveTo(62.0f, 217.10457f, 62.89543f, 218.0f, 64.0f, 218.0f),
                    PathNode.LineTo(192.0f, 218.0f),
                    PathNode.CurveTo(193.10457f, 218.0f, 194.0f, 217.10457f, 194.0f, 216.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 170.0f),
                    PathNode.CurveTo(122.47715f, 170.0f, 118.0f, 174.47716f, 118.0f, 180.0f),
                    PathNode.CurveTo(118.0f, 185.52284f, 122.47715f, 190.0f, 128.0f, 190.0f),
                    PathNode.CurveTo(133.52284f, 190.0f, 138.0f, 185.52284f, 138.0f, 180.0f),
                    PathNode.CurveTo(138.0f, 174.47716f, 133.52284f, 170.0f, 128.0f, 170.0f),
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
        return _computerTower!!
    }

private var _computerTower: ImageVector? = null
