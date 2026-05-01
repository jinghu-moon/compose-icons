package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.RollerSkating: ImageVector
    get() {
        if (_rollerSkating != null) return _rollerSkating!!
        _rollerSkating = tablerOutlineIcon(
            name = "RollerSkating",
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
                    PathNode.MoveTo(6.0f, 17.0f),
                    PathNode.CurveTo(6.0f, 18.10457f, 6.895431f, 19.0f, 8.0f, 19.0f),
                    PathNode.CurveTo(9.104569f, 19.0f, 10.0f, 18.10457f, 10.0f, 17.0f),
                    PathNode.CurveTo(10.0f, 15.895431f, 9.104569f, 15.0f, 8.0f, 15.0f),
                    PathNode.CurveTo(6.895431f, 15.0f, 6.0f, 15.895431f, 6.0f, 17.0f)
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
                    PathNode.MoveTo(14.0f, 17.0f),
                    PathNode.CurveTo(14.0f, 18.10457f, 14.895431f, 19.0f, 16.0f, 19.0f),
                    PathNode.CurveTo(17.10457f, 19.0f, 18.0f, 18.10457f, 18.0f, 17.0f),
                    PathNode.CurveTo(18.0f, 15.895431f, 17.10457f, 15.0f, 16.0f, 15.0f),
                    PathNode.CurveTo(14.895431f, 15.0f, 14.0f, 15.895431f, 14.0f, 17.0f)
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
        return _rollerSkating!!
    }

private var _rollerSkating: ImageVector? = null
