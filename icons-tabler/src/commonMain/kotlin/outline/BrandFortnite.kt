package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandFortnite: ImageVector
    get() {
        if (_brandFortnite != null) return _brandFortnite!!
        _brandFortnite = tablerOutlineIcon(
            name = "BrandFortnite",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(8.0f, 3.0f),
                    PathNode.LineTo(15.5f, 3.0f),
                    PathNode.LineTo(15.0f, 7.0f),
                    PathNode.LineTo(12.0f, 7.0f),
                    PathNode.LineTo(12.0f, 10.0f),
                    PathNode.LineTo(15.0f, 10.0f),
                    PathNode.LineTo(15.0f, 13.5f),
                    PathNode.LineTo(12.0f, 13.5f),
                    PathNode.LineTo(12.0f, 20.0f),
                    PathNode.LineTo(8.0f, 21.0f),
                    PathNode.LineTo(8.0f, 3.0f)
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
        return _brandFortnite!!
    }

private var _brandFortnite: ImageVector? = null
