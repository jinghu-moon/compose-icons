package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.SunHorizon: ImageVector
    get() {
        if (_sunHorizon != null) return _sunHorizon!!
        _sunHorizon = phosphorFillIcon(
            name = "SunHorizon",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M248 160c0 4.418-3.582 8-8 8h-224c-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8h40.45c-.295-2.657-.445-5.327-.45-8C56 104.235 88.235 72 128 72c39.764 0 72 32.235 72 72-.005 2.673-.155 5.343-.45 8h40.45c4.418 0 8 3.582 8 8ZM208 192h-160c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8h160c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8ZM80.84 59.58c1.977 3.954 6.786 5.557 10.74 3.58 3.954-1.977 5.557-6.786 3.58-10.74l-8-16C85.183 32.466 80.374 30.863 76.42 32.84c-3.954 1.977-5.557 6.786-3.58 10.74ZM20.42 103.16l16 8c3.952 1.977 8.758 .377 10.735-3.575 1.977-3.952 .377-8.758-3.575-10.735l-16-8c-3.952-1.977-8.758-.377-10.735 3.575-1.977 3.952-.377 8.758 3.575 10.735ZM216 112c1.239 0 2.461-.287 3.57-.84l16-8c3.952-1.977 5.552-6.783 3.575-10.735-1.977-3.952-6.783-5.552-10.735-3.575l-16 8c-3.314 1.663-5.051 5.386-4.196 8.995 .855 3.608 4.078 6.156 7.786 6.155ZM164.42 63.16c1.899 .951 4.098 1.108 6.112 .436 2.015-.672 3.679-2.116 4.628-4.016l8-16c1.977-3.954 .374-8.763-3.58-10.74-3.954-1.977-8.763-.374-10.74 3.58l-8 16c-.951 1.899-1.108 4.098-.436 6.112 .672 2.015 2.116 3.679 4.016 4.628Z"),
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
        return _sunHorizon!!
    }

private var _sunHorizon: ImageVector? = null
