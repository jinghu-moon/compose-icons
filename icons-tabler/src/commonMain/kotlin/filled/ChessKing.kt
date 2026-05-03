package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.ChessKing: ImageVector
    get() {
        if (_chessKing != null) return _chessKing!!
        _chessKing = tablerFilledIcon(
            name = "ChessKing",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(12.0f, 2.0f),
                    PathNode.CurveTo(12.506975f, 2.000067f, 12.933684f, 2.379507f, 12.993f, 2.883f),
                    PathNode.LineTo(13.0f, 3.0f),
                    PathNode.LineTo(13.0f, 5.0f),
                    PathNode.LineTo(15.0f, 5.0f),
                    PathNode.CurveTo(15.529094f, 5.000587f, 15.966165f, 5.413211f, 15.997172f, 5.941395f),
                    PathNode.CurveTo(16.02818f, 6.469579f, 15.64239f, 6.930509f, 15.117f, 6.993f),
                    PathNode.LineTo(15.0f, 7.0f),
                    PathNode.LineTo(13.0f, 7.0f),
                    PathNode.LineTo(13.0f, 8.758f),
                    PathNode.CurveTo(13.607788f, 8.351439f, 14.305675f, 8.099472f, 15.033f, 8.024f),
                    PathNode.LineTo(15.273f, 8.006f),
                    PathNode.LineTo(15.5f, 8.0f),
                    PathNode.CurveTo(17.98528f, 8.0f, 20.0f, 10.014719f, 20.0f, 12.5f),
                    PathNode.CurveTo(19.99771f, 14.815372f, 18.240297f, 16.75181f, 15.936f, 16.978f),
                    PathNode.LineTo(15.719f, 16.994f),
                    PathNode.LineTo(15.5f, 17.0f),
                    PathNode.LineTo(8.5f, 17.0f),
                    PathNode.CurveTo(6.572034f, 16.999992f, 4.85828f, 15.771821f, 4.238709f, 13.946119f),
                    PathNode.CurveTo(3.619138f, 12.120417f, 4.231426f, 10.102879f, 5.761178f, 8.929459f),
                    PathNode.CurveTo(7.290931f, 7.756039f, 9.398217f, 7.687486f, 11.001f, 8.759f),
                    PathNode.LineTo(11.0f, 7.0f),
                    PathNode.LineTo(9.0f, 7.0f),
                    PathNode.CurveTo(8.470906f, 6.999413f, 8.033836f, 6.58679f, 8.002828f, 6.058605f),
                    PathNode.CurveTo(7.971821f, 5.530421f, 8.35761f, 5.069491f, 8.883f, 5.007f),
                    PathNode.LineTo(9.0f, 5.0f),
                    PathNode.LineTo(11.0f, 5.0f),
                    PathNode.LineTo(11.0f, 3.0f),
                    PathNode.CurveTo(11.0f, 2.447715f, 11.447715f, 2.0f, 12.0f, 2.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(18.0f, 18.0f),
                    PathNode.LineTo(6.0f, 18.0f),
                    PathNode.CurveTo(5.447716f, 18.0f, 5.0f, 18.447716f, 5.0f, 19.0f),
                    PathNode.CurveTo(5.0f, 20.10457f, 5.895431f, 21.0f, 7.0f, 21.0f),
                    PathNode.LineTo(17.0f, 21.0f),
                    PathNode.CurveTo(18.01501f, 21.000254f, 18.869259f, 20.240158f, 18.987f, 19.232f),
                    PathNode.LineTo(18.998f, 19.058f),
                    PathNode.CurveTo(19.013964f, 18.783232f, 18.915974f, 18.514032f, 18.727116f, 18.31382f),
                    PathNode.CurveTo(18.538258f, 18.11361f, 18.27523f, 18.000088f, 18.0f, 18.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
        }
        return _chessKing!!
    }

private var _chessKing: ImageVector? = null
