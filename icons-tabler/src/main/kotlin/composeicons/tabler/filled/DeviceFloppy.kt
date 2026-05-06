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
                pathData = parseSvgPathData("M16 3c.265 0 .52 .105 .707 .293l4 4c.188 .187 .293 .442 .293 .707v10c0 1.657-1.343 3-3 3h-12C4.343 21 3 19.657 3 18v-12C3 4.343 4.343 3 6 3h1v4c0 .507 .38 .934 .883 .993L8 8h6c.552 0 1-.448 1-1v-4ZM12 11c-1.617-.001-2.943 1.282-2.995 2.898C9.002 13.932 9 13.966 9 14c0 1.657 1.343 3 3 3 1.657 0 3-1.343 3-3 0-1.657-1.343-3-3-3M13 3v3h-4v-3Z"),
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
