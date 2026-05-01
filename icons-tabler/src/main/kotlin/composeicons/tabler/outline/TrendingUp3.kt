package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.TrendingUp3: ImageVector
    get() {
        if (_trendingUp3 != null) return _trendingUp3!!
        _trendingUp3 = tablerOutlineIcon(
            name = "TrendingUp3",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(18.0f, 5.0f),
                    PathNode.LineTo(21.0f, 8.0f),
                    PathNode.LineTo(18.0f, 11.0f)
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
                    PathNode.MoveTo(3.0f, 18.0f),
                    PathNode.LineTo(5.397f, 18.0f),
                    PathNode.CurveTo(7.02857f, 17.999876f, 8.557458f, 17.203705f, 9.493f, 15.867f),
                    PathNode.LineTo(13.507f, 10.133f),
                    PathNode.CurveTo(14.442542f, 8.796294f, 15.97143f, 8.000123f, 17.603f, 8.0f),
                    PathNode.LineTo(21.0f, 8.0f)
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
        return _trendingUp3!!
    }

private var _trendingUp3: ImageVector? = null
