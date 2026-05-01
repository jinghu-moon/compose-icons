package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Marquee: ImageVector
    get() {
        if (_marquee != null) return _marquee!!
        _marquee = tablerOutlineIcon(
            name = "Marquee",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(4.0f, 6.0f),
                    PathNode.CurveTo(4.0f, 4.895431f, 4.895431f, 4.0f, 6.0f, 4.0f),
                    PathNode.MoveTo(9.0f, 4.0f),
                    PathNode.LineTo(10.5f, 4.0f),
                    PathNode.MoveTo(13.5f, 4.0f),
                    PathNode.LineTo(15.0f, 4.0f),
                    PathNode.MoveTo(18.0f, 4.0f),
                    PathNode.CurveTo(19.10457f, 4.0f, 20.0f, 4.895431f, 20.0f, 6.0f),
                    PathNode.MoveTo(20.0f, 9.0f),
                    PathNode.LineTo(20.0f, 10.5f),
                    PathNode.MoveTo(20.0f, 13.5f),
                    PathNode.LineTo(20.0f, 15.0f),
                    PathNode.MoveTo(20.0f, 18.0f),
                    PathNode.CurveTo(20.0f, 19.10457f, 19.10457f, 20.0f, 18.0f, 20.0f),
                    PathNode.MoveTo(15.0f, 20.0f),
                    PathNode.LineTo(13.5f, 20.0f),
                    PathNode.MoveTo(10.5f, 20.0f),
                    PathNode.LineTo(9.0f, 20.0f),
                    PathNode.MoveTo(6.0f, 20.0f),
                    PathNode.CurveTo(4.895431f, 20.0f, 4.0f, 19.10457f, 4.0f, 18.0f),
                    PathNode.MoveTo(4.0f, 15.0f),
                    PathNode.LineTo(4.0f, 13.5f),
                    PathNode.MoveTo(4.0f, 10.5f),
                    PathNode.LineTo(4.0f, 9.0f),
                    PathNode.MoveTo(4.0f, 6.0f)
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
        return _marquee!!
    }

private var _marquee: ImageVector? = null
