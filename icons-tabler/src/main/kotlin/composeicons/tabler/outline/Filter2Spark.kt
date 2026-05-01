package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Filter2Spark: ImageVector
    get() {
        if (_filter2Spark != null) return _filter2Spark!!
        _filter2Spark = tablerOutlineIcon(
            name = "Filter2Spark",
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
                    PathNode.LineTo(15.5f, 12.0f)
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
                    PathNode.LineTo(11.5f, 18.0f)
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
                    PathNode.MoveTo(19.0f, 21.5f),
                    PathNode.CurveTo(19.205f, 20.651f, 19.641f, 19.875f, 20.258f, 19.258f),
                    PathNode.CurveTo(20.875f, 18.641f, 21.651f, 18.205f, 22.5f, 18.0f),
                    PathNode.CurveTo(21.651f, 17.795f, 20.875f, 17.359f, 20.258f, 16.742f),
                    PathNode.CurveTo(19.641f, 16.125f, 19.205f, 15.349f, 19.0f, 14.5f),
                    PathNode.CurveTo(18.795f, 15.349f, 18.359f, 16.125f, 17.742f, 16.742f),
                    PathNode.CurveTo(17.125f, 17.359f, 16.349f, 17.795f, 15.5f, 18.0f),
                    PathNode.CurveTo(16.349f, 18.205f, 17.125f, 18.641f, 17.742f, 19.258f),
                    PathNode.CurveTo(18.359f, 19.875f, 18.795f, 20.651f, 19.0f, 21.5f)
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
        return _filter2Spark!!
    }

private var _filter2Spark: ImageVector? = null
