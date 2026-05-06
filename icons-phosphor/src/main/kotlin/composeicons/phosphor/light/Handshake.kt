package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Handshake: ImageVector
    get() {
        if (_handshake != null) return _handshake!!
        _handshake = phosphorLightIcon(
            name = "Handshake",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M252.51 108.8 227 57.75c-1.659-3.322-4.57-5.849-8.091-7.024-3.522-1.176-7.367-.904-10.689 .754L182.66 64.26 129.53 50.2c-1.003-.26-2.057-.26-3.06 0L73.34 64.26 47.79 51.48C44.467 49.818 40.62 49.545 37.096 50.721 33.571 51.897 30.659 54.426 29 57.75L3.49 108.8c-3.456 6.915-.654 15.322 6.26 18.78l27.15 13.58 55.61 39.72c.603 .434 1.281 .753 2 .94l64 16c.487 .121 .988 .182 1.49 .18 1.591-.001 3.116-.634 4.24-1.76l55.31-55.31 26.7-13.35c6.914-3.458 9.716-11.865 6.26-18.78ZM199.51 143.96 163.71 115.28c-2.391-1.913-5.839-1.719-8 .45-18.65 18.79-39.5 16.42-52.79 7.92-.53-.327-.877-.881-.94-1.5-.072-.567 .115-1.136 .51-1.55L146.43 78h33.86l28.41 56.82ZM14.11 115.69c-.165-.501-.126-1.048 .11-1.52L39.74 63.11c.342-.679 1.04-1.105 1.8-1.1 .309 0 .614 .072 .89 .21L64.64 73.32 37.32 128 15.11 116.9c-.484-.25-.845-.687-1-1.21ZM158.16 185.36 98.56 170.46 47.66 134.1 76.84 75.75 128 62.21l14.8 3.92c-1.132 .22-2.174 .766-3 1.57L94.1 112.05c-3.006 3.004-4.484 7.21-4.02 11.434 .465 4.224 2.823 8.008 6.41 10.286 20.22 12.92 44.75 10.49 63.8-5.89L191 152.5ZM241.89 115.69c-.166 .504-.526 .921-1 1.16L218.68 128 191.36 73.32 213.57 62.22c.475-.239 1.026-.278 1.53-.11 .504 .166 .921 .526 1.16 1l25.52 51.06c.236 .472 .275 1.019 .11 1.52ZM129.89 217.45c-.802 3.214-4.056 5.17-7.27 4.37L80.89 211.39c-.72-.184-1.399-.503-2-.94L52.52 191.64c-2.698-1.933-3.318-5.687-1.385-8.385 1.933-2.698 5.687-3.318 8.385-1.385L84.91 200l40.61 10.15c1.548 .387 2.878 1.374 3.696 2.744 .818 1.37 1.057 3.009 .664 4.556Z"),
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
        return _handshake!!
    }

private var _handshake: ImageVector? = null
