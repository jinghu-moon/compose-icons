package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.ChessRook: ImageVector
    get() {
        if (_chessRook != null) return _chessRook!!
        _chessRook = tablerFilledIcon(
            name = "ChessRook",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(14.0f, 3.0f),
                    PathNode.CurveTo(14.506975f, 3.000067f, 14.933684f, 3.379507f, 14.993f, 3.883f),
                    PathNode.LineTo(15.0f, 4.0f),
                    PathNode.LineTo(15.0f, 6.0f),
                    PathNode.LineTo(16.652f, 6.0f),
                    PathNode.LineTo(17.014f, 3.836f),
                    PathNode.CurveTo(17.096647f, 3.335357f, 17.54115f, 2.975972f, 18.048f, 3.0f),
                    PathNode.LineTo(18.164f, 3.013f),
                    PathNode.CurveTo(18.66504f, 3.095688f, 19.024551f, 3.540777f, 19.0f, 4.048f),
                    PathNode.LineTo(18.987f, 4.164f),
                    PathNode.LineTo(18.487f, 7.164f),
                    PathNode.CurveTo(18.414438f, 7.601595f, 18.062283f, 7.939094f, 17.622f, 7.993f),
                    PathNode.LineTo(17.5f, 8.0f),
                    PathNode.LineTo(16.117f, 8.0f),
                    PathNode.LineTo(16.994f, 15.89f),
                    PathNode.CurveTo(17.054367f, 16.436176f, 16.662731f, 16.928738f, 16.117f, 16.993f),
                    PathNode.LineTo(16.0f, 17.0f),
                    PathNode.LineTo(8.0f, 17.0f),
                    PathNode.CurveTo(7.450438f, 17.000013f, 7.003847f, 16.55655f, 7.0f, 16.007f),
                    PathNode.LineTo(7.006f, 15.89f),
                    PathNode.LineTo(7.883f, 8.0f),
                    PathNode.LineTo(6.5f, 8.0f),
                    PathNode.CurveTo(6.056111f, 8.000261f, 5.665177f, 7.707875f, 5.54f, 7.282f),
                    PathNode.LineTo(5.514f, 7.164f),
                    PathNode.LineTo(5.014f, 4.164f),
                    PathNode.CurveTo(4.927348f, 3.641691f, 5.262822f, 3.142359f, 5.779133f, 3.025149f),
                    PathNode.CurveTo(6.295445f, 2.907938f, 6.813636f, 3.213473f, 6.961f, 3.722f),
                    PathNode.LineTo(6.986f, 3.836f),
                    PathNode.LineTo(7.347f, 6.0f),
                    PathNode.LineTo(9.0f, 6.0f),
                    PathNode.LineTo(9.0f, 4.0f),
                    PathNode.CurveTo(9.000587f, 3.470907f, 9.413211f, 3.033835f, 9.941395f, 3.002828f),
                    PathNode.CurveTo(10.469579f, 2.971821f, 10.93051f, 3.35761f, 10.993f, 3.883f),
                    PathNode.LineTo(11.0f, 4.0f),
                    PathNode.LineTo(11.0f, 6.0f),
                    PathNode.LineTo(13.0f, 6.0f),
                    PathNode.LineTo(13.0f, 4.0f),
                    PathNode.CurveTo(13.0f, 3.447715f, 13.447715f, 3.0f, 14.0f, 3.0f),
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
        return _chessRook!!
    }

private var _chessRook: ImageVector? = null
