package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.SquareLetterA: ImageVector
    get() {
        if (_squareLetterA != null) return _squareLetterA!!
        _squareLetterA = tablerFilledIcon(
            name = "SquareLetterA",
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
                    PathNode.MoveTo(12.0f, 7.0f),
                    PathNode.CurveTo(10.343145f, 7.0f, 9.0f, 8.343146f, 9.0f, 10.0f),
                    PathNode.LineTo(9.0f, 16.0f),
                    PathNode.CurveTo(9.0f, 16.552284f, 9.447715f, 17.0f, 10.0f, 17.0f),
                    PathNode.CurveTo(10.552285f, 17.0f, 11.0f, 16.552284f, 11.0f, 16.0f),
                    PathNode.LineTo(11.0f, 14.0f),
                    PathNode.LineTo(13.0f, 14.0f),
                    PathNode.LineTo(13.0f, 16.0f),
                    PathNode.CurveTo(13.000067f, 16.506975f, 13.379507f, 16.933683f, 13.883f, 16.993f),
                    PathNode.LineTo(14.0f, 17.0f),
                    PathNode.CurveTo(14.552285f, 17.0f, 15.0f, 16.552284f, 15.0f, 16.0f),
                    PathNode.LineTo(15.0f, 10.0f),
                    PathNode.CurveTo(15.0f, 8.343146f, 13.656855f, 7.0f, 12.0f, 7.0f),
                    PathNode.MoveTo(12.0f, 9.0f),
                    PathNode.CurveTo(12.552285f, 9.0f, 13.0f, 9.447715f, 13.0f, 10.0f),
                    PathNode.LineTo(13.0f, 12.0f),
                    PathNode.LineTo(11.0f, 12.0f),
                    PathNode.LineTo(11.0f, 10.0f),
                    PathNode.CurveTo(11.000067f, 9.493025f, 11.379507f, 9.066316f, 11.883f, 9.007f),
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
        return _squareLetterA!!
    }

private var _squareLetterA: ImageVector? = null
