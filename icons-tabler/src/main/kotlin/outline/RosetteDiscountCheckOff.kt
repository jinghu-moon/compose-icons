package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.RosetteDiscountCheckOff: ImageVector
    get() {
        if (_rosetteDiscountCheckOff != null) return _rosetteDiscountCheckOff!!
        _rosetteDiscountCheckOff = tablerOutlineIcon(
            name = "RosetteDiscountCheckOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 9.000 12.000 L 11.000 14.000 L 12.500 12.500M 14.500 10.500 L 15.000 10.000"),
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
                pathData = parseSvgPathData("M 8.887 4.890 C 9.212 4.783 9.507 4.601 9.750 4.360 L 10.450 3.660 C 10.863 3.245 11.424 3.011 12.010 3.011 C 12.596 3.011 13.157 3.245 13.570 3.660 L 14.270 4.360 C 14.682 4.770 15.240 5.000 15.820 5.000 L 16.820 5.000 C 18.035 5.000 19.020 5.985 19.020 7.200 L 19.020 8.200 C 19.020 8.780 19.250 9.338 19.660 9.750 L 20.360 10.450 C 20.775 10.863 21.009 11.424 21.009 12.010 C 21.009 12.596 20.775 13.157 20.360 13.570 L 19.660 14.270 C 19.420 14.511 19.239 14.805 19.132 15.128M 18.375 18.376 C 17.963 18.789 17.403 19.021 16.820 19.020 L 15.820 19.020 C 15.239 19.020 14.682 19.250 14.270 19.660 L 13.570 20.360 C 13.157 20.775 12.596 21.009 12.010 21.009 C 11.424 21.009 10.863 20.775 10.450 20.360 L 9.750 19.660 C 9.338 19.250 8.781 19.020 8.200 19.020 L 7.200 19.020 C 5.985 19.020 5.000 18.035 5.000 16.820 L 5.000 15.820 C 5.000 15.239 4.770 14.682 4.360 14.270 L 3.660 13.570 C 3.245 13.157 3.011 12.596 3.011 12.010 C 3.011 11.424 3.245 10.863 3.660 10.450 L 4.360 9.750 C 4.770 9.338 5.000 8.781 5.000 8.200 L 5.000 7.200 C 5.000 6.596 5.244 6.048 5.638 5.650"),
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
                pathData = parseSvgPathData("M 3.000 3.000 L 21.000 21.000"),
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
        return _rosetteDiscountCheckOff!!
    }

private var _rosetteDiscountCheckOff: ImageVector? = null
