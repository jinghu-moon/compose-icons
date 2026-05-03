package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandNytimes: ImageVector
    get() {
        if (_brandNytimes != null) return _brandNytimes!!
        _brandNytimes = tablerOutlineIcon(
            name = "BrandNytimes",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(11.036f, 5.058f),
                    PathNode.CurveTo(7.034699f, 5.544797f, 4.020499f, 8.932434f, 4.002236f, 12.963197f),
                    PathNode.CurveTo(3.983972f, 16.99396f, 6.967349f, 20.408772f, 10.964075f, 20.931808f),
                    PathNode.CurveTo(14.960801f, 21.454845f, 18.722431f, 18.922726f, 19.742f, 15.023f)
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
                    PathNode.MoveTo(12.0f, 21.0f),
                    PathNode.LineTo(12.0f, 10.0f),
                    PathNode.LineTo(4.5f, 14.0f)
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
                    PathNode.MoveTo(17.5f, 3.0f),
                    PathNode.CurveTo(18.880713f, 3.0f, 20.0f, 4.119288f, 20.0f, 5.5f),
                    PathNode.CurveTo(20.0f, 6.880712f, 18.880713f, 8.0f, 17.5f, 8.0f),
                    PathNode.LineTo(6.5f, 3.0f),
                    PathNode.CurveTo(5.247911f, 2.997363f, 4.186978f, 3.921391f, 4.017691f, 5.161987f),
                    PathNode.CurveTo(3.848404f, 6.402582f, 4.62298f, 7.577076f, 5.83f, 7.91f)
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
                    PathNode.MoveTo(9.0f, 12.0f),
                    PathNode.LineTo(9.0f, 20.0f)
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
                    PathNode.MoveTo(16.0f, 13.0f),
                    PathNode.LineTo(15.99f, 13.0f)
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
        return _brandNytimes!!
    }

private var _brandNytimes: ImageVector? = null
