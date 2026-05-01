package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Eraser: ImageVector
    get() {
        if (_eraser != null) return _eraser!!
        _eraser = lucideOutlineIcon(
            name = "Eraser",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(21.0f, 21.0f),
                    PathNode.LineTo(8.0f, 21.0f),
                    PathNode.CurveTo(7.467388f, 21.001217f, 6.95629f, 20.789938f, 6.58f, 20.413f),
                    PathNode.LineTo(2.586f, 16.414f),
                    PathNode.CurveTo(1.805236f, 15.633f, 1.805236f, 14.367f, 2.586f, 13.586f),
                    PathNode.LineTo(12.586f, 3.586f),
                    PathNode.CurveTo(12.961096f, 3.210752f, 13.469927f, 2.999927f, 14.0005f, 2.999927f),
                    PathNode.CurveTo(14.531074f, 2.999927f, 15.039904f, 3.210752f, 15.415f, 3.586f),
                    PathNode.LineTo(21.414f, 9.586f),
                    PathNode.CurveTo(22.194763f, 10.367f, 22.194763f, 11.633f, 21.414f, 12.414f),
                    PathNode.LineTo(12.834f, 21.0f)
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
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(5.082f, 11.09f),
                    PathNode.LineTo(13.91f, 19.918f)
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
        return _eraser!!
    }

private var _eraser: ImageVector? = null
