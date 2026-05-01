package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandPagekit: ImageVector
    get() {
        if (_brandPagekit != null) return _brandPagekit!!
        _brandPagekit = tablerOutlineIcon(
            name = "BrandPagekit",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(12.077f, 20.0f),
                    PathNode.LineTo(7.0f, 20.0f),
                    PathNode.LineTo(7.0f, 4.0f),
                    PathNode.LineTo(18.0f, 4.0f),
                    PathNode.LineTo(18.0f, 18.0f),
                    PathNode.LineTo(12.923f, 18.0f)
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
        return _brandPagekit!!
    }

private var _brandPagekit: ImageVector? = null
