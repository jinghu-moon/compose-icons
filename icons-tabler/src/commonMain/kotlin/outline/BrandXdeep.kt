package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandXdeep: ImageVector
    get() {
        if (_brandXdeep != null) return _brandXdeep!!
        _brandXdeep = tablerOutlineIcon(
            name = "BrandXdeep",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(14.401f, 8.398f),
                    PathNode.LineTo(16.0f, 6.0f),
                    PathNode.LineTo(21.0f, 6.0f),
                    PathNode.LineTo(17.0f, 12.0f),
                    PathNode.LineTo(21.0f, 18.0f),
                    PathNode.LineTo(16.0f, 18.0f),
                    PathNode.LineTo(8.0f, 6.0f),
                    PathNode.LineTo(3.0f, 6.0f),
                    PathNode.LineTo(7.0f, 12.0f),
                    PathNode.LineTo(3.0f, 18.0f),
                    PathNode.LineTo(8.0f, 18.0f),
                    PathNode.LineTo(9.596f, 15.607f)
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
        return _brandXdeep!!
    }

private var _brandXdeep: ImageVector? = null
