package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandHtml5: ImageVector
    get() {
        if (_brandHtml5 != null) return _brandHtml5!!
        _brandHtml5 = tablerOutlineIcon(
            name = "BrandHtml5",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(20.0f, 4.0f),
                    PathNode.LineTo(18.0f, 18.5f),
                    PathNode.LineTo(12.0f, 20.5f),
                    PathNode.LineTo(6.0f, 18.5f),
                    PathNode.LineTo(4.0f, 4.0f),
                    PathNode.LineTo(20.0f, 4.0f)
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
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(15.5f, 8.0f),
                    PathNode.LineTo(8.5f, 8.0f),
                    PathNode.LineTo(9.0f, 12.0f),
                    PathNode.LineTo(15.0f, 12.0f),
                    PathNode.LineTo(14.5f, 15.5f),
                    PathNode.LineTo(12.0f, 16.25f),
                    PathNode.LineTo(9.5f, 15.5f),
                    PathNode.LineTo(9.4f, 15.0f)
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
        return _brandHtml5!!
    }

private var _brandHtml5: ImageVector? = null
