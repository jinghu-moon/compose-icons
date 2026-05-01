package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.At: ImageVector
    get() {
        if (_at != null) return _at!!
        _at = tablerOutlineIcon(
            name = "At",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(8.0f, 12.0f),
                    PathNode.CurveTo(8.0f, 14.209139f, 9.790861f, 16.0f, 12.0f, 16.0f),
                    PathNode.CurveTo(14.209139f, 16.0f, 16.0f, 14.209139f, 16.0f, 12.0f),
                    PathNode.CurveTo(16.0f, 9.790861f, 14.209139f, 8.0f, 12.0f, 8.0f),
                    PathNode.CurveTo(9.790861f, 8.0f, 8.0f, 9.790861f, 8.0f, 12.0f)
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
                    PathNode.MoveTo(16.0f, 12.0f),
                    PathNode.LineTo(16.0f, 13.5f),
                    PathNode.CurveTo(16.0f, 14.880712f, 17.119287f, 16.0f, 18.5f, 16.0f),
                    PathNode.CurveTo(19.880713f, 16.0f, 21.0f, 14.880712f, 21.0f, 13.5f),
                    PathNode.LineTo(21.0f, 12.0f),
                    PathNode.CurveTo(21.005102f, 8.029075f, 18.407158f, 4.524072f, 14.606389f, 3.3741f),
                    PathNode.CurveTo(10.80562f, 2.224127f, 6.700349f, 3.700981f, 4.503208f, 7.008677f),
                    PathNode.CurveTo(2.306067f, 10.316372f, 2.536356f, 14.673128f, 5.069956f, 17.730766f),
                    PathNode.CurveTo(7.603554f, 20.788404f, 11.841642f, 21.824247f, 15.5f, 20.28f)
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
        return _at!!
    }

private var _at: ImageVector? = null
