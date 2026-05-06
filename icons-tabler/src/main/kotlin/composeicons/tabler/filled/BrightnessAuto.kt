package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.BrightnessAuto: ImageVector
    get() {
        if (_brightnessAuto != null) return _brightnessAuto!!
        _brightnessAuto = tablerFilledIcon(
            name = "BrightnessAuto",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12.707 2.793 14.915 5h3.085c.507 0 .934 .38 .993 .883L19 6v3.085l2.207 2.208c.356 .356 .392 .922 .083 1.32l-.083 .094L19 14.914v3.086c-0 .507-.38 .934-.883 .993L18 19h-3.086l-2.207 2.207c-.356 .356-.922 .392-1.32 .083l-.094-.083L9.085 19h-3.085c-.507-0-.934-.38-.993-.883L5 18v-3.085L2.793 12.707c-.356-.356-.392-.922-.083-1.32l.083-.094L5 9.084v-3.084c0-.507 .38-.934 .883-.993L6 5h3.084L11.293 2.793c.391-.39 1.023-.39 1.414 0M12 8C10.343 8 9 9.343 9 11v3.5c0 .552 .448 1 1 1 .552 0 1-.448 1-1v-.5h2v.5c0 .507 .38 .934 .883 .993l.117 .007c.552 0 1-.448 1-1v-3.5C15 9.343 13.657 8 12 8M12 10c.552 0 1 .448 1 1v1h-2v-1c0-.507 .38-.934 .883-.993Z"),
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
        return _brightnessAuto!!
    }

private var _brightnessAuto: ImageVector? = null
