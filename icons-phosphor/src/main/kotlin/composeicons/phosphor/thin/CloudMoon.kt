package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.CloudMoon: ImageVector
    get() {
        if (_cloudMoon != null) return _cloudMoon!!
        _cloudMoon = phosphorThinIcon(
            name = "CloudMoon",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M172 76c-5.384 .003-10.751 .61-16 1.81C155.015 46.969 133.387 20.656 103.32 13.72c-1.343-.308-2.751 .098-3.724 1.074-.974 .976-1.376 2.384-1.066 3.726 4.647 20.169-1.42 41.31-16.055 55.945C67.84 89.1 46.699 95.167 26.53 90.52c-1.345-.312-2.756 .092-3.732 1.068-.976 .976-1.38 2.387-1.068 3.732 4.468 19.203 17.027 35.533 34.44 44.78-12.559 14.121-15.664 34.297-7.932 51.541C55.971 208.884 73.102 219.986 92 220h80c39.764 0 72-32.236 72-72C244 108.235 211.764 76 172 76ZM31.22 99.44c2.912 .372 5.844 .559 8.78 .56 37.539-.039 67.961-30.461 68-68-.001-2.939-.188-5.875-.56-8.79C131.776 31.434 148.116 54.312 148 80v.11c-21.02 7.424-37.437 24.133-44.49 45.28C99.743 124.466 95.879 123.999 92 124c-10.743-.008-21.175 3.606-29.61 10.26C47.736 127.323 36.498 114.77 31.22 99.44ZM172 212h-80C76.577 211.988 62.535 203.11 55.91 189.183c-6.625-13.927-4.653-30.423 5.068-42.396 9.722-11.973 25.461-17.291 40.452-13.667-.743 3.509-1.221 7.069-1.43 10.65-.127 2.209 1.561 4.103 3.77 4.23 2.209 .127 4.103-1.561 4.23-3.77 .243-4.279 .913-8.524 2-12.67 0-.12 .07-.24 .09-.36 8.672-32.031 40.369-52.138 73.042-46.332 32.673 5.806 55.503 35.602 52.608 68.66C232.845 186.586 205.184 211.961 172 212Z"),
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
        return _cloudMoon!!
    }

private var _cloudMoon: ImageVector? = null
