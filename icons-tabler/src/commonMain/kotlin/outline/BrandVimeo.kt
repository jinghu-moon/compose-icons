package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandVimeo: ImageVector
    get() {
        if (_brandVimeo != null) return _brandVimeo!!
        _brandVimeo = tablerOutlineIcon(
            name = "BrandVimeo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(3.0f, 8.5f),
                    PathNode.LineTo(4.0f, 9.5f),
                    PathNode.CurveTo(4.0f, 9.5f, 5.5f, 8.398f, 6.0f, 9.0f),
                    PathNode.CurveTo(6.509f, 9.609f, 7.863f, 16.65f, 8.5f, 18.0f),
                    PathNode.CurveTo(9.056f, 19.184f, 10.478f, 20.89f, 12.5f, 19.5f),
                    PathNode.CurveTo(14.5f, 18.0f, 20.0f, 14.0f, 21.0f, 8.0f),
                    PathNode.CurveTo(21.444f, 5.339f, 20.0f, 4.0f, 18.5f, 4.0f),
                    PathNode.CurveTo(16.5f, 4.0f, 14.453f, 5.202f, 14.0f, 8.0f),
                    PathNode.CurveTo(16.05f, 6.746f, 16.551f, 9.0f, 15.5f, 11.0f),
                    PathNode.CurveTo(14.448f, 13.0f, 13.5f, 14.0f, 13.0f, 14.0f),
                    PathNode.CurveTo(12.51f, 14.0f, 12.076f, 12.835f, 11.5f, 10.5f),
                    PathNode.CurveTo(10.91f, 8.08f, 11.0f, 4.0f, 8.5f, 4.0f),
                    PathNode.CurveTo(6.0f, 4.0f, 3.0f, 8.5f, 3.0f, 8.5f)
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
        return _brandVimeo!!
    }

private var _brandVimeo: ImageVector? = null
