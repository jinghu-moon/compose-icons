package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.CircleLetterE: ImageVector
    get() {
        if (_circleLetterE != null) return _circleLetterE!!
        _circleLetterE = tablerFilledIcon(
            name = "CircleLetterE",
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
                    PathNode.MoveTo(14.0f, 7.0f),
                    PathNode.LineTo(10.0f, 7.0f),
                    PathNode.CurveTo(9.447715f, 7.0f, 9.0f, 7.447716f, 9.0f, 8.0f),
                    PathNode.LineTo(9.0f, 16.0f),
                    PathNode.CurveTo(9.0f, 16.552284f, 9.447715f, 17.0f, 10.0f, 17.0f),
                    PathNode.LineTo(14.0f, 17.0f),
                    PathNode.CurveTo(14.552285f, 17.0f, 15.0f, 16.552284f, 15.0f, 16.0f),
                    PathNode.LineTo(14.993f, 15.883f),
                    PathNode.CurveTo(14.933684f, 15.379507f, 14.506975f, 15.000067f, 14.0f, 15.0f),
                    PathNode.LineTo(11.0f, 15.0f),
                    PathNode.LineTo(11.0f, 13.0f),
                    PathNode.LineTo(12.5f, 13.0f),
                    PathNode.CurveTo(13.006975f, 12.999933f, 13.433684f, 12.620493f, 13.493f, 12.117f),
                    PathNode.LineTo(13.5f, 12.0f),
                    PathNode.CurveTo(13.5f, 11.447715f, 13.052285f, 11.0f, 12.5f, 11.0f),
                    PathNode.LineTo(11.0f, 11.0f),
                    PathNode.LineTo(11.0f, 9.0f),
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
        return _circleLetterE!!
    }

private var _circleLetterE: ImageVector? = null
