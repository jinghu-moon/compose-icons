package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.CircleLetterP: ImageVector
    get() {
        if (_circleLetterP != null) return _circleLetterP!!
        _circleLetterP = tablerFilledIcon(
            name = "CircleLetterP",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(12.0f, 2.0f),
                    PathNode.CurveTo(17.523f, 2.0f, 22.0f, 6.477f, 22.0f, 12.0f),
                    PathNode.CurveTo(22.0f, 17.523f, 17.523f, 22.0f, 12.0f, 22.0f),
                    PathNode.CurveTo(6.477f, 22.0f, 2.0f, 17.523f, 2.0f, 12.0f),
                    PathNode.CurveTo(2.0f, 6.477f, 6.477f, 2.0f, 12.0f, 2.0f),
                    PathNode.MoveTo(12.0f, 7.0f),
                    PathNode.LineTo(10.0f, 7.0f),
                    PathNode.CurveTo(9.447715f, 7.0f, 9.0f, 7.447716f, 9.0f, 8.0f),
                    PathNode.LineTo(9.0f, 16.0f),
                    PathNode.CurveTo(9.0f, 16.552284f, 9.447715f, 17.0f, 10.0f, 17.0f),
                    PathNode.LineTo(10.117f, 16.993f),
                    PathNode.CurveTo(10.620493f, 16.933683f, 10.999933f, 16.506975f, 11.0f, 16.0f),
                    PathNode.LineTo(11.0f, 13.0f),
                    PathNode.LineTo(12.0f, 13.0f),
                    PathNode.CurveTo(13.656855f, 13.0f, 15.0f, 11.656855f, 15.0f, 10.0f),
                    PathNode.CurveTo(15.0f, 8.343146f, 13.656855f, 7.0f, 12.0f, 7.0f),
                    PathNode.MoveTo(12.0f, 9.0f),
                    PathNode.CurveTo(12.552285f, 9.0f, 13.0f, 9.447715f, 13.0f, 10.0f),
                    PathNode.CurveTo(13.0f, 10.552285f, 12.552285f, 11.0f, 12.0f, 11.0f),
                    PathNode.LineTo(11.0f, 11.0f),
                    PathNode.LineTo(11.0f, 9.0f),
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
        return _circleLetterP!!
    }

private var _circleLetterP: ImageVector? = null
