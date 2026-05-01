package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ScubaDiving: ImageVector
    get() {
        if (_scubaDiving != null) return _scubaDiving!!
        _scubaDiving = tablerOutlineIcon(
            name = "ScubaDiving",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(19.0f, 12.0f),
                    PathNode.CurveTo(19.0f, 12.552285f, 19.447716f, 13.0f, 20.0f, 13.0f),
                    PathNode.CurveTo(20.552284f, 13.0f, 21.0f, 12.552285f, 21.0f, 12.0f),
                    PathNode.CurveTo(21.0f, 11.447715f, 20.552284f, 11.0f, 20.0f, 11.0f),
                    PathNode.CurveTo(19.447716f, 11.0f, 19.0f, 11.447715f, 19.0f, 12.0f)
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
                    PathNode.MoveTo(2.0f, 2.0f),
                    PathNode.LineTo(5.0f, 5.0f),
                    PathNode.LineTo(6.5f, 9.0f),
                    PathNode.LineTo(10.0f, 11.0f),
                    PathNode.LineTo(16.0f, 13.0f),
                    PathNode.LineTo(17.0f, 17.0f),
                    PathNode.LineTo(19.5f, 20.0f)
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
                    PathNode.MoveTo(11.0f, 8.0f),
                    PathNode.LineTo(15.5f, 9.5f)
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
        return _scubaDiving!!
    }

private var _scubaDiving: ImageVector? = null
