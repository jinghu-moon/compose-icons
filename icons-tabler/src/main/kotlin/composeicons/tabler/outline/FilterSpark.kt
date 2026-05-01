package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.FilterSpark: ImageVector
    get() {
        if (_filterSpark != null) return _filterSpark!!
        _filterSpark = tablerOutlineIcon(
            name = "FilterSpark",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(15.0f, 12.5f),
                    PathNode.LineTo(15.0f, 12.0f),
                    PathNode.LineTo(19.414f, 7.586f),
                    PathNode.CurveTo(19.789099f, 7.211015f, 19.999887f, 6.70239f, 20.0f, 6.172f),
                    PathNode.LineTo(20.0f, 4.0f),
                    PathNode.LineTo(4.0f, 4.0f),
                    PathNode.LineTo(4.0f, 6.227f),
                    PathNode.CurveTo(4.0f, 6.724f, 4.185f, 7.204f, 4.52f, 7.572f),
                    PathNode.LineTo(9.0f, 12.5f),
                    PathNode.LineTo(9.0f, 21.0f),
                    PathNode.LineTo(11.0f, 20.333f)
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
                    PathNode.MoveTo(18.5f, 22.0f),
                    PathNode.CurveTo(18.918587f, 20.269625f, 20.269625f, 18.918587f, 22.0f, 18.5f),
                    PathNode.CurveTo(20.269625f, 18.081413f, 18.918587f, 16.730375f, 18.5f, 15.0f),
                    PathNode.CurveTo(18.081413f, 16.730375f, 16.730375f, 18.081413f, 15.0f, 18.5f),
                    PathNode.CurveTo(16.730375f, 18.918587f, 18.081413f, 20.269625f, 18.5f, 22.0f)
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
        return _filterSpark!!
    }

private var _filterSpark: ImageVector? = null
