package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.AlignLeftSimple: ImageVector
    get() {
        if (_alignLeftSimple != null) return _alignLeftSimple!!
        _alignLeftSimple = phosphorBoldIcon(
            name = "AlignLeftSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(44.0f, 56.0f),
                    PathNode.LineTo(44.0f, 200.0f),
                    PathNode.CurveTo(44.0f, 206.62741f, 38.62742f, 212.0f, 32.0f, 212.0f),
                    PathNode.CurveTo(25.372583f, 212.0f, 20.0f, 206.62741f, 20.0f, 200.0f),
                    PathNode.LineTo(20.0f, 56.0f),
                    PathNode.CurveTo(20.0f, 49.37258f, 25.372583f, 44.0f, 32.0f, 44.0f),
                    PathNode.CurveTo(38.62742f, 44.0f, 44.0f, 49.37258f, 44.0f, 56.0f),
                    PathNode.Close,
                    PathNode.MoveTo(244.0f, 96.0f),
                    PathNode.LineTo(244.0f, 160.0f),
                    PathNode.CurveTo(244.0f, 171.0457f, 235.0457f, 180.0f, 224.0f, 180.0f),
                    PathNode.LineTo(80.0f, 180.0f),
                    PathNode.CurveTo(68.95431f, 180.0f, 60.0f, 171.0457f, 60.0f, 160.0f),
                    PathNode.LineTo(60.0f, 96.0f),
                    PathNode.CurveTo(60.0f, 84.95431f, 68.95431f, 76.0f, 80.0f, 76.0f),
                    PathNode.LineTo(224.0f, 76.0f),
                    PathNode.CurveTo(235.0457f, 76.0f, 244.0f, 84.95431f, 244.0f, 96.0f),
                    PathNode.Close,
                    PathNode.MoveTo(220.0f, 100.0f),
                    PathNode.LineTo(84.0f, 100.0f),
                    PathNode.LineTo(84.0f, 156.0f),
                    PathNode.LineTo(220.0f, 156.0f),
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
        return _alignLeftSimple!!
    }

private var _alignLeftSimple: ImageVector? = null
