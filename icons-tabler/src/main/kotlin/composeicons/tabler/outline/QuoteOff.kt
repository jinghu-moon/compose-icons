package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.QuoteOff: ImageVector
    get() {
        if (_quoteOff != null) return _quoteOff!!
        _quoteOff = tablerOutlineIcon(
            name = "QuoteOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(10.0f, 11.0f),
                    PathNode.LineTo(6.0f, 11.0f),
                    PathNode.CurveTo(5.447716f, 11.0f, 5.0f, 10.552285f, 5.0f, 10.0f),
                    PathNode.LineTo(5.0f, 7.0f),
                    PathNode.CurveTo(5.0f, 6.447716f, 5.447716f, 6.0f, 6.0f, 6.0f),
                    PathNode.MoveTo(10.0f, 10.0f),
                    PathNode.LineTo(10.0f, 13.0f),
                    PathNode.CurveTo(10.0f, 15.667f, 8.667f, 17.333f, 6.0f, 18.0f)
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
                    PathNode.MoveTo(19.0f, 11.0f),
                    PathNode.LineTo(15.0f, 11.0f),
                    PathNode.MoveTo(14.0f, 10.0f),
                    PathNode.LineTo(14.0f, 7.0f),
                    PathNode.CurveTo(14.0f, 6.447716f, 14.447715f, 6.0f, 15.0f, 6.0f),
                    PathNode.LineTo(18.0f, 6.0f),
                    PathNode.CurveTo(18.552284f, 6.0f, 19.0f, 6.447716f, 19.0f, 7.0f),
                    PathNode.LineTo(19.0f, 13.0f),
                    PathNode.CurveTo(19.0f, 13.66f, 18.918f, 14.26f, 18.755f, 14.798f),
                    PathNode.MoveTo(17.102f, 17.088f),
                    PathNode.CurveTo(16.531f, 17.488f, 15.83f, 17.792f, 15.0f, 18.0f)
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
                    PathNode.MoveTo(3.0f, 3.0f),
                    PathNode.LineTo(21.0f, 21.0f)
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
        return _quoteOff!!
    }

private var _quoteOff: ImageVector? = null
