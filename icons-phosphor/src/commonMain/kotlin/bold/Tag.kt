package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Tag: ImageVector
    get() {
        if (_tag != null) return _tag!!
        _tag = phosphorBoldIcon(
            name = "Tag",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(246.15f, 133.18f),
                    PathNode.LineTo(146.83f, 33.86f),
                    PathNode.CurveTo(143.08957f, 30.094933f, 137.9972f, 27.984512f, 132.69f, 28.0f),
                    PathNode.LineTo(40.0f, 28.0f),
                    PathNode.CurveTo(33.37258f, 28.0f, 28.0f, 33.37258f, 28.0f, 40.0f),
                    PathNode.LineTo(28.0f, 132.69f),
                    PathNode.CurveTo(27.984512f, 137.9972f, 30.094933f, 143.08957f, 33.86f, 146.83f),
                    PathNode.LineTo(133.18f, 246.15f),
                    PathNode.CurveTo(140.98999f, 253.95764f, 153.65001f, 253.95764f, 161.46f, 246.15f),
                    PathNode.LineTo(246.15f, 161.46f),
                    PathNode.CurveTo(253.95764f, 153.65001f, 253.95764f, 140.98999f, 246.15f, 133.18f),
                    PathNode.Close,
                    PathNode.MoveTo(147.32f, 226.35f),
                    PathNode.LineTo(52.0f, 131.0f),
                    PathNode.LineTo(52.0f, 52.0f),
                    PathNode.LineTo(131.0f, 52.0f),
                    PathNode.LineTo(226.32f, 147.32f),
                    PathNode.Close,
                    PathNode.MoveTo(104.0f, 88.0f),
                    PathNode.CurveTo(104.0f, 96.836555f, 96.836555f, 104.0f, 88.0f, 104.0f),
                    PathNode.CurveTo(79.163445f, 104.0f, 72.0f, 96.836555f, 72.0f, 88.0f),
                    PathNode.CurveTo(72.0f, 79.163445f, 79.163445f, 72.0f, 88.0f, 72.0f),
                    PathNode.CurveTo(96.836555f, 72.0f, 104.0f, 79.163445f, 104.0f, 88.0f),
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
        return _tag!!
    }

private var _tag: ImageVector? = null
