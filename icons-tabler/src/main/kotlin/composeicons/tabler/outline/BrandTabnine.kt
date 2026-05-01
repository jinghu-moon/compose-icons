package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandTabnine: ImageVector
    get() {
        if (_brandTabnine != null) return _brandTabnine!!
        _brandTabnine = tablerOutlineIcon(
            name = "BrandTabnine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(20.0f, 12.0f),
                    PathNode.LineTo(8.0f, 18.75f),
                    PathNode.MoveTo(20.0f, 12.0f),
                    PathNode.LineTo(8.0f, 5.25f),
                    PathNode.MoveTo(20.0f, 12.0f),
                    PathNode.LineTo(20.0f, 7.473f),
                    PathNode.LineTo(12.0f, 3.0f),
                    PathNode.LineTo(8.0f, 5.25f),
                    PathNode.MoveTo(20.0f, 12.0f),
                    PathNode.LineTo(20.0f, 16.5f),
                    PathNode.LineTo(12.0f, 21.0f),
                    PathNode.LineTo(8.0f, 18.75f),
                    PathNode.MoveTo(8.0f, 5.25f),
                    PathNode.LineTo(4.0f, 7.472f),
                    PathNode.LineTo(4.0f, 16.5f),
                    PathNode.LineTo(8.0f, 18.75f),
                    PathNode.LineTo(20.0f, 12.0f)
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
        return _brandTabnine!!
    }

private var _brandTabnine: ImageVector? = null
