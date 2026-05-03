package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Buildings: ImageVector
    get() {
        if (_buildings != null) return _buildings!!
        _buildings = phosphorLightIcon(
            name = "Buildings",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(240.0f, 210.0f),
                    PathNode.LineTo(222.0f, 210.0f),
                    PathNode.LineTo(222.0f, 96.0f),
                    PathNode.CurveTo(222.0f, 88.26801f, 215.73198f, 82.0f, 208.0f, 82.0f),
                    PathNode.LineTo(142.0f, 82.0f),
                    PathNode.LineTo(142.0f, 32.0f),
                    PathNode.CurveTo(141.99782f, 26.837017f, 139.1542f, 22.09429f, 134.60118f, 19.659878f),
                    PathNode.CurveTo(130.04816f, 17.225464f, 124.524826f, 17.494543f, 120.23f, 20.36f),
                    PathNode.LineTo(40.23f, 73.69f),
                    PathNode.CurveTo(36.336433f, 76.287735f, 33.99863f, 80.65939f, 34.0f, 85.34f),
                    PathNode.LineTo(34.0f, 210.0f),
                    PathNode.LineTo(16.0f, 210.0f),
                    PathNode.CurveTo(12.686292f, 210.0f, 10.0f, 212.6863f, 10.0f, 216.0f),
                    PathNode.CurveTo(10.0f, 219.3137f, 12.686292f, 222.0f, 16.0f, 222.0f),
                    PathNode.LineTo(240.0f, 222.0f),
                    PathNode.CurveTo(243.3137f, 222.0f, 246.0f, 219.3137f, 246.0f, 216.0f),
                    PathNode.CurveTo(246.0f, 212.6863f, 243.3137f, 210.0f, 240.0f, 210.0f),
                    PathNode.Close,
                    PathNode.MoveTo(208.0f, 94.0f),
                    PathNode.CurveTo(209.10457f, 94.0f, 210.0f, 94.89543f, 210.0f, 96.0f),
                    PathNode.LineTo(210.0f, 210.0f),
                    PathNode.LineTo(142.0f, 210.0f),
                    PathNode.LineTo(142.0f, 94.0f),
                    PathNode.Close,
                    PathNode.MoveTo(46.0f, 85.34f),
                    PathNode.CurveTo(46.001236f, 84.67286f, 46.335037f, 84.05026f, 46.89f, 83.68f),
                    PathNode.LineTo(126.89f, 30.34f),
                    PathNode.CurveTo(127.50312f, 29.930931f, 128.29153f, 29.892239f, 128.94177f, 30.239307f),
                    PathNode.CurveTo(129.592f, 30.586374f, 129.99864f, 31.262943f, 130.0f, 32.0f),
                    PathNode.LineTo(130.0f, 210.0f),
                    PathNode.LineTo(46.0f, 210.0f),
                    PathNode.Close,
                    PathNode.MoveTo(110.0f, 112.0f),
                    PathNode.LineTo(110.0f, 128.0f),
                    PathNode.CurveTo(110.0f, 131.3137f, 107.313705f, 134.0f, 104.0f, 134.0f),
                    PathNode.CurveTo(100.686295f, 134.0f, 98.0f, 131.3137f, 98.0f, 128.0f),
                    PathNode.LineTo(98.0f, 112.0f),
                    PathNode.CurveTo(98.0f, 108.686295f, 100.686295f, 106.0f, 104.0f, 106.0f),
                    PathNode.CurveTo(107.313705f, 106.0f, 110.0f, 108.686295f, 110.0f, 112.0f),
                    PathNode.Close,
                    PathNode.MoveTo(78.0f, 112.0f),
                    PathNode.LineTo(78.0f, 128.0f),
                    PathNode.CurveTo(78.0f, 131.3137f, 75.313705f, 134.0f, 72.0f, 134.0f),
                    PathNode.CurveTo(68.686295f, 134.0f, 66.0f, 131.3137f, 66.0f, 128.0f),
                    PathNode.LineTo(66.0f, 112.0f),
                    PathNode.CurveTo(66.0f, 108.686295f, 68.686295f, 106.0f, 72.0f, 106.0f),
                    PathNode.CurveTo(75.313705f, 106.0f, 78.0f, 108.686295f, 78.0f, 112.0f),
                    PathNode.Close,
                    PathNode.MoveTo(78.0f, 168.0f),
                    PathNode.LineTo(78.0f, 184.0f),
                    PathNode.CurveTo(78.0f, 187.3137f, 75.313705f, 190.0f, 72.0f, 190.0f),
                    PathNode.CurveTo(68.686295f, 190.0f, 66.0f, 187.3137f, 66.0f, 184.0f),
                    PathNode.LineTo(66.0f, 168.0f),
                    PathNode.CurveTo(66.0f, 164.6863f, 68.686295f, 162.0f, 72.0f, 162.0f),
                    PathNode.CurveTo(75.313705f, 162.0f, 78.0f, 164.6863f, 78.0f, 168.0f),
                    PathNode.Close,
                    PathNode.MoveTo(110.0f, 168.0f),
                    PathNode.LineTo(110.0f, 184.0f),
                    PathNode.CurveTo(110.0f, 187.3137f, 107.313705f, 190.0f, 104.0f, 190.0f),
                    PathNode.CurveTo(100.686295f, 190.0f, 98.0f, 187.3137f, 98.0f, 184.0f),
                    PathNode.LineTo(98.0f, 168.0f),
                    PathNode.CurveTo(98.0f, 164.6863f, 100.686295f, 162.0f, 104.0f, 162.0f),
                    PathNode.CurveTo(107.313705f, 162.0f, 110.0f, 164.6863f, 110.0f, 168.0f),
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
        return _buildings!!
    }

private var _buildings: ImageVector? = null
