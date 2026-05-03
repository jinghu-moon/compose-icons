package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.SquareRoundedLetterZ: ImageVector
    get() {
        if (_squareRoundedLetterZ != null) return _squareRoundedLetterZ!!
        _squareRoundedLetterZ = tablerFilledIcon(
            name = "SquareRoundedLetterZ",
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
                    PathNode.MoveTo(14.0f, 7.0f),
                    PathNode.LineTo(10.0f, 7.0f),
                    PathNode.CurveTo(9.447715f, 7.0f, 9.0f, 7.447716f, 9.0f, 8.0f),
                    PathNode.LineTo(9.007f, 8.117f),
                    PathNode.CurveTo(9.066316f, 8.620493f, 9.493025f, 8.999933f, 10.0f, 9.0f),
                    PathNode.LineTo(12.382f, 9.0f),
                    PathNode.LineTo(9.106f, 15.553f),
                    PathNode.CurveTo(8.951141f, 15.862903f, 8.967714f, 16.230879f, 9.149805f, 16.525606f),
                    PathNode.CurveTo(9.331897f, 16.820332f, 9.65356f, 16.999813f, 10.0f, 17.0f),
                    PathNode.LineTo(14.0f, 17.0f),
                    PathNode.CurveTo(14.552285f, 17.0f, 15.0f, 16.552284f, 15.0f, 16.0f),
                    PathNode.LineTo(14.993f, 15.883f),
                    PathNode.CurveTo(14.933684f, 15.379507f, 14.506975f, 15.000067f, 14.0f, 15.0f),
                    PathNode.LineTo(11.618f, 15.0f),
                    PathNode.LineTo(14.894f, 8.447f),
                    PathNode.CurveTo(15.048859f, 8.137098f, 15.032286f, 7.769121f, 14.850195f, 7.474395f),
                    PathNode.CurveTo(14.668103f, 7.179668f, 14.34644f, 7.000185f, 14.0f, 7.0f)
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
        return _squareRoundedLetterZ!!
    }

private var _squareRoundedLetterZ: ImageVector? = null
