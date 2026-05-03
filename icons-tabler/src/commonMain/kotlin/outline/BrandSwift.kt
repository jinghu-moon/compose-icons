package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandSwift: ImageVector
    get() {
        if (_brandSwift != null) return _brandSwift!!
        _brandSwift = tablerOutlineIcon(
            name = "BrandSwift",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(20.547f, 15.828f),
                    PathNode.CurveTo(21.877f, 11.702f, 19.163f, 6.307f, 14.5f, 3.0f),
                    PathNode.CurveTo(14.365f, 2.904f, 16.89f, 9.704f, 15.808f, 12.124f),
                    PathNode.CurveTo(13.655f, 10.67f, 11.052f, 8.63f, 8.0f, 6.0f),
                    PathNode.LineTo(7.5f, 8.0f),
                    PathNode.LineTo(4.0f, 7.0f),
                    PathNode.CurveTo(8.36f, 11.748f, 11.213f, 14.695f, 12.56f, 15.841f),
                    PathNode.CurveTo(7.902f, 17.93f, 1.91f, 14.863f, 2.0f, 15.0f),
                    PathNode.CurveTo(3.016f, 16.545f, 8.0f, 21.0f, 13.0f, 21.0f),
                    PathNode.CurveTo(15.0f, 21.0f, 16.788f, 20.498f, 17.742f, 19.611f),
                    PathNode.CurveTo(17.747f, 19.606f, 18.174f, 19.165f, 19.12f, 19.441f),
                    PathNode.CurveTo(19.624f, 19.589f, 20.583f, 20.108f, 22.0f, 21.0f),
                    PathNode.LineTo(22.0f, 19.493f),
                    PathNode.CurveTo(22.0f, 18.116f, 21.485f, 16.823f, 20.547f, 15.828f)
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
        return _brandSwift!!
    }

private var _brandSwift: ImageVector? = null
