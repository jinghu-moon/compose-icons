package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.AppStoreLogo: ImageVector
    get() {
        if (_appStoreLogo != null) return _appStoreLogo!!
        _appStoreLogo = phosphorFillIcon(
            name = "AppStoreLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M128 24C70.562 24 24 70.562 24 128c0 57.438 46.562 104 104 104 57.438 0 104-46.562 104-104C231.939 70.588 185.412 24.061 128 24ZM83.66 180.12l-4.8 8c-2.275 3.789-7.191 5.015-10.98 2.74-3.789-2.275-5.015-7.191-2.74-10.98l4.8-8c2.275-3.789 7.191-5.015 10.98-2.74 3.789 2.275 5.015 7.191 2.74 10.98ZM128 152h-72c-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8h35.47L118.67 90.67 105.14 68.12c-2.275-3.789-1.049-8.705 2.74-10.98 3.789-2.275 8.705-1.049 10.98 2.74L128 75.12l9.14-15.24c2.275-3.789 7.191-5.015 10.98-2.74 3.789 2.275 5.015 7.191 2.74 10.98L110.13 136h17.87c4.418 0 8 3.582 8 8 0 4.418-3.582 8-8 8ZM200 152h-25.87l16.73 27.88c2.275 3.789 1.049 8.705-2.74 10.98-3.789 2.275-8.705 1.049-10.98-2.74L138.74 124.12c-2.275-3.789-1.049-8.705 2.74-10.98 3.789-2.275 8.705-1.049 10.98 2.74L164.53 136h35.47c4.418 0 8 3.582 8 8 0 4.418-3.582 8-8 8Z"),
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
        return _appStoreLogo!!
    }

private var _appStoreLogo: ImageVector? = null
