package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.ChessKnight: ImageVector
    get() {
        if (_chessKnight != null) return _chessKnight!!
        _chessKnight = tablerFilledIcon(
            name = "ChessKnight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(8.959f, 1.99f),
                    PathNode.LineTo(8.812f, 2.018f),
                    PathNode.LineTo(8.697f, 2.047f),
                    PathNode.CurveTo(8.441711f, 2.128014f, 8.229591f, 2.308051f, 8.10816f, 2.546778f),
                    PathNode.CurveTo(7.986729f, 2.785504f, 7.966139f, 3.062964f, 8.051f, 3.317f),
                    PathNode.LineTo(8.8f, 5.562f),
                    PathNode.LineTo(5.985f, 7.297f),
                    PathNode.CurveTo(5.044639f, 7.875925f, 4.751425f, 9.107424f, 5.33f, 10.048f),
                    PathNode.LineTo(5.419f, 10.181f),
                    PathNode.CurveTo(5.79563f, 10.695741f, 6.395185f, 10.999976f, 7.033f, 11.0f),
                    PathNode.LineTo(8.596f, 10.999f),
                    PathNode.LineTo(6.982f, 15.673f),
                    PathNode.CurveTo(6.876233f, 15.978664f, 6.924839f, 16.316608f, 7.112462f, 16.580076f),
                    PathNode.CurveTo(7.300086f, 16.843544f, 7.603554f, 16.999992f, 7.927f, 17.0f),
                    PathNode.LineTo(15.888f, 17.0f),
                    PathNode.CurveTo(16.431807f, 17.000132f, 16.876036f, 16.565674f, 16.888f, 16.022f),
                    PathNode.LineTo(17.0f, 11.022f),
                    PathNode.CurveTo(17.0f, 7.195f, 15.445f, 4.144f, 12.33f, 3.056f),
                    PathNode.LineTo(9.931f, 2.226f),
                    PathNode.LineTo(9.556f, 2.105f),
                    PathNode.LineTo(9.298f, 2.031f),
                    PathNode.LineTo(9.163f, 2.0f),
                    PathNode.LineTo(9.062f, 1.987f),
                    PathNode.LineTo(9.007f, 1.986f),
                    PathNode.LineTo(8.959f, 1.989f),
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
        return _chessKnight!!
    }

private var _chessKnight: ImageVector? = null
