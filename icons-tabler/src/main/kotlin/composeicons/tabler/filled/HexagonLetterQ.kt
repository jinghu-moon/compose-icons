package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.HexagonLetterQ: ImageVector
    get() {
        if (_hexagonLetterQ != null) return _hexagonLetterQ!!
        _hexagonLetterQ = tablerFilledIcon(
            name = "HexagonLetterQ",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M13.666 1.429l6.75 3.98 .096 .063 .093 .078 .106 .074c.759 .569 1.229 1.443 1.284 2.39L22 8.218v7.284c0 1.175-.643 2.256-1.623 2.793l-6.804 4.302c-.98 .538-2.166 .538-3.2-.032L3.678 18.328C2.645 17.762 2.002 16.679 2 15.502v-7.285C2 7.111 2.57 6.089 3.476 5.512L10.426 1.414c1-.552 2.214-.552 3.24 .015M12 7C10.343 7 9 8.343 9 10v4c-0 1.006 .504 1.945 1.342 2.501 .838 .556 1.899 .655 2.826 .263l.125-.057c.392 .379 1.016 .374 1.402-.012 .386-.386 .391-1.009 .012-1.402l.057-.125c.156-.37 .236-.767 .236-1.168v-4C15 8.343 13.657 7 12 7M13 14.002h-.059c-.529 .029-.943 .468-.941 .998-.552 0-1-.448-1-1v-4c0-.552 .448-1 1-1 .552 0 1 .448 1 1Z"),
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
        return _hexagonLetterQ!!
    }

private var _hexagonLetterQ: ImageVector? = null
