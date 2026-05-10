package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.PhoneDisconnect: ImageVector
    get() {
        if (_phoneDisconnect != null) return _phoneDisconnect!!
        _phoneDisconnect = phosphorFillIcon(
            name = "PhoneDisconnect",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M236.28 161.84c-4.343 5.551-11.808 7.606-18.38 5.06l-49-17.39-.29-.11c-4.977-1.991-8.626-6.342-9.72-11.59l-6.21-29.75h0c-16.111-5.49-33.593-5.451-49.68 .11l-5.9 29.52c-1.057 5.307-4.725 9.72-9.75 11.73l-.29 .11L38.06 166.9c-1.819 .717-3.755 1.09-5.71 1.1-4.931 .009-9.591-2.256-12.63-6.14C2.49 139.64 4.42 110.15 24.41 90.15c56.15-56.17 151-56.17 207.18 0h0c19.99 19.98 21.92 49.47 4.69 71.69ZM216 192h-176c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8h176c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8Z"),
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
