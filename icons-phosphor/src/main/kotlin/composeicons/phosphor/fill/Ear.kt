package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Ear: ImageVector
    get() {
        if (_ear != null) return _ear!!
        _ear = phosphorFillIcon(
            name = "Ear",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M128 24C70.562 24 24 70.562 24 128c0 57.438 46.562 104 104 104 57.438 0 104-46.562 104-104C231.939 70.588 185.412 24.061 128 24ZM148 152c.452-.001 .901-.076 1.33-.22 4.138-1.385 8.623 .803 10.08 4.916 1.457 4.114-.652 8.636-4.74 10.164-6.122 2.166-12.915 1.224-18.218-2.525C131.15 160.585 127.998 154.494 128 148c0-8.85 4.77-15.23 9-20.87 3.77-5 7-9.38 7-15.13 0-8.837-7.163-16-16-16-8.837 0-16 7.163-16 16 0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8C96 94.327 110.327 80 128 80c17.673 0 32 14.327 32 32 0 11.07-5.66 18.63-10.2 24.71C146.2 141.52 144 144.64 144 148c0 2.209 1.791 4 4 4ZM184 120c-4.418 0-8-3.582-8-8C176 85.49 154.51 64 128 64 101.49 64 80 85.49 80 112c0 11.9 6.71 20.5 13.82 29.6 7 8.92 14.18 18.15 14.18 30.4-.003 8.054 4.826 15.324 12.251 18.445 7.425 3.121 15.997 1.483 21.749-4.155 2.014-2.129 5.031-2.986 7.863-2.235 2.832 .751 5.027 2.992 5.721 5.839 .694 2.847-.225 5.846-2.394 7.816-10.353 10.14-25.775 13.084-39.135 7.47C100.695 199.567 92.004 186.491 92 172c0-6.74-5-13.14-10.79-20.55C73.54 141.63 64 129.41 64 112 64 76.654 92.654 48 128 48c35.346 0 64 28.654 64 64 0 4.418-3.582 8-8 8Z"),
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
        return _ear!!
    }

private var _ear: ImageVector? = null
