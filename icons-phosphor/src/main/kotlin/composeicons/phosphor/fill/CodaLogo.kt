package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.CodaLogo: ImageVector
    get() {
        if (_codaLogo != null) return _codaLogo!!
        _codaLogo = phosphorFillIcon(
            name = "CodaLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M136 128c0 22.091 17.909 40 40 40h.32c7.83 .3 14-1.46 21.24-6.11 3.693-2.349 8.371-2.501 12.209-.397 3.838 2.104 6.225 6.13 6.231 10.507v36c0 8.837-7.163 16-16 16h-144c-8.837 0-16-7.163-16-16v-160C40 39.163 47.163 32 56 32h144c8.837 0 16 7.163 16 16v36c-.002 4.384-2.396 8.419-6.243 10.522-3.847 2.104-8.535 1.942-12.227-.422C185.162 86.381 169.586 85.957 156.816 92.992 144.047 100.028 136.083 113.421 136 128Z"),
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
        return _codaLogo!!
    }

private var _codaLogo: ImageVector? = null
