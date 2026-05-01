package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.CaretDoubleLeft: ImageVector
    get() {
        if (_caretDoubleLeft != null) return _caretDoubleLeft!!
        _caretDoubleLeft = phosphorThinIcon(
            name = "CaretDoubleLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(202.83f, 205.17f),
                    PathNode.CurveTo(204.39296f, 206.73297f, 204.39296f, 209.26703f, 202.83f, 210.83f),
                    PathNode.CurveTo(201.26703f, 212.39296f, 198.73297f, 212.39296f, 197.17f, 210.83f),
                    PathNode.LineTo(117.17f, 130.83f),
                    PathNode.CurveTo(116.418884f, 130.07973f, 115.99686f, 129.06163f, 115.99686f, 128.0f),
                    PathNode.CurveTo(115.99686f, 126.93836f, 116.418884f, 125.92027f, 117.17f, 125.17f),
                    PathNode.LineTo(197.17f, 45.17f),
                    PathNode.CurveTo(198.73297f, 43.607033f, 201.26703f, 43.607033f, 202.83f, 45.17f),
                    PathNode.CurveTo(204.39296f, 46.732967f, 204.39296f, 49.267033f, 202.83f, 50.83f),
                    PathNode.LineTo(125.66f, 128.0f),
                    PathNode.Close,
                    PathNode.MoveTo(45.66f, 128.0f),
                    PathNode.LineTo(122.83f, 50.83f),
                    PathNode.CurveTo(124.39297f, 49.267033f, 124.39297f, 46.732967f, 122.83f, 45.17f),
                    PathNode.CurveTo(121.26704f, 43.607033f, 118.73296f, 43.607033f, 117.17f, 45.17f),
                    PathNode.LineTo(37.17f, 125.17f),
                    PathNode.CurveTo(36.41889f, 125.92027f, 35.996853f, 126.93836f, 35.996853f, 128.0f),
                    PathNode.CurveTo(35.996853f, 129.06163f, 36.41889f, 130.07973f, 37.17f, 130.83f),
                    PathNode.LineTo(117.17f, 210.83f),
                    PathNode.CurveTo(118.73296f, 212.39296f, 121.26704f, 212.39296f, 122.83f, 210.83f),
                    PathNode.CurveTo(124.39297f, 209.26703f, 124.39297f, 206.73297f, 122.83f, 205.17f),
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
        return _caretDoubleLeft!!
    }

private var _caretDoubleLeft: ImageVector? = null
