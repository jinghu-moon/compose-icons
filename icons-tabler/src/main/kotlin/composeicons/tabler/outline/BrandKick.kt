package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandKick: ImageVector
    get() {
        if (_brandKick != null) return _brandKick!!
        _brandKick = tablerOutlineIcon(
            name = "BrandKick",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(4.0f, 4.0f),
                    PathNode.LineTo(9.0f, 4.0f),
                    PathNode.LineTo(9.0f, 8.0f),
                    PathNode.LineTo(12.0f, 8.0f),
                    PathNode.LineTo(12.0f, 6.0f),
                    PathNode.LineTo(14.0f, 6.0f),
                    PathNode.LineTo(14.0f, 4.0f),
                    PathNode.LineTo(20.0f, 4.0f),
                    PathNode.LineTo(20.0f, 8.0f),
                    PathNode.LineTo(18.0f, 8.0f),
                    PathNode.LineTo(18.0f, 10.0f),
                    PathNode.LineTo(16.0f, 10.0f),
                    PathNode.LineTo(16.0f, 14.0f),
                    PathNode.LineTo(18.0f, 14.0f),
                    PathNode.LineTo(18.0f, 16.0f),
                    PathNode.LineTo(20.0f, 16.0f),
                    PathNode.LineTo(20.0f, 20.0f),
                    PathNode.LineTo(14.0f, 20.0f),
                    PathNode.LineTo(14.0f, 18.0f),
                    PathNode.LineTo(12.0f, 18.0f),
                    PathNode.LineTo(12.0f, 16.0f),
                    PathNode.LineTo(9.0f, 16.0f),
                    PathNode.LineTo(9.0f, 20.0f),
                    PathNode.LineTo(4.0f, 20.0f),
                    PathNode.LineTo(4.0f, 4.0f)
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
        return _brandKick!!
    }

private var _brandKick: ImageVector? = null
