package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Link: ImageVector
    get() {
        if (_link != null) return _link!!
        _link = phosphorDuotoneIcon(
            name = "Link",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M218.34 119.6l-34.74 34.74c-11.584 11.599-28.412 16.255-44.31 12.26-.31 .34-.62 .67-.95 1l-34.74 34.74C91.869 214.357 74.583 219.137 58.345 214.856 42.107 210.575 29.425 197.893 25.144 181.655c-4.281-16.238 .5-33.524 12.516-45.255L72.4 101.66C83.986 90.065 100.812 85.409 116.71 89.4c.31-.34 .62-.67 1-1L152.4 53.66c18.271-17.837 47.49-17.661 65.545 .395 18.055 18.055 18.231 47.274 .395 65.545Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.2f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
            addPath(
                pathData = parseSvgPathData("M240 88.23c-.401 13.927-6.128 27.169-16 37L189.25 160c-10.223 10.279-24.133 16.04-38.63 16h-.05c-14.747-.01-28.864-5.983-39.141-16.559C101.151 148.864 95.587 134.582 96 119.84c.124-4.418 3.807-7.899 8.225-7.775 4.418 .124 7.899 3.807 7.775 8.225-.294 10.423 3.639 20.523 10.905 28.002 7.266 7.479 17.248 11.702 27.675 11.708h0c10.248 .026 20.081-4.046 27.31-11.31l34.75-34.75c14.925-15.113 14.849-39.44-.17-54.46C197.45 44.461 173.123 44.385 158.01 59.31l-11 11c-3.145 2.988-8.099 2.925-11.167-.143C132.775 67.099 132.712 62.145 135.7 59l11-11C156.949 37.747 170.853 31.987 185.35 31.987c14.497 0 28.401 5.76 38.65 16.013 10.623 10.649 16.407 25.194 16 40.23ZM109 185.66l-11 11C90.753 203.955 80.883 208.04 70.6 208h0C54.983 207.987 40.909 198.573 34.937 184.142c-5.972-14.43-2.668-31.037 8.373-42.082L78 107.31C89.181 96.07 106.094 92.803 120.656 99.069c14.563 6.266 23.818 20.794 23.344 36.641-.059 2.122 .727 4.18 2.187 5.722 1.459 1.542 3.471 2.44 5.593 2.498h.22c4.334 .002 7.881-3.448 8-7.78C160.385 121.141 154.603 106.63 144 96 122.66 74.669 88.07 74.669 66.73 96L32 130.75C16.381 146.362 11.701 169.844 20.14 190.252c8.439 20.408 28.337 33.726 50.42 33.748h0c14.5 .042 28.414-5.72 38.64-16l11-11c2.684-3.161 2.507-7.849-.407-10.799-2.914-2.95-7.599-3.185-10.793-.541Z"),
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
        return _link!!
    }

private var _link: ImageVector? = null
