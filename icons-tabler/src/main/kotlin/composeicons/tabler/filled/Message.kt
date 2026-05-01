package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Message: ImageVector
    get() {
        if (_message != null) return _message!!
        _message = tablerFilledIcon(
            name = "Message",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(18.0f, 3.0f),
                    PathNode.CurveTo(20.209139f, 3.0f, 22.0f, 4.790861f, 22.0f, 7.0f),
                    PathNode.LineTo(22.0f, 15.0f),
                    PathNode.CurveTo(22.0f, 17.209139f, 20.209139f, 19.0f, 18.0f, 19.0f),
                    PathNode.LineTo(13.276f, 19.0f),
                    PathNode.LineTo(8.514f, 21.857f),
                    PathNode.CurveTo(8.222594f, 22.031878f, 7.862316f, 22.046787f, 7.557458f, 21.896582f),
                    PathNode.CurveTo(7.2526f, 21.746376f, 7.044896f, 21.45162f, 7.006f, 21.114f),
                    PathNode.LineTo(7.0f, 21.0f),
                    PathNode.LineTo(7.0f, 19.0f),
                    PathNode.LineTo(6.0f, 19.0f),
                    PathNode.CurveTo(3.868599f, 19.000002f, 2.11157f, 17.328735f, 2.005f, 15.2f),
                    PathNode.LineTo(2.0f, 15.0f),
                    PathNode.LineTo(2.0f, 7.0f),
                    PathNode.CurveTo(2.0f, 4.790861f, 3.790861f, 3.0f, 6.0f, 3.0f),
                    PathNode.Close,
                    PathNode.MoveTo(14.0f, 12.0f),
                    PathNode.LineTo(8.0f, 12.0f),
                    PathNode.CurveTo(7.447716f, 12.0f, 7.0f, 12.447715f, 7.0f, 13.0f),
                    PathNode.CurveTo(7.0f, 13.552285f, 7.447716f, 14.0f, 8.0f, 14.0f),
                    PathNode.LineTo(14.0f, 14.0f),
                    PathNode.CurveTo(14.552285f, 14.0f, 15.0f, 13.552285f, 15.0f, 13.0f),
                    PathNode.CurveTo(15.0f, 12.447715f, 14.552285f, 12.0f, 14.0f, 12.0f),
                    PathNode.MoveTo(16.0f, 8.0f),
                    PathNode.LineTo(8.0f, 8.0f),
                    PathNode.CurveTo(7.447716f, 8.0f, 7.0f, 8.447715f, 7.0f, 9.0f),
                    PathNode.CurveTo(7.0f, 9.552285f, 7.447716f, 10.0f, 8.0f, 10.0f),
                    PathNode.LineTo(16.0f, 10.0f),
                    PathNode.CurveTo(16.552284f, 10.0f, 17.0f, 9.552285f, 17.0f, 9.0f),
                    PathNode.CurveTo(17.0f, 8.447715f, 16.552284f, 8.0f, 16.0f, 8.0f)
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
        return _message!!
    }

private var _message: ImageVector? = null
