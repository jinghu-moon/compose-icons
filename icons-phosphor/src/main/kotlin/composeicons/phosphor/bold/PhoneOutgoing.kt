package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.PhoneOutgoing: ImageVector
    get() {
        if (_phoneOutgoing != null) return _phoneOutgoing!!
        _phoneOutgoing = phosphorBoldIcon(
            name = "PhoneOutgoing",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M143.52 112.48c-2.259-2.252-3.529-5.31-3.529-8.5 0-3.19 1.27-6.248 3.529-8.5L171 68h-11c-6.627 0-12-5.373-12-12 0-6.627 5.373-12 12-12h40c6.627 0 12 5.373 12 12v40c0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12v-11l-27.51 27.51c-2.252 2.259-5.31 3.529-8.5 3.529-3.19 0-6.248-1.27-8.5-3.529ZM227.85 183.58C223.905 213.609 198.287 236.047 168 236 86.39 236 20 169.61 20 88 19.953 57.713 42.391 32.095 72.42 28.15 81.202 27.083 89.646 31.898 93.2 40l21.11 47.13c.022 .062 .049 .122 .08 .18 2.635 6.159 2.012 13.227-1.66 18.83-.257 .402-.541 .786-.85 1.15L92.82 130c7.06 12.84 20.5 26.16 33.49 33.21l22.31-19c.358-.3 .732-.58 1.12-.84 5.625-3.774 12.783-4.43 19-1.74l.18 .08L216 162.8c8.1 3.556 12.914 11.998 11.85 20.78ZM203.54 183.52l-42-18.81-22.43 19.07c-.353 .305-.723 .589-1.11 .85-5.865 3.889-13.343 4.409-19.69 1.37C98.83 176.6 79.42 157.32 70 138c-3.047-6.318-2.561-13.771 1.28-19.64 .261-.402 .548-.786 .86-1.15L91.3 94.5l-18.82-42C55.824 56.171 43.972 70.944 44 88c.083 68.449 55.551 123.917 124 124 17.071 .047 31.866-11.809 35.54-28.48Z"),
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
        return _phoneOutgoing!!
    }

private var _phoneOutgoing: ImageVector? = null
