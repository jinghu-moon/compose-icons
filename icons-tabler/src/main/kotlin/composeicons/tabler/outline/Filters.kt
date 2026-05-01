package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Filters: ImageVector
    get() {
        if (_filters != null) return _filters!!
        _filters = tablerOutlineIcon(
            name = "Filters",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(7.0f, 8.0f),
                    PathNode.CurveTo(7.0f, 10.761424f, 9.238576f, 13.0f, 12.0f, 13.0f),
                    PathNode.CurveTo(14.761424f, 13.0f, 17.0f, 10.761424f, 17.0f, 8.0f),
                    PathNode.CurveTo(17.0f, 5.238577f, 14.761424f, 3.0f, 12.0f, 3.0f),
                    PathNode.CurveTo(9.238576f, 3.0f, 7.0f, 5.238577f, 7.0f, 8.0f)
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
                    PathNode.MoveTo(8.0f, 11.0f),
                    PathNode.CurveTo(5.680786f, 11.000116f, 3.666086f, 12.595038f, 3.133748f, 14.852332f),
                    PathNode.CurveTo(2.601411f, 17.109625f, 3.691191f, 19.436676f, 5.765974f, 20.47303f),
                    PathNode.CurveTo(7.840758f, 21.509384f, 10.355846f, 20.982964f, 11.840853f, 19.201529f),
                    PathNode.CurveTo(13.325859f, 17.420094f, 13.390921f, 14.851327f, 11.998f, 12.997f)
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
                    PathNode.MoveTo(12.002f, 19.003f),
                    PathNode.CurveTo(13.413892f, 20.882584f, 15.944453f, 21.524782f, 18.081757f, 20.545904f),
                    PathNode.CurveTo(20.21906f, 19.567026f, 21.385818f, 17.231466f, 20.884932f, 14.934646f),
                    PathNode.CurveTo(20.384045f, 12.637826f, 18.350801f, 11.000118f, 16.0f, 11.0f)
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
        return _filters!!
    }

private var _filters: ImageVector? = null
