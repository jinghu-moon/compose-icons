package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.MapPinPlus: ImageVector
    get() {
        if (_mapPinPlus != null) return _mapPinPlus!!
        _mapPinPlus = phosphorLightIcon(
            name = "MapPinPlus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(166.0f, 104.0f),
                    PathNode.CurveTo(166.0f, 107.313705f, 163.3137f, 110.0f, 160.0f, 110.0f),
                    PathNode.LineTo(134.0f, 110.0f),
                    PathNode.LineTo(134.0f, 136.0f),
                    PathNode.CurveTo(134.0f, 139.3137f, 131.3137f, 142.0f, 128.0f, 142.0f),
                    PathNode.CurveTo(124.686295f, 142.0f, 122.0f, 139.3137f, 122.0f, 136.0f),
                    PathNode.LineTo(122.0f, 110.0f),
                    PathNode.LineTo(96.0f, 110.0f),
                    PathNode.CurveTo(92.686295f, 110.0f, 90.0f, 107.313705f, 90.0f, 104.0f),
                    PathNode.CurveTo(90.0f, 100.686295f, 92.686295f, 98.0f, 96.0f, 98.0f),
                    PathNode.LineTo(122.0f, 98.0f),
                    PathNode.LineTo(122.0f, 72.0f),
                    PathNode.CurveTo(122.0f, 68.686295f, 124.686295f, 66.0f, 128.0f, 66.0f),
                    PathNode.CurveTo(131.3137f, 66.0f, 134.0f, 68.686295f, 134.0f, 72.0f),
                    PathNode.LineTo(134.0f, 98.0f),
                    PathNode.LineTo(160.0f, 98.0f),
                    PathNode.CurveTo(163.3137f, 98.0f, 166.0f, 100.686295f, 166.0f, 104.0f),
                    PathNode.Close,
                    PathNode.MoveTo(214.0f, 104.0f),
                    PathNode.CurveTo(214.0f, 134.91f, 199.66f, 167.74f, 172.53f, 198.94f),
                    PathNode.CurveTo(160.28487f, 213.09122f, 146.50345f, 225.83627f, 131.44f, 236.94f),
                    PathNode.CurveTo(129.37442f, 238.38542f, 126.62557f, 238.38542f, 124.56f, 236.94f),
                    PathNode.CurveTo(109.49655f, 225.83627f, 95.715126f, 213.09122f, 83.47f, 198.94f),
                    PathNode.CurveTo(56.34f, 167.74f, 42.0f, 134.91f, 42.0f, 104.0f),
                    PathNode.CurveTo(42.0f, 56.503513f, 80.50351f, 18.0f, 128.0f, 18.0f),
                    PathNode.CurveTo(175.49649f, 18.0f, 214.0f, 56.503513f, 214.0f, 104.0f),
                    PathNode.Close,
                    PathNode.MoveTo(202.0f, 104.0f),
                    PathNode.CurveTo(202.0f, 63.130928f, 168.86908f, 30.0f, 128.0f, 30.0f),
                    PathNode.CurveTo(87.13093f, 30.0f, 54.0f, 63.130928f, 54.0f, 104.0f),
                    PathNode.CurveTo(54.0f, 163.62f, 113.0f, 212.93f, 128.0f, 224.51f),
                    PathNode.CurveTo(143.0f, 212.93f, 202.0f, 163.62f, 202.0f, 104.0f),
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
        return _mapPinPlus!!
    }

private var _mapPinPlus: ImageVector? = null
