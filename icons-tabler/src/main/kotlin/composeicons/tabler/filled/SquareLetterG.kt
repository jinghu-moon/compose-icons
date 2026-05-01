package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.SquareLetterG: ImageVector
    get() {
        if (_squareLetterG != null) return _squareLetterG!!
        _squareLetterG = tablerFilledIcon(
            name = "SquareLetterG",
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
                    PathNode.MoveTo(14.0f, 7.0f),
                    PathNode.LineTo(12.0f, 7.0f),
                    PathNode.CurveTo(10.343145f, 7.0f, 9.0f, 8.343146f, 9.0f, 10.0f),
                    PathNode.LineTo(9.0f, 14.0f),
                    PathNode.CurveTo(9.0f, 15.656855f, 10.343145f, 17.0f, 12.0f, 17.0f),
                    PathNode.LineTo(14.0f, 17.0f),
                    PathNode.CurveTo(14.552285f, 17.0f, 15.0f, 16.552284f, 15.0f, 16.0f),
                    PathNode.LineTo(15.0f, 12.0f),
                    PathNode.CurveTo(15.0f, 11.447715f, 14.552285f, 11.0f, 14.0f, 11.0f),
                    PathNode.LineTo(13.0f, 11.0f),
                    PathNode.CurveTo(12.447715f, 11.0f, 12.0f, 11.447715f, 12.0f, 12.0f),
                    PathNode.LineTo(12.007f, 12.117f),
                    PathNode.CurveTo(12.066316f, 12.620493f, 12.493025f, 12.999933f, 13.0f, 13.0f),
                    PathNode.LineTo(13.0f, 15.0f),
                    PathNode.LineTo(12.0f, 15.0f),
                    PathNode.CurveTo(11.447715f, 15.0f, 11.0f, 14.552285f, 11.0f, 14.0f),
                    PathNode.LineTo(11.0f, 10.0f),
                    PathNode.CurveTo(11.0f, 9.447715f, 11.447715f, 9.0f, 12.0f, 9.0f),
                    PathNode.LineTo(14.0f, 9.0f),
                    PathNode.CurveTo(14.552285f, 9.0f, 15.0f, 8.552285f, 15.0f, 8.0f),
                    PathNode.CurveTo(15.0f, 7.447716f, 14.552285f, 7.0f, 14.0f, 7.0f)
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
        return _squareLetterG!!
    }

private var _squareLetterG: ImageVector? = null
