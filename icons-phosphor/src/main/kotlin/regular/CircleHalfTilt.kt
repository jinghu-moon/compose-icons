package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.CircleHalfTilt: ImageVector
    get() {
        if (_circleHalfTilt != null) return _circleHalfTilt!!
        _circleHalfTilt = phosphorRegularIcon(
            name = "CircleHalfTilt",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(201.54f, 54.46f),
                    PathNode.CurveTo(160.92497f, 13.84498f, 95.07501f, 13.84498f, 54.46f, 54.46f),
                    PathNode.CurveTo(13.84498f, 95.07501f, 13.84498f, 160.92497f, 54.46f, 201.54f),
                    PathNode.CurveTo(95.07501f, 242.15501f, 160.92497f, 242.15501f, 201.54f, 201.54f),
                    PathNode.CurveTo(242.15501f, 160.92497f, 242.15501f, 95.07501f, 201.54f, 54.46f),
                    PathNode.Close,
                    PathNode.MoveTo(184.0f, 195.87f),
                    PathNode.CurveTo(179.06825f, 199.94669f, 173.70258f, 203.46791f, 168.0f, 206.37f),
                    PathNode.LineTo(168.0f, 99.31f),
                    PathNode.LineTo(184.0f, 83.31f),
                    PathNode.Close,
                    PathNode.MoveTo(104.0f, 163.31f),
                    PathNode.LineTo(120.0f, 147.31f),
                    PathNode.LineTo(120.0f, 215.59f),
                    PathNode.CurveTo(114.58572f, 215.08441f, 109.229675f, 214.08015f, 104.0f, 212.59f),
                    PathNode.Close,
                    PathNode.MoveTo(88.0f, 206.37f),
                    PathNode.CurveTo(82.180016f, 203.40652f, 76.712234f, 199.79712f, 71.7f, 195.61f),
                    PathNode.LineTo(88.0f, 179.31f),
                    PathNode.Close,
                    PathNode.MoveTo(136.0f, 131.31f),
                    PathNode.LineTo(152.0f, 115.31f),
                    PathNode.LineTo(152.0f, 212.63f),
                    PathNode.CurveTo(146.77032f, 214.12015f, 141.41428f, 215.1244f, 136.0f, 215.63f),
                    PathNode.Close,
                    PathNode.MoveTo(40.0f, 128.0f),
                    PathNode.CurveTo(40.00917f, 93.86724f, 59.75535f, 62.818478f, 90.66368f, 48.336758f),
                    PathNode.CurveTo(121.572014f, 33.855038f, 158.06679f, 38.55279f, 184.3f, 60.39f),
                    PathNode.LineTo(60.38f, 184.31f),
                    PathNode.CurveTo(47.163055f, 168.5282f, 39.94518f, 148.58519f, 40.0f, 128.0f),
                    PathNode.Close,
                    PathNode.MoveTo(200.0f, 178.59f),
                    PathNode.LineTo(200.0f, 77.41f),
                    PathNode.CurveTo(221.3273f, 107.76505f, 221.3273f, 148.23495f, 200.0f, 178.59f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _circleHalfTilt!!
    }

private var _circleHalfTilt: ImageVector? = null
