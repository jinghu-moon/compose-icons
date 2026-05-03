package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.DropdownMenu: ImageVector
    get() {
        if (_dropdownMenu != null) return _dropdownMenu!!
        _dropdownMenu = radixIcon(
            name = "DropdownMenu",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15f, height = 15f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 14.581 11.109 C 14.763 11.146 14.900 11.307 14.900 11.500 C 14.900 11.693 14.763 11.854 14.581 11.892 L 14.500 11.901 L 7.500 11.901 C 7.279 11.901 7.100 11.721 7.100 11.500 C 7.100 11.279 7.279 11.100 7.500 11.100 L 14.500 11.100 L 14.581 11.109 ZM 14.581 9.109 C 14.763 9.146 14.900 9.307 14.900 9.500 C 14.900 9.693 14.763 9.854 14.581 9.892 L 14.500 9.901 L 7.500 9.901 C 7.279 9.901 7.100 9.721 7.100 9.500 C 7.100 9.279 7.279 9.100 7.500 9.100 L 14.500 9.100 L 14.581 9.109 ZM 2.500 9.250 L 0.000 6.000 L 5.000 6.000 L 2.500 9.250 ZM 14.581 7.109 C 14.763 7.146 14.900 7.307 14.900 7.500 C 14.900 7.693 14.763 7.854 14.581 7.892 L 14.500 7.901 L 7.500 7.901 C 7.279 7.901 7.100 7.721 7.100 7.500 C 7.100 7.279 7.279 7.100 7.500 7.100 L 14.500 7.100 L 14.581 7.109 ZM 14.581 5.109 C 14.763 5.146 14.900 5.307 14.900 5.500 C 14.900 5.693 14.763 5.854 14.581 5.892 L 14.500 5.901 L 7.500 5.901 C 7.279 5.901 7.100 5.721 7.100 5.500 C 7.100 5.279 7.279 5.100 7.500 5.100 L 14.500 5.100 L 14.581 5.109 ZM 14.581 3.109 C 14.763 3.146 14.900 3.307 14.900 3.500 C 14.900 3.693 14.763 3.855 14.581 3.892 L 14.500 3.901 L 7.500 3.901 C 7.279 3.901 7.100 3.721 7.100 3.500 C 7.100 3.279 7.279 3.100 7.500 3.100 L 14.500 3.100 L 14.581 3.109 Z"),
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
        return _dropdownMenu!!
    }

private var _dropdownMenu: ImageVector? = null
