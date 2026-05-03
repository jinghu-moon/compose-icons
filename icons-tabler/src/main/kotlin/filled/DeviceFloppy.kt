package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.DeviceFloppy: ImageVector
    get() {
        if (_deviceFloppy != null) return _deviceFloppy!!
        _deviceFloppy = tablerFilledIcon(
            name = "DeviceFloppy",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 16.000 3.000 C 16.265 3.000 16.520 3.105 16.707 3.293 L 20.707 7.293 C 20.895 7.480 21.000 7.735 21.000 8.000 L 21.000 18.000 C 21.000 19.657 19.657 21.000 18.000 21.000 L 6.000 21.000 C 4.343 21.000 3.000 19.657 3.000 18.000 L 3.000 6.000 C 3.000 4.343 4.343 3.000 6.000 3.000 L 7.000 3.000 L 7.000 7.000 C 7.000 7.507 7.380 7.934 7.883 7.993 L 8.000 8.000 L 14.000 8.000 C 14.552 8.000 15.000 7.552 15.000 7.000 L 15.000 3.000 ZM 12.000 11.000 C 10.383 10.999 9.057 12.282 9.005 13.898 C 9.002 13.932 9.000 13.966 9.000 14.000 C 9.000 15.657 10.343 17.000 12.000 17.000 C 13.657 17.000 15.000 15.657 15.000 14.000 C 15.000 12.343 13.657 11.000 12.000 11.000M 13.000 3.000 L 13.000 6.000 L 9.000 6.000 L 9.000 3.000 Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
        }
        return _deviceFloppy!!
    }

private var _deviceFloppy: ImageVector? = null
