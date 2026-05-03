package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Filters: ImageVector
    get() {
        if (_filters != null) return _filters!!
        _filters = tablerFilledIcon(
            name = "Filters",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 19.396 11.056 C 21.915 12.791 22.725 16.144 21.277 18.838 C 19.829 21.532 16.586 22.706 13.749 21.562 Q 13.955 21.352 14.145 21.122 C 15.573 19.409 16.222 17.178 15.934 14.967 C 17.492 14.086 18.711 12.709 19.396 11.056"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
            addPath(
                pathData = parseSvgPathData("M 4.609 11.051 C 6.126 14.741 10.132 16.746 13.995 15.749 C 14.115 18.609 12.198 21.155 9.416 21.831 C 6.634 22.506 3.763 21.122 2.558 18.526 C 1.353 15.930 2.150 12.843 4.461 11.155 Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
            addPath(
                pathData = parseSvgPathData("M 12.000 2.000 C 15.314 2.000 18.000 4.686 18.000 8.000 C 18.000 11.314 15.314 14.000 12.000 14.000 C 8.686 14.000 6.000 11.314 6.000 8.000 L 6.004 7.775 C 6.125 4.551 8.774 2.000 12.000 2.000"),
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
        return _filters!!
    }

private var _filters: ImageVector? = null
