package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.UserCircle: ImageVector
    get() {
        if (_userCircle != null) return _userCircle!!
        _userCircle = phosphorFillIcon(
            name = "UserCircle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M172 120c0 24.301-19.699 44-44 44C103.699 164 84 144.301 84 120 84 95.699 103.699 76 128 76c24.289 .028 43.972 19.711 44 44ZM232 128c0 57.438-46.562 104-104 104C70.562 232 24 185.438 24 128 24 70.562 70.562 24 128 24c57.412 .061 103.939 46.588 104 104ZM216 128c-.026-23.933-9.788-46.825-27.042-63.411C171.705 48.003 148.445 39.152 124.53 40.07 77.43 41.89 39.87 81.12 40 128.25c.045 21.455 7.958 42.149 22.24 58.16C68.056 177.974 75.444 170.739 84 165.1c1.499-.99 3.475-.859 4.83 .32 22.473 19.438 55.807 19.438 78.28 0 1.355-1.179 3.331-1.31 4.83-.32 8.566 5.636 15.965 12.871 21.79 21.31C208.082 170.34 216.011 149.546 216 128Z"),
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
        return _userCircle!!
    }

private var _userCircle: ImageVector? = null
