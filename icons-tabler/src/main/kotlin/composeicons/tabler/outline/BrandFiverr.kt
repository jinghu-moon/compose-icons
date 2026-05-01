package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandFiverr: ImageVector
    get() {
        if (_brandFiverr != null) return _brandFiverr!!
        _brandFiverr = tablerOutlineIcon(
            name = "BrandFiverr",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(15.0f, 3.0f),
                    PathNode.LineTo(13.0f, 3.0f),
                    PathNode.CurveTo(9.686292f, 3.0f, 7.0f, 5.686292f, 7.0f, 9.0f),
                    PathNode.LineTo(4.0f, 9.0f),
                    PathNode.LineTo(4.0f, 13.0f),
                    PathNode.LineTo(7.0f, 13.0f),
                    PathNode.LineTo(7.0f, 21.0f),
                    PathNode.LineTo(11.0f, 21.0f),
                    PathNode.LineTo(11.0f, 14.0f),
                    PathNode.LineTo(15.0f, 14.0f),
                    PathNode.LineTo(15.0f, 21.0f),
                    PathNode.LineTo(19.0f, 21.0f),
                    PathNode.LineTo(19.0f, 10.0f),
                    PathNode.LineTo(11.0f, 10.0f),
                    PathNode.LineTo(11.0f, 8.967f),
                    PathNode.CurveTo(10.999926f, 8.439551f, 11.211686f, 7.93417f, 11.587739f, 7.564323f),
                    PathNode.CurveTo(11.963791f, 7.194475f, 12.472625f, 6.991151f, 13.0f, 7.0f),
                    PathNode.LineTo(15.0f, 7.0f),
                    PathNode.LineTo(15.0f, 3.0f)
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
        return _brandFiverr!!
    }

private var _brandFiverr: ImageVector? = null
