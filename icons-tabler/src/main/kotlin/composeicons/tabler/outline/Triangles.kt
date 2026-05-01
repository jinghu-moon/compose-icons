package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Triangles: ImageVector
    get() {
        if (_triangles != null) return _triangles!!
        _triangles = tablerOutlineIcon(
            name = "Triangles",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(9.974f, 21.0f),
                    PathNode.LineTo(18.026f, 21.0f),
                    PathNode.CurveTo(18.385742f, 20.999826f, 18.716162f, 20.801575f, 18.885605f, 20.484236f),
                    PathNode.CurveTo(19.055048f, 20.166897f, 19.03598f, 19.782036f, 18.836f, 19.483f),
                    PathNode.LineTo(14.811f, 13.435f),
                    PathNode.CurveTo(14.630754f, 13.163085f, 14.326231f, 12.999595f, 14.0f, 12.999595f),
                    PathNode.CurveTo(13.673769f, 12.999595f, 13.369246f, 13.163085f, 13.189f, 13.435f),
                    PathNode.LineTo(9.164f, 19.483f),
                    PathNode.CurveTo(8.965493f, 19.782297f, 8.9472f, 20.166376f, 9.11636f, 20.483187f),
                    PathNode.CurveTo(9.285521f, 20.799997f, 9.61486f, 20.998455f, 9.974f, 21.0f)
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
                    PathNode.MoveTo(4.98f, 16.0f),
                    PathNode.LineTo(19.02f, 16.0f),
                    PathNode.CurveTo(19.562f, 16.0f, 20.0f, 15.557f, 20.0f, 15.011f),
                    PathNode.CurveTo(19.999556f, 14.821828f, 19.945463f, 14.636662f, 19.844f, 14.477f),
                    PathNode.LineTo(12.824f, 3.454f),
                    PathNode.CurveTo(12.645637f, 3.170997f, 12.334521f, 2.999327f, 12.0f, 2.999327f),
                    PathNode.CurveTo(11.665479f, 2.999327f, 11.354363f, 3.170997f, 11.176f, 3.454f),
                    PathNode.LineTo(4.156f, 14.477f),
                    PathNode.CurveTo(3.86687f, 14.936635f, 3.997378f, 15.543011f, 4.45f, 15.843f),
                    PathNode.CurveTo(4.607774f, 15.945471f, 4.791871f, 16.000006f, 4.98f, 16.0f)
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
        return _triangles!!
    }

private var _triangles: ImageVector? = null
