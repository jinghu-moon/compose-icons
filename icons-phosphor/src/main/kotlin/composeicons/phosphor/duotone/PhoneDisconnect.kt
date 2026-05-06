package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.PhoneDisconnect: ImageVector
    get() {
        if (_phoneDisconnect != null) return _phoneDisconnect!!
        _phoneDisconnect = phosphorDuotoneIcon(
            name = "PhoneDisconnect",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M230 157c-2.197 2.786-5.967 3.791-9.26 2.47L171.58 142c-2.49-.997-4.315-3.174-4.86-5.8l-6.21-29.74c-.558-2.733-2.509-4.973-5.14-5.9-17.864-6.123-37.265-6.077-55.1 .13-2.651 .949-4.6 3.233-5.12 6l-5.9 29.51c-.547 2.628-2.376 4.806-4.87 5.8L35.29 159.42C32 160.767 28.215 159.781 26 157 11.4 138.17 12.74 113.17 30 95.88c53.11-53.11 142.77-53.11 195.88 0 17.35 17.24 18.69 42.24 4.12 61.12Z"),
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
                pathData = parseSvgPathData("M231.59 90.13h0C175.44 34 80.56 34 24.41 90.13c-20 20-21.92 49.49-4.69 71.71 3.035 3.891 7.695 6.164 12.63 6.16 1.967 .001 3.917-.365 5.75-1.08l49-17.37 .29-.11c5.025-2.01 8.693-6.423 9.75-11.73l5.9-29.52c16.087-5.561 33.569-5.6 49.68-.11h0l6.21 29.75c1.094 5.248 4.743 9.599 9.72 11.59l.29 .11 49 17.39c6.572 2.546 14.037 .491 18.38-5.06 17.19-22.24 15.26-51.73-4.73-71.73ZM223.67 152l-.3-.12L174.55 134.55l-6.21-29.74C167.194 99.337 163.274 94.859 158 93c-19.563-6.698-40.806-6.652-60.34 .13-5.316 1.899-9.238 6.46-10.32 12l-5.9 29.51L32.63 151.86c-.1 0-.17 .13-.27 .17-12.33-15.91-11-36.23 3.36-50.58 25-25 58.65-37.53 92.28-37.53 33.63 0 67.27 12.51 92.28 37.53 14.33 14.35 15.72 34.67 3.39 50.55ZM223.99 200c0 4.418-3.582 8-8 8h-175.99c-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8h176c4.418 0 8 3.582 8 8Z"),
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
        return _phoneDisconnect!!
    }

private var _phoneDisconnect: ImageVector? = null
