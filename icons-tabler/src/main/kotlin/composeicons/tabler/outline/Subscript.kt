package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Subscript: ImageVector
    get() {
        if (_subscript != null) return _subscript!!
        _subscript = tablerOutlineIcon(
            name = "Subscript",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(5.0f, 7.0f),
                    PathNode.LineTo(13.0f, 17.0f),
                    PathNode.MoveTo(5.0f, 17.0f),
                    PathNode.LineTo(13.0f, 7.0f)
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
                    PathNode.MoveTo(21.0f, 20.0f),
                    PathNode.LineTo(17.0f, 20.0f),
                    PathNode.LineTo(20.5f, 16.0f),
                    PathNode.CurveTo(21.052284f, 15.033502f, 20.716497f, 13.802285f, 19.75f, 13.25f),
                    PathNode.CurveTo(18.783503f, 12.697715f, 17.552284f, 13.033502f, 17.0f, 14.0f)
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
        return _subscript!!
    }

private var _subscript: ImageVector? = null
