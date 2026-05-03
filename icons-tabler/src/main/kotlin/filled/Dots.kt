package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Dots: ImageVector
    get() {
        if (_dots != null) return _dots!!
        _dots = tablerFilledIcon(
            name = "Dots",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 7.000 12.000 C 7.000 13.105 6.105 14.000 5.000 14.000 C 3.895 14.000 3.000 13.105 3.000 12.000 Q 3.000 11.947 3.005 11.898 C 3.057 10.834 3.935 9.999 5.000 10.000 C 6.105 10.000 7.000 10.895 7.000 12.000"),
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
                pathData = parseSvgPathData("M 14.000 12.000 C 14.000 13.105 13.105 14.000 12.000 14.000 C 10.895 14.000 10.000 13.105 10.000 12.000 Q 10.000 11.947 10.005 11.898 C 10.057 10.834 10.935 9.999 12.000 10.000 C 13.105 10.000 14.000 10.895 14.000 12.000"),
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
                pathData = parseSvgPathData("M 21.000 12.000 C 21.000 13.105 20.105 14.000 19.000 14.000 C 17.895 14.000 17.000 13.105 17.000 12.000 Q 17.000 11.947 17.005 11.898 C 17.057 10.834 17.935 9.999 19.000 10.000 C 20.105 10.000 21.000 10.895 21.000 12.000"),
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
        return _dots!!
    }

private var _dots: ImageVector? = null
