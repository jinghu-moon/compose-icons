package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.CornerLeftUpDouble: ImageVector
    get() {
        if (_cornerLeftUpDouble != null) return _cornerLeftUpDouble!!
        _cornerLeftUpDouble = tablerOutlineIcon(
            name = "CornerLeftUpDouble",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(18.0f, 19.0f),
                    PathNode.LineTo(12.0f, 19.0f),
                    PathNode.CurveTo(10.343145f, 19.0f, 9.0f, 17.656855f, 9.0f, 16.0f),
                    PathNode.LineTo(9.0f, 9.0f)
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
                    PathNode.MoveTo(13.0f, 13.0f),
                    PathNode.LineTo(9.0f, 9.0f),
                    PathNode.LineTo(5.0f, 13.0f),
                    PathNode.MoveTo(13.0f, 8.0f),
                    PathNode.LineTo(9.0f, 4.0f),
                    PathNode.LineTo(5.0f, 8.0f)
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
        return _cornerLeftUpDouble!!
    }

private var _cornerLeftUpDouble: ImageVector? = null
