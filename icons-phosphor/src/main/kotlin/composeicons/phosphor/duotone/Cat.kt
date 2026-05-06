package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Cat: ImageVector
    get() {
        if (_cat != null) return _cat!!
        _cat = phosphorDuotoneIcon(
            name = "Cat",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M224 48v88c0 48.6-43 88-96 88C75 224 32 184.6 32 136v-88c-.003-3.238 1.947-6.158 4.938-7.397 2.991-1.239 6.434-.554 8.722 1.737L67.6 67.6h0c36.027-26.132 84.773-26.132 120.8 0h0L210.34 42.36c2.286-2.288 5.724-2.975 8.713-1.741 2.989 1.234 4.941 4.147 4.947 7.381Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.2f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
            addPath(
                pathData = parseSvgPathData("M96 140c0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12 0-6.627 5.373-12 12-12 6.627 0 12 5.373 12 12ZM172 128c-6.627 0-12 5.373-12 12 0 6.627 5.373 12 12 12 6.627 0 12-5.373 12-12 0-6.627-5.373-12-12-12ZM232 48v88c0 52.93-46.65 96-104 96C70.65 232 24 188.93 24 136v-88c.003-6.469 3.901-12.3 9.878-14.775 5.977-2.475 12.856-1.108 17.432 3.465 .14 .14 .26 .27 .38 .41L69 57c36.115-22.627 81.985-22.627 118.1 0L204.31 37.1c.12-.14 .24-.27 .38-.41 4.576-4.573 11.455-5.94 17.432-3.465 5.977 2.475 9.875 8.306 9.878 14.775ZM216 48 194.44 72.8c-2.735 3.165-7.447 3.688-10.81 1.2C178.75 70.391 173.512 67.291 168 64.75v23.25c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8v-28.95c-5.248-1.35-10.6-2.26-16-2.72v31.67c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8v-31.67c-5.4 .46-10.752 1.37-16 2.72v28.95c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8v-23.25C82.488 67.291 77.25 70.391 72.37 74c-3.355 2.495-8.066 1.985-10.81-1.17L40 48v88c0 41.66 35.21 76 80 79.67v-20.36L106.34 181.65c-3.123-3.126-3.121-8.192 .005-11.315 3.126-3.123 8.192-3.121 11.315 .005L128 180.68l10.34-10.34c3.123-3.126 8.189-3.128 11.315-.005 3.126 3.123 3.128 8.189 .005 11.315L136 195.31v20.36c44.79-3.69 80-38 80-79.67Z"),
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
        return _cat!!
    }

private var _cat: ImageVector? = null
