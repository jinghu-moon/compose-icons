package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.CarFan: ImageVector
    get() {
        if (_carFan != null) return _carFan!!
        _carFan = tablerFilledIcon(
            name = "CarFan",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 12.363 2.068 L 17.275 3.982 C 18.180 4.334 18.826 5.146 18.967 6.107 C 19.108 7.068 18.721 8.031 17.955 8.628 L 14.910 10.999 L 21.000 11.000 C 21.330 11.000 21.639 11.163 21.826 11.436 C 22.012 11.708 22.052 12.055 21.932 12.363 L 20.018 17.275 C 19.666 18.180 18.854 18.826 17.893 18.967 C 16.932 19.108 15.969 18.721 15.372 17.955 L 13.000 14.908 L 13.000 21.000 C 13.000 21.330 12.837 21.639 12.564 21.826 C 12.292 22.012 11.945 22.052 11.637 21.932 L 6.725 20.018 C 5.820 19.666 5.174 18.854 5.033 17.893 C 4.892 16.932 5.279 15.969 6.045 15.372 L 9.090 13.000 L 3.000 13.000 C 2.670 13.000 2.361 12.837 2.174 12.564 C 1.988 12.292 1.948 11.945 2.068 11.637 L 3.982 6.725 C 4.334 5.820 5.146 5.174 6.107 5.033 C 7.068 4.892 8.031 5.279 8.628 6.045 L 10.999 9.089 L 11.000 3.000 C 11.000 2.670 11.163 2.361 11.436 2.174 C 11.708 1.988 12.055 1.948 12.363 2.068"),
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
        return _carFan!!
    }

private var _carFan: ImageVector? = null
