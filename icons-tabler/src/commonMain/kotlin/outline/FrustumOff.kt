package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.FrustumOff: ImageVector
    get() {
        if (_frustumOff != null) return _frustumOff!!
        _frustumOff = tablerOutlineIcon(
            name = "FrustumOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(7.72f, 3.728f),
                    PathNode.LineTo(11.204f, 2.17f),
                    PathNode.CurveTo(11.709931f, 1.94411f, 12.288069f, 1.94411f, 12.794f, 2.17f),
                    PathNode.LineTo(17.29f, 4.18f),
                    PathNode.CurveTo(17.844f, 4.426f, 18.253f, 4.916f, 18.402f, 5.508f),
                    PathNode.LineTo(20.94f, 15.666f),
                    PathNode.CurveTo(21.043f, 16.078f, 21.01f, 16.498f, 20.865f, 16.872f),
                    PathNode.MoveTo(18.566f, 18.571f),
                    PathNode.LineTo(12.841f, 21.309f),
                    PathNode.CurveTo(12.309319f, 21.563963f, 11.690681f, 21.563963f, 11.159f, 21.309f),
                    PathNode.LineTo(4.124f, 17.944f),
                    PathNode.CurveTo(3.273818f, 17.533245f, 2.829325f, 16.581596f, 3.06f, 15.666f),
                    PathNode.LineTo(5.58f, 5.586f)
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
                    PathNode.MoveTo(18.0f, 4.82f),
                    PathNode.LineTo(12.802f, 7.144f),
                    PathNode.CurveTo(12.292297f, 7.371813f, 11.709702f, 7.371813f, 11.2f, 7.144f)
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
                    PathNode.MoveTo(12.0f, 7.32f),
                    PathNode.LineTo(12.0f, 8.0f),
                    PathNode.MoveTo(12.0f, 12.0f),
                    PathNode.LineTo(12.0f, 21.5f)
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
                    PathNode.MoveTo(3.0f, 3.0f),
                    PathNode.LineTo(21.0f, 21.0f)
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
        return _frustumOff!!
    }

private var _frustumOff: ImageVector? = null
