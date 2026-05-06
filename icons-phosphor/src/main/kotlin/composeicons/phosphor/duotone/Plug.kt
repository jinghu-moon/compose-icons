package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Plug: ImageVector
    get() {
        if (_plug != null) return _plug!!
        _plug = phosphorDuotoneIcon(
            name = "Plug",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M212 132l-58.63 58.63c-12.496 12.494-32.754 12.494-45.25 0L65.37 147.88c-12.494-12.496-12.494-32.754 0-45.25L124 44Z"),
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
                pathData = parseSvgPathData("M237.66 66.34C236.159 64.838 234.123 63.994 232 63.994c-2.123 0-4.159 .844-5.66 2.346L192 100.69 155.31 64 189.66 29.66c3.126-3.126 3.126-8.194 0-11.32-3.126-3.126-8.194-3.126-11.32 0L144 52.69 117.66 26.34c-3.126-3.126-8.194-3.126-11.32 0-3.126 3.126-3.126 8.194 0 11.32L112.69 44 59.69 97c-7.502 7.502-11.716 17.676-11.716 28.285 0 10.609 4.215 20.783 11.716 28.285l15.71 15.71L26.34 218.34c-3.126 3.126-3.126 8.194 0 11.32 3.126 3.126 8.194 3.126 11.32 0L86.75 180.57l15.71 15.71c7.502 7.502 17.676 11.716 28.285 11.716 10.609 0 20.783-4.215 28.285-11.716l53-53 6.34 6.35c3.126 3.126 8.194 3.126 11.32 0 3.126-3.126 3.126-8.194 0-11.32L203.31 112 237.66 77.66c1.502-1.501 2.346-3.537 2.346-5.66 0-2.123-.844-4.159-2.346-5.66ZM147.72 185c-4.501 4.504-10.608 7.034-16.975 7.034-6.367 0-12.474-2.53-16.975-7.034L71 142.23c-4.504-4.501-7.034-10.608-7.034-16.975 0-6.367 2.53-12.474 7.034-16.975l53-53L200.69 132Z"),
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
        return _plug!!
    }

private var _plug: ImageVector? = null
