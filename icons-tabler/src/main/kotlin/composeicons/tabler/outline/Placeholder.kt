package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Placeholder: ImageVector
    get() {
        if (_placeholder != null) return _placeholder!!
        _placeholder = tablerOutlineIcon(
            name = "Placeholder",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(10.0f, 20.415f),
                    PathNode.CurveTo(12.992311f, 21.626839f, 16.419762f, 20.92136f, 18.690233f, 18.626268f),
                    PathNode.CurveTo(20.960707f, 16.331179f, 21.629183f, 12.896319f, 20.385145f, 9.917251f),
                    PathNode.CurveTo(19.141108f, 6.938182f, 16.228386f, 4.998806f, 13.0f, 5.0f),
                    PathNode.LineTo(10.0f, 5.0f)
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
                    PathNode.MoveTo(13.0f, 8.0f),
                    PathNode.LineTo(10.0f, 5.0f),
                    PathNode.LineTo(13.0f, 2.0f)
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
                    PathNode.MoveTo(7.0f, 17.0f),
                    PathNode.LineTo(11.0f, 13.0f),
                    PathNode.LineTo(7.0f, 9.0f),
                    PathNode.LineTo(3.0f, 13.0f),
                    PathNode.LineTo(7.0f, 17.0f)
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
        return _placeholder!!
    }

private var _placeholder: ImageVector? = null
