package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.LayoutGrid: ImageVector
    get() {
        if (_layoutGrid != null) return _layoutGrid!!
        _layoutGrid = tablerFilledIcon(
            name = "LayoutGrid",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 9.000 3.000 C 10.105 3.000 11.000 3.895 11.000 5.000 L 11.000 9.000 C 11.000 10.105 10.105 11.000 9.000 11.000 L 5.000 11.000 C 3.895 11.000 3.000 10.105 3.000 9.000 L 3.000 5.000 C 3.000 3.895 3.895 3.000 5.000 3.000 Z"),
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
                pathData = parseSvgPathData("M 19.000 3.000 C 20.105 3.000 21.000 3.895 21.000 5.000 L 21.000 9.000 C 21.000 10.105 20.105 11.000 19.000 11.000 L 15.000 11.000 C 13.895 11.000 13.000 10.105 13.000 9.000 L 13.000 5.000 C 13.000 3.895 13.895 3.000 15.000 3.000 Z"),
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
                pathData = parseSvgPathData("M 9.000 13.000 C 10.105 13.000 11.000 13.895 11.000 15.000 L 11.000 19.000 C 11.000 20.105 10.105 21.000 9.000 21.000 L 5.000 21.000 C 3.895 21.000 3.000 20.105 3.000 19.000 L 3.000 15.000 C 3.000 13.895 3.895 13.000 5.000 13.000 Z"),
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
                pathData = parseSvgPathData("M 19.000 13.000 C 20.105 13.000 21.000 13.895 21.000 15.000 L 21.000 19.000 C 21.000 20.105 20.105 21.000 19.000 21.000 L 15.000 21.000 C 13.895 21.000 13.000 20.105 13.000 19.000 L 13.000 15.000 C 13.000 13.895 13.895 13.000 15.000 13.000 Z"),
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
        return _layoutGrid!!
    }

private var _layoutGrid: ImageVector? = null
