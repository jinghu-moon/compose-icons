package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Flag: ImageVector
    get() {
        if (_flag != null) return _flag!!
        _flag = lucideOutlineIcon(
            name = "Flag",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(4.0f, 22.0f),
                    PathNode.LineTo(4.0f, 4.0f),
                    PathNode.CurveTo(4.0f, 3.685243f, 4.148194f, 3.388854f, 4.4f, 3.2f),
                    PathNode.CurveTo(5.438577f, 2.421067f, 6.701779f, 2.0f, 8.0f, 2.0f),
                    PathNode.CurveTo(11.0f, 2.0f, 13.0f, 4.0f, 15.333f, 4.0f),
                    PathNode.QuadTo(17.333f, 4.0f, 18.4f, 3.2f),
                    PathNode.CurveTo(18.703018f, 2.972737f, 19.108427f, 2.936181f, 19.447214f, 3.105573f),
                    PathNode.CurveTo(19.785997f, 3.274965f, 20.0f, 3.621228f, 20.0f, 4.0f),
                    PathNode.LineTo(20.0f, 14.0f),
                    PathNode.CurveTo(20.0f, 14.314757f, 19.851807f, 14.611146f, 19.6f, 14.8f),
                    PathNode.CurveTo(18.561422f, 15.578933f, 17.298222f, 16.0f, 16.0f, 16.0f),
                    PathNode.CurveTo(13.0f, 16.0f, 11.0f, 14.0f, 8.0f, 14.0f),
                    PathNode.CurveTo(6.524118f, 14.000037f, 5.100025f, 14.544041f, 4.0f, 15.528f)
                ),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color.Black),
                strokeAlpha = 1f,
                strokeLineWidth = 2.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _flag!!
    }

private var _flag: ImageVector? = null
