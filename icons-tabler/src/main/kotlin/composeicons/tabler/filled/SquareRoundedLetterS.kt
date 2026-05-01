package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.SquareRoundedLetterS: ImageVector
    get() {
        if (_squareRoundedLetterS != null) return _squareRoundedLetterS!!
        _squareRoundedLetterS = tablerFilledIcon(
            name = "SquareRoundedLetterS",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(11.676f, 2.001f),
                    PathNode.LineTo(12.0f, 2.0f),
                    PathNode.CurveTo(19.752f, 2.0f, 22.0f, 4.248f, 22.0f, 12.0f),
                    PathNode.LineTo(21.995f, 12.642f),
                    PathNode.CurveTo(21.869f, 19.877f, 19.534f, 22.0f, 12.0f, 22.0f),
                    PathNode.LineTo(11.358f, 21.995f),
                    PathNode.CurveTo(4.228f, 21.87f, 2.063f, 19.6f, 2.0f, 12.325f),
                    PathNode.LineTo(2.0f, 12.0f),
                    PathNode.CurveTo(2.0f, 4.357f, 4.185f, 2.064f, 11.676f, 2.001f),
                    PathNode.MoveTo(13.0f, 7.0f),
                    PathNode.LineTo(11.0f, 7.0f),
                    PathNode.CurveTo(9.895431f, 7.0f, 9.0f, 7.895431f, 9.0f, 9.0f),
                    PathNode.LineTo(9.0f, 11.0f),
                    PathNode.CurveTo(9.0f, 12.104569f, 9.895431f, 13.0f, 11.0f, 13.0f),
                    PathNode.LineTo(13.0f, 13.0f),
                    PathNode.LineTo(13.0f, 15.0f),
                    PathNode.LineTo(11.0f, 15.0f),
                    PathNode.CurveTo(11.0f, 14.447715f, 10.552285f, 14.0f, 10.0f, 14.0f),
                    PathNode.CurveTo(9.447715f, 14.0f, 9.0f, 14.447715f, 9.0f, 15.0f),
                    PathNode.CurveTo(9.0f, 16.10457f, 9.895431f, 17.0f, 11.0f, 17.0f),
                    PathNode.LineTo(13.0f, 17.0f),
                    PathNode.CurveTo(14.104569f, 17.0f, 15.0f, 16.10457f, 15.0f, 15.0f),
                    PathNode.LineTo(15.0f, 13.0f),
                    PathNode.CurveTo(15.0f, 11.895431f, 14.104569f, 11.0f, 13.0f, 11.0f),
                    PathNode.LineTo(11.0f, 11.0f),
                    PathNode.LineTo(11.0f, 9.0f),
                    PathNode.LineTo(13.0f, 9.0f),
                    PathNode.LineTo(13.007f, 9.117f),
                    PathNode.CurveTo(13.06949f, 9.64239f, 13.530421f, 10.028179f, 14.058605f, 9.997172f),
                    PathNode.CurveTo(14.586789f, 9.966165f, 14.999413f, 9.529094f, 15.0f, 9.0f),
                    PathNode.CurveTo(15.0f, 7.895431f, 14.104569f, 7.0f, 13.0f, 7.0f)
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
        return _squareRoundedLetterS!!
    }

private var _squareRoundedLetterS: ImageVector? = null
