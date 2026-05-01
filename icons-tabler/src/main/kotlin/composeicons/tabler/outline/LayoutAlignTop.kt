package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.LayoutAlignTop: ImageVector
    get() {
        if (_layoutAlignTop != null) return _layoutAlignTop!!
        _layoutAlignTop = tablerOutlineIcon(
            name = "LayoutAlignTop",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(4.0f, 4.0f),
                    PathNode.LineTo(20.0f, 4.0f)
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
                    PathNode.MoveTo(9.0f, 10.0f),
                    PathNode.CurveTo(9.0f, 8.895431f, 9.895431f, 8.0f, 11.0f, 8.0f),
                    PathNode.LineTo(13.0f, 8.0f),
                    PathNode.CurveTo(14.104569f, 8.0f, 15.0f, 8.895431f, 15.0f, 10.0f),
                    PathNode.LineTo(15.0f, 18.0f),
                    PathNode.CurveTo(15.0f, 19.10457f, 14.104569f, 20.0f, 13.0f, 20.0f),
                    PathNode.LineTo(11.0f, 20.0f),
                    PathNode.CurveTo(9.895431f, 20.0f, 9.0f, 19.10457f, 9.0f, 18.0f),
                    PathNode.LineTo(9.0f, 10.0f)
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
        return _layoutAlignTop!!
    }

private var _layoutAlignTop: ImageVector? = null
