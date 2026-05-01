package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandEdge: ImageVector
    get() {
        if (_brandEdge != null) return _brandEdge!!
        _brandEdge = tablerOutlineIcon(
            name = "BrandEdge",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(20.978f, 11.372f),
                    PathNode.CurveTo(20.671625f, 6.998265f, 17.25809f, 3.481749f, 12.895389f, 3.04555f),
                    PathNode.CurveTo(8.532687f, 2.609351f, 4.490497f, 5.380416f, 3.324239f, 9.606913f),
                    PathNode.CurveTo(2.157981f, 13.833408f, 4.207071f, 18.2853f, 8.176101f, 20.148155f),
                    PathNode.CurveTo(12.14513f, 22.011015f, 16.878992f, 20.742687f, 19.385f, 17.145f)
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
                    PathNode.MoveTo(20.978f, 11.372f),
                    PathNode.CurveTo(21.188f, 14.365f, 15.944f, 13.785f, 14.065f, 12.858f),
                    PathNode.CurveTo(15.457f, 11.258f, 14.467f, 8.82f, 11.791f, 9.007f),
                    PathNode.CurveTo(10.046f, 9.129f, 8.864f, 10.164f, 9.007f, 12.209f),
                    PathNode.CurveTo(9.287f, 16.199f, 13.451f, 18.414f, 19.367f, 16.999f)
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
                    PathNode.MoveTo(3.022f, 12.628f),
                    PathNode.CurveTo(2.739f, 8.585f, 11.739f, 5.4f, 14.27f, 9.94f)
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
                    PathNode.MoveTo(12.628f, 20.978f),
                    PathNode.CurveTo(9.635f, 21.188f, 7.466f, 16.253f, 9.061f, 11.23f)
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
        return _brandEdge!!
    }

private var _brandEdge: ImageVector? = null
