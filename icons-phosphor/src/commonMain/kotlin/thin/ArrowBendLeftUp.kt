package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.ArrowBendLeftUp: ImageVector
    get() {
        if (_arrowBendLeftUp != null) return _arrowBendLeftUp!!
        _arrowBendLeftUp = phosphorThinIcon(
            name = "ArrowBendLeftUp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(204.0f, 224.0f),
                    PathNode.CurveTo(204.0f, 226.20914f, 202.20914f, 228.0f, 200.0f, 228.0f),
                    PathNode.CurveTo(144.79666f, 227.93938f, 100.06062f, 183.20334f, 100.0f, 128.0f),
                    PathNode.LineTo(100.0f, 41.66f),
                    PathNode.LineTo(58.83f, 82.83f),
                    PathNode.CurveTo(57.267033f, 84.39297f, 54.732967f, 84.39297f, 53.17f, 82.83f),
                    PathNode.CurveTo(51.607033f, 81.26704f, 51.607033f, 78.73296f, 53.17f, 77.17f),
                    PathNode.LineTo(101.17f, 29.17f),
                    PathNode.CurveTo(101.92027f, 28.418892f, 102.93836f, 27.996853f, 104.0f, 27.996853f),
                    PathNode.CurveTo(105.06164f, 27.996853f, 106.07973f, 28.418892f, 106.83f, 29.17f),
                    PathNode.LineTo(154.83f, 77.17f),
                    PathNode.CurveTo(156.39296f, 78.73296f, 156.39296f, 81.26704f, 154.83f, 82.83f),
                    PathNode.CurveTo(153.26703f, 84.39297f, 150.73297f, 84.39297f, 149.17f, 82.83f),
                    PathNode.LineTo(108.0f, 41.66f),
                    PathNode.LineTo(108.0f, 128.0f),
                    PathNode.CurveTo(108.055115f, 178.78735f, 149.21265f, 219.94489f, 200.0f, 220.0f),
                    PathNode.CurveTo(202.20914f, 220.0f, 204.0f, 221.79086f, 204.0f, 224.0f),
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
        return _arrowBendLeftUp!!
    }

private var _arrowBendLeftUp: ImageVector? = null
