package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.BedFlat: ImageVector
    get() {
        if (_bedFlat != null) return _bedFlat!!
        _bedFlat = tablerFilledIcon(
            name = "BedFlat",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 5.000 8.000 C 6.657 8.000 8.000 9.343 8.000 11.000 C 8.000 12.657 6.657 14.000 5.000 14.000 C 3.343 14.000 2.000 12.657 2.000 11.000 L 2.005 10.824 C 2.098 9.238 3.411 8.000 5.000 8.000"),
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
                pathData = parseSvgPathData("M 18.000 7.000 C 20.209 7.000 22.000 8.791 22.000 11.000 L 22.000 13.000 C 22.000 13.552 21.552 14.000 21.000 14.000 L 10.000 14.000 C 9.448 14.000 9.000 13.552 9.000 13.000 L 9.000 8.000 C 9.000 7.448 9.448 7.000 10.000 7.000 Z"),
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
                pathData = parseSvgPathData("M 21.000 15.000 C 21.552 15.000 22.000 15.448 22.000 16.000 C 22.000 16.552 21.552 17.000 21.000 17.000 L 3.000 17.000 C 2.448 17.000 2.000 16.552 2.000 16.000 C 2.000 15.448 2.448 15.000 3.000 15.000 Z"),
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
        return _bedFlat!!
    }

private var _bedFlat: ImageVector? = null
