package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Ballpen: ImageVector
    get() {
        if (_ballpen != null) return _ballpen!!
        _ballpen = tablerOutlineIcon(
            name = "Ballpen",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(14.0f, 6.0f),
                    PathNode.LineTo(21.0f, 13.0f),
                    PathNode.LineTo(17.0f, 17.0f)
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
                    PathNode.MoveTo(5.828f, 18.172f),
                    PathNode.CurveTo(6.358378f, 18.702538f, 7.07782f, 19.000605f, 7.828f, 19.000605f),
                    PathNode.CurveTo(8.57818f, 19.000605f, 9.297623f, 18.702538f, 9.828f, 18.172f),
                    PathNode.LineTo(20.414f, 7.586f),
                    PathNode.CurveTo(20.789248f, 7.210904f, 21.000072f, 6.702074f, 21.000072f, 6.1715f),
                    PathNode.CurveTo(21.000072f, 5.640927f, 20.789248f, 5.132096f, 20.414f, 4.757f),
                    PathNode.LineTo(19.243f, 3.586f),
                    PathNode.CurveTo(18.867905f, 3.210752f, 18.359074f, 2.999927f, 17.8285f, 2.999927f),
                    PathNode.CurveTo(17.297926f, 2.999927f, 16.789097f, 3.210752f, 16.414f, 3.586f),
                    PathNode.LineTo(5.828f, 14.172f),
                    PathNode.CurveTo(5.297463f, 14.702377f, 4.999396f, 15.42182f, 4.999396f, 16.172f),
                    PathNode.CurveTo(4.999396f, 16.92218f, 5.297463f, 17.641623f, 5.828f, 18.172f)
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
                    PathNode.MoveTo(4.0f, 20.0f),
                    PathNode.LineTo(5.768f, 18.232f)
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
        return _ballpen!!
    }

private var _ballpen: ImageVector? = null
