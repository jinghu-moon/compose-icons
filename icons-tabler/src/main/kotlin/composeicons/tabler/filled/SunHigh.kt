package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.SunHigh: ImageVector
    get() {
        if (_sunHigh != null) return _sunHigh!!
        _sunHigh = tablerFilledIcon(
            name = "SunHigh",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12 19c.552 0 1 .448 1 1v2c0 .552-.448 1-1 1-.552 0-1-.448-1-1v-2c0-.552 .448-1 1-1M7.05 16.95c.39 .39 .39 1.023 0 1.414L5.636 19.778c-.251 .26-.623 .364-.973 .273-.35-.092-.623-.365-.714-.714-.092-.35 .013-.721 .273-.973L5.636 16.95c.39-.39 1.023-.39 1.414 0M18.364 16.95l1.414 1.414c.379 .392 .374 1.016-.012 1.402-.386 .386-1.009 .391-1.402 .012L16.95 18.364c-.379-.392-.374-1.016 .012-1.402 .386-.386 1.009-.391 1.402-.012M13.315 7.114c1.736 .445 3.102 1.785 3.579 3.513 .477 1.728-.007 3.579-1.27 4.852-1.262 1.273-3.109 1.772-4.841 1.309C8.125 16.078 6.54 13.353 7.237 10.692 7.934 8.03 10.65 6.431 13.315 7.114M4 11c.552 0 1 .448 1 1 0 .552-.448 1-1 1h-2C1.448 13 1 12.552 1 12c0-.552 .448-1 1-1ZM22 11c.552 0 1 .448 1 1 0 .552-.448 1-1 1h-2c-.552 0-1-.448-1-1 0-.552 .448-1 1-1ZM5.636 4.222 7.05 5.636c.379 .392 .374 1.016-.012 1.402-.386 .386-1.009 .391-1.402 .012L4.222 5.636C3.843 5.244 3.848 4.62 4.234 4.234c.386-.386 1.009-.391 1.402-.012M19.778 4.222c.39 .39 .39 1.023 0 1.414L18.364 7.05c-.392 .379-1.016 .374-1.402-.012-.386-.386-.391-1.009-.012-1.402L18.364 4.222c.39-.39 1.024-.39 1.414 0M12 1c.552 0 1 .448 1 1v2c0 .552-.448 1-1 1C11.448 5 11 4.552 11 4v-2c0-.552 .448-1 1-1"),
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
        return _sunHigh!!
    }

private var _sunHigh: ImageVector? = null
