package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.CaretDoubleUp: ImageVector
    get() {
        if (_caretDoubleUp != null) return _caretDoubleUp!!
        _caretDoubleUp = phosphorThinIcon(
            name = "CaretDoubleUp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(210.83f, 197.17f),
                    PathNode.CurveTo(212.39296f, 198.73297f, 212.39296f, 201.26703f, 210.83f, 202.83f),
                    PathNode.CurveTo(209.26703f, 204.39296f, 206.73297f, 204.39296f, 205.17f, 202.83f),
                    PathNode.LineTo(128.0f, 125.66f),
                    PathNode.LineTo(50.83f, 202.83f),
                    PathNode.CurveTo(49.267033f, 204.39296f, 46.732967f, 204.39296f, 45.17f, 202.83f),
                    PathNode.CurveTo(43.607033f, 201.26703f, 43.607033f, 198.73297f, 45.17f, 197.17f),
                    PathNode.LineTo(125.17f, 117.17f),
                    PathNode.CurveTo(125.92027f, 116.418884f, 126.93836f, 115.99686f, 128.0f, 115.99686f),
                    PathNode.CurveTo(129.06163f, 115.99686f, 130.07973f, 116.418884f, 130.83f, 117.17f),
                    PathNode.Close,
                    PathNode.MoveTo(50.83f, 122.83f),
                    PathNode.LineTo(128.0f, 45.66f),
                    PathNode.LineTo(205.17f, 122.83f),
                    PathNode.CurveTo(206.73297f, 124.39297f, 209.26703f, 124.39297f, 210.83f, 122.83f),
                    PathNode.CurveTo(212.39296f, 121.26704f, 212.39296f, 118.73296f, 210.83f, 117.17f),
                    PathNode.LineTo(130.83f, 37.17f),
                    PathNode.CurveTo(130.07973f, 36.41889f, 129.06163f, 35.996853f, 128.0f, 35.996853f),
                    PathNode.CurveTo(126.93836f, 35.996853f, 125.92027f, 36.41889f, 125.17f, 37.17f),
                    PathNode.LineTo(45.17f, 117.17f),
                    PathNode.CurveTo(43.607033f, 118.73296f, 43.607033f, 121.26704f, 45.17f, 122.83f),
                    PathNode.CurveTo(46.732967f, 124.39297f, 49.267033f, 124.39297f, 50.83f, 122.83f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 8.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _caretDoubleUp!!
    }

private var _caretDoubleUp: ImageVector? = null
