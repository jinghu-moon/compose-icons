package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Headlights: ImageVector
    get() {
        if (_headlights != null) return _headlights!!
        _headlights = phosphorLightIcon(
            name = "Headlights",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(162.0f, 80.0f),
                    PathNode.CurveTo(162.0f, 76.686295f, 164.6863f, 74.0f, 168.0f, 74.0f),
                    PathNode.LineTo(240.0f, 74.0f),
                    PathNode.CurveTo(243.3137f, 74.0f, 246.0f, 76.686295f, 246.0f, 80.0f),
                    PathNode.CurveTo(246.0f, 83.313705f, 243.3137f, 86.0f, 240.0f, 86.0f),
                    PathNode.LineTo(168.0f, 86.0f),
                    PathNode.CurveTo(164.6863f, 86.0f, 162.0f, 83.313705f, 162.0f, 80.0f),
                    PathNode.Close,
                    PathNode.MoveTo(240.0f, 170.0f),
                    PathNode.LineTo(168.0f, 170.0f),
                    PathNode.CurveTo(164.6863f, 170.0f, 162.0f, 172.6863f, 162.0f, 176.0f),
                    PathNode.CurveTo(162.0f, 179.3137f, 164.6863f, 182.0f, 168.0f, 182.0f),
                    PathNode.LineTo(240.0f, 182.0f),
                    PathNode.CurveTo(243.3137f, 182.0f, 246.0f, 179.3137f, 246.0f, 176.0f),
                    PathNode.CurveTo(246.0f, 172.6863f, 243.3137f, 170.0f, 240.0f, 170.0f),
                    PathNode.Close,
                    PathNode.MoveTo(240.0f, 106.0f),
                    PathNode.LineTo(168.0f, 106.0f),
                    PathNode.CurveTo(164.6863f, 106.0f, 162.0f, 108.686295f, 162.0f, 112.0f),
                    PathNode.CurveTo(162.0f, 115.313705f, 164.6863f, 118.0f, 168.0f, 118.0f),
                    PathNode.LineTo(240.0f, 118.0f),
                    PathNode.CurveTo(243.3137f, 118.0f, 246.0f, 115.313705f, 246.0f, 112.0f),
                    PathNode.CurveTo(246.0f, 108.686295f, 243.3137f, 106.0f, 240.0f, 106.0f),
                    PathNode.Close,
                    PathNode.MoveTo(240.0f, 138.0f),
                    PathNode.LineTo(168.0f, 138.0f),
                    PathNode.CurveTo(164.6863f, 138.0f, 162.0f, 140.6863f, 162.0f, 144.0f),
                    PathNode.CurveTo(162.0f, 147.3137f, 164.6863f, 150.0f, 168.0f, 150.0f),
                    PathNode.LineTo(240.0f, 150.0f),
                    PathNode.CurveTo(243.3137f, 150.0f, 246.0f, 147.3137f, 246.0f, 144.0f),
                    PathNode.CurveTo(246.0f, 140.6863f, 243.3137f, 138.0f, 240.0f, 138.0f),
                    PathNode.Close,
                    PathNode.MoveTo(142.0f, 64.0f),
                    PathNode.LineTo(142.0f, 192.0f),
                    PathNode.CurveTo(142.0f, 199.73198f, 135.73198f, 206.0f, 128.0f, 206.0f),
                    PathNode.LineTo(88.0f, 206.0f),
                    PathNode.CurveTo(67.21048f, 206.0006f, 47.280937f, 197.70183f, 32.63602f, 182.94612f),
                    PathNode.CurveTo(17.991106f, 168.19043f, 9.842746f, 148.19893f, 10.0f, 127.41f),
                    PathNode.CurveTo(10.32f, 84.73f, 45.71f, 50.0f, 88.9f, 50.0f),
                    PathNode.LineTo(128.0f, 50.0f),
                    PathNode.CurveTo(135.73198f, 50.0f, 142.0f, 56.268013f, 142.0f, 64.0f),
                    PathNode.Close,
                    PathNode.MoveTo(130.0f, 64.0f),
                    PathNode.CurveTo(130.0f, 62.89543f, 129.10457f, 62.0f, 128.0f, 62.0f),
                    PathNode.LineTo(88.9f, 62.0f),
                    PathNode.CurveTo(52.28f, 62.0f, 22.27f, 91.38f, 22.0f, 127.5f),
                    PathNode.CurveTo(21.866734f, 145.09076f, 28.761408f, 162.00685f, 41.153282f, 174.4926f),
                    PathNode.CurveTo(53.54516f, 186.97836f, 70.40874f, 194.0005f, 88.0f, 194.0f),
                    PathNode.LineTo(128.0f, 194.0f),
                    PathNode.CurveTo(129.10457f, 194.0f, 130.0f, 193.10457f, 130.0f, 192.0f),
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
        return _headlights!!
    }

private var _headlights: ImageVector? = null
