package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.CornerLeftUp: ImageVector
    get() {
        if (_cornerLeftUp != null) return _cornerLeftUp!!
        _cornerLeftUp = tablerOutlineIcon(
            name = "CornerLeftUp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(18.0f, 18.0f),
                    PathNode.LineTo(12.0f, 18.0f),
                    PathNode.CurveTo(10.343145f, 18.0f, 9.0f, 16.656855f, 9.0f, 15.0f),
                    PathNode.LineTo(9.0f, 5.0f),
                    PathNode.LineTo(5.0f, 9.0f),
                    PathNode.MoveTo(13.0f, 9.0f),
                    PathNode.LineTo(9.0f, 5.0f)
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
        return _cornerLeftUp!!
    }

private var _cornerLeftUp: ImageVector? = null
