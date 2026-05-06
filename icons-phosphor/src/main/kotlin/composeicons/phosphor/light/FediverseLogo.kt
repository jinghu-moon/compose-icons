package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.FediverseLogo: ImageVector
    get() {
        if (_fediverseLogo != null) return _fediverseLogo!!
        _fediverseLogo = phosphorLightIcon(
            name = "FediverseLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M212 98c-3.843-.003-7.639 .851-11.11 2.5L168.48 60c7.01-8.963 7.378-21.444 .906-30.804C162.915 19.836 151.108 15.772 140.247 19.165 129.385 22.558 121.992 32.621 122 44c.001 1.404 .115 2.805 .34 4.19L73 68.74C66.158 59.297 53.865 55.564 42.927 59.609 31.99 63.654 25.083 74.486 26.032 86.109c.948 11.623 9.52 21.193 20.968 23.411L49 159c-11.369 3.164-19.181 13.587-19.027 25.386 .153 11.8 8.234 22.016 19.681 24.883 11.447 2.867 23.389-2.335 29.086-12.669L130 211c0 .34 0 .69 0 1-.012 11.728 7.829 22.012 19.141 25.105 11.312 3.094 23.295-1.769 29.253-11.87 5.958-10.102 4.416-22.941-3.765-31.345l28.85-45.33c9.761 3.391 20.605 .68 27.621-6.907 7.016-7.587 8.874-18.609 4.731-28.076C231.69 104.11 222.334 97.995 212 98ZM156 186c-.78 0-1.55 0-2.31 .11L136.2 133.62 187 131.2c1.191 4.102 3.372 7.848 6.35 10.91l-28.85 45.33c-2.733-.952-5.606-1.439-8.5-1.44ZM72.27 163.74C68.994 161.101 65.127 159.296 61 158.48L59 109c4.529-1.273 8.628-3.751 11.86-7.17l46.42 26.87ZM148 70c3.843 .003 7.639-.851 11.11-2.5L191.52 108c-2.564 3.273-4.303 7.114-5.07 11.2l-50.76 2.42L148 70ZM148 30c7.732 0 14 6.268 14 14 0 7.732-6.268 14-14 14-7.732 0-14-6.268-14-14 0-7.732 6.268-14 14-14ZM127 59.26c2.44 3.352 5.641 6.077 9.34 7.95L124 118.77 76.9 91.48c1.136-3.782 1.396-7.773 .76-11.67ZM38 84C38 76.268 44.268 70 52 70c7.732 0 14 6.268 14 14 0 7.732-6.268 14-14 14C44.268 98 38 91.732 38 84ZM56 198c-7.732 0-14-6.268-14-14 0-7.732 6.268-14 14-14 7.732 0 14 6.268 14 14 0 7.732-6.268 14-14 14ZM82 185c0-.34 0-.69 0-1 0-3.724-.801-7.404-2.35-10.79L125 137.94l17.32 52c-3.772 2.346-6.885 5.611-9.05 9.49ZM156 226c-7.732 0-14-6.268-14-14 0-7.732 6.268-14 14-14 7.732 0 14 6.268 14 14 0 7.732-6.268 14-14 14ZM212 138c-7.732 0-14-6.268-14-14 0-7.732 6.268-14 14-14 7.732 0 14 6.268 14 14 0 7.732-6.268 14-14 14Z"),
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
        return _fediverseLogo!!
    }

private var _fediverseLogo: ImageVector? = null
