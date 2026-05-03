package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.MapPinLine: ImageVector
    get() {
        if (_mapPinLine != null) return _mapPinLine!!
        _mapPinLine = phosphorLightIcon(
            name = "MapPinLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(200.0f, 226.0f),
                    PathNode.LineTo(145.22f, 226.0f),
                    PathNode.CurveTo(154.96324f, 217.64958f, 164.09033f, 208.60603f, 172.53f, 198.94f),
                    PathNode.CurveTo(199.66f, 167.74f, 214.0f, 134.94f, 214.0f, 104.0f),
                    PathNode.CurveTo(214.0f, 56.503513f, 175.49649f, 18.0f, 128.0f, 18.0f),
                    PathNode.CurveTo(80.50351f, 18.0f, 42.0f, 56.503513f, 42.0f, 104.0f),
                    PathNode.CurveTo(42.0f, 134.91f, 56.34f, 167.74f, 83.47f, 198.94f),
                    PathNode.CurveTo(91.90966f, 208.60603f, 101.03676f, 217.64958f, 110.78f, 226.0f),
                    PathNode.LineTo(56.0f, 226.0f),
                    PathNode.CurveTo(52.68629f, 226.0f, 50.0f, 228.6863f, 50.0f, 232.0f),
                    PathNode.CurveTo(50.0f, 235.3137f, 52.68629f, 238.0f, 56.0f, 238.0f),
                    PathNode.LineTo(200.0f, 238.0f),
                    PathNode.CurveTo(203.3137f, 238.0f, 206.0f, 235.3137f, 206.0f, 232.0f),
                    PathNode.CurveTo(206.0f, 228.6863f, 203.3137f, 226.0f, 200.0f, 226.0f),
                    PathNode.Close,
                    PathNode.MoveTo(54.0f, 104.0f),
                    PathNode.CurveTo(54.0f, 63.130928f, 87.13093f, 30.0f, 128.0f, 30.0f),
                    PathNode.CurveTo(168.86908f, 30.0f, 202.0f, 63.130928f, 202.0f, 104.0f),
                    PathNode.CurveTo(202.0f, 163.62f, 143.0f, 212.93f, 128.0f, 224.51f),
                    PathNode.CurveTo(113.0f, 212.93f, 54.0f, 163.62f, 54.0f, 104.0f),
                    PathNode.Close,
                    PathNode.MoveTo(166.0f, 104.0f),
                    PathNode.CurveTo(166.0f, 83.013176f, 148.98682f, 66.0f, 128.0f, 66.0f),
                    PathNode.CurveTo(107.013176f, 66.0f, 90.0f, 83.013176f, 90.0f, 104.0f),
                    PathNode.CurveTo(90.0f, 124.986824f, 107.013176f, 142.0f, 128.0f, 142.0f),
                    PathNode.CurveTo(148.98682f, 142.0f, 166.0f, 124.986824f, 166.0f, 104.0f),
                    PathNode.Close,
                    PathNode.MoveTo(102.0f, 104.0f),
                    PathNode.CurveTo(102.0f, 89.640594f, 113.640594f, 78.0f, 128.0f, 78.0f),
                    PathNode.CurveTo(142.3594f, 78.0f, 154.0f, 89.640594f, 154.0f, 104.0f),
                    PathNode.CurveTo(154.0f, 118.359406f, 142.3594f, 130.0f, 128.0f, 130.0f),
                    PathNode.CurveTo(113.640594f, 130.0f, 102.0f, 118.359406f, 102.0f, 104.0f),
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
        return _mapPinLine!!
    }

private var _mapPinLine: ImageVector? = null
