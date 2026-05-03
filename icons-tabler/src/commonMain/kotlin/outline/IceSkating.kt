package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.IceSkating: ImageVector
    get() {
        if (_iceSkating != null) return _iceSkating!!
        _iceSkating = tablerOutlineIcon(
            name = "IceSkating",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(5.905f, 5.0f),
                    PathNode.LineTo(9.323f, 5.0f),
                    PathNode.CurveTo(9.731827f, 5.000259f, 10.099325f, 5.24935f, 10.251f, 5.629f),
                    PathNode.LineTo(11.394f, 8.485f),
                    PathNode.CurveTo(11.771723f, 9.429802f, 12.602596f, 10.118746f, 13.601f, 10.315f),
                    PathNode.LineTo(18.318f, 11.241f),
                    PathNode.CurveTo(19.29532f, 11.433132f, 20.000067f, 12.289973f, 20.0f, 13.286f),
                    PathNode.LineTo(20.0f, 14.0f),
                    PathNode.CurveTo(20.0f, 14.552285f, 19.552284f, 15.0f, 19.0f, 15.0f),
                    PathNode.LineTo(5.105f, 15.0f),
                    PathNode.CurveTo(4.821512f, 15.001421f, 4.550743f, 14.882452f, 4.360046f, 14.672686f),
                    PathNode.CurveTo(4.169349f, 14.462918f, 4.076647f, 14.18207f, 4.105f, 13.9f),
                    PathNode.LineTo(4.905f, 5.9f),
                    PathNode.CurveTo(4.956542f, 5.387099f, 5.389522f, 4.997417f, 5.905f, 5.0f)
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
                    PathNode.MoveTo(3.0f, 19.0f),
                    PathNode.LineTo(20.0f, 19.0f),
                    PathNode.CurveTo(20.552284f, 19.0f, 21.0f, 18.552284f, 21.0f, 18.0f)
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
                    PathNode.MoveTo(9.0f, 15.0f),
                    PathNode.LineTo(9.0f, 19.0f)
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
                    PathNode.MoveTo(15.0f, 15.0f),
                    PathNode.LineTo(15.0f, 19.0f)
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
        return _iceSkating!!
    }

private var _iceSkating: ImageVector? = null
