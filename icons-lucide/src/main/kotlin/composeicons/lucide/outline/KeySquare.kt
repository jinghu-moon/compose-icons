package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.KeySquare: ImageVector
    get() {
        if (_keySquare != null) return _keySquare!!
        _keySquare = lucideOutlineIcon(
            name = "KeySquare",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(12.4f, 2.7f),
                    PathNode.CurveTo(13.358883f, 1.810707f, 14.841117f, 1.810707f, 15.8f, 2.7f),
                    PathNode.LineTo(21.3f, 8.2f),
                    PathNode.CurveTo(22.189293f, 9.158883f, 22.189293f, 10.641117f, 21.3f, 11.6f),
                    PathNode.LineTo(17.6f, 15.3f),
                    PathNode.CurveTo(16.641117f, 16.189293f, 15.158883f, 16.189293f, 14.2f, 15.3f),
                    PathNode.LineTo(8.7f, 9.8f),
                    PathNode.CurveTo(7.810707f, 8.841117f, 7.810707f, 7.358883f, 8.7f, 6.4f),
                    PathNode.Close
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
                    PathNode.MoveTo(14.0f, 7.0f),
                    PathNode.LineTo(17.0f, 10.0f)
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
                    PathNode.MoveTo(9.4f, 10.6f),
                    PathNode.LineTo(2.586f, 17.414f),
                    PathNode.CurveTo(2.210901f, 17.788986f, 2.000113f, 18.297611f, 2.0f, 18.828f),
                    PathNode.LineTo(2.0f, 21.0f),
                    PathNode.CurveTo(2.0f, 21.552284f, 2.447715f, 22.0f, 3.0f, 22.0f),
                    PathNode.LineTo(6.0f, 22.0f),
                    PathNode.CurveTo(6.552285f, 22.0f, 7.0f, 21.552284f, 7.0f, 21.0f),
                    PathNode.LineTo(7.0f, 20.0f),
                    PathNode.CurveTo(7.0f, 19.447716f, 7.447716f, 19.0f, 8.0f, 19.0f),
                    PathNode.LineTo(9.0f, 19.0f),
                    PathNode.CurveTo(9.552285f, 19.0f, 10.0f, 18.552284f, 10.0f, 18.0f),
                    PathNode.LineTo(10.0f, 17.0f),
                    PathNode.CurveTo(10.0f, 16.447716f, 10.447715f, 16.0f, 11.0f, 16.0f),
                    PathNode.LineTo(11.172f, 16.0f),
                    PathNode.CurveTo(11.70239f, 15.999887f, 12.211015f, 15.789099f, 12.586f, 15.414f),
                    PathNode.LineTo(13.4f, 14.6f)
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
        return _keySquare!!
    }

private var _keySquare: ImageVector? = null
