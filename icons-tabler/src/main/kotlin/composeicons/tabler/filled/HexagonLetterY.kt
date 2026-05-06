package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.HexagonLetterY: ImageVector
    get() {
        if (_hexagonLetterY != null) return _hexagonLetterY!!
        _hexagonLetterY = tablerFilledIcon(
            name = "HexagonLetterY",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M13.666 1.429l6.75 3.98 .096 .063 .093 .078 .106 .074c.759 .569 1.229 1.443 1.284 2.39L22 8.218v7.284c0 1.175-.643 2.256-1.623 2.793l-6.804 4.302c-.98 .538-2.166 .538-3.2-.032L3.678 18.328C2.645 17.762 2.002 16.679 2 15.502v-7.285C2 7.111 2.57 6.089 3.476 5.512L10.426 1.414c1-.552 2.214-.552 3.24 .015M14.371 7.072c-.246-.099-.522-.095-.765 .009-.244 .104-.436 .301-.535 .548L12 10.307 10.928 7.629c-.217-.493-.786-.726-1.286-.526-.5 .2-.752 .761-.57 1.268L11 13.194v2.806c0 .507 .38 .934 .883 .993L12 17c.552 0 1-.448 1-1v-2.809L14.928 8.371c.188-.47-.005-1.008-.45-1.25Z"),
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
        return _hexagonLetterY!!
    }

private var _hexagonLetterY: ImageVector? = null
