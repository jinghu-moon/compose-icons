package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Meat: ImageVector
    get() {
        if (_meat != null) return _meat!!
        _meat = tablerOutlineIcon(
            name = "Meat",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(13.62f, 8.382f),
                    PathNode.LineTo(15.586f, 6.415f),
                    PathNode.CurveTo(14.945846f, 5.775039f, 14.815318f, 4.784909f, 15.267754f, 4.000913f),
                    PathNode.CurveTo(15.720188f, 3.216917f, 16.64278f, 2.83453f, 17.517172f, 3.068596f),
                    PathNode.CurveTo(18.391563f, 3.302663f, 18.99974f, 4.094823f, 19.0f, 5.0f),
                    PathNode.CurveTo(19.905426f, 4.999355f, 20.698345f, 5.607066f, 20.933058f, 6.48154f),
                    PathNode.CurveTo(21.16777f, 7.356014f, 20.785725f, 8.279093f, 20.001665f, 8.731913f),
                    PathNode.CurveTo(19.217606f, 9.184733f, 18.227137f, 9.054329f, 17.587f, 8.414f),
                    PathNode.LineTo(15.767f, 10.235f)
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
                    PathNode.MoveTo(5.904f, 18.596f),
                    PathNode.CurveTo(8.637f, 21.33f, 11.804f, 22.596f, 12.974f, 21.425f),
                    PathNode.CurveTo(14.146f, 20.253f, 12.88f, 17.087f, 10.146f, 14.354f),
                    PathNode.CurveTo(7.413f, 11.62f, 4.246f, 10.354f, 3.076f, 11.525f),
                    PathNode.CurveTo(1.904f, 12.697f, 3.17f, 15.863f, 5.904f, 18.596f)
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
                    PathNode.MoveTo(7.5f, 16.0f),
                    PathNode.LineTo(8.5f, 17.0f)
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
                    PathNode.MoveTo(12.975f, 21.425f),
                    PathNode.CurveTo(16.88f, 17.519f, 17.83f, 12.137f, 15.096f, 9.404f),
                    PathNode.CurveTo(12.363f, 6.67f, 6.981f, 7.62f, 3.076f, 11.525f)
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
        return _meat!!
    }

private var _meat: ImageVector? = null
