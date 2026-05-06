package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Broadcast: ImageVector
    get() {
        if (_broadcast != null) return _broadcast!!
        _broadcast = phosphorDuotoneIcon(
            name = "Broadcast",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M160 128c0 17.673-14.327 32-32 32C110.327 160 96 145.673 96 128c0-17.673 14.327-32 32-32 17.673 0 32 14.327 32 32Z"),
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
                pathData = parseSvgPathData("M128 88c-22.091 0-40 17.909-40 40 0 22.091 17.909 40 40 40 22.091 0 40-17.909 40-40C168 105.909 150.091 88 128 88ZM128 152c-13.255 0-24-10.745-24-24 0-13.255 10.745-24 24-24 13.255 0 24 10.745 24 24 0 13.255-10.745 24-24 24ZM201.71 159.14c-3.437 8.126-8.195 15.627-14.08 22.2-2.965 3.208-7.956 3.445-11.211 .531-3.255-2.914-3.571-7.9-.709-11.201 21.75-24.285 21.75-61.045 0-85.33-1.96-2.121-2.625-5.135-1.739-7.884 .886-2.749 3.185-4.807 6.015-5.385 2.83-.577 5.752 .416 7.644 2.598 20.619 23.072 26.1 55.958 14.08 84.47ZM69 103.09c-9.635 22.808-5.25 49.128 11.26 67.58 2.862 3.301 2.546 8.287-.709 11.201-3.255 2.914-8.246 2.677-11.211-.531C41.144 150.984 41.144 105.026 68.34 74.67c2.946-3.3 8.01-3.586 11.31-.64 3.3 2.946 3.586 8.01 .64 11.31C75.57 90.591 71.755 96.589 69 103.09ZM248 128c.049 31.417-12.269 61.592-34.29 84-1.983 2.12-4.96 3-7.777 2.298-2.817-.702-5.033-2.875-5.79-5.678-.757-2.803 .065-5.796 2.146-7.82 39.666-40.413 39.666-105.147 0-145.56-3.104-3.154-3.064-8.226 .09-11.33 3.154-3.104 8.226-3.064 11.33 .09 22.021 22.408 34.339 52.583 34.29 84ZM53.71 200.78c3.098 3.154 3.054 8.222-.1 11.32-3.154 3.098-8.222 3.054-11.32-.1C-3.517 165.367-3.517 90.633 42.29 44c1.983-2.12 4.96-3 7.777-2.298 2.817 .702 5.033 2.875 5.79 5.678 .757 2.803-.065 5.796-2.146 7.82-39.666 40.413-39.666 105.147 0 145.56Z"),
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
        return _broadcast!!
    }

private var _broadcast: ImageVector? = null
