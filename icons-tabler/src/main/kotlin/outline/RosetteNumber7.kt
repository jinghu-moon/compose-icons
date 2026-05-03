package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.RosetteNumber7: ImageVector
    get() {
        if (_rosetteNumber7 != null) return _rosetteNumber7!!
        _rosetteNumber7 = tablerOutlineIcon(
            name = "RosetteNumber7",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 10.000 8.000 L 14.000 8.000 L 12.000 16.000"),
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
        pathData = parseSvgPathData("M 5.000 7.200 C 5.000 5.985 5.985 5.000 7.200 5.000 L 8.200 5.000 C 8.781 5.000 9.338 4.770 9.750 4.360 L 10.450 3.660 C 10.863 3.245 11.424 3.011 12.010 3.011 C 12.596 3.011 13.157 3.245 13.570 3.660 L 14.270 4.360 C 14.682 4.770 15.240 5.000 15.820 5.000 L 16.820 5.000 C 18.035 5.000 19.020 5.985 19.020 7.200 L 19.020 8.200 C 19.020 8.780 19.250 9.338 19.660 9.750 L 20.360 10.450 C 20.775 10.863 21.009 11.424 21.009 12.010 C 21.009 12.596 20.775 13.157 20.360 13.570 L 19.660 14.270 C 19.250 14.682 19.020 15.239 19.020 15.820 L 19.020 16.820 C 19.020 18.035 18.035 19.020 16.820 19.020 L 15.820 19.020 C 15.239 19.020 14.682 19.250 14.270 19.660 L 13.570 20.360 C 13.157 20.775 12.596 21.009 12.010 21.009 C 11.424 21.009 10.863 20.775 10.450 20.360 L 9.750 19.660 C 9.338 19.250 8.781 19.020 8.200 19.020 L 7.200 19.020 C 5.985 19.020 5.000 18.035 5.000 16.820 L 5.000 15.820 C 5.000 15.239 4.770 14.682 4.360 14.270 L 3.660 13.570 C 3.245 13.157 3.011 12.596 3.011 12.010 C 3.011 11.424 3.245 10.863 3.660 10.450 L 4.360 9.750 C 4.770 9.338 5.000 8.781 5.000 8.200 L 5.000 7.200"),
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
        return _rosetteNumber7!!
    }

private var _rosetteNumber7: ImageVector? = null
