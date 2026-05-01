package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandDropbox: ImageVector
    get() {
        if (_brandDropbox != null) return _brandDropbox!!
        _brandDropbox = tablerOutlineIcon(
            name = "BrandDropbox",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(7.5f, 10.625f),
                    PathNode.LineTo(3.0f, 7.812f),
                    PathNode.LineTo(7.5f, 5.0f),
                    PathNode.LineTo(12.0f, 7.813f),
                    PathNode.MoveTo(7.5f, 10.625f),
                    PathNode.LineTo(12.0f, 7.812f),
                    PathNode.MoveTo(7.5f, 10.625f),
                    PathNode.LineTo(3.0f, 13.448f),
                    PathNode.LineTo(7.5f, 16.25f),
                    PathNode.MoveTo(7.5f, 10.625f),
                    PathNode.LineTo(12.0f, 13.448f),
                    PathNode.MoveTo(12.0f, 7.812f),
                    PathNode.LineTo(16.5f, 10.603f),
                    PathNode.LineTo(21.0f, 7.791f),
                    PathNode.LineTo(16.5f, 5.0f),
                    PathNode.LineTo(12.0f, 7.813f),
                    PathNode.MoveTo(7.5f, 16.251f),
                    PathNode.LineTo(12.0f, 13.449f),
                    PathNode.MoveTo(7.5f, 16.251f),
                    PathNode.LineTo(7.5f, 17.374f),
                    PathNode.LineTo(12.0f, 20.001f),
                    PathNode.LineTo(16.5f, 17.374f),
                    PathNode.LineTo(16.5f, 16.251f),
                    PathNode.MoveTo(12.0f, 13.449f),
                    PathNode.LineTo(16.5f, 10.626f),
                    PathNode.LineTo(21.0f, 13.449f),
                    PathNode.LineTo(16.5f, 16.251f),
                    PathNode.MoveTo(12.0f, 13.449f),
                    PathNode.LineTo(16.5f, 16.251f)
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
        return _brandDropbox!!
    }

private var _brandDropbox: ImageVector? = null
