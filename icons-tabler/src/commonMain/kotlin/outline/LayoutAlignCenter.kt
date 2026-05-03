package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.LayoutAlignCenter: ImageVector
    get() {
        if (_layoutAlignCenter != null) return _layoutAlignCenter!!
        _layoutAlignCenter = tablerOutlineIcon(
            name = "LayoutAlignCenter",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(12.0f, 4.0f),
                    PathNode.LineTo(12.0f, 9.0f)
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
                    PathNode.MoveTo(12.0f, 15.0f),
                    PathNode.LineTo(12.0f, 20.0f)
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
                    PathNode.MoveTo(6.0f, 11.0f),
                    PathNode.CurveTo(6.0f, 9.895431f, 6.895431f, 9.0f, 8.0f, 9.0f),
                    PathNode.LineTo(16.0f, 9.0f),
                    PathNode.CurveTo(17.10457f, 9.0f, 18.0f, 9.895431f, 18.0f, 11.0f),
                    PathNode.LineTo(18.0f, 13.0f),
                    PathNode.CurveTo(18.0f, 14.104569f, 17.10457f, 15.0f, 16.0f, 15.0f),
                    PathNode.LineTo(8.0f, 15.0f),
                    PathNode.CurveTo(6.895431f, 15.0f, 6.0f, 14.104569f, 6.0f, 13.0f),
                    PathNode.LineTo(6.0f, 11.0f)
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
        return _layoutAlignCenter!!
    }

private var _layoutAlignCenter: ImageVector? = null
