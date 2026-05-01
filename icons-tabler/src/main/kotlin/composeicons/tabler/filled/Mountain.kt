package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Mountain: ImageVector
    get() {
        if (_mountain != null) return _mountain!!
        _mountain = tablerFilledIcon(
            name = "Mountain",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(6.18f, 10.95f),
                    PathNode.LineTo(8.72f, 14.125f),
                    PathNode.LineTo(8.804f, 14.218f),
                    PathNode.CurveTo(9.195932f, 14.598347f, 9.820529f, 14.593895f, 10.207f, 14.208f),
                    PathNode.LineTo(11.844f, 12.57f),
                    PathNode.LineTo(13.168f, 14.555f),
                    PathNode.CurveTo(13.323496f, 14.788258f, 13.569762f, 14.945536f, 13.846786f, 14.988505f),
                    PathNode.CurveTo(14.123809f, 15.031475f, 14.406148f, 14.956192f, 14.625f, 14.781f),
                    PathNode.LineTo(18.257f, 11.875f),
                    PathNode.LineTo(21.904f, 19.572f),
                    PathNode.CurveTo(22.050726f, 19.88183f, 22.028515f, 20.245228f, 21.845148f, 20.534883f),
                    PathNode.CurveTo(21.66178f, 20.82454f, 21.342817f, 21.000076f, 21.0f, 21.0f),
                    PathNode.LineTo(3.0f, 21.0f),
                    PathNode.CurveTo(2.657183f, 21.000076f, 2.33822f, 20.82454f, 2.154853f, 20.534883f),
                    PathNode.CurveTo(1.971485f, 20.245228f, 1.949274f, 19.88183f, 2.096f, 19.572f),
                    PathNode.Close,
                    PathNode.MoveTo(12.0f, 3.072f),
                    PathNode.CurveTo(13.275673f, 3.071868f, 14.437167f, 3.807001f, 14.983f, 4.96f),
                    PathNode.LineTo(17.377f, 10.017f),
                    PathNode.LineTo(14.227f, 12.537f),
                    PathNode.LineTo(12.832f, 10.445f),
                    PathNode.LineTo(12.757f, 10.346f),
                    PathNode.CurveTo(12.575292f, 10.135726f, 12.314275f, 10.010552f, 12.036549f, 10.000498f),
                    PathNode.CurveTo(11.758822f, 9.990444f, 11.489438f, 10.096416f, 11.293f, 10.293f),
                    PathNode.LineTo(9.582f, 12.002f),
                    PathNode.LineTo(8.281f, 10.375f),
                    PathNode.LineTo(7.13f, 8.94f),
                    PathNode.LineTo(9.018f, 4.96f),
                    PathNode.CurveTo(9.563679f, 3.807328f, 10.724689f, 3.072255f, 12.0f, 3.072f)
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
        }
        return _mountain!!
    }

private var _mountain: ImageVector? = null
