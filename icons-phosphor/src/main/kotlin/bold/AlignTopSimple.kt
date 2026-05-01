package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.AlignTopSimple: ImageVector
    get() {
        if (_alignTopSimple != null) return _alignTopSimple!!
        _alignTopSimple = phosphorBoldIcon(
            name = "AlignTopSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(212.0f, 32.0f),
                    PathNode.CurveTo(212.0f, 38.62742f, 206.62741f, 44.0f, 200.0f, 44.0f),
                    PathNode.LineTo(56.0f, 44.0f),
                    PathNode.CurveTo(49.37258f, 44.0f, 44.0f, 38.62742f, 44.0f, 32.0f),
                    PathNode.CurveTo(44.0f, 25.372583f, 49.37258f, 20.0f, 56.0f, 20.0f),
                    PathNode.LineTo(200.0f, 20.0f),
                    PathNode.CurveTo(206.62741f, 20.0f, 212.0f, 25.372583f, 212.0f, 32.0f),
                    PathNode.Close,
                    PathNode.MoveTo(180.0f, 80.0f),
                    PathNode.LineTo(180.0f, 224.0f),
                    PathNode.CurveTo(180.0f, 235.0457f, 171.0457f, 244.0f, 160.0f, 244.0f),
                    PathNode.LineTo(96.0f, 244.0f),
                    PathNode.CurveTo(84.95431f, 244.0f, 76.0f, 235.0457f, 76.0f, 224.0f),
                    PathNode.LineTo(76.0f, 80.0f),
                    PathNode.CurveTo(76.0f, 68.95431f, 84.95431f, 60.0f, 96.0f, 60.0f),
                    PathNode.LineTo(160.0f, 60.0f),
                    PathNode.CurveTo(171.0457f, 60.0f, 180.0f, 68.95431f, 180.0f, 80.0f),
                    PathNode.Close,
                    PathNode.MoveTo(156.0f, 84.0f),
                    PathNode.LineTo(100.0f, 84.0f),
                    PathNode.LineTo(100.0f, 220.0f),
                    PathNode.LineTo(156.0f, 220.0f),
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
        return _alignTopSimple!!
    }

private var _alignTopSimple: ImageVector? = null
