package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Bowl: ImageVector
    get() {
        if (_bowl != null) return _bowl!!
        _bowl = tablerOutlineIcon(
            name = "Bowl",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(4.0f, 8.0f),
                    PathNode.LineTo(20.0f, 8.0f),
                    PathNode.CurveTo(20.552284f, 8.0f, 21.0f, 8.447715f, 21.0f, 9.0f),
                    PathNode.LineTo(21.0f, 9.5f),
                    PathNode.CurveTo(21.0f, 11.0f, 18.483f, 15.073f, 17.0f, 16.0f),
                    PathNode.LineTo(17.0f, 17.0f),
                    PathNode.CurveTo(17.0f, 17.552284f, 16.552284f, 18.0f, 16.0f, 18.0f),
                    PathNode.LineTo(8.0f, 18.0f),
                    PathNode.CurveTo(7.447716f, 18.0f, 7.0f, 17.552284f, 7.0f, 17.0f),
                    PathNode.LineTo(7.0f, 16.0f),
                    PathNode.CurveTo(5.313f, 14.946f, 3.0f, 11.0f, 3.0f, 9.5f),
                    PathNode.LineTo(3.0f, 9.0f),
                    PathNode.CurveTo(3.0f, 8.447715f, 3.447715f, 8.0f, 4.0f, 8.0f)
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
        return _bowl!!
    }

private var _bowl: ImageVector? = null
