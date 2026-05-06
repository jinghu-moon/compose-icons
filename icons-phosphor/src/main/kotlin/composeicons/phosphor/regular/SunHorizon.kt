package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.SunHorizon: ImageVector
    get() {
        if (_sunHorizon != null) return _sunHorizon!!
        _sunHorizon = phosphorRegularIcon(
            name = "SunHorizon",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M240 152h-40.45c.295-2.657 .445-5.327 .45-8C200 104.235 167.764 72 128 72 88.235 72 56 104.235 56 144c.005 2.673 .155 5.343 .45 8h-40.45c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8h224c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8ZM72 144c-.04-20.992 11.663-40.243 30.317-49.87 18.654-9.627 41.125-8.014 58.212 4.18 17.087 12.194 25.92 32.92 22.881 53.69h-110.82c-.387-2.649-.584-5.323-.59-8ZM216 200c0 4.418-3.582 8-8 8h-160c-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8h160c4.418 0 8 3.582 8 8ZM72.84 43.58c-1.977-3.954-.374-8.763 3.58-10.74 3.954-1.977 8.763-.374 10.74 3.58l8 16c1.977 3.954 .374 8.763-3.58 10.74-3.954 1.977-8.763 .374-10.74-3.58ZM16.84 92.42c.95-1.898 2.616-3.341 4.63-4.01 2.014-.67 4.212-.511 6.11 .44l16 8c3.952 1.977 5.552 6.783 3.575 10.735-1.977 3.952-6.783 5.552-10.735 3.575l-16-8c-1.9-.948-3.345-2.613-4.016-4.628-.672-2.015-.515-4.213 .436-6.112ZM208.84 107.58c-1.973-3.952-.371-8.755 3.58-10.73l16-8c3.952-1.977 8.758-.377 10.735 3.575 1.977 3.952 .377 8.758-3.575 10.735l-16 8c-1.899 .951-4.098 1.108-6.112 .436-2.015-.672-3.679-2.116-4.628-4.016ZM160.84 52.42l8-16c1.977-3.954 6.786-5.557 10.74-3.58 3.954 1.977 5.557 6.786 3.58 10.74l-8 16c-1.977 3.954-6.786 5.557-10.74 3.58-3.954-1.977-5.557-6.786-3.58-10.74Z"),
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
