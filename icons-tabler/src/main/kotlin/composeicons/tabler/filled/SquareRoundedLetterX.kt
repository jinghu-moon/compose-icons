package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.SquareRoundedLetterX: ImageVector
    get() {
        if (_squareRoundedLetterX != null) return _squareRoundedLetterX!!
        _squareRoundedLetterX = tablerFilledIcon(
            name = "SquareRoundedLetterX",
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
                    PathNode.MoveTo(14.447f, 7.106f),
                    PathNode.CurveTo(13.953238f, 6.859413f, 13.353058f, 7.059473f, 13.106f, 7.553f),
                    PathNode.LineTo(12.0f, 9.763f),
                    PathNode.LineTo(10.894f, 7.553f),
                    PathNode.CurveTo(10.667456f, 7.099231f, 10.13709f, 6.886913f, 9.66f, 7.059f),
                    PathNode.LineTo(9.553f, 7.106f),
                    PathNode.CurveTo(9.059473f, 7.353059f, 8.859413f, 7.953237f, 9.106f, 8.447f),
                    PathNode.LineTo(10.88f, 12.0f),
                    PathNode.LineTo(9.105f, 15.553f),
                    PathNode.CurveTo(8.878234f, 16.006298f, 9.026471f, 16.557568f, 9.45f, 16.836f),
                    PathNode.LineTo(9.552f, 16.894f),
                    PathNode.CurveTo(10.045763f, 17.140587f, 10.645942f, 16.940525f, 10.893f, 16.447f),
                    PathNode.LineTo(12.0f, 14.236f),
                    PathNode.LineTo(13.106f, 16.447f),
                    PathNode.CurveTo(13.332544f, 16.90077f, 13.86291f, 17.113087f, 14.34f, 16.941f),
                    PathNode.LineTo(14.447f, 16.894f),
                    PathNode.CurveTo(14.940527f, 16.646942f, 15.140587f, 16.046762f, 14.894f, 15.553f),
                    PathNode.LineTo(13.118f, 12.0f),
                    PathNode.LineTo(14.894f, 8.447f),
                    PathNode.CurveTo(15.120766f, 7.993702f, 14.972529f, 7.442434f, 14.549f, 7.164f),
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
        return _squareRoundedLetterX!!
    }

private var _squareRoundedLetterX: ImageVector? = null
