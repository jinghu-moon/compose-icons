package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.SquareLetterM: ImageVector
    get() {
        if (_squareLetterM != null) return _squareLetterM!!
        _squareLetterM = tablerFilledIcon(
            name = "SquareLetterM",
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
                    PathNode.MoveTo(16.0f, 8.0f),
                    PathNode.CurveTo(16.0f, 6.986f, 14.664f, 6.616f, 14.143f, 7.486f),
                    PathNode.LineTo(12.0f, 11.056f),
                    PathNode.LineTo(9.857f, 7.486f),
                    PathNode.CurveTo(9.336f, 6.616f, 8.0f, 6.986f, 8.0f, 8.0f),
                    PathNode.LineTo(8.0f, 16.0f),
                    PathNode.CurveTo(8.0f, 16.552284f, 8.447715f, 17.0f, 9.0f, 17.0f),
                    PathNode.LineTo(9.117f, 16.993f),
                    PathNode.CurveTo(9.620493f, 16.933683f, 9.999933f, 16.506975f, 10.0f, 16.0f),
                    PathNode.LineTo(10.0f, 11.61f),
                    PathNode.LineTo(11.143f, 13.514f),
                    PathNode.LineTo(11.217f, 13.622f),
                    PathNode.CurveTo(11.421135f, 13.87859f, 11.738091f, 14.018806f, 12.065269f, 13.99726f),
                    PathNode.CurveTo(12.392447f, 13.975714f, 12.688276f, 13.795144f, 12.857f, 13.514f),
                    PathNode.LineTo(14.0f, 11.61f),
                    PathNode.LineTo(14.0f, 16.0f),
                    PathNode.CurveTo(14.0f, 16.552284f, 14.447715f, 17.0f, 15.0f, 17.0f),
                    PathNode.CurveTo(15.552285f, 17.0f, 16.0f, 16.552284f, 16.0f, 16.0f),
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
        return _squareLetterM!!
    }

private var _squareLetterM: ImageVector? = null
