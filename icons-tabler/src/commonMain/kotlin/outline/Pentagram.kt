package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Pentagram: ImageVector
    get() {
        if (_pentagram != null) return _pentagram!!
        _pentagram = tablerOutlineIcon(
            name = "Pentagram",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(5.636f, 5.636f),
                    PathNode.CurveTo(9.15074f, 2.12126f, 14.84926f, 2.12126f, 18.364f, 5.636f),
                    PathNode.CurveTo(21.87874f, 9.15074f, 21.87874f, 14.84926f, 18.364f, 18.364f),
                    PathNode.CurveTo(14.849259f, 21.87874f, 9.150741f, 21.87874f, 5.636f, 18.364f),
                    PathNode.CurveTo(2.12126f, 14.849259f, 2.12126f, 9.150741f, 5.636f, 5.636f)
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
                    PathNode.MoveTo(15.236f, 11.0f),
                    PathNode.LineTo(20.5f, 15.0f),
                    PathNode.LineTo(14.0f, 15.0f),
                    PathNode.LineTo(12.0f, 21.0f),
                    PathNode.LineTo(10.0f, 15.0f),
                    PathNode.LineTo(3.5f, 15.0f),
                    PathNode.LineTo(8.776f, 11.0f),
                    PathNode.LineTo(6.72f, 4.72f),
                    PathNode.LineTo(12.0f, 8.5f),
                    PathNode.LineTo(17.28f, 4.72f),
                    PathNode.LineTo(15.236f, 11.0f)
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
        return _pentagram!!
    }

private var _pentagram: ImageVector? = null
