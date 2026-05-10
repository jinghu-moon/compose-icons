package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Club: ImageVector
    get() {
        if (_club != null) return _club!!
        _club = phosphorFillIcon(
            name = "Club",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M240 144c-.007 20.171-10.862 38.78-28.417 48.715-17.555 9.935-39.096 9.662-56.393-.715h-4.44l8.91 29.7c.727 2.422 .266 5.045-1.243 7.074-1.509 2.029-3.888 3.225-6.417 3.226h-48c-2.529-.001-4.908-1.197-6.417-3.226-1.509-2.029-1.97-4.652-1.243-7.074L105.25 192h-4.44C80.525 204.19 54.766 202.312 36.464 187.308 18.161 172.305 11.266 147.415 19.24 125.133 27.213 102.85 48.334 87.985 72 88c.78 0 1.55 0 2.33 0C67.502 65.074 75.99 40.341 95.458 26.44c19.468-13.901 45.616-13.901 65.084 0C180.01 40.341 188.498 65.074 181.67 88c.77 0 1.55 0 2.33 0 30.914 .033 55.967 25.086 56 56Z"),
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
        return _club!!
    }

private var _club: ImageVector? = null
