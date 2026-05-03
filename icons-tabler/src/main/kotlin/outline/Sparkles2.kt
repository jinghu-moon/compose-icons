package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Sparkles2: ImageVector
    get() {
        if (_sparkles2 != null) return _sparkles2!!
        _sparkles2 = tablerOutlineIcon(
            name = "Sparkles2",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 13.000 7.000 C 13.520 6.862 14.027 6.680 14.516 6.454 C 15.427 6.016 16.010 5.439 16.453 4.522 C 16.660 4.094 16.835 3.594 17.000 3.000 C 17.165 3.595 17.340 4.095 17.547 4.521 C 17.990 5.439 18.573 6.016 19.484 6.454 C 19.910 6.659 20.409 6.834 21.000 7.000 C 20.480 7.138 19.973 7.321 19.484 7.547 C 18.573 7.985 17.990 8.562 17.547 9.479 C 17.319 9.969 17.136 10.478 17.000 11.000 C 16.835 10.406 16.660 9.905 16.453 9.479 C 16.010 8.561 15.427 7.985 14.516 7.547 C 14.028 7.320 13.521 7.137 13.000 7.000"),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color(0xFF000000)),
                strokeAlpha = 1f,
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
            )
            addPath(
                pathData = parseSvgPathData("M 3.000 14.000 C 3.558 13.846 4.109 13.668 4.652 13.468 C 7.194 12.515 8.505 11.230 9.468 8.662 C 9.669 8.116 9.847 7.561 10.000 7.000 C 10.153 7.561 10.331 8.116 10.532 8.662 C 11.495 11.229 12.807 12.515 15.348 13.468 Q 16.098 13.748 17.000 14.000 C 16.442 14.154 15.891 14.332 15.348 14.532 C 12.806 15.485 11.494 16.770 10.532 19.338 C 10.331 19.884 10.153 20.439 10.000 21.000 C 9.847 20.439 9.669 19.884 9.468 19.338 C 8.505 16.770 7.193 15.485 4.652 14.532 C 4.109 14.332 3.558 14.154 3.000 14.000"),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color(0xFF000000)),
                strokeAlpha = 1f,
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
            )
        }
        return _sparkles2!!
    }

private var _sparkles2: ImageVector? = null
