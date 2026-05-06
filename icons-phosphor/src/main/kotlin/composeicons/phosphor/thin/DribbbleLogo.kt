package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.DribbbleLogo: ImageVector
    get() {
        if (_dribbbleLogo != null) return _dribbbleLogo!!
        _dribbbleLogo = phosphorThinIcon(
            name = "DribbbleLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M128 28C72.772 28 28 72.772 28 128c0 55.228 44.772 100 100 100 55.228 0 100-44.772 100-100C227.939 72.797 183.203 28.061 128 28ZM219.92 124.43C216 124.15 212 124 208 124c-15.76 .004-31.437 2.274-46.55 6.74C157.791 118.97 152.813 107.651 146.61 97c-.49-.82-1-1.64-1.5-2.46 16.416-9.342 31.096-21.45 43.39-35.79 19.079 16.627 30.448 40.392 31.42 65.68ZM182.25 53.75C170.499 67.416 156.472 78.947 140.79 87.83 128.523 69.743 112.785 54.274 94.49 42.32c29.281-11.462 62.391-7.15 87.76 11.43ZM85.78 46.28c18.997 11.551 35.324 27.006 47.9 45.34C112.041 102.418 88.184 108.027 64 108c-8.483 .017-16.954-.652-25.33-2C45.065 80.25 62.227 58.495 85.78 46.28ZM36 128c.001-4.755 .368-9.502 1.1-14.2 8.892 1.464 17.888 2.2 26.9 2.2 25.725 .03 51.095-6.006 74.05-17.62 .55 .9 1.11 1.79 1.64 2.7 5.912 10.134 10.656 20.906 14.14 32.11-9.569 3.335-18.806 7.557-27.59 12.61C103.497 158.922 84.216 177.285 70 199.36 48.486 181.917 35.993 155.697 36 128ZM76.44 204.16c13.554-21.206 32.006-38.844 53.8-51.43 8.205-4.724 16.828-8.681 25.76-11.82 3.249 12.671 4.896 25.699 4.9 38.78 0 12.015-1.379 23.99-4.11 35.69-27.08 8.925-56.769 4.78-80.37-11.22ZM165.74 211.9c2.111-10.607 3.177-21.395 3.18-32.21-.004-13.922-1.779-27.786-5.28-41.26C178.041 134.168 192.981 132.003 208 132c4 0 7.94 .15 11.88 .45-1.711 34.544-22.616 65.222-54.14 79.45Z"),
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
        return _dribbbleLogo!!
    }

private var _dribbbleLogo: ImageVector? = null
