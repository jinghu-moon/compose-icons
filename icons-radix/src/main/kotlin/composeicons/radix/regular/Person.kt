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
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15f, height = 15f),
        ) {
            addPath(
                pathData = parseSvgPathData("M7.501 .875c2.002 0 3.625 1.623 3.625 3.625C11.125 6.155 10.015 7.549 8.499 7.983c1.197 .145 2.224 .567 2.997 1.329 .982 .968 1.479 2.408 1.479 4.288-0 .262-.213 .475-.475 .475-.262-0-.474-.213-.475-.475 0-1.72-.453-2.88-1.196-3.612C10.084 9.255 8.973 8.875 7.5 8.875 6.027 8.875 4.915 9.255 4.171 9.988c-.743 .732-1.196 1.893-1.196 3.612-0 .262-.212 .475-.475 .475-.262-0-.474-.213-.475-.475 0-1.88 .497-3.32 1.479-4.288C4.276 8.551 5.303 8.129 6.499 7.984 4.984 7.55 3.876 6.154 3.876 4.5 3.876 2.498 5.499 .875 7.501 .875ZM7.501 1.824C6.023 1.824 4.825 3.023 4.825 4.5c0 1.477 1.199 2.675 2.676 2.675C8.978 7.174 10.175 5.977 10.175 4.5 10.175 3.023 8.978 1.825 7.501 1.824Z"),
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
        return _person!!
    }

private var _person: ImageVector? = null
