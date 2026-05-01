package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Grave: ImageVector
    get() {
        if (_grave != null) return _grave!!
        _grave = tablerOutlineIcon(
            name = "Grave",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(5.0f, 21.0f),
                    PathNode.LineTo(5.0f, 19.0f),
                    PathNode.CurveTo(5.0f, 17.343145f, 6.343146f, 16.0f, 8.0f, 16.0f),
                    PathNode.LineTo(16.0f, 16.0f),
                    PathNode.CurveTo(17.656855f, 16.0f, 19.0f, 17.343145f, 19.0f, 19.0f),
                    PathNode.LineTo(19.0f, 21.0f),
                    PathNode.LineTo(5.0f, 21.0f)
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
                    PathNode.MoveTo(10.0f, 16.0f),
                    PathNode.LineTo(10.0f, 11.0f),
                    PathNode.LineTo(6.0f, 11.0f),
                    PathNode.LineTo(6.0f, 7.0f),
                    PathNode.LineTo(10.0f, 7.0f),
                    PathNode.LineTo(10.0f, 3.0f),
                    PathNode.LineTo(14.0f, 3.0f),
                    PathNode.LineTo(14.0f, 7.0f),
                    PathNode.LineTo(18.0f, 7.0f),
                    PathNode.LineTo(18.0f, 11.0f),
                    PathNode.LineTo(14.0f, 11.0f),
                    PathNode.LineTo(14.0f, 16.0f)
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
        return _grave!!
    }

private var _grave: ImageVector? = null
