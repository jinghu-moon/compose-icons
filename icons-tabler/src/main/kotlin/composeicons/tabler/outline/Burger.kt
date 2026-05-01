package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Burger: ImageVector
    get() {
        if (_burger != null) return _burger!!
        _burger = tablerOutlineIcon(
            name = "Burger",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(4.0f, 15.0f),
                    PathNode.LineTo(20.0f, 15.0f),
                    PathNode.CurveTo(20.0f, 17.209139f, 18.209139f, 19.0f, 16.0f, 19.0f),
                    PathNode.LineTo(8.0f, 19.0f),
                    PathNode.CurveTo(5.790861f, 19.0f, 4.0f, 17.209139f, 4.0f, 15.0f)
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
                    PathNode.MoveTo(12.0f, 4.0f),
                    PathNode.CurveTo(15.783f, 4.0f, 18.953f, 6.133f, 19.786f, 9.0f),
                    PathNode.LineTo(4.214f, 9.0f),
                    PathNode.CurveTo(5.047f, 6.133f, 8.217f, 4.0f, 12.0f, 4.0f)
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
                    PathNode.MoveTo(5.0f, 12.0f),
                    PathNode.LineTo(19.0f, 12.0f)
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
        return _burger!!
    }

private var _burger: ImageVector? = null
