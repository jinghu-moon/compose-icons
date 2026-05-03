package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandInertia: ImageVector
    get() {
        if (_brandInertia != null) return _brandInertia!!
        _brandInertia = tablerOutlineIcon(
            name = "BrandInertia",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(12.5f, 8.0f),
                    PathNode.LineTo(16.5f, 12.0f),
                    PathNode.LineTo(12.5f, 16.0f),
                    PathNode.LineTo(17.0f, 16.0f),
                    PathNode.LineTo(21.0f, 12.0f),
                    PathNode.LineTo(17.0f, 8.0f),
                    PathNode.LineTo(12.5f, 8.0f)
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
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(3.5f, 8.0f),
                    PathNode.LineTo(7.5f, 12.0f),
                    PathNode.LineTo(3.5f, 16.0f),
                    PathNode.LineTo(8.0f, 16.0f),
                    PathNode.LineTo(12.0f, 12.0f),
                    PathNode.LineTo(8.0f, 8.0f),
                    PathNode.LineTo(3.5f, 8.0f)
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
        return _brandInertia!!
    }

private var _brandInertia: ImageVector? = null
