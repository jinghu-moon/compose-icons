package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.Transform: ImageVector
    get() {
        if (_transform != null) return _transform!!
        _transform = radixIcon(
            name = "Transform",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15f, height = 15f),
        ) {
            addPath(
                pathData = parseSvgPathData("M3.342 .855c.454 .046 .809 .43 .809 .896v.3h6.699v-.3c0-.497 .403-.9 .9-.9h1.5l.092 .005c.454 .046 .809 .43 .809 .896v1.5l-.005 .092c-.046 .454-.43 .808-.896 .809h-.3v6.699h.3l.092 .005c.454 .046 .809 .43 .809 .895v1.5l-.005 .092c-.046 .454-.43 .808-.896 .809h-1.5c-.497 0-.9-.403-.9-.9v-.3h-6.699v.3l-.005 .092c-.046 .454-.43 .808-.895 .809h-1.5c-.497 0-.9-.403-.9-.9v-1.5c0-.497 .403-.9 .9-.9h.3v-6.699h-.3c-.497 0-.9-.404-.9-.9v-1.5c0-.497 .403-.9 .9-.9h1.5l.092 .005ZM1.75 13.25h1.5v-1.5h-1.5v1.5ZM11.75 13.25h1.5v-1.5h-1.5v1.5ZM4.151 2.951v.3l-.005 .092c-.046 .454-.43 .808-.895 .809h-.3v6.699h.3l.092 .005c.454 .046 .809 .43 .809 .895v.3h6.699v-.3c0-.497 .403-.9 .9-.9h.3v-6.699h-.3c-.497 0-.9-.404-.9-.9v-.3h-6.699ZM7.092 5.105c.454 .046 .809 .43 .809 .896v1l-.005 .092c-0 .005-.002 .009-.003 .014 .035-.004 .071-.006 .107-.006h1l.092 .005c.454 .046 .809 .43 .809 .896v1l-.005 .092c-.046 .454-.43 .808-.896 .809h-1c-.497 0-.9-.404-.9-.9v-1c0-.036 .002-.072 .006-.107-.035 .004-.07 .008-.105 .008h-1c-.497 0-.9-.404-.9-.9v-1c0-.497 .403-.9 .9-.9h1l.092 .005ZM8 9h1v-1h-1v1ZM6 7h1v-1h-1v1ZM1.75 3.25h1.5v-1.5h-1.5v1.5ZM11.75 3.25h1.5v-1.5h-1.5v1.5Z"),
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
        return _transform!!
    }

private var _transform: ImageVector? = null
