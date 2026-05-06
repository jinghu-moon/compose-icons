package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.GoogleCardboardLogo: ImageVector
    get() {
        if (_googleCardboardLogo != null) return _googleCardboardLogo!!
        _googleCardboardLogo = phosphorLightIcon(
            name = "GoogleCardboardLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M224 50h-192C24.268 50 18 56.268 18 64v128c0 7.732 6.268 14 14 14h64c1.591-.001 3.116-.634 4.24-1.76l26.35-26.34c.78-.775 2.04-.775 2.82 0l26.35 26.34c1.124 1.126 2.649 1.759 4.24 1.76h64c7.732 0 14-6.268 14-14v-128c0-7.732-6.268-14-14-14ZM226 192c0 1.105-.895 2-2 2h-61.51L137.9 169.42c-2.626-2.626-6.187-4.101-9.9-4.101-3.713 0-7.274 1.475-9.9 4.101L93.51 194h-61.51c-1.105 0-2-.895-2-2v-128c0-1.105 .895-2 2-2h192c1.105 0 2 .895 2 2ZM80 98C63.431 98 50 111.431 50 128c0 16.569 13.431 30 30 30 16.569 0 30-13.431 30-30C110 111.431 96.569 98 80 98ZM80 146c-9.941 0-18-8.059-18-18 0-9.941 8.059-18 18-18 9.941 0 18 8.059 18 18 0 9.941-8.059 18-18 18ZM176 98c-16.569 0-30 13.431-30 30 0 16.569 13.431 30 30 30 16.569 0 30-13.431 30-30C206 111.431 192.569 98 176 98ZM176 146c-9.941 0-18-8.059-18-18 0-9.941 8.059-18 18-18 9.941 0 18 8.059 18 18 0 9.941-8.059 18-18 18Z"),
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
        return _googleCardboardLogo!!
    }

private var _googleCardboardLogo: ImageVector? = null
