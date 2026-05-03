package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.CircleHalfTilt: ImageVector
    get() {
        if (_circleHalfTilt != null) return _circleHalfTilt!!
        _circleHalfTilt = phosphorDuotoneIcon(
            name = "CircleHalfTilt",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(195.88f, 195.88f),
                    PathNode.CurveTo(158.39018f, 233.36732f, 97.60982f, 233.36732f, 60.12f, 195.88f),
                    PathNode.LineTo(195.88f, 60.12f),
                    PathNode.CurveTo(233.36732f, 97.60982f, 233.36732f, 158.39018f, 195.88f, 195.88f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 0.2f,
                stroke = null,
                strokeAlpha = 0.2f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(201.54f, 54.46f),
                    PathNode.CurveTo(160.92497f, 13.84498f, 95.07501f, 13.84498f, 54.46f, 54.46f),
                    PathNode.CurveTo(13.84498f, 95.07501f, 13.84498f, 160.92497f, 54.46f, 201.54f),
                    PathNode.CurveTo(95.07501f, 242.15501f, 160.92497f, 242.15501f, 201.54f, 201.54f),
                    PathNode.CurveTo(242.15501f, 160.92497f, 242.15501f, 95.07501f, 201.54f, 54.46f),
                    PathNode.Close,
                    PathNode.MoveTo(65.78f, 65.77f),
                    PathNode.CurveTo(97.97347f, 33.648285f, 149.3287f, 31.317108f, 184.3f, 60.39f),
                    PathNode.LineTo(60.38f, 184.31f),
                    PathNode.CurveTo(31.261858f, 149.34326f, 33.603287f, 97.9445f, 65.78f, 65.77f),
                    PathNode.Close,
                    PathNode.MoveTo(190.22f, 190.23f),
                    PathNode.CurveTo(158.02246f, 222.34248f, 106.6745f, 224.67332f, 71.7f, 195.61f),
                    PathNode.LineTo(195.62f, 71.69f),
                    PathNode.CurveTo(224.73814f, 106.656746f, 222.39671f, 158.05551f, 190.22f, 190.23f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _circleHalfTilt!!
    }

private var _circleHalfTilt: ImageVector? = null
