package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.Camera: ImageVector
    get() {
        if (_camera != null) return _camera!!
        _camera = radixIcon(
            name = "Camera",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15f, height = 15f),
        ) {
            addPath(
                pathData = parseSvgPathData("M13 2c1.105 0 2 .895 2 2v7c0 1.105-.895 2-2 2h-11C.964 13 .113 12.213 .011 11.204L0 11v-7C0 2.895 .895 2 2 2h11ZM2 3C1.448 3 1 3.448 1 4v7l.005 .102C1.056 11.607 1.482 12 2 12h11c.552 0 1-.448 1-1v-7C14 3.448 13.552 3 13 3h-11ZM9.686 3.988c1.902 .097 3.416 1.669 3.416 3.596l-.005 .186c-.096 1.903-1.67 3.416-3.597 3.416l-.185-.005C7.474 11.087 5.998 9.611 5.904 7.77L5.899 7.584C5.9 5.596 7.512 3.984 9.5 3.983l.186 .005ZM9.5 4.983C8.064 4.984 6.9 6.148 6.899 7.584c0 1.436 1.164 2.601 2.601 2.602 1.436-0 2.601-1.165 2.602-2.602C12.101 6.148 10.936 4.984 9.5 4.983ZM4.75 4C4.888 4 5 4.112 5 4.25v1.505c-0 .138-.112 .25-.25 .25h-2.5C2.112 6.005 2 5.893 2 5.755v-1.505C2 4.112 2.112 4 2.25 4h2.5Z"),
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
        return _camera!!
    }

private var _camera: ImageVector? = null
