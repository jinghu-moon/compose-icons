package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Trolley: ImageVector
    get() {
        if (_trolley != null) return _trolley!!
        _trolley = tablerFilledIcon(
            name = "Trolley",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 20.555 4.168 C 20.776 4.315 20.929 4.544 20.981 4.804 C 21.033 5.064 20.979 5.334 20.832 5.555 L 18.211 9.487 L 19.447 10.106 C 19.923 10.362 20.108 10.950 19.867 11.433 C 19.625 11.917 19.043 12.121 18.553 11.894 L 17.093 11.164 L 13.217 16.979 C 14.120 17.970 14.256 19.440 13.551 20.579 C 12.845 21.719 11.468 22.252 10.179 21.886 C 8.889 21.519 8.000 20.341 8.000 19.000 L 8.005 18.824 Q 8.013 18.689 8.032 18.557 L 5.445 16.832 C 4.985 16.525 4.861 15.905 5.168 15.445 C 5.475 14.985 6.095 14.861 6.555 15.168 L 8.979 16.783 C 9.645 16.174 10.551 15.898 11.443 16.033 L 19.168 4.445 C 19.315 4.224 19.544 4.071 19.804 4.019 C 20.064 3.967 20.334 4.021 20.555 4.168M 9.988 3.769 L 10.128 3.851 L 13.435 5.955 C 13.951 6.283 14.316 6.804 14.447 7.402 C 14.578 8.000 14.466 8.625 14.135 9.140 L 11.041 13.950 C 10.357 15.016 8.940 15.328 7.871 14.648 L 4.565 12.544 C 4.049 12.216 3.684 11.695 3.553 11.097 C 3.422 10.499 3.534 9.874 3.865 9.359 L 6.959 4.549 C 7.609 3.537 8.930 3.197 9.988 3.769"),
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
        return _trolley!!
    }

private var _trolley: ImageVector? = null
