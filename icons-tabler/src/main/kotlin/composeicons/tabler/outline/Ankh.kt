package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Ankh: ImageVector
    get() {
        if (_ankh != null) return _ankh!!
        _ankh = tablerOutlineIcon(
            name = "Ankh",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(6.0f, 13.0f),
                    PathNode.LineTo(18.0f, 13.0f)
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
                    PathNode.MoveTo(12.0f, 21.0f),
                    PathNode.LineTo(12.0f, 13.0f),
                    PathNode.LineTo(11.578f, 12.789f),
                    PathNode.CurveTo(9.385161f, 11.692754f, 7.999968f, 9.451591f, 8.0f, 7.0f),
                    PathNode.CurveTo(8.0f, 4.790861f, 9.790861f, 3.0f, 12.0f, 3.0f),
                    PathNode.CurveTo(14.209139f, 3.0f, 16.0f, 4.790861f, 16.0f, 7.0f),
                    PathNode.CurveTo(16.000032f, 9.451591f, 14.614839f, 11.692754f, 12.422f, 12.789f),
                    PathNode.LineTo(12.0f, 13.0f)
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
        return _ankh!!
    }

private var _ankh: ImageVector? = null
