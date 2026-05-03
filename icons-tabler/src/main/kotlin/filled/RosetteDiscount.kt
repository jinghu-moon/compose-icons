package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.RosetteDiscount: ImageVector
    get() {
        if (_rosetteDiscount != null) return _rosetteDiscount!!
        _rosetteDiscount = tablerFilledIcon(
            name = "RosetteDiscount",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 12.010 2.011 C 12.862 2.011 13.678 2.351 14.277 2.953 L 14.975 3.651 C 15.200 3.874 15.503 4.000 15.820 4.000 L 16.820 4.000 C 18.587 4.000 20.020 5.433 20.020 7.200 L 20.020 8.200 C 20.020 8.516 20.146 8.820 20.367 9.043 L 21.065 9.741 C 21.669 10.341 22.008 11.157 22.009 12.009 C 22.009 12.860 21.670 13.676 21.067 14.277 L 20.369 14.975 C 20.146 15.200 20.020 15.503 20.020 15.820 L 20.020 16.820 C 20.020 18.587 18.587 20.020 16.820 20.020 L 15.820 20.020 C 15.504 20.020 15.201 20.145 14.977 20.367 L 14.279 21.065 C 13.679 21.669 12.863 22.008 12.011 22.009 C 11.160 22.009 10.344 21.670 9.743 21.067 L 9.045 20.369 C 8.820 20.146 8.517 20.020 8.200 20.020 L 7.200 20.020 C 5.433 20.020 4.000 18.587 4.000 16.820 L 4.000 15.820 C 4.000 15.504 3.875 15.201 3.653 14.977 L 2.955 14.279 C 2.351 13.679 2.012 12.863 2.011 12.011 C 2.011 11.160 2.350 10.344 2.953 9.743 L 3.651 9.045 C 3.874 8.820 4.000 8.517 4.000 8.200 L 4.000 7.200 L 4.005 7.018 C 4.101 5.324 5.503 4.000 7.200 4.000 L 8.200 4.000 C 8.516 4.000 8.819 3.875 9.043 3.653 L 9.741 2.955 C 10.342 2.351 11.158 2.011 12.010 2.011M 14.500 13.000 C 13.672 13.000 13.000 13.672 13.000 14.500 C 13.000 15.328 13.672 16.000 14.500 16.000 C 15.328 16.000 16.000 15.328 16.000 14.500 C 16.000 13.672 15.328 13.000 14.500 13.000M 15.707 8.293 C 15.316 7.903 14.684 7.903 14.293 8.293 L 8.293 14.293 C 7.914 14.685 7.919 15.309 8.305 15.695 C 8.691 16.081 9.315 16.086 9.707 15.707 L 15.707 9.707 C 16.097 9.316 16.097 8.684 15.707 8.293M 9.500 8.000 C 8.672 8.000 8.000 8.672 8.000 9.500 C 8.000 10.328 8.672 11.000 9.500 11.000 C 10.328 11.000 11.000 10.328 11.000 9.500 C 11.000 8.672 10.328 8.000 9.500 8.000"),
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
        return _rosetteDiscount!!
    }

private var _rosetteDiscount: ImageVector? = null
