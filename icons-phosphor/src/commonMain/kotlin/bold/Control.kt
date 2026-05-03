package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Control: ImageVector
    get() {
        if (_control != null) return _control!!
        _control = phosphorBoldIcon(
            name = "Control",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(208.49f, 128.49f),
                    PathNode.CurveTo(206.23837f, 130.74945f, 203.17982f, 132.01947f, 199.99f, 132.01947f),
                    PathNode.CurveTo(196.80019f, 132.01947f, 193.74162f, 130.74945f, 191.49f, 128.49f),
                    PathNode.LineTo(128.0f, 65.0f),
                    PathNode.LineTo(64.49f, 128.49f),
                    PathNode.CurveTo(59.79558f, 133.18442f, 52.18442f, 133.18442f, 47.49f, 128.49f),
                    PathNode.CurveTo(42.79558f, 123.79558f, 42.79558f, 116.18442f, 47.49f, 111.49f),
                    PathNode.LineTo(119.49f, 39.49f),
                    PathNode.CurveTo(121.74162f, 37.230545f, 124.80018f, 35.960537f, 127.99f, 35.960537f),
                    PathNode.CurveTo(131.17982f, 35.960537f, 134.23837f, 37.230545f, 136.49f, 39.49f),
                    PathNode.LineTo(208.49f, 111.49f),
                    PathNode.CurveTo(210.74945f, 113.74162f, 212.01947f, 116.80018f, 212.01947f, 119.99f),
                    PathNode.CurveTo(212.01947f, 123.17982f, 210.74945f, 126.23838f, 208.49f, 128.49f),
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
        return _control!!
    }

private var _control: ImageVector? = null
