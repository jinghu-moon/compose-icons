package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.Bell: ImageVector
    get() {
        if (_bell != null) return _bell!!
        _bell = radixIcon(
            name = "Bell",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15f, height = 15f),
        ) {
            addPath(
                pathData = parseSvgPathData("M7.501 .15c.608 0 1.101 .493 1.101 1.101-0 .506-.342 .93-.808 1.059 2.348 .151 4.206 2.104 4.206 4.49v3.45c0 .806 .033 1.457 .724 1.803 .207 .104 .316 .336 .263 .561-.053 .226-.254 .386-.486 .386h-4.341c.208 .183 .341 .451 .341 .75-0 .552-.448 1-1 1-.552 0-1-.448-1-1 0-.299 .132-.567 .341-.75h-4.341c-.232 0-.433-.16-.486-.386-.053-.226 .055-.458 .263-.561 .691-.345 .724-.997 .724-1.803v-3.45C3 4.413 4.858 2.461 7.207 2.31 6.742 2.181 6.4 1.757 6.4 1.251 6.4 .643 6.893 .15 7.501 .15ZM7.5 3.3C5.567 3.3 4 4.867 4 6.8v3.45c0 .445 .013 1.135-.301 1.75h7.602C10.987 11.385 11 10.695 11 10.25v-3.45C11 4.867 9.433 3.3 7.5 3.3Z"),
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
        return _bell!!
    }

private var _bell: ImageVector? = null
