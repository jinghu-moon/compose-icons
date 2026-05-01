package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Filter2Dollar: ImageVector
    get() {
        if (_filter2Dollar != null) return _filter2Dollar!!
        _filter2Dollar = tablerOutlineIcon(
            name = "Filter2Dollar",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(4.0f, 6.0f),
                    PathNode.LineTo(20.0f, 6.0f)
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
                    PathNode.MoveTo(6.0f, 12.0f),
                    PathNode.LineTo(16.0f, 12.0f)
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
                    PathNode.MoveTo(9.0f, 18.0f),
                    PathNode.LineTo(13.0f, 18.0f)
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
                    PathNode.MoveTo(21.0f, 15.0f),
                    PathNode.LineTo(19.0f, 15.0f),
                    PathNode.MoveTo(17.0f, 21.0f),
                    PathNode.LineTo(19.0f, 21.0f),
                    PathNode.MoveTo(19.0f, 21.0f),
                    PathNode.LineTo(19.0f, 22.0f),
                    PathNode.MoveTo(19.0f, 21.0f),
                    PathNode.LineTo(19.5f, 21.0f),
                    PathNode.CurveTo(19.898f, 21.0f, 20.279f, 20.842f, 20.561f, 20.561f),
                    PathNode.CurveTo(20.842f, 20.28f, 21.0f, 19.898f, 21.0f, 19.5f),
                    PathNode.CurveTo(21.0f, 19.102f, 20.842f, 18.721f, 20.561f, 18.439f),
                    PathNode.CurveTo(20.28f, 18.158f, 19.898f, 18.0f, 19.5f, 18.0f),
                    PathNode.LineTo(18.5f, 18.0f),
                    PathNode.CurveTo(18.102f, 18.0f, 17.721f, 17.842f, 17.439f, 17.561f),
                    PathNode.CurveTo(17.158f, 17.28f, 17.0f, 16.898f, 17.0f, 16.5f),
                    PathNode.CurveTo(17.0f, 16.102f, 17.158f, 15.721f, 17.439f, 15.439f),
                    PathNode.CurveTo(17.72f, 15.158f, 18.102f, 15.0f, 18.5f, 15.0f),
                    PathNode.LineTo(19.0f, 15.0f),
                    PathNode.MoveTo(19.0f, 14.0f),
                    PathNode.LineTo(19.0f, 15.0f)
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
        return _filter2Dollar!!
    }

private var _filter2Dollar: ImageVector? = null
