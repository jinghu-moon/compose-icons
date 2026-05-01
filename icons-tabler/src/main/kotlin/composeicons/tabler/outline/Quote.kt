package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Quote: ImageVector
    get() {
        if (_quote != null) return _quote!!
        _quote = tablerOutlineIcon(
            name = "Quote",
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
                    PathNode.LineTo(9.0f, 6.0f),
                    PathNode.CurveTo(9.552285f, 6.0f, 10.0f, 6.447716f, 10.0f, 7.0f),
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
                    PathNode.CurveTo(14.447715f, 11.0f, 14.0f, 10.552285f, 14.0f, 10.0f),
                    PathNode.LineTo(14.0f, 7.0f),
                    PathNode.CurveTo(14.0f, 6.447716f, 14.447715f, 6.0f, 15.0f, 6.0f),
                    PathNode.LineTo(18.0f, 6.0f),
                    PathNode.CurveTo(18.552284f, 6.0f, 19.0f, 6.447716f, 19.0f, 7.0f),
                    PathNode.LineTo(19.0f, 13.0f),
                    PathNode.CurveTo(19.0f, 15.667f, 17.667f, 17.333f, 15.0f, 18.0f)
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
        return _quote!!
    }

private var _quote: ImageVector? = null
