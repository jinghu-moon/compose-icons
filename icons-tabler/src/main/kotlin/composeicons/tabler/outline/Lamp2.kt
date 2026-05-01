package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Lamp2: ImageVector
    get() {
        if (_lamp2 != null) return _lamp2!!
        _lamp2 = tablerOutlineIcon(
            name = "Lamp2",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(5.0f, 21.0f),
                    PathNode.LineTo(14.0f, 21.0f)
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
                    PathNode.MoveTo(10.0f, 21.0f),
                    PathNode.LineTo(3.0f, 13.0f),
                    PathNode.LineTo(11.5f, 7.5f)
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
                    PathNode.MoveTo(13.0f, 14.0f),
                    PathNode.CurveTo(10.852f, 11.852f, 10.852f, 8.148f, 13.0f, 6.0f),
                    PathNode.CurveTo(15.088f, 3.912f, 18.842f, 4.028f, 21.0f, 6.0f),
                    PathNode.LineTo(13.0f, 14.0f)
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
                    PathNode.MoveTo(11.742f, 7.574f),
                    PathNode.LineTo(10.586f, 6.418f),
                    PathNode.CurveTo(9.804793f, 5.637069f, 9.804569f, 4.370707f, 10.5855f, 3.5895f),
                    PathNode.CurveTo(11.36643f, 2.808293f, 12.632793f, 2.80807f, 13.414f, 3.589f),
                    PathNode.LineTo(14.558f, 4.733f)
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
                    PathNode.MoveTo(15.5f, 12.0f),
                    PathNode.LineTo(15.708f, 12.274f),
                    PathNode.CurveTo(16.692795f, 13.249102f, 18.279205f, 13.249102f, 19.264f, 12.274f),
                    PathNode.CurveTo(20.203f, 11.341f, 20.244f, 9.854f, 19.386f, 8.874f),
                    PathNode.LineTo(19.02f, 8.505f)
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
        return _lamp2!!
    }

private var _lamp2: ImageVector? = null
