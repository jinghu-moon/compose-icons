package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.GoodreadsLogo: ImageVector
    get() {
        if (_goodreadsLogo != null) return _goodreadsLogo!!
        _goodreadsLogo = phosphorRegularIcon(
            name = "GoodreadsLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M184 24c-4.418 0-8 3.582-8 8v13.74C158.403 25.787 130.297 18.801 105.406 28.193 80.515 37.585 64.03 61.396 64 88v24c.03 26.604 16.515 50.415 41.406 59.807 24.891 9.392 52.997 2.406 70.594-17.547v13.74c-.028 26.498-21.502 47.972-48 48-16.45 0-32.72-8.08-41.44-20.58-2.529-3.623-7.517-4.509-11.14-1.98-3.623 2.529-4.509 7.517-1.98 11.14C85.06 221.24 106.48 232 128 232c35.33-.039 63.961-28.67 64-64v-136c0-4.418-3.582-8-8-8ZM128 160C101.502 159.972 80.028 138.498 80 112v-24C80 61.49 101.49 40 128 40c26.51 0 48 21.49 48 48v24c-.028 26.498-21.502 47.972-48 48Z"),
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
        return _goodreadsLogo!!
    }

private var _goodreadsLogo: ImageVector? = null
