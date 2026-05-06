package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.HexagonLetterW: ImageVector
    get() {
        if (_hexagonLetterW != null) return _hexagonLetterW!!
        _hexagonLetterW = tablerFilledIcon(
            name = "HexagonLetterW",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M13.666 1.429l6.75 3.98 .096 .063 .093 .078 .106 .074c.759 .569 1.229 1.443 1.284 2.39L22 8.218v7.284c0 1.175-.643 2.256-1.623 2.793l-6.804 4.302c-.98 .538-2.166 .538-3.2-.032L3.678 18.328C2.645 17.762 2.002 16.679 2 15.502v-7.285C2 7.111 2.57 6.089 3.476 5.512L10.426 1.414c1-.552 2.214-.552 3.24 .015M14.008 7.876l-.52 4.153-.56-1.4c-.319-.799-1.41-.837-1.803-.114l-.053 .114-.561 1.4L9.992 7.876C9.929 7.373 9.499 6.996 8.992 7l-.116 .008c-.548 .069-.936 .568-.868 1.116l1 8c.128 1.025 1.537 1.207 1.92 .247L12 13.693l1.072 2.678c.383 .96 1.792 .778 1.92-.247l1-8c.055-.54-.332-1.025-.871-1.093-.539-.067-1.033 .308-1.113 .845"),
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
        return _hexagonLetterW!!
    }

private var _hexagonLetterW: ImageVector? = null
