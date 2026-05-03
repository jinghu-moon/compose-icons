package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ArrowBendLeftUp: ImageVector
    get() {
        if (_arrowBendLeftUp != null) return _arrowBendLeftUp!!
        _arrowBendLeftUp = phosphorBoldIcon(
            name = "ArrowBendLeftUp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(212.0f, 224.0f),
                    PathNode.CurveTo(212.0f, 230.62741f, 206.62741f, 236.0f, 200.0f, 236.0f),
                    PathNode.CurveTo(140.38066f, 235.93387f, 92.06613f, 187.61934f, 92.0f, 128.0f),
                    PathNode.LineTo(92.0f, 61.0f),
                    PathNode.LineTo(64.49f, 88.49f),
                    PathNode.CurveTo(59.79558f, 93.18442f, 52.18442f, 93.18442f, 47.49f, 88.49f),
                    PathNode.CurveTo(42.79558f, 83.79558f, 42.79558f, 76.18442f, 47.49f, 71.49f),
                    PathNode.LineTo(95.49f, 23.49f),
                    PathNode.CurveTo(97.74162f, 21.230547f, 100.80018f, 19.960535f, 103.99f, 19.960535f),
                    PathNode.CurveTo(107.17982f, 19.960535f, 110.23838f, 21.230547f, 112.49f, 23.49f),
                    PathNode.LineTo(160.49f, 71.49f),
                    PathNode.CurveTo(165.18442f, 76.18442f, 165.18442f, 83.79558f, 160.49f, 88.49f),
                    PathNode.CurveTo(155.79558f, 93.18442f, 148.18442f, 93.18442f, 143.49f, 88.49f),
                    PathNode.LineTo(116.0f, 61.0f),
                    PathNode.LineTo(116.0f, 128.0f),
                    PathNode.CurveTo(116.04961f, 174.37135f, 153.62865f, 211.9504f, 200.0f, 212.0f),
                    PathNode.CurveTo(206.62741f, 212.0f, 212.0f, 217.37259f, 212.0f, 224.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 24.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _arrowBendLeftUp!!
    }

private var _arrowBendLeftUp: ImageVector? = null
