package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.WebhooksLogo: ImageVector
    get() {
        if (_webhooksLogo != null) return _webhooksLogo!!
        _webhooksLogo = phosphorFillIcon(
            name = "WebhooksLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M50.15 160 89.07 92.57 86.83 88.69C77.707 73.383 77.813 54.282 87.108 39.079 96.402 23.875 113.353 15.071 131.136 16.213c17.783 1.141 33.47 12.04 40.744 28.307 1.735 3.774 .362 8.248-3.19 10.4-1.973 1.146-4.341 1.394-6.509 .684-2.168-.711-3.929-2.313-4.841-4.404C152.529 40.327 142.086 33.017 130.222 32.22c-11.863-.797-23.191 5.049-29.414 15.181-6.223 10.132-6.315 22.879-.239 33.099 .032 .04 .059 .083 .08 .13l13.83 23.94c1.429 2.475 1.429 5.525 0 8L77.86 176c-4.473 7.531-14.171 10.065-21.757 5.685C48.517 177.305 45.864 167.639 50.15 160ZM191.15 120h-12.34L141.86 56C137.387 48.469 127.689 45.935 120.103 50.315 112.517 54.695 109.864 64.361 114.15 72l34.64 60c1.428 2.473 4.065 3.997 6.92 4h35.63c17.89 0 32.95 14.64 32.66 32.53-.287 17.346-14.343 31.304-31.69 31.47-4.235-.051-7.817 3.12-8.28 7.33-.188 2.235 .571 4.447 2.092 6.095 1.521 1.649 3.664 2.583 5.908 2.575 12.889-.011 25.233-5.2 34.259-14.401 9.026-9.201 13.977-21.642 13.741-34.529C239.49 140.79 217.48 120 191.19 120ZM208 167.23C207.6 158.62 200.18 152 191.57 152h-76.76c-2.859-.001-5.501 1.524-6.93 4L91.72 184h0c-5.942 10.247-17.06 16.373-28.897 15.924C50.986 199.474 40.366 192.522 35.218 181.854 30.07 171.186 31.236 158.546 38.25 149c2.577-3.355 2.178-8.12-.92-11-1.671-1.489-3.89-2.21-6.117-1.988-2.227 .222-4.259 1.368-5.603 3.158-6.171 8.177-9.541 18.126-9.61 28.37-.195 21.798 14.322 40.99 35.351 46.734 21.028 5.744 43.287-3.404 54.2-22.274h0l4.62-8h81.83c4.38 .005 8.571-1.786 11.595-4.955 3.024-3.169 4.616-7.44 4.405-11.815Z"),
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
        return _webhooksLogo!!
    }

private var _webhooksLogo: ImageVector? = null
