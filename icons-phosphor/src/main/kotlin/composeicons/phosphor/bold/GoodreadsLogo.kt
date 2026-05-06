package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.GoodreadsLogo: ImageVector
    get() {
        if (_goodreadsLogo != null) return _goodreadsLogo!!
        _goodreadsLogo = phosphorBoldIcon(
            name = "GoodreadsLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M184 20c-6.627 0-12 5.373-12 12v4.22C151.823 19.03 123.49 15.144 99.429 26.268 75.369 37.391 59.975 61.493 60 88v24c-.025 26.507 15.369 50.609 39.429 61.732 24.06 11.124 52.393 7.238 72.571-9.952v4.22c-.028 24.289-19.711 43.972-44 44-15 0-30.29-7.58-38.16-18.87-3.794-5.434-11.276-6.764-16.71-2.97-5.434 3.794-6.764 11.276-2.97 16.71C82.5 224.56 105.21 236 128 236c37.539-.039 67.961-30.461 68-68v-136c0-6.627-5.373-12-12-12ZM128 156C103.711 155.972 84.028 136.289 84 112v-24C84 63.699 103.699 44 128 44c24.301 0 44 19.699 44 44v24c-.028 24.289-19.711 43.972-44 44Z"),
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
