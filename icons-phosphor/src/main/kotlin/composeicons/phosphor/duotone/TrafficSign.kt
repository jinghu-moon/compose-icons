package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.TrafficSign: ImageVector
    get() {
        if (_trafficSign != null) return _trafficSign!!
        _trafficSign = phosphorDuotoneIcon(
            name = "TrafficSign",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M237.49 134.05 134.05 237.49c-1.602 1.608-3.78 2.513-6.05 2.513-2.27 0-4.448-.904-6.05-2.513L18.51 134.05C16.902 132.448 15.997 130.27 15.997 128c0-2.27 .904-4.448 2.513-6.05L122 18.51c1.602-1.608 3.78-2.513 6.05-2.513 2.27 0 4.448 .904 6.05 2.513L237.49 122c3.317 3.332 3.317 8.718 0 12.05Z"),
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
                pathData = parseSvgPathData("M243.15 116.29 139.71 12.85C136.604 9.744 132.392 7.999 128 7.999c-4.392 0-8.604 1.745-11.71 4.851L12.85 116.29C9.744 119.396 7.999 123.608 7.999 128c0 4.392 1.745 8.604 4.851 11.71L116.29 243.15h0c3.106 3.106 7.318 4.851 11.71 4.851 4.392 0 8.604-1.745 11.71-4.851L243.15 139.71c3.106-3.106 4.851-7.318 4.851-11.71 0-4.392-1.745-8.604-4.851-11.71ZM231.84 128.39 128.39 231.84c-.217 .211-.563 .211-.78 0h0L24.16 128.39c-.211-.217-.211-.563 0-.78L127.61 24.16c.102-.106 .243-.164 .39-.16 .149 0 .292 .057 .4 .16L231.84 127.61c.211 .217 .211 .563 0 .78ZM173.66 114.39c1.502 1.501 2.346 3.537 2.346 5.66 0 2.123-.844 4.159-2.346 5.66l-24 24c-3.126 3.126-8.194 3.126-11.32 0-3.126-3.126-3.126-8.194 0-11.32L148.69 128h-36.69c-8.837 0-16 7.163-16 16v8c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8v-8c0-17.673 14.327-32 32-32h36.69L138.34 101.66c-3.126-3.126-3.126-8.194 0-11.32 3.126-3.126 8.194-3.126 11.32 0Z"),
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
        return _trafficSign!!
    }

private var _trafficSign: ImageVector? = null
