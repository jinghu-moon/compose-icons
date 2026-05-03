package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ColorFilter: ImageVector
    get() {
        if (_colorFilter != null) return _colorFilter!!
        _colorFilter = tablerOutlineIcon(
            name = "ColorFilter",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 13.580 13.790 C 13.850 14.470 14.000 15.220 14.000 16.000 C 14.000 17.770 13.230 19.370 12.000 20.460 C 10.905 21.454 9.479 22.003 8.000 22.000 C 4.690 22.000 2.000 19.310 2.000 16.000 C 2.000 13.240 3.880 10.900 6.420 10.210"),
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
        pathData = parseSvgPathData("M 17.580 10.210 C 20.120 10.900 22.000 13.240 22.000 16.000 C 22.000 19.310 19.310 22.000 16.000 22.000 C 14.521 22.003 13.095 21.454 12.000 20.460"),
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
        pathData = parseSvgPathData("M 6.000 8.000 C 6.000 11.314 8.686 14.000 12.000 14.000 C 15.314 14.000 18.000 11.314 18.000 8.000 C 18.000 4.686 15.314 2.000 12.000 2.000 C 8.686 2.000 6.000 4.686 6.000 8.000"),
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
        return _colorFilter!!
    }

private var _colorFilter: ImageVector? = null
