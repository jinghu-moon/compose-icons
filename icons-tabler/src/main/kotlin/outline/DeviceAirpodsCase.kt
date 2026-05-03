package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.DeviceAirpodsCase: ImageVector
    get() {
        if (_deviceAirpodsCase != null) return _deviceAirpodsCase!!
        _deviceAirpodsCase = tablerOutlineIcon(
            name = "DeviceAirpodsCase",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 21.000 10.000 L 3.000 10.000"),
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
                pathData = parseSvgPathData("M 3.000 8.000 C 3.000 5.791 4.791 4.000 7.000 4.000 L 17.000 4.000 C 19.209 4.000 21.000 5.791 21.000 8.000 L 21.000 16.000 C 21.000 18.209 19.209 20.000 17.000 20.000 L 7.000 20.000 C 4.791 20.000 3.000 18.209 3.000 16.000 L 3.000 8.000"),
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
                pathData = parseSvgPathData("M 7.000 10.000 L 7.000 11.500 C 7.000 12.328 7.672 13.000 8.500 13.000 L 15.500 13.000 C 16.328 13.000 17.000 12.328 17.000 11.500 L 17.000 10.000"),
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
        return _deviceAirpodsCase!!
    }

private var _deviceAirpodsCase: ImageVector? = null
