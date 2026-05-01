package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Union: ImageVector
    get() {
        if (_union != null) return _union!!
        _union = phosphorBoldIcon(
            name = "Union",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(212.0f, 64.0f),
                    PathNode.LineTo(212.0f, 144.0f),
                    PathNode.CurveTo(212.0f, 190.39192f, 174.39192f, 228.0f, 128.0f, 228.0f),
                    PathNode.CurveTo(81.60808f, 228.0f, 44.0f, 190.39192f, 44.0f, 144.0f),
                    PathNode.LineTo(44.0f, 64.0f),
                    PathNode.CurveTo(44.0f, 57.37258f, 49.37258f, 52.0f, 56.0f, 52.0f),
                    PathNode.CurveTo(62.62742f, 52.0f, 68.0f, 57.37258f, 68.0f, 64.0f),
                    PathNode.LineTo(68.0f, 144.0f),
                    PathNode.CurveTo(68.0f, 177.13708f, 94.862915f, 204.0f, 128.0f, 204.0f),
                    PathNode.CurveTo(161.13708f, 204.0f, 188.0f, 177.13708f, 188.0f, 144.0f),
                    PathNode.LineTo(188.0f, 64.0f),
                    PathNode.CurveTo(188.0f, 57.37258f, 193.37259f, 52.0f, 200.0f, 52.0f),
                    PathNode.CurveTo(206.62741f, 52.0f, 212.0f, 57.37258f, 212.0f, 64.0f),
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
        return _union!!
    }

private var _union: ImageVector? = null
