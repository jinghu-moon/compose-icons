package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Pill: ImageVector
    get() {
        if (_pill != null) return _pill!!
        _pill = tablerOutlineIcon(
            name = "Pill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(4.5f, 12.5f),
                    PathNode.LineTo(12.5f, 4.5f),
                    PathNode.CurveTo(14.432997f, 2.567004f, 17.567003f, 2.567004f, 19.5f, 4.5f),
                    PathNode.CurveTo(21.432997f, 6.432997f, 21.432997f, 9.567003f, 19.5f, 11.5f),
                    PathNode.LineTo(11.5f, 19.5f),
                    PathNode.CurveTo(9.567003f, 21.432997f, 6.432997f, 21.432997f, 4.5f, 19.5f),
                    PathNode.CurveTo(2.567004f, 17.567003f, 2.567004f, 14.432997f, 4.5f, 12.5f)
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
                    PathNode.MoveTo(8.5f, 8.5f),
                    PathNode.LineTo(15.5f, 15.5f)
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
        return _pill!!
    }

private var _pill: ImageVector? = null
