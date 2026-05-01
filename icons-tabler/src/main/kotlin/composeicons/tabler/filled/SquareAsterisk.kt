package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.SquareAsterisk: ImageVector
    get() {
        if (_squareAsterisk != null) return _squareAsterisk!!
        _squareAsterisk = tablerFilledIcon(
            name = "SquareAsterisk",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(19.0f, 2.0f),
                    PathNode.CurveTo(20.656855f, 2.0f, 22.0f, 3.343146f, 22.0f, 5.0f),
                    PathNode.LineTo(22.0f, 19.0f),
                    PathNode.CurveTo(22.0f, 20.656855f, 20.656855f, 22.0f, 19.0f, 22.0f),
                    PathNode.LineTo(5.0f, 22.0f),
                    PathNode.CurveTo(3.343146f, 22.0f, 2.0f, 20.656855f, 2.0f, 19.0f),
                    PathNode.LineTo(2.0f, 5.0f),
                    PathNode.CurveTo(2.0f, 3.343146f, 3.343146f, 2.0f, 5.0f, 2.0f),
                    PathNode.Close,
                    PathNode.MoveTo(12.0f, 7.5f),
                    PathNode.CurveTo(11.447715f, 7.5f, 11.0f, 7.947716f, 11.0f, 8.5f),
                    PathNode.LineTo(11.0f, 10.131f),
                    PathNode.LineTo(9.555f, 9.168f),
                    PathNode.LineTo(9.454f, 9.108f),
                    PathNode.CurveTo(8.981177f, 8.861758f, 8.39832f, 9.02972f, 8.129043f, 9.489814f),
                    PathNode.CurveTo(7.859766f, 9.949906f, 7.998758f, 10.540343f, 8.445f, 10.832f),
                    PathNode.LineTo(10.195f, 12.0f),
                    PathNode.LineTo(8.445f, 13.169f),
                    PathNode.LineTo(8.352f, 13.239f),
                    PathNode.CurveTo(7.946247f, 13.581595f, 7.879042f, 14.181593f, 8.198943f, 14.605468f),
                    PathNode.CurveTo(8.518844f, 15.029344f, 9.114269f, 15.12925f, 9.555f, 14.833f),
                    PathNode.LineTo(11.0f, 13.868f),
                    PathNode.LineTo(11.0f, 15.5f),
                    PathNode.LineTo(11.007f, 15.617f),
                    PathNode.CurveTo(11.06949f, 16.142391f, 11.530421f, 16.52818f, 12.058605f, 16.497171f),
                    PathNode.CurveTo(12.586789f, 16.466166f, 12.999413f, 16.029093f, 13.0f, 15.5f),
                    PathNode.LineTo(13.0f, 13.869f),
                    PathNode.LineTo(14.445f, 14.832f),
                    PathNode.LineTo(14.546f, 14.892f),
                    PathNode.CurveTo(15.018823f, 15.138242f, 15.60168f, 14.97028f, 15.870957f, 14.510186f),
                    PathNode.CurveTo(16.140234f, 14.050094f, 16.001244f, 13.459657f, 15.555f, 13.168f),
                    PathNode.LineTo(13.803f, 11.999f),
                    PathNode.LineTo(15.555f, 10.832f),
                    PathNode.LineTo(15.648f, 10.762f),
                    PathNode.CurveTo(16.053753f, 10.419404f, 16.120958f, 9.819407f, 15.801057f, 9.395532f),
                    PathNode.CurveTo(15.481156f, 8.971657f, 14.885731f, 8.871751f, 14.445f, 9.168f),
                    PathNode.LineTo(13.0f, 10.13f),
                    PathNode.LineTo(13.0f, 8.5f),
                    PathNode.LineTo(12.993f, 8.383001f),
                    PathNode.CurveTo(12.933684f, 7.879507f, 12.506975f, 7.500067f, 12.0f, 7.5f),
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
        return _squareAsterisk!!
    }

private var _squareAsterisk: ImageVector? = null
