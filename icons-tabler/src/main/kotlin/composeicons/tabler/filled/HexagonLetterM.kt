package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.HexagonLetterM: ImageVector
    get() {
        if (_hexagonLetterM != null) return _hexagonLetterM!!
        _hexagonLetterM = tablerFilledIcon(
            name = "HexagonLetterM",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M13.666 1.429l6.75 3.98 .096 .063 .093 .078 .106 .074c.759 .569 1.229 1.443 1.284 2.39L22 8.218v7.284c0 1.175-.643 2.256-1.623 2.793l-6.804 4.302c-.98 .538-2.166 .538-3.2-.032L3.678 18.328C2.645 17.762 2.002 16.679 2 15.502v-7.285C2 7.111 2.57 6.089 3.476 5.512L10.426 1.414c1-.552 2.214-.552 3.24 .015M16 8C16 6.986 14.664 6.616 14.143 7.486L12 11.056 9.857 7.486C9.336 6.616 8 6.986 8 8v8c0 .552 .448 1 1 1l.117-.007c.503-.059 .883-.486 .883-.993v-4.39l1.143 1.904 .074 .108c.204 .257 .521 .397 .848 .375 .327-.022 .623-.202 .792-.483L14 11.61v4.39c0 .552 .448 1 1 1 .552 0 1-.448 1-1Z"),
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
        return _hexagonLetterM!!
    }

private var _hexagonLetterM: ImageVector? = null
