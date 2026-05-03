package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.GlobeLock: ImageVector
    get() {
        if (_globeLock != null) return _globeLock!!
        _globeLock = lucideOutlineIcon(
            name = "GlobeLock",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(15.686f, 15.0f),
                    PathNode.CurveTo(15.12992f, 17.629887f, 13.853751f, 20.05343f, 12.0f, 22.0f),
                    PathNode.CurveTo(6.666667f, 16.4f, 6.666667f, 7.6f, 12.0f, 2.0f),
                    PathNode.CurveTo(6.870074f, 2.001338f, 2.573199f, 5.884251f, 2.053964f, 10.987832f),
                    PathNode.CurveTo(1.53473f, 16.091413f, 4.961569f, 20.760132f, 9.986115f, 21.794577f),
                    PathNode.CurveTo(15.010661f, 22.829023f, 20.003021f, 19.893639f, 21.542f, 15.0f)
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
                    PathNode.MoveTo(2.0f, 12.0f),
                    PathNode.LineTo(10.5f, 12.0f)
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
                    PathNode.MoveTo(20.0f, 6.0f),
                    PathNode.LineTo(20.0f, 4.0f),
                    PathNode.CurveTo(20.0f, 2.895431f, 19.10457f, 2.0f, 18.0f, 2.0f),
                    PathNode.CurveTo(16.89543f, 2.0f, 16.0f, 2.895431f, 16.0f, 4.0f),
                    PathNode.LineTo(16.0f, 6.0f)
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
                    PathNode.MoveTo(15.0f, 6.0f),
                    PathNode.LineTo(21.0f, 6.0f),
                    PathNode.CurveTo(21.552284f, 6.0f, 22.0f, 6.447716f, 22.0f, 7.0f),
                    PathNode.LineTo(22.0f, 10.0f),
                    PathNode.CurveTo(22.0f, 10.552285f, 21.552284f, 11.0f, 21.0f, 11.0f),
                    PathNode.LineTo(15.0f, 11.0f),
                    PathNode.CurveTo(14.447715f, 11.0f, 14.0f, 10.552285f, 14.0f, 10.0f),
                    PathNode.LineTo(14.0f, 7.0f),
                    PathNode.CurveTo(14.0f, 6.447716f, 14.447715f, 6.0f, 15.0f, 6.0f),
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
        }
        return _globeLock!!
    }

private var _globeLock: ImageVector? = null
