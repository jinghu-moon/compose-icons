package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandLinqpad: ImageVector
    get() {
        if (_brandLinqpad != null) return _brandLinqpad!!
        _brandLinqpad = tablerOutlineIcon(
            name = "BrandLinqpad",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(5.0f, 21.0f),
                    PathNode.LineTo(8.5f, 21.0f),
                    PathNode.LineTo(11.0f, 15.0f),
                    PathNode.LineTo(13.5f, 14.0f),
                    PathNode.LineTo(16.0f, 21.0f),
                    PathNode.LineTo(20.0f, 21.0f),
                    PathNode.LineTo(21.0f, 16.5f),
                    PathNode.LineTo(19.0f, 15.5f),
                    PathNode.LineTo(12.0f, 3.5f),
                    PathNode.LineTo(6.0f, 3.0f),
                    PathNode.LineTo(7.5f, 7.0f),
                    PathNode.LineTo(10.0f, 7.5f),
                    PathNode.LineTo(11.0f, 10.0f),
                    PathNode.LineTo(4.0f, 18.0f),
                    PathNode.LineTo(5.0f, 21.0f)
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
        return _brandLinqpad!!
    }

private var _brandLinqpad: ImageVector? = null
