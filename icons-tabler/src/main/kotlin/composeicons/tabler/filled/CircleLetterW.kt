package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.CircleLetterW: ImageVector
    get() {
        if (_circleLetterW != null) return _circleLetterW!!
        _circleLetterW = tablerFilledIcon(
            name = "CircleLetterW",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12 2c5.523 0 10 4.477 10 10 0 5.523-4.477 10-10 10C6.477 22 2 17.523 2 12 2 6.477 6.477 2 12 2M14.008 7.876l-.52 4.153-.56-1.4c-.319-.799-1.41-.837-1.803-.114l-.053 .114-.561 1.4L9.992 7.876C9.929 7.373 9.499 6.996 8.992 7l-.116 .008c-.548 .069-.936 .568-.868 1.116l1 8c.128 1.025 1.537 1.207 1.92 .247L12 13.693l1.072 2.678c.383 .96 1.792 .778 1.92-.247l1-8c.055-.54-.332-1.025-.871-1.093-.539-.067-1.033 .308-1.113 .845"),
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
        return _circleLetterW!!
    }

private var _circleLetterW: ImageVector? = null
