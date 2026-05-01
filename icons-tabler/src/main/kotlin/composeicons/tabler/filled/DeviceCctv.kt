package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.DeviceCctv: ImageVector
    get() {
        if (_deviceCctv != null) return _deviceCctv!!
        _deviceCctv = tablerFilledIcon(
            name = "DeviceCctv",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(20.0f, 8.0f),
                    PathNode.LineTo(20.0f, 14.0f),
                    PathNode.CurveTo(20.0f, 18.418278f, 16.418278f, 22.0f, 12.0f, 22.0f),
                    PathNode.CurveTo(7.581722f, 22.0f, 4.0f, 18.418278f, 4.0f, 14.0f),
                    PathNode.LineTo(4.0f, 8.0f),
                    PathNode.Close,
                    PathNode.MoveTo(12.0f, 10.0f),
                    PathNode.CurveTo(9.858614f, 10.000114f, 8.09715f, 11.686641f, 8.004f, 13.826f),
                    PathNode.LineTo(8.0f, 14.0f),
                    PathNode.CurveTo(8.0f, 16.209139f, 9.790861f, 18.0f, 12.0f, 18.0f),
                    PathNode.CurveTo(14.209139f, 18.0f, 16.0f, 16.209139f, 16.0f, 14.0f),
                    PathNode.CurveTo(16.0f, 11.790861f, 14.209139f, 10.0f, 12.0f, 10.0f),
                    PathNode.MoveTo(12.01f, 13.0f),
                    PathNode.CurveTo(12.539093f, 13.000587f, 12.976165f, 13.413211f, 13.007172f, 13.941395f),
                    PathNode.CurveTo(13.038179f, 14.469579f, 12.65239f, 14.93051f, 12.127f, 14.993f),
                    PathNode.LineTo(12.0f, 15.0f),
                    PathNode.CurveTo(11.470906f, 14.999413f, 11.033835f, 14.586789f, 11.002828f, 14.058605f),
                    PathNode.CurveTo(10.971821f, 13.530421f, 11.35761f, 13.06949f, 11.883f, 13.007f),
                    PathNode.Close,
                    PathNode.MoveTo(2.0f, 5.0f),
                    PathNode.LineTo(2.0f, 4.0f),
                    PathNode.CurveTo(2.0f, 2.895431f, 2.895431f, 2.0f, 4.0f, 2.0f),
                    PathNode.LineTo(20.0f, 2.0f),
                    PathNode.CurveTo(21.10457f, 2.0f, 22.0f, 2.895431f, 22.0f, 4.0f),
                    PathNode.LineTo(22.0f, 5.0f),
                    PathNode.CurveTo(22.0f, 6.10457f, 21.10457f, 7.0f, 20.0f, 7.0f),
                    PathNode.LineTo(4.0f, 7.0f),
                    PathNode.CurveTo(2.895431f, 7.0f, 2.0f, 6.10457f, 2.0f, 5.0f)
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
        return _deviceCctv!!
    }

private var _deviceCctv: ImageVector? = null
