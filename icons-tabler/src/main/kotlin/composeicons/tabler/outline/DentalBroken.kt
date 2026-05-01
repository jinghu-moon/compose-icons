package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.DentalBroken: ImageVector
    get() {
        if (_dentalBroken != null) return _dentalBroken!!
        _dentalBroken = tablerOutlineIcon(
            name = "DentalBroken",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(12.0f, 5.5f),
                    PathNode.CurveTo(10.926f, 4.914f, 9.417f, 4.0f, 8.0f, 4.0f),
                    PathNode.CurveTo(5.9f, 4.0f, 4.0f, 5.247f, 4.0f, 9.0f),
                    PathNode.CurveTo(4.0f, 13.899f, 5.056f, 17.41f, 6.671f, 19.537f),
                    PathNode.CurveTo(7.244f, 20.293f, 8.641f, 20.058f, 9.238f, 19.301f),
                    PathNode.CurveTo(9.636f, 18.796f, 10.057f, 17.862f, 10.5f, 16.5f),
                    PathNode.CurveTo(10.792f, 15.729f, 11.392f, 14.996f, 12.0f, 15.0f),
                    PathNode.CurveTo(12.602f, 15.0f, 13.21f, 15.737f, 13.5f, 16.5f),
                    PathNode.CurveTo(13.943f, 17.862f, 14.364f, 18.795f, 14.762f, 19.3f),
                    PathNode.CurveTo(15.359f, 20.059f, 16.762f, 20.293f, 17.329f, 19.537f),
                    PathNode.CurveTo(18.944f, 17.41f, 20.0f, 13.9f, 20.0f, 9.0f),
                    PathNode.CurveTo(20.0f, 5.26f, 18.092f, 4.0f, 16.0f, 4.0f),
                    PathNode.CurveTo(14.577f, 4.0f, 13.08f, 4.911f, 12.0f, 5.5f)
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
                    PathNode.MoveTo(12.0f, 5.5f),
                    PathNode.LineTo(13.0f, 8.0f),
                    PathNode.LineTo(11.0f, 10.0f),
                    PathNode.LineTo(13.0f, 12.0f)
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
        return _dentalBroken!!
    }

private var _dentalBroken: ImageVector? = null
