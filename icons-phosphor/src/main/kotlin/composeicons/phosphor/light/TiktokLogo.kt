package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.TiktokLogo: ImageVector
    get() {
        if (_tiktokLogo != null) return _tiktokLogo!!
        _tiktokLogo = phosphorLightIcon(
            name = "TiktokLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M224 74C196.399 73.967 174.033 51.601 174 24c0-3.314-2.686-6-6-6h-40c-3.314 0-6 2.686-6 6v132c-.007 10.898-7.992 20.149-18.772 21.748C92.447 179.347 82.121 172.813 78.951 162.385c-3.17-10.427 1.772-21.604 11.619-26.275 2.094-.993 3.429-3.103 3.43-5.42v-42.69c-.002-1.765-.781-3.44-2.129-4.578C90.522 82.283 88.74 81.796 87 82.09 52.2 88.28 26 120.05 26 156c0 40.869 33.131 74 74 74 40.869 0 74-33.131 74-74v-43.07c15.256 8.607 32.484 13.11 50 13.07 3.314 0 6-2.686 6-6v-40c0-3.314-2.686-6-6-6ZM218 113.8c-16.763-1.071-32.882-6.856-46.5-16.69-1.83-1.314-4.243-1.493-6.246-.461-2.003 1.031-3.26 3.098-3.254 5.351v54c0 34.242-27.758 62-62 62C65.758 218 38 190.242 38 156 38 128.28 56.47 103.52 82 95.62v31.53c-13.873 8.657-19.618 25.964-13.676 41.199 5.942 15.235 21.888 24.082 37.959 21.06C122.354 186.387 133.997 172.353 134 156v-126h28.29c2.902 29.482 26.228 52.808 55.71 55.71Z"),
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
        return _tiktokLogo!!
    }

private var _tiktokLogo: ImageVector? = null
