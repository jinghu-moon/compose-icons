package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Playlist: ImageVector
    get() {
        if (_playlist != null) return _playlist!!
        _playlist = phosphorLightIcon(
            name = "Playlist",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M34 64c0-3.314 2.686-6 6-6h176c3.314 0 6 2.686 6 6 0 3.314-2.686 6-6 6h-176c-3.314 0-6-2.686-6-6ZM40 134h120c3.314 0 6-2.686 6-6 0-3.314-2.686-6-6-6h-120c-3.314 0-6 2.686-6 6 0 3.314 2.686 6 6 6ZM112 186h-72c-3.314 0-6 2.686-6 6 0 3.314 2.686 6 6 6h72c3.314 0 6-2.686 6-6 0-3.314-2.686-6-6-6ZM245.75 125.72c-.962 3.169-4.31 4.96-7.48 4L206 120.06v71.94c0 13.913-9.566 26.001-23.107 29.197-13.541 3.197-27.503-3.337-33.725-15.781-6.222-12.444-3.072-27.534 7.61-36.449 10.682-8.915 26.092-9.315 37.222-.967v-56c-.001-1.896 .895-3.681 2.416-4.814 1.521-1.133 3.487-1.48 5.304-.936l40 12c1.525 .456 2.807 1.499 3.563 2.9 .756 1.401 .924 3.045 .467 4.57ZM194 192c0-9.941-8.059-18-18-18-9.941 0-18 8.059-18 18 0 9.941 8.059 18 18 18 9.941 0 18-8.059 18-18Z"),
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
        return _playlist!!
    }

private var _playlist: ImageVector? = null
