package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.ArrowULeftUp: ImageVector
    get() {
        if (_arrowULeftUp != null) return _arrowULeftUp!!
        _arrowULeftUp = phosphorThinIcon(
            name = "ArrowULeftUp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(204.0f, 80.0f),
                    PathNode.LineTo(204.0f, 168.0f),
                    PathNode.CurveTo(204.0f, 201.13708f, 177.13708f, 228.0f, 144.0f, 228.0f),
                    PathNode.CurveTo(110.862915f, 228.0f, 84.0f, 201.13708f, 84.0f, 168.0f),
                    PathNode.LineTo(84.0f, 41.66f),
                    PathNode.LineTo(42.83f, 82.83f),
                    PathNode.CurveTo(41.267033f, 84.39297f, 38.732967f, 84.39297f, 37.17f, 82.83f),
                    PathNode.CurveTo(35.607033f, 81.26704f, 35.607033f, 78.73296f, 37.17f, 77.17f),
                    PathNode.LineTo(85.17f, 29.17f),
                    PathNode.CurveTo(85.92027f, 28.418892f, 86.93836f, 27.996853f, 88.0f, 27.996853f),
                    PathNode.CurveTo(89.06164f, 27.996853f, 90.07973f, 28.418892f, 90.83f, 29.17f),
                    PathNode.LineTo(138.83f, 77.17f),
                    PathNode.CurveTo(140.39296f, 78.73296f, 140.39296f, 81.26704f, 138.83f, 82.83f),
                    PathNode.CurveTo(137.26703f, 84.39297f, 134.73297f, 84.39297f, 133.17f, 82.83f),
                    PathNode.LineTo(92.0f, 41.66f),
                    PathNode.LineTo(92.0f, 168.0f),
                    PathNode.CurveTo(92.0f, 196.71881f, 115.2812f, 220.0f, 144.0f, 220.0f),
                    PathNode.CurveTo(172.71881f, 220.0f, 196.0f, 196.71881f, 196.0f, 168.0f),
                    PathNode.LineTo(196.0f, 80.0f),
                    PathNode.CurveTo(196.0f, 77.79086f, 197.79086f, 76.0f, 200.0f, 76.0f),
                    PathNode.CurveTo(202.20914f, 76.0f, 204.0f, 77.79086f, 204.0f, 80.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 8.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _arrowULeftUp!!
    }

private var _arrowULeftUp: ImageVector? = null
