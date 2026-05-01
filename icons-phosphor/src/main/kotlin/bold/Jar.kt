package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Jar: ImageVector
    get() {
        if (_jar != null) return _jar!!
        _jar = phosphorBoldIcon(
            name = "Jar",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(188.0f, 49.68f),
                    PathNode.LineTo(188.0f, 32.0f),
                    PathNode.CurveTo(188.0f, 20.954306f, 179.0457f, 12.0f, 168.0f, 12.0f),
                    PathNode.LineTo(88.0f, 12.0f),
                    PathNode.CurveTo(76.95431f, 12.0f, 68.0f, 20.954306f, 68.0f, 32.0f),
                    PathNode.LineTo(68.0f, 49.68f),
                    PathNode.CurveTo(49.083385f, 55.063385f, 36.025604f, 72.3323f, 36.0f, 92.0f),
                    PathNode.LineTo(36.0f, 200.0f),
                    PathNode.CurveTo(36.027554f, 224.28911f, 55.71089f, 243.97244f, 80.0f, 244.0f),
                    PathNode.LineTo(176.0f, 244.0f),
                    PathNode.CurveTo(200.28911f, 243.97244f, 219.97244f, 224.28911f, 220.0f, 200.0f),
                    PathNode.LineTo(220.0f, 92.0f),
                    PathNode.CurveTo(219.9744f, 72.3323f, 206.91661f, 55.063385f, 188.0f, 49.68f),
                    PathNode.Close,
                    PathNode.MoveTo(164.0f, 48.0f),
                    PathNode.LineTo(140.0f, 48.0f),
                    PathNode.LineTo(140.0f, 36.0f),
                    PathNode.LineTo(164.0f, 36.0f),
                    PathNode.Close,
                    PathNode.MoveTo(116.0f, 36.0f),
                    PathNode.LineTo(116.0f, 48.0f),
                    PathNode.LineTo(92.0f, 48.0f),
                    PathNode.LineTo(92.0f, 36.0f),
                    PathNode.Close,
                    PathNode.MoveTo(196.0f, 200.0f),
                    PathNode.CurveTo(196.0f, 211.0457f, 187.0457f, 220.0f, 176.0f, 220.0f),
                    PathNode.LineTo(80.0f, 220.0f),
                    PathNode.CurveTo(68.95431f, 220.0f, 60.0f, 211.0457f, 60.0f, 200.0f),
                    PathNode.LineTo(60.0f, 92.0f),
                    PathNode.CurveTo(60.0f, 80.95431f, 68.95431f, 72.0f, 80.0f, 72.0f),
                    PathNode.LineTo(176.0f, 72.0f),
                    PathNode.CurveTo(187.0457f, 72.0f, 196.0f, 80.95431f, 196.0f, 92.0f),
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
        return _jar!!
    }

private var _jar: ImageVector? = null
