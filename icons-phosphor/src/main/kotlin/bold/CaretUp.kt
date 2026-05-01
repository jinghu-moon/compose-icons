package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.CaretUp: ImageVector
    get() {
        if (_caretUp != null) return _caretUp!!
        _caretUp = phosphorBoldIcon(
            name = "CaretUp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(216.49f, 168.49f),
                    PathNode.CurveTo(214.23837f, 170.74945f, 211.17982f, 172.01947f, 207.99f, 172.01947f),
                    PathNode.CurveTo(204.80019f, 172.01947f, 201.74162f, 170.74945f, 199.49f, 168.49f),
                    PathNode.LineTo(128.0f, 97.0f),
                    PathNode.LineTo(56.49f, 168.49f),
                    PathNode.CurveTo(51.79558f, 173.18442f, 44.18442f, 173.18442f, 39.49f, 168.49f),
                    PathNode.CurveTo(34.79558f, 163.79558f, 34.79558f, 156.18442f, 39.49f, 151.49f),
                    PathNode.LineTo(119.49f, 71.49f),
                    PathNode.CurveTo(121.74162f, 69.230545f, 124.80018f, 67.96054f, 127.99f, 67.96054f),
                    PathNode.CurveTo(131.17982f, 67.96054f, 134.23837f, 69.230545f, 136.49f, 71.49f),
                    PathNode.LineTo(216.49f, 151.49f),
                    PathNode.CurveTo(218.74945f, 153.74162f, 220.01947f, 156.80019f, 220.01947f, 159.99f),
                    PathNode.CurveTo(220.01947f, 163.17982f, 218.74945f, 166.23837f, 216.49f, 168.49f),
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
        return _caretUp!!
    }

private var _caretUp: ImageVector? = null
