package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Gem: ImageVector
    get() {
        if (_gem != null) return _gem!!
        _gem = lucideOutlineIcon(
            name = "Gem",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(10.5f, 3.0f),
                    PathNode.LineTo(8.0f, 9.0f),
                    PathNode.LineTo(12.0f, 22.0f),
                    PathNode.LineTo(16.0f, 9.0f),
                    PathNode.LineTo(13.5f, 3.0f)
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
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(17.0f, 3.0f),
                    PathNode.CurveTo(17.629515f, 3.0f, 18.222292f, 3.296389f, 18.6f, 3.8f),
                    PathNode.LineTo(21.6f, 7.8f),
                    PathNode.CurveTo(22.128256f, 8.504554f, 22.133535f, 9.471722f, 21.613f, 10.182f),
                    PathNode.LineTo(13.623f, 21.168f),
                    PathNode.CurveTo(13.247192f, 21.690363f, 12.643f, 21.99999f, 11.9995f, 21.99999f),
                    PathNode.CurveTo(11.356f, 21.99999f, 10.751807f, 21.690363f, 10.376f, 21.168f),
                    PathNode.LineTo(2.386f, 10.182f),
                    PathNode.CurveTo(1.865761f, 9.471502f, 1.871445f, 8.504333f, 2.4f, 7.8f),
                    PathNode.LineTo(5.398f, 3.803f),
                    PathNode.CurveTo(5.775502f, 3.297694f, 6.369253f, 3.000078f, 7.0f, 3.0f),
                    PathNode.Close
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
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(2.0f, 9.0f),
                    PathNode.LineTo(22.0f, 9.0f)
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
        return _gem!!
    }

private var _gem: ImageVector? = null
