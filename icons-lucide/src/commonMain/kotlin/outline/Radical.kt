package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Radical: ImageVector
    get() {
        if (_radical != null) return _radical!!
        _radical = lucideOutlineIcon(
            name = "Radical",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(3.0f, 12.0f),
                    PathNode.LineTo(6.28f, 12.0f),
                    PathNode.CurveTo(6.71024f, 12.000327f, 7.092045f, 12.275806f, 7.228f, 12.684f),
                    PathNode.LineTo(9.526f, 20.618f),
                    PathNode.CurveTo(9.597378f, 20.829153f, 9.799903f, 20.967566f, 10.022562f, 20.95736f),
                    PathNode.CurveTo(10.245222f, 20.947153f, 10.434237f, 20.7908f, 10.486f, 20.574f),
                    PathNode.LineTo(13.82f, 4.771f),
                    PathNode.CurveTo(13.926148f, 4.319784f, 14.328466f, 4.000661f, 14.792f, 4.0f),
                    PathNode.LineTo(21.0f, 4.0f)
                ),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1.0f,
                stroke = SolidColor(Color.Black),
                strokeAlpha = 1.0f,
                strokeLineWidth = 2.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _radical!!
    }

private var _radical: ImageVector? = null
