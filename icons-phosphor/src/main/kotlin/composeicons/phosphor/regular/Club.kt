package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Club: ImageVector
    get() {
        if (_club != null) return _club!!
        _club = phosphorRegularIcon(
            name = "Club",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M184 88c-.78 0-1.56 0-2.33 0C188.498 65.074 180.01 40.341 160.542 26.44c-19.468-13.901-45.616-13.901-65.084 0C75.99 40.341 67.502 65.074 74.33 88c-.78 0-1.55 0-2.33 0-23.057 .011-43.751 14.154-52.137 35.632-8.386 21.478-2.751 45.901 14.199 61.533 16.949 15.632 41.748 19.278 62.479 9.185l-8.2 27.35c-.727 2.422-.266 5.045 1.243 7.074 1.509 2.029 3.888 3.225 6.417 3.226h64c2.529-.001 4.908-1.197 6.417-3.226 1.509-2.029 1.97-4.652 1.243-7.074l-8.2-27.35c20.731 10.093 45.529 6.447 62.479-9.185 16.949-15.632 22.585-40.055 14.199-61.533C227.751 102.154 207.057 88.011 184 88ZM184 184c-13.452-.002-26.002-6.766-33.4-18-2.193-3.298-6.468-4.495-10.055-2.816-3.587 1.679-5.405 5.73-4.275 9.526l13 43.26h-42.5l13-43.26c1.201-3.825-.615-7.949-4.248-9.645-3.633-1.696-7.96-.442-10.122 2.935C93.913 183.399 70.988 189.056 52.725 179 34.462 168.943 26.986 146.545 35.547 127.535 44.108 108.525 65.835 99.279 85.47 106.29c3.254 1.163 6.888 .106 9.009-2.623 2.121-2.728 2.251-6.51 .321-9.377C83.589 77.607 86.499 55.195 101.6 41.929c15.1-13.266 37.7-13.266 52.801 0 15.1 13.266 18.011 35.678 6.8 52.361-1.93 2.867-1.8 6.649 .321 9.377 2.121 2.728 5.755 3.786 9.009 2.623 14.997-5.305 31.711-1.219 42.57 10.405 10.859 11.624 13.797 28.578 7.485 43.179C214.272 174.475 199.907 183.948 184 184Z"),
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
