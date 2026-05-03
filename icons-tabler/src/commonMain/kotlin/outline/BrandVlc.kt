package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandVlc: ImageVector
    get() {
        if (_brandVlc != null) return _brandVlc!!
        _brandVlc = tablerOutlineIcon(
            name = "BrandVlc",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(13.79f, 4.337f),
                    PathNode.LineTo(16.891f, 13.642f),
                    PathNode.CurveTo(17.221f, 14.627f, 16.778f, 15.712f, 15.871f, 16.141f),
                    PathNode.CurveTo(13.417523f, 17.286837f, 10.582477f, 17.286837f, 8.129f, 16.141f),
                    PathNode.CurveTo(7.222f, 15.713f, 6.779f, 14.627f, 7.109f, 13.642f),
                    PathNode.LineTo(10.209f, 4.337f),
                    PathNode.CurveTo(10.476f, 3.537f, 11.194f, 3.0f, 12.0f, 3.0f),
                    PathNode.CurveTo(12.807f, 3.0f, 13.525f, 3.537f, 13.79f, 4.337f)
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
                    PathNode.MoveTo(7.0f, 14.0f),
                    PathNode.LineTo(5.571f, 14.0f),
                    PathNode.CurveTo(4.678213f, 13.99995f, 3.893517f, 14.591635f, 3.648f, 15.45f),
                    PathNode.LineTo(3.077f, 17.45f),
                    PathNode.CurveTo(2.904382f, 18.053501f, 3.025109f, 18.703033f, 3.40305f, 19.204205f),
                    PathNode.CurveTo(3.780991f, 19.705374f, 4.372297f, 20.000034f, 5.0f, 20.0f),
                    PathNode.LineTo(18.998f, 20.0f),
                    PathNode.CurveTo(19.625704f, 20.000034f, 20.217009f, 19.705374f, 20.59495f, 19.204205f),
                    PathNode.CurveTo(20.97289f, 18.703033f, 21.093618f, 18.053501f, 20.921f, 17.45f),
                    PathNode.LineTo(20.349f, 15.45f),
                    PathNode.CurveTo(20.103483f, 14.591635f, 19.318787f, 13.99995f, 18.426f, 14.0f),
                    PathNode.LineTo(17.0f, 14.0f)
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
        return _brandVlc!!
    }

private var _brandVlc: ImageVector? = null
