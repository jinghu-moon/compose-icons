package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.ChessQueen: ImageVector
    get() {
        if (_chessQueen != null) return _chessQueen!!
        _chessQueen = tablerFilledIcon(
            name = "ChessQueen",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(12.0f, 2.0f),
                    PathNode.CurveTo(12.765662f, 2.000136f, 13.46405f, 2.437389f, 13.79861f, 3.126089f),
                    PathNode.CurveTo(14.13317f, 3.814789f, 14.045179f, 4.634053f, 13.572f, 5.236f),
                    PathNode.LineTo(14.365f, 7.219f),
                    PathNode.LineTo(16.067f, 5.517f),
                    PathNode.CurveTo(15.90754f, 4.916413f, 16.035856f, 4.27583f, 16.41434f, 3.782998f),
                    PathNode.CurveTo(16.792822f, 3.290167f, 17.378605f, 3.000908f, 18.0f, 3.0f),
                    PathNode.CurveTo(18.973684f, 2.998647f, 19.806852f, 3.698696f, 19.97333f, 4.658044f),
                    PathNode.CurveTo(20.139807f, 5.617391f, 19.591211f, 6.557222f, 18.674f, 6.884f),
                    PathNode.LineTo(16.984f, 16.179f),
                    PathNode.CurveTo(16.905493f, 16.61073f, 16.554699f, 16.94084f, 16.119f, 16.993f),
                    PathNode.LineTo(16.0f, 17.0f),
                    PathNode.LineTo(8.0f, 17.0f),
                    PathNode.CurveTo(7.561163f, 17.000221f, 7.173457f, 16.714308f, 7.044f, 16.295f),
                    PathNode.LineTo(7.016f, 16.179f),
                    PathNode.LineTo(5.326f, 6.884f),
                    PathNode.CurveTo(4.306515f, 6.51869f, 3.762996f, 5.408294f, 4.099882f, 4.379066f),
                    PathNode.CurveTo(4.436769f, 3.349838f, 5.531659f, 2.775724f, 6.569837f, 3.083927f),
                    PathNode.CurveTo(7.608015f, 3.39213f, 8.212282f, 4.470671f, 7.933f, 5.517f),
                    PathNode.LineTo(9.634f, 7.219f),
                    PathNode.LineTo(10.428f, 5.236f),
                    PathNode.CurveTo(9.954821f, 4.634053f, 9.86683f, 3.814789f, 10.20139f, 3.126089f),
                    PathNode.CurveTo(10.53595f, 2.437389f, 11.234338f, 2.000136f, 12.0f, 2.0f),
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
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
        }
        return _chessQueen!!
    }

private var _chessQueen: ImageVector? = null
