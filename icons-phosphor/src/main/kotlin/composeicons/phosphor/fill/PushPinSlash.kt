package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.PushPinSlash: ImageVector
    get() {
        if (_pushPinSlash != null) return _pushPinSlash!!
        _pushPinSlash = phosphorFillIcon(
            name = "PushPinSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M235.33 104l-47.62 47.78c-.774 .774-1.831 1.197-2.925 1.17-1.094-.026-2.129-.5-2.865-1.31L108 70.27c-1.431-1.578-1.374-4.001 .13-5.51L152 20.7c3.001-3.001 7.071-4.688 11.315-4.688 4.244 0 8.314 1.686 11.315 4.688l60.69 60.68c6.246 6.245 6.251 16.37 .01 22.62ZM53.92 34.62C52.371 32.924 50.169 31.976 47.873 32.016c-2.296 .04-4.464 1.065-5.953 2.814-2.581 3.172-2.423 7.763 .37 10.75L67.32 73.15C58.26 75.09 48.2 79.37 38 87.63c-3.541 2.847-5.704 7.065-5.95 11.602-.246 4.537 1.448 8.964 4.66 12.178L85 159.71 42.55 202.14c-3.068 2.972-3.33 7.805-.6 11.09 1.453 1.682 3.54 2.684 5.761 2.766 2.221 .082 4.376-.765 5.949-2.336L96.29 171l48.29 48.29c2.998 3.011 7.071 4.705 11.32 4.71 .38 0 .75 0 1.13 0 4.615-.32 8.863-2.63 11.64-6.33 4.753-6.191 8.666-12.983 11.64-20.2l21.77 23.95c1.912 2.155 4.835 3.116 7.653 2.515 2.818-.601 5.095-2.67 5.961-5.418 .867-2.748 .189-5.749-1.774-7.858Z"),
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
        return _pushPinSlash!!
    }

private var _pushPinSlash: ImageVector? = null
