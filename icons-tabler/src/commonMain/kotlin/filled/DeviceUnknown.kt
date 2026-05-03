package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.DeviceUnknown: ImageVector
    get() {
        if (_deviceUnknown != null) return _deviceUnknown!!
        _deviceUnknown = tablerFilledIcon(
            name = "DeviceUnknown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(17.0f, 2.0f),
                    PathNode.CurveTo(18.656855f, 2.0f, 20.0f, 3.343146f, 20.0f, 5.0f),
                    PathNode.LineTo(20.0f, 19.0f),
                    PathNode.CurveTo(20.0f, 20.656855f, 18.656855f, 22.0f, 17.0f, 22.0f),
                    PathNode.LineTo(7.0f, 22.0f),
                    PathNode.CurveTo(5.343146f, 22.0f, 4.0f, 20.656855f, 4.0f, 19.0f),
                    PathNode.LineTo(4.0f, 5.0f),
                    PathNode.CurveTo(4.0f, 3.343146f, 5.343146f, 2.0f, 7.0f, 2.0f),
                    PathNode.Close,
                    PathNode.MoveTo(12.0f, 15.0f),
                    PathNode.CurveTo(11.447715f, 15.0f, 11.0f, 15.447715f, 11.0f, 16.0f),
                    PathNode.LineTo(11.0f, 16.01f),
                    PathNode.CurveTo(11.0f, 16.562284f, 11.447715f, 17.01f, 12.0f, 17.01f),
                    PathNode.CurveTo(12.552285f, 17.01f, 13.0f, 16.562284f, 13.0f, 16.01f),
                    PathNode.LineTo(13.0f, 16.0f),
                    PathNode.CurveTo(13.0f, 15.447715f, 12.552285f, 15.0f, 12.0f, 15.0f),
                    PathNode.MoveTo(13.368f, 8.327f),
                    PathNode.CurveTo(12.135484f, 7.696894f, 10.631351f, 7.998466f, 9.737f, 9.055f),
                    PathNode.CurveTo(9.395349f, 9.477615f, 9.453744f, 10.095723f, 9.868498f, 10.446877f),
                    PathNode.CurveTo(10.283251f, 10.798031f, 10.902524f, 10.753677f, 11.263f, 10.347f),
                    PathNode.CurveTo(11.557348f, 9.999237f, 12.052539f, 9.900199f, 12.458f, 10.108f),
                    PathNode.CurveTo(12.871289f, 10.317436f, 13.086588f, 10.783341f, 12.978253f, 11.233825f),
                    PathNode.CurveTo(12.869918f, 11.684307f, 12.466324f, 12.001378f, 12.003f, 12.0f),
                    PathNode.CurveTo(11.450715f, 11.998343f, 11.001657f, 12.444715f, 11.0f, 12.997f),
                    PathNode.CurveTo(10.998343f, 13.549285f, 11.444715f, 13.998343f, 11.997f, 14.0f),
                    PathNode.CurveTo(13.385754f, 14.004174f, 14.595838f, 13.054639f, 14.92207f, 11.704739f),
                    PathNode.CurveTo(15.248301f, 10.354839f, 14.605392f, 8.957489f, 13.368f, 8.327f)
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
        return _deviceUnknown!!
    }

private var _deviceUnknown: ImageVector? = null
