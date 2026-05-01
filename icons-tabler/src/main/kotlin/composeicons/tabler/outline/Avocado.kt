package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Avocado: ImageVector
    get() {
        if (_avocado != null) return _avocado!!
        _avocado = tablerOutlineIcon(
            name = "Avocado",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(17.8f, 14.04f),
                    PathNode.CurveTo(18.009584f, 13.221964f, 18.478697f, 12.493909f, 19.137f, 11.965f),
                    PathNode.CurveTo(20.332f, 10.98f, 20.953f, 9.68f, 21.0f, 8.063f),
                    PathNode.CurveTo(20.953f, 6.633f, 20.46f, 5.437f, 19.523f, 4.477f),
                    PathNode.CurveTo(18.563f, 3.539f, 17.367f, 3.047f, 15.938f, 3.0f),
                    PathNode.CurveTo(14.32f, 3.047f, 13.02f, 3.668f, 12.035f, 4.863f),
                    PathNode.CurveTo(11.473f, 5.543f, 10.781f, 5.988f, 9.961f, 6.199f),
                    PathNode.CurveTo(9.023f, 6.387f, 8.133001f, 6.679f, 7.289f, 7.079f),
                    PathNode.CurveTo(6.445f, 7.477f, 5.73f, 7.957f, 5.145f, 8.519f),
                    PathNode.CurveTo(3.715f, 10.02f, 3.0f, 11.743f, 3.0f, 13.688f),
                    PathNode.CurveTo(3.0f, 15.634f, 3.715f, 17.356f, 5.145f, 18.856f),
                    PathNode.CurveTo(6.645f, 20.285f, 8.367f, 21.0f, 10.313f, 21.0f),
                    PathNode.CurveTo(12.258f, 21.0f, 13.98f, 20.285f, 15.48f, 18.855f),
                    PathNode.CurveTo(16.043f, 18.27f, 16.535f, 17.555f, 16.957f, 16.711f),
                    PathNode.CurveTo(17.355f, 15.867f, 17.637f, 14.988f, 17.801f, 14.074f),
                    PathNode.LineTo(17.801f, 14.039f),
                    PathNode.LineTo(17.8f, 14.04f)
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
                    PathNode.MoveTo(10.87f, 10.036f),
                    PathNode.CurveTo(9.928f, 10.148f, 9.076f, 10.574f, 8.314f, 11.314f),
                    PathNode.CurveTo(7.574f, 12.076f, 7.148f, 12.928f, 7.036f, 13.87f),
                    PathNode.CurveTo(6.901f, 14.79f, 7.148f, 15.574f, 7.776f, 16.224f),
                    PathNode.CurveTo(8.426f, 16.852f, 9.211f, 17.099f, 10.13f, 16.964f),
                    PathNode.CurveTo(11.072f, 16.852f, 11.924f, 16.426f, 12.686f, 15.686f),
                    PathNode.CurveTo(13.426f, 14.924f, 13.852f, 14.072f, 13.964f, 13.13f),
                    PathNode.CurveTo(14.099f, 12.21f, 13.852f, 11.426f, 13.224f, 10.776f),
                    PathNode.CurveTo(12.574f, 10.148f, 11.789f, 9.901f, 10.87f, 10.036f)
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
        return _avocado!!
    }

private var _avocado: ImageVector? = null
