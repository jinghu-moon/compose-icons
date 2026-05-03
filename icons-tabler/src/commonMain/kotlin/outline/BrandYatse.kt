package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandYatse: ImageVector
    get() {
        if (_brandYatse != null) return _brandYatse!!
        _brandYatse = tablerOutlineIcon(
            name = "BrandYatse",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(7.0f, 3.0f),
                    PathNode.LineTo(12.0f, 5.876f),
                    PathNode.LineTo(12.0f, 10.964f),
                    PathNode.LineTo(16.197f, 8.234f),
                    PathNode.LineTo(21.0f, 10.965f),
                    PathNode.LineTo(11.719f, 16.443f),
                    PathNode.LineTo(9.336f, 17.853f),
                    PathNode.LineTo(7.002f, 19.23f),
                    PathNode.LineTo(4.002f, 21.0f),
                    PathNode.LineTo(4.002f, 15.435f),
                    PathNode.LineTo(7.002f, 13.664f),
                    PathNode.LineTo(7.0f, 3.0f)
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
        return _brandYatse!!
    }

private var _brandYatse: ImageVector? = null
