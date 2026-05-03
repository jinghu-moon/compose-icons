package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.XboxY: ImageVector
    get() {
        if (_xboxY != null) return _xboxY!!
        _xboxY = tablerFilledIcon(
            name = "XboxY",
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
                    PathNode.MoveTo(15.6f, 7.2f),
                    PathNode.CurveTo(15.158173f, 6.868629f, 14.531371f, 6.958173f, 14.2f, 7.4f),
                    PathNode.LineTo(12.0f, 10.333f),
                    PathNode.LineTo(9.8f, 7.4f),
                    PathNode.CurveTo(9.468629f, 6.958173f, 8.841827f, 6.868629f, 8.4f, 7.2f),
                    PathNode.CurveTo(7.958173f, 7.531371f, 7.868629f, 8.158173f, 8.2f, 8.6f),
                    PathNode.LineTo(11.01f, 12.348f),
                    PathNode.LineTo(11.0f, 15.997f),
                    PathNode.CurveTo(10.999203f, 16.262217f, 11.103797f, 16.516888f, 11.290771f, 16.704987f),
                    PathNode.CurveTo(11.477745f, 16.893085f, 11.731783f, 16.999205f, 11.997f, 17.0f),
                    PathNode.LineTo(12.114f, 16.994f),
                    PathNode.CurveTo(12.617926f, 16.936176f, 12.998741f, 16.510231f, 13.0f, 16.003f),
                    PathNode.LineTo(13.01f, 12.32f),
                    PathNode.LineTo(15.8f, 8.6f),
                    PathNode.CurveTo(16.13137f, 8.158173f, 16.041828f, 7.531371f, 15.6f, 7.2f)
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
        return _xboxY!!
    }

private var _xboxY: ImageVector? = null
