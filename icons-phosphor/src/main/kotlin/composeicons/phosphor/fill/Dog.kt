package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Dog: ImageVector
    get() {
        if (_dog != null) return _dog!!
        _dog = phosphorFillIcon(
            name = "Dog",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M239.71 125 223.29 37c-.811-4.335-3.376-8.144-7.088-10.525-3.712-2.382-8.243-3.125-12.522-2.055l-.31 .09L150.85 40h-45.7L52.63 24.56l-.31-.09c-4.279-1.07-8.81-.327-12.522 2.055-3.712 2.382-6.277 6.19-7.088 10.525L16.29 125c-1.447 7.256 2.346 14.543 9.12 17.52 2.106 .966 4.393 1.47 6.71 1.48 2.773-.001 5.494-.747 7.88-2.16v42.16c0 22.091 17.909 40 40 40h96c22.091 0 40-17.909 40-40v-42.15c2.383 1.41 5.101 2.156 7.87 2.16 2.319-.007 4.61-.508 6.72-1.47 6.782-2.979 10.577-10.277 9.12-17.54ZM176 208h-40v-12.69l13.66-13.65c3.126-3.126 3.126-8.194 0-11.32-3.126-3.126-8.194-3.126-11.32 0L128 180.69 117.66 170.34c-3.126-3.126-8.194-3.126-11.32 0-3.126 3.126-3.126 8.194 0 11.32L120 195.31v12.69h-40C66.745 208 56 197.255 56 184v-60.89L107.93 56h40.14L200 123.11v60.89c0 13.255-10.745 24-24 24ZM104 140c0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12 0-6.627 5.373-12 12-12 6.627 0 12 5.373 12 12ZM176 140c0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12 0-6.627 5.373-12 12-12 6.627 0 12 5.373 12 12Z"),
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
        return _dog!!
    }

private var _dog: ImageVector? = null
