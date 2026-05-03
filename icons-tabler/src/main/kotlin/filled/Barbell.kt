package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Barbell: ImageVector
    get() {
        if (_barbell != null) return _barbell!!
        _barbell = tablerFilledIcon(
            name = "Barbell",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 4.000 7.000 C 4.552 7.000 5.000 7.448 5.000 8.000 L 5.000 16.000 C 5.000 16.552 4.552 17.000 4.000 17.000 C 3.448 17.000 3.000 16.552 3.000 16.000 L 3.000 13.000 L 2.000 13.000 C 1.448 13.000 1.000 12.552 1.000 12.000 C 1.000 11.448 1.448 11.000 2.000 11.000 L 3.000 11.000 L 3.000 8.000 C 3.000 7.448 3.448 7.000 4.000 7.000"),
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
                pathData = parseSvgPathData("M 20.000 7.000 C 20.552 7.000 21.000 7.448 21.000 8.000 L 21.000 11.000 L 22.000 11.000 C 22.552 11.000 23.000 11.448 23.000 12.000 C 23.000 12.552 22.552 13.000 22.000 13.000 L 21.000 13.000 L 21.000 16.000 C 21.000 16.552 20.552 17.000 20.000 17.000 C 19.448 17.000 19.000 16.552 19.000 16.000 L 19.000 8.000 C 19.000 7.448 19.448 7.000 20.000 7.000"),
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
                pathData = parseSvgPathData("M 16.000 5.000 C 17.105 5.000 18.000 5.895 18.000 7.000 L 18.000 17.000 C 18.000 18.105 17.105 19.000 16.000 19.000 C 14.895 19.000 14.000 18.105 14.000 17.000 L 14.000 13.000 L 10.000 13.000 L 10.000 17.000 C 10.000 18.105 9.105 19.000 8.000 19.000 C 6.895 19.000 6.000 18.105 6.000 17.000 L 6.000 7.000 C 6.000 5.895 6.895 5.000 8.000 5.000 C 9.105 5.000 10.000 5.895 10.000 7.000 L 10.000 11.000 L 14.000 11.000 L 14.000 7.000 C 14.000 5.895 14.895 5.000 16.000 5.000"),
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
        return _barbell!!
    }

private var _barbell: ImageVector? = null
