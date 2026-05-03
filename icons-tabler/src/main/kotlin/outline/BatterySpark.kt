package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BatterySpark: ImageVector
    get() {
        if (_batterySpark != null) return _batterySpark!!
        _batterySpark = tablerOutlineIcon(
            name = "BatterySpark",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 12.000 17.000 L 6.000 17.000 C 4.895 17.000 4.000 16.105 4.000 15.000 L 4.000 9.000 C 4.000 7.895 4.895 7.000 6.000 7.000 L 17.000 7.000 C 18.105 7.000 19.000 7.895 19.000 9.000 L 19.000 9.500 C 19.000 9.776 19.224 10.000 19.500 10.000 C 19.776 10.000 20.000 10.224 20.000 10.500 L 20.000 11.500"),
        pathFillType = PathFillType.NonZero,
        fill = null,
        fillAlpha = 1.0f,
        stroke = SolidColor(Color(0xFF000000)),
        strokeAlpha = 1.0f,
        strokeLineWidth = 2.0f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round,
    )
    addPath(
        pathData = parseSvgPathData("M 19.000 22.500 C 19.419 20.770 20.770 19.419 22.500 19.000 C 20.770 18.581 19.419 17.230 19.000 15.500 C 18.581 17.230 17.230 18.581 15.500 19.000 C 17.230 19.419 18.581 20.770 19.000 22.500"),
        pathFillType = PathFillType.NonZero,
        fill = null,
        fillAlpha = 1.0f,
        stroke = SolidColor(Color(0xFF000000)),
        strokeAlpha = 1.0f,
        strokeLineWidth = 2.0f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round,
    )
        }
        return _batterySpark!!
    }

private var _batterySpark: ImageVector? = null
