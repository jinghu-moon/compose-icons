package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.PhoneCall: ImageVector
    get() {
        if (_phoneCall != null) return _phoneCall!!
        _phoneCall = phosphorBoldIcon(
            name = "PhoneCall",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M140.41 44.9c1.713-6.4 8.289-10.201 14.69-8.49 31.59 8.23 56.26 32.9 64.49 64.49 1.21 4.175 .068 8.677-2.986 11.771-3.054 3.093-7.541 4.294-11.731 3.138-4.19-1.156-7.427-4.487-8.463-8.708C190.342 83.83 172.17 65.658 148.9 59.59c-6.4-1.713-10.201-8.289-8.49-14.69ZM227.85 183.58C223.905 213.609 198.287 236.047 168 236 86.39 236 20 169.61 20 88 19.953 57.713 42.391 32.095 72.42 28.15 81.202 27.083 89.646 31.898 93.2 40l21.11 47.13c.022 .062 .049 .122 .08 .18 2.635 6.159 2.012 13.227-1.66 18.83-.257 .402-.541 .786-.85 1.15L92.82 130c7.06 12.84 20.5 26.16 33.49 33.21l22.31-19c.358-.3 .732-.58 1.12-.84 5.625-3.774 12.783-4.43 19-1.74l.18 .08L216 162.8c8.1 3.556 12.914 11.998 11.85 20.78ZM203.54 183.52l-42-18.81-22.43 19.07c-.353 .305-.723 .589-1.11 .85-5.865 3.889-13.343 4.409-19.69 1.37C98.83 176.6 79.42 157.32 70 138c-3.047-6.318-2.561-13.771 1.28-19.64 .261-.402 .548-.786 .86-1.15L91.3 94.49 72.48 52.49C55.82 56.161 43.967 70.941 44 88c.083 68.449 55.551 123.917 124 124 17.071 .047 31.866-11.809 35.54-28.48ZM137.63 97.47c9.959 3.139 17.761 10.941 20.9 20.9 1.571 4.997 6.202 8.397 11.44 8.4 1.224-.001 2.441-.187 3.61-.55 6.295-1.992 9.798-8.695 7.84-15C175.928 93.782 162.268 80.122 144.83 74.63c-4.116-1.381-8.657-.431-11.874 2.484-3.217 2.915-4.609 7.34-3.64 11.572 .969 4.232 4.149 7.61 8.315 8.834Z"),
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
        return _phoneCall!!
    }

private var _phoneCall: ImageVector? = null
