package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Flag: ImageVector
    get() {
        if (_flag != null) return _flag!!
        _flag = tablerFilledIcon(
            name = "Flag",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(4.0f, 5.0f),
                    PathNode.CurveTo(4.000038f, 4.731366f, 4.108157f, 4.474044f, 4.3f, 4.286f),
                    PathNode.CurveTo(6.562009f, 2.068577f, 10.158075f, 1.991515f, 12.513f, 4.11f),
                    PathNode.LineTo(12.864f, 4.438f),
                    PathNode.CurveTo(14.372742f, 5.759905f, 16.627258f, 5.759905f, 18.136f, 4.438f),
                    PathNode.LineTo(18.385f, 4.211f),
                    PathNode.CurveTo(18.995f, 3.728f, 19.912f, 4.114f, 19.995f, 4.887f),
                    PathNode.LineTo(20.0f, 5.0f),
                    PathNode.LineTo(20.0f, 14.0f),
                    PathNode.CurveTo(19.999962f, 14.268634f, 19.891844f, 14.525956f, 19.7f, 14.714f),
                    PathNode.CurveTo(17.43799f, 16.931423f, 13.841925f, 17.008484f, 11.487f, 14.89f),
                    PathNode.LineTo(11.136f, 14.562f),
                    PathNode.CurveTo(9.677843f, 13.284379f, 7.51341f, 13.236337f, 6.0f, 14.448f),
                    PathNode.LineTo(6.0f, 21.0f),
                    PathNode.CurveTo(5.999413f, 21.529093f, 5.58679f, 21.966166f, 5.058605f, 21.997171f),
                    PathNode.CurveTo(4.530421f, 22.02818f, 4.069491f, 21.642391f, 4.007f, 21.117f),
                    PathNode.LineTo(4.0f, 21.0f),
                    PathNode.LineTo(4.0f, 5.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
        }
        return _flag!!
    }

private var _flag: ImageVector? = null
