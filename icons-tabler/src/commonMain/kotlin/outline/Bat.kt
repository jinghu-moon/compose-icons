package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Bat: ImageVector
    get() {
        if (_bat != null) return _bat!!
        _bat = tablerOutlineIcon(
            name = "Bat",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(17.0f, 16.0f),
                    PathNode.CurveTo(17.74f, 13.714f, 19.778f, 12.238f, 22.0f, 13.0f),
                    PathNode.CurveTo(21.827f, 10.405f, 22.13f, 7.686f, 20.0f, 5.5f),
                    PathNode.CurveTo(18.292f, 8.148f, 16.642f, 8.057f, 15.0f, 8.0f),
                    PathNode.LineTo(15.0f, 4.0f),
                    PathNode.LineTo(12.0f, 6.0f),
                    PathNode.LineTo(9.0f, 4.0f),
                    PathNode.LineTo(9.0f, 8.0f),
                    PathNode.CurveTo(7.358f, 8.057f, 5.708f, 8.148f, 4.0f, 5.5f),
                    PathNode.CurveTo(1.87f, 7.686f, 2.173f, 10.405f, 2.0f, 13.0f),
                    PathNode.CurveTo(4.222f, 12.238f, 6.26f, 13.714f, 7.0f, 16.0f),
                    PathNode.CurveTo(9.593f, 16.0f, 10.889f, 16.952f, 12.0f, 20.0f),
                    PathNode.CurveTo(13.111f, 16.952f, 14.407f, 16.0f, 17.0f, 16.0f)
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
                    PathNode.MoveTo(9.0f, 8.0f),
                    PathNode.CurveTo(9.0f, 9.656855f, 10.343145f, 11.0f, 12.0f, 11.0f),
                    PathNode.CurveTo(13.656855f, 11.0f, 15.0f, 9.656855f, 15.0f, 8.0f)
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
        return _bat!!
    }

private var _bat: ImageVector? = null
