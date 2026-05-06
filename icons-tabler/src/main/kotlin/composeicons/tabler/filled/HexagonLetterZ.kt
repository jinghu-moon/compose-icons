package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.HexagonLetterZ: ImageVector
    get() {
        if (_hexagonLetterZ != null) return _hexagonLetterZ!!
        _hexagonLetterZ = tablerFilledIcon(
            name = "HexagonLetterZ",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M13.666 1.429l6.75 3.98 .096 .063 .093 .078 .106 .074c.759 .569 1.229 1.443 1.284 2.39L22 8.218v7.284c0 1.175-.643 2.256-1.623 2.793l-6.804 4.302c-.98 .538-2.166 .538-3.2-.032L3.678 18.328C2.645 17.762 2.002 16.679 2 15.502v-7.285C2 7.111 2.57 6.089 3.476 5.512L10.426 1.414c1-.552 2.214-.552 3.24 .015M14 7h-4C9.448 7 9 7.448 9 8l.007 .117c.059 .503 .486 .883 .993 .883h2.382L9.106 15.553c-.155 .31-.138 .678 .044 .973 .182 .295 .504 .474 .85 .474h4c.552 0 1-.448 1-1l-.007-.117C14.934 15.38 14.507 15 14 15h-2.382L14.894 8.447c.155-.31 .138-.678-.044-.973C14.668 7.18 14.346 7 14 7"),
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
        return _hexagonLetterZ!!
    }

private var _hexagonLetterZ: ImageVector? = null
