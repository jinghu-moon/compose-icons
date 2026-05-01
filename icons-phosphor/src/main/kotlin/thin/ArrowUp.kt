package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.ArrowUp: ImageVector
    get() {
        if (_arrowUp != null) return _arrowUp!!
        _arrowUp = phosphorThinIcon(
            name = "ArrowUp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(202.83f, 114.83f),
                    PathNode.CurveTo(202.07973f, 115.581116f, 201.06163f, 116.00314f, 200.0f, 116.00314f),
                    PathNode.CurveTo(198.93837f, 116.00314f, 197.92027f, 115.581116f, 197.17f, 114.83f),
                    PathNode.LineTo(132.0f, 49.66f),
                    PathNode.LineTo(132.0f, 216.0f),
                    PathNode.CurveTo(132.0f, 218.20914f, 130.20914f, 220.0f, 128.0f, 220.0f),
                    PathNode.CurveTo(125.79086f, 220.0f, 124.0f, 218.20914f, 124.0f, 216.0f),
                    PathNode.LineTo(124.0f, 49.66f),
                    PathNode.LineTo(58.83f, 114.83f),
                    PathNode.CurveTo(57.267033f, 116.39297f, 54.732967f, 116.39297f, 53.17f, 114.83f),
                    PathNode.CurveTo(51.607033f, 113.26704f, 51.607033f, 110.73296f, 53.17f, 109.17f),
                    PathNode.LineTo(125.17f, 37.17f),
                    PathNode.CurveTo(125.92027f, 36.41889f, 126.93836f, 35.996853f, 128.0f, 35.996853f),
                    PathNode.CurveTo(129.06163f, 35.996853f, 130.07973f, 36.41889f, 130.83f, 37.17f),
                    PathNode.LineTo(202.83f, 109.17f),
                    PathNode.CurveTo(203.58112f, 109.92027f, 204.00314f, 110.93836f, 204.00314f, 112.0f),
                    PathNode.CurveTo(204.00314f, 113.06164f, 203.58112f, 114.07973f, 202.83f, 114.83f),
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
        return _arrowUp!!
    }

private var _arrowUp: ImageVector? = null
