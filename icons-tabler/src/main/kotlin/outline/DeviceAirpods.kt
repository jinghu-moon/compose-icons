package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.DeviceAirpods: ImageVector
    get() {
        if (_deviceAirpods != null) return _deviceAirpods!!
        _deviceAirpods = tablerOutlineIcon(
            name = "DeviceAirpods",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 6.000 4.000 C 8.133 3.997 9.893 5.669 10.000 7.800 L 10.000 8.000 L 10.000 18.500 C 10.000 19.328 9.328 20.000 8.500 20.000 C 7.672 20.000 7.000 19.328 7.000 18.500 L 7.000 12.000 L 6.000 12.000 C 3.867 12.003 2.107 10.331 2.000 8.200 L 2.000 8.000 C 2.000 5.791 3.791 4.000 6.000 4.000"),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color(0xFF000000)),
                strokeAlpha = 1f,
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
            )
            addPath(
                pathData = parseSvgPathData("M 18.000 4.000 C 15.867 3.997 14.107 5.669 14.000 7.800 L 14.000 8.000 L 14.000 18.500 C 14.000 19.328 14.672 20.000 15.500 20.000 C 16.328 20.000 17.000 19.328 17.000 18.500 L 17.000 12.000 L 18.000 12.000 C 20.133 12.003 21.893 10.331 22.000 8.200 L 22.000 8.000 C 22.000 5.791 20.209 4.000 18.000 4.000"),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color(0xFF000000)),
                strokeAlpha = 1f,
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
            )
        }
        return _deviceAirpods!!
    }

private var _deviceAirpods: ImageVector? = null
