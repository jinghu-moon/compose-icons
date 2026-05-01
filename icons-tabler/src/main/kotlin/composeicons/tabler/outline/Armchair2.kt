package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Armchair2: ImageVector
    get() {
        if (_armchair2 != null) return _armchair2!!
        _armchair2 = tablerOutlineIcon(
            name = "Armchair2",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(5.0f, 10.0f),
                    PathNode.LineTo(5.0f, 6.0f),
                    PathNode.CurveTo(5.0f, 4.343146f, 6.343146f, 3.0f, 8.0f, 3.0f),
                    PathNode.LineTo(16.0f, 3.0f),
                    PathNode.CurveTo(17.656855f, 3.0f, 19.0f, 4.343146f, 19.0f, 6.0f),
                    PathNode.LineTo(19.0f, 10.0f)
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
                    PathNode.MoveTo(16.0f, 15.0f),
                    PathNode.LineTo(16.0f, 13.0f),
                    PathNode.CurveTo(16.0f, 11.343145f, 17.343145f, 10.0f, 19.0f, 10.0f),
                    PathNode.CurveTo(20.656855f, 10.0f, 22.0f, 11.343145f, 22.0f, 13.0f),
                    PathNode.CurveTo(22.0f, 14.656855f, 20.656855f, 16.0f, 19.0f, 16.0f),
                    PathNode.LineTo(19.0f, 19.0f),
                    PathNode.LineTo(5.0f, 19.0f),
                    PathNode.LineTo(5.0f, 16.0f),
                    PathNode.CurveTo(3.343146f, 16.0f, 2.0f, 14.656855f, 2.0f, 13.0f),
                    PathNode.CurveTo(2.0f, 11.343145f, 3.343146f, 10.0f, 5.0f, 10.0f),
                    PathNode.CurveTo(6.656854f, 10.0f, 8.0f, 11.343145f, 8.0f, 13.0f),
                    PathNode.LineTo(8.0f, 15.0f)
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
                    PathNode.MoveTo(8.0f, 12.0f),
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
                    PathNode.MoveTo(7.0f, 19.0f),
                    PathNode.LineTo(7.0f, 21.0f)
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
                    PathNode.MoveTo(17.0f, 19.0f),
                    PathNode.LineTo(17.0f, 21.0f)
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
        return _armchair2!!
    }

private var _armchair2: ImageVector? = null
