package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.Person: ImageVector
    get() {
        if (_person != null) return _person!!
        _person = radixIcon(
            name = "Person",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15.0f, height = 15.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 7.501 0.875 C 9.502 0.875 11.125 2.498 11.126 4.500 C 11.125 6.155 10.015 7.549 8.499 7.983 C 9.696 8.128 10.723 8.551 11.496 9.312 C 12.477 10.280 12.974 11.721 12.974 13.601 C 12.974 13.863 12.762 14.075 12.500 14.075 C 12.238 14.075 12.025 13.863 12.025 13.601 C 12.025 11.881 11.572 10.721 10.829 9.988 C 10.084 9.255 8.973 8.875 7.500 8.875 C 6.027 8.875 4.915 9.255 4.171 9.988 C 3.428 10.721 2.974 11.881 2.974 13.601 C 2.974 13.863 2.762 14.075 2.500 14.075 C 2.238 14.075 2.025 13.863 2.025 13.601 C 2.025 11.721 2.522 10.280 3.504 9.312 C 4.276 8.551 5.303 8.129 6.499 7.984 C 4.984 7.550 3.876 6.154 3.876 4.500 C 3.876 2.498 5.499 0.875 7.501 0.875 ZM 7.501 1.824 C 6.023 1.824 4.825 3.023 4.825 4.500 C 4.825 5.977 6.023 7.175 7.501 7.175 C 8.978 7.174 10.175 5.977 10.175 4.500 C 10.175 3.023 8.978 1.825 7.501 1.824 Z"),
        pathFillType = PathFillType.NonZero,
        fill = SolidColor(Color(0xFF000000)),
        fillAlpha = 1.0f,
        stroke = null,
        strokeAlpha = 1.0f,
        strokeLineWidth = 0.0f,
        strokeLineCap = StrokeCap.Butt,
        strokeLineJoin = StrokeJoin.Miter,
    )
        }
        return _person!!
    }

private var _person: ImageVector? = null
