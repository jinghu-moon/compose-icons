package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.ChartBubble: ImageVector
    get() {
        if (_chartBubble != null) return _chartBubble!!
        _chartBubble = tablerFilledIcon(
            name = "ChartBubble",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(6.0f, 12.0f),
                    PathNode.CurveTo(8.183138f, 12.000002f, 9.963043f, 13.750477f, 9.999441f, 15.933311f),
                    PathNode.CurveTo(10.035839f, 18.116144f, 8.315284f, 19.924988f, 6.13336f, 19.997776f),
                    PathNode.CurveTo(3.951436f, 20.070564f, 2.114157f, 18.380407f, 2.005f, 16.2f),
                    PathNode.LineTo(2.0f, 16.0f),
                    PathNode.LineTo(2.005f, 15.8f),
                    PathNode.CurveTo(2.11157f, 13.671265f, 3.868599f, 11.999998f, 6.0f, 12.0f),
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
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(16.0f, 16.0f),
                    PathNode.CurveTo(17.633957f, 16.000092f, 18.967352f, 17.307772f, 18.99926f, 18.941414f),
                    PathNode.CurveTo(19.03117f, 20.575058f, 17.749853f, 21.93381f, 16.117147f, 21.997705f),
                    PathNode.CurveTo(14.484443f, 22.061602f, 13.100859f, 20.80714f, 13.005f, 19.176f),
                    PathNode.LineTo(13.0f, 19.0f),
                    PathNode.LineTo(13.005f, 18.824f),
                    PathNode.CurveTo(13.098195f, 17.238178f, 14.411443f, 15.999911f, 16.0f, 16.0f),
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
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(14.5f, 2.0f),
                    PathNode.CurveTo(17.508772f, 2.000242f, 19.958921f, 4.418106f, 19.99907f, 7.426611f),
                    PathNode.CurveTo(20.039215f, 10.435115f, 17.65446f, 12.9175f, 14.646767f, 12.99803f),
                    PathNode.CurveTo(11.639072f, 13.07856f, 9.124898f, 10.727343f, 9.004f, 7.721f),
                    PathNode.LineTo(9.0f, 7.5f),
                    PathNode.LineTo(9.004f, 7.279f),
                    PathNode.CurveTo(9.122607f, 4.329621f, 11.548237f, 1.999763f, 14.5f, 2.0f),
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
        return _chartBubble!!
    }

private var _chartBubble: ImageVector? = null
