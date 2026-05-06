package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.AppStoreLogo: ImageVector
    get() {
        if (_appStoreLogo != null) return _appStoreLogo!!
        _appStoreLogo = phosphorThinIcon(
            name = "AppStoreLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M60.9 194l-9.46 16c-.629 1.391-1.995 2.303-3.521 2.351-1.526 .047-2.946-.778-3.66-2.128-.714-1.35-.597-2.988 .301-4.223L54 190c1.185-1.719 3.493-2.238 5.3-1.19 1.806 1.047 2.503 3.308 1.6 5.19ZM232 156h-50.08L150 102c-1.124-1.903-3.577-2.534-5.48-1.41-1.903 1.124-2.534 3.577-1.41 5.48L204.56 210c.696 1.291 2.043 2.098 3.51 2.102 1.467 .004 2.818-.796 3.521-2.083 .703-1.288 .645-2.857-.152-4.088l-24.79-42h45.35c2.209 0 4-1.791 4-4 0-2.209-1.791-4-4-4ZM142.47 156h-59.1L155.44 34c.898-1.235 1.015-2.873 .301-4.223-.714-1.35-2.134-2.175-3.66-2.128-1.526 .047-2.892 .959-3.521 2.351L128 64.75 107.44 30c-.629-1.391-1.995-2.303-3.521-2.351-1.526-.047-2.946 .778-3.66 2.128-.714 1.35-.597 2.988 .301 4.223l22.79 38.58L74.08 156h-50.08c-2.209 0-4 1.791-4 4 0 2.209 1.791 4 4 4h118.47c2.209 0 4-1.791 4-4 0-2.209-1.791-4-4-4Z"),
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
