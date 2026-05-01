package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Golf: ImageVector
    get() {
        if (_golf != null) return _golf!!
        _golf = tablerOutlineIcon(
            name = "Golf",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(12.0f, 18.0f),
                    PathNode.LineTo(12.0f, 3.0f),
                    PathNode.LineTo(19.0f, 7.0f),
                    PathNode.LineTo(12.0f, 11.0f)
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
                    PathNode.MoveTo(9.0f, 17.67f),
                    PathNode.CurveTo(8.38f, 18.03f, 8.0f, 18.49f, 8.0f, 19.0f),
                    PathNode.CurveTo(8.0f, 20.1f, 9.8f, 21.0f, 12.0f, 21.0f),
                    PathNode.CurveTo(14.2f, 21.0f, 16.0f, 20.1f, 16.0f, 19.0f),
                    PathNode.CurveTo(16.0f, 18.5f, 15.62f, 18.03f, 15.0f, 17.67f)
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
        return _golf!!
    }

private var _golf: ImageVector? = null
