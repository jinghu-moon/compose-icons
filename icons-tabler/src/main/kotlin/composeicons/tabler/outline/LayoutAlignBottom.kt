package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.LayoutAlignBottom: ImageVector
    get() {
        if (_layoutAlignBottom != null) return _layoutAlignBottom!!
        _layoutAlignBottom = tablerOutlineIcon(
            name = "LayoutAlignBottom",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(4.0f, 20.0f),
                    PathNode.LineTo(20.0f, 20.0f)
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
                    PathNode.MoveTo(9.0f, 6.0f),
                    PathNode.CurveTo(9.0f, 4.895431f, 9.895431f, 4.0f, 11.0f, 4.0f),
                    PathNode.LineTo(13.0f, 4.0f),
                    PathNode.CurveTo(14.104569f, 4.0f, 15.0f, 4.895431f, 15.0f, 6.0f),
                    PathNode.LineTo(15.0f, 14.0f),
                    PathNode.CurveTo(15.0f, 15.104569f, 14.104569f, 16.0f, 13.0f, 16.0f),
                    PathNode.LineTo(11.0f, 16.0f),
                    PathNode.CurveTo(9.895431f, 16.0f, 9.0f, 15.104569f, 9.0f, 14.0f),
                    PathNode.LineTo(9.0f, 6.0f)
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
        return _layoutAlignBottom!!
    }

private var _layoutAlignBottom: ImageVector? = null
