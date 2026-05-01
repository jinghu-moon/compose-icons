package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ArrowBendRightUp: ImageVector
    get() {
        if (_arrowBendRightUp != null) return _arrowBendRightUp!!
        _arrowBendRightUp = phosphorBoldIcon(
            name = "ArrowBendRightUp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(208.49f, 88.49f),
                    PathNode.CurveTo(206.23837f, 90.74945f, 203.17982f, 92.01946f, 199.99f, 92.01946f),
                    PathNode.CurveTo(196.80019f, 92.01946f, 193.74162f, 90.74945f, 191.49f, 88.49f),
                    PathNode.LineTo(164.0f, 61.0f),
                    PathNode.LineTo(164.0f, 128.0f),
                    PathNode.CurveTo(163.93387f, 187.61934f, 115.61934f, 235.93387f, 56.0f, 236.0f),
                    PathNode.CurveTo(49.37258f, 236.0f, 44.0f, 230.62741f, 44.0f, 224.0f),
                    PathNode.CurveTo(44.0f, 217.37259f, 49.37258f, 212.0f, 56.0f, 212.0f),
                    PathNode.CurveTo(102.37135f, 211.9504f, 139.9504f, 174.37135f, 140.0f, 128.0f),
                    PathNode.LineTo(140.0f, 61.0f),
                    PathNode.LineTo(112.49f, 88.49f),
                    PathNode.CurveTo(107.79558f, 93.18442f, 100.18442f, 93.18442f, 95.49f, 88.49f),
                    PathNode.CurveTo(90.79558f, 83.79558f, 90.79558f, 76.18442f, 95.49f, 71.49f),
                    PathNode.LineTo(143.49f, 23.49f),
                    PathNode.CurveTo(145.74162f, 21.230547f, 148.80019f, 19.960535f, 151.99f, 19.960535f),
                    PathNode.CurveTo(155.17982f, 19.960535f, 158.23837f, 21.230547f, 160.49f, 23.49f),
                    PathNode.LineTo(208.49f, 71.49f),
                    PathNode.CurveTo(210.74945f, 73.74162f, 212.01947f, 76.80018f, 212.01947f, 79.99f),
                    PathNode.CurveTo(212.01947f, 83.17982f, 210.74945f, 86.23838f, 208.49f, 88.49f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 24.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _arrowBendRightUp!!
    }

private var _arrowBendRightUp: ImageVector? = null
