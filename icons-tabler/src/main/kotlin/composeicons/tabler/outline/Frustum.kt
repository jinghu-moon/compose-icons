package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Frustum: ImageVector
    get() {
        if (_frustum != null) return _frustum!!
        _frustum = tablerOutlineIcon(
            name = "Frustum",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(18.402f, 5.508f),
                    PathNode.LineTo(20.94f, 15.666f),
                    PathNode.CurveTo(21.170675f, 16.581596f, 20.726183f, 17.533245f, 19.876f, 17.944f),
                    PathNode.LineTo(12.84f, 21.31f),
                    PathNode.CurveTo(12.308319f, 21.56496f, 11.689681f, 21.56496f, 11.158f, 21.31f),
                    PathNode.LineTo(4.123f, 17.945f),
                    PathNode.CurveTo(3.272818f, 17.534246f, 2.828325f, 16.582598f, 3.059f, 15.667f),
                    PathNode.LineTo(5.598f, 5.508f),
                    PathNode.CurveTo(5.744687f, 4.918493f, 6.15387f, 4.428949f, 6.708f, 4.18f),
                    PathNode.LineTo(11.204f, 2.17f),
                    PathNode.CurveTo(11.709931f, 1.94411f, 12.288069f, 1.94411f, 12.794f, 2.17f),
                    PathNode.LineTo(17.29f, 4.18f),
                    PathNode.CurveTo(17.844f, 4.426f, 18.253f, 4.916f, 18.402f, 5.508f)
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
                    PathNode.MoveTo(18.0f, 4.82f),
                    PathNode.LineTo(12.802f, 7.144f),
                    PathNode.CurveTo(12.292297f, 7.371813f, 11.709702f, 7.371813f, 11.2f, 7.144f),
                    PathNode.LineTo(6.0f, 4.819f)
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
                    PathNode.MoveTo(12.0f, 7.32f),
                    PathNode.LineTo(12.0f, 21.5f)
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
        return _frustum!!
    }

private var _frustum: ImageVector? = null
