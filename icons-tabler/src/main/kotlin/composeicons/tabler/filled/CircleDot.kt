package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.CircleDot: ImageVector
    get() {
        if (_circleDot != null) return _circleDot!!
        _circleDot = tablerFilledIcon(
            name = "CircleDot",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(17.0f, 3.34f),
                    PathNode.CurveTo(21.1674f, 5.746208f, 23.030024f, 10.779379f, 21.433f, 15.318825f),
                    PathNode.CurveTo(19.835976f, 19.858273f, 15.232252f, 22.616514f, 10.476249f, 21.883377f),
                    PathNode.CurveTo(5.720245f, 21.15024f, 2.160861f, 17.133654f, 2.005f, 12.324f),
                    PathNode.LineTo(2.0f, 12.0f),
                    PathNode.LineTo(2.005f, 11.676f),
                    PathNode.CurveTo(2.118919f, 8.162982f, 4.068822f, 4.967704f, 7.140892f, 3.259883f),
                    PathNode.CurveTo(10.212963f, 1.552061f, 13.95609f, 1.582479f, 17.0f, 3.34f),
                    PathNode.Close,
                    PathNode.MoveTo(12.0f, 10.0f),
                    PathNode.CurveTo(11.012398f, 9.999958f, 10.172622f, 10.720798f, 10.023f, 11.697f),
                    PathNode.LineTo(10.005f, 11.851f),
                    PathNode.LineTo(10.0f, 12.0f),
                    PathNode.LineTo(10.005f, 12.15f),
                    PathNode.CurveTo(10.086374f, 13.231937f, 11.015568f, 14.05167f, 12.099209f, 13.997506f),
                    PathNode.CurveTo(13.182849f, 13.943342f, 14.02567f, 13.035039f, 13.998752f, 11.95038f),
                    PathNode.CurveTo(13.971833f, 10.865721f, 13.084993f, 10.000343f, 12.0f, 10.0f),
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
        return _circleDot!!
    }

private var _circleDot: ImageVector? = null
