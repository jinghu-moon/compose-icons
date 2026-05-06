package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.PaypalLogo: ImageVector
    get() {
        if (_paypalLogo != null) return _paypalLogo!!
        _paypalLogo = phosphorFillIcon(
            name = "PaypalLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M220.12 93.54C214.751 86.639 207.835 81.097 199.93 77.36 198.52 47.495 173.899 24.004 144 24h-60c-7.341 .001-13.74 4.998-15.52 12.12L32.48 180.12c-1.195 4.779-.121 9.843 2.911 13.726 3.032 3.883 7.683 6.153 12.609 6.154h27.5l-3 12.12c-1.194 4.776-.123 9.836 2.904 13.718 3.027 3.882 7.673 6.155 12.596 6.162h31.5c7.334-.01 13.722-5.005 15.5-12.12L144 184h32c21.406-.001 40.939-12.204 50.326-31.442 9.387-19.238 6.986-42.144-6.186-59.018ZM48 184 84 40h60c19.2-.005 35.695 13.632 39.3 32.49C180.88 72.171 178.441 72.007 176 72h-56c-7.345-.003-13.749 4.994-15.53 12.12L79.52 184h-31.52ZM214.77 137.7C210.341 155.507 194.349 168.005 176 168h-32c-7.341 .001-13.74 4.998-15.52 12.12L119.48 216h-31.48l20-80h36c25.29 .007 47.435-16.966 54-41.39 3.612 2.393 6.813 5.355 9.48 8.77 7.627 9.688 10.324 22.367 7.3 34.32Z"),
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
        return _paypalLogo!!
    }

private var _paypalLogo: ImageVector? = null
