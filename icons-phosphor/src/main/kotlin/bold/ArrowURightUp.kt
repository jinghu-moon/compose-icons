package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ArrowURightUp: ImageVector
    get() {
        if (_arrowURightUp != null) return _arrowURightUp!!
        _arrowURightUp = phosphorBoldIcon(
            name = "ArrowURightUp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(224.49f, 88.49f),
                    PathNode.CurveTo(222.23837f, 90.74945f, 219.17982f, 92.01946f, 215.99f, 92.01946f),
                    PathNode.CurveTo(212.80019f, 92.01946f, 209.74162f, 90.74945f, 207.49f, 88.49f),
                    PathNode.LineTo(180.0f, 61.0f),
                    PathNode.LineTo(180.0f, 168.0f),
                    PathNode.CurveTo(180.0f, 205.55536f, 149.55536f, 236.0f, 112.0f, 236.0f),
                    PathNode.CurveTo(74.44463f, 236.0f, 44.0f, 205.55536f, 44.0f, 168.0f),
                    PathNode.LineTo(44.0f, 80.0f),
                    PathNode.CurveTo(44.0f, 73.37258f, 49.37258f, 68.0f, 56.0f, 68.0f),
                    PathNode.CurveTo(62.62742f, 68.0f, 68.0f, 73.37258f, 68.0f, 80.0f),
                    PathNode.LineTo(68.0f, 168.0f),
                    PathNode.CurveTo(68.0f, 192.30052f, 87.69947f, 212.0f, 112.0f, 212.0f),
                    PathNode.CurveTo(136.30052f, 212.0f, 156.0f, 192.30052f, 156.0f, 168.0f),
                    PathNode.LineTo(156.0f, 61.0f),
                    PathNode.LineTo(128.49f, 88.49f),
                    PathNode.CurveTo(123.79558f, 93.18442f, 116.18442f, 93.18442f, 111.49f, 88.49f),
                    PathNode.CurveTo(106.79558f, 83.79558f, 106.79558f, 76.18442f, 111.49f, 71.49f),
                    PathNode.LineTo(159.49f, 23.49f),
                    PathNode.CurveTo(161.74162f, 21.230547f, 164.80019f, 19.960535f, 167.99f, 19.960535f),
                    PathNode.CurveTo(171.17982f, 19.960535f, 174.23837f, 21.230547f, 176.49f, 23.49f),
                    PathNode.LineTo(224.49f, 71.49f),
                    PathNode.CurveTo(226.74945f, 73.74162f, 228.01947f, 76.80018f, 228.01947f, 79.99f),
                    PathNode.CurveTo(228.01947f, 83.17982f, 226.74945f, 86.23838f, 224.49f, 88.49f),
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
        return _arrowURightUp!!
    }

private var _arrowURightUp: ImageVector? = null
