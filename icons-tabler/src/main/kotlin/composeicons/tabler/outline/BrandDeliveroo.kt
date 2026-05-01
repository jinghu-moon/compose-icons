package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandDeliveroo: ImageVector
    get() {
        if (_brandDeliveroo != null) return _brandDeliveroo!!
        _brandDeliveroo = tablerOutlineIcon(
            name = "BrandDeliveroo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(15.0f, 11.0f),
                    PathNode.LineTo(16.0f, 2.0f),
                    PathNode.LineTo(21.0f, 2.5f),
                    PathNode.LineTo(20.0f, 16.0f),
                    PathNode.LineTo(17.0f, 22.0f),
                    PathNode.LineTo(4.5f, 19.5f),
                    PathNode.LineTo(3.0f, 13.5f),
                    PathNode.LineTo(10.0f, 12.0f),
                    PathNode.LineTo(8.5f, 4.5f),
                    PathNode.LineTo(13.0f, 3.5f),
                    PathNode.LineTo(15.0f, 11.0f)
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
                    PathNode.MoveTo(14.5f, 15.5f),
                    PathNode.CurveTo(14.5f, 16.052284f, 14.947715f, 16.5f, 15.5f, 16.5f),
                    PathNode.CurveTo(16.052284f, 16.5f, 16.5f, 16.052284f, 16.5f, 15.5f),
                    PathNode.CurveTo(16.5f, 14.947715f, 16.052284f, 14.5f, 15.5f, 14.5f),
                    PathNode.CurveTo(14.947715f, 14.5f, 14.5f, 14.947715f, 14.5f, 15.5f)
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
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
                    PathNode.MoveTo(10.5f, 14.5f),
                    PathNode.CurveTo(10.5f, 15.052285f, 10.947715f, 15.5f, 11.5f, 15.5f),
                    PathNode.CurveTo(12.052285f, 15.5f, 12.5f, 15.052285f, 12.5f, 14.5f),
                    PathNode.CurveTo(12.5f, 13.947715f, 12.052285f, 13.5f, 11.5f, 13.5f),
                    PathNode.CurveTo(10.947715f, 13.5f, 10.5f, 13.947715f, 10.5f, 14.5f)
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = SolidColor(Color.Black),
                strokeAlpha = 1f,
                strokeLineWidth = 2.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _brandDeliveroo!!
    }

private var _brandDeliveroo: ImageVector? = null
