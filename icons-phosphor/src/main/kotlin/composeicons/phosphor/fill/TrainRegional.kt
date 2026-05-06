package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.TrainRegional: ImageVector
    get() {
        if (_trainRegional != null) return _trainRegional!!
        _trainRegional = phosphorFillIcon(
            name = "TrainRegional",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M168 88c0 4.418-3.582 8-8 8h-64c-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8h64c4.418 0 8 3.582 8 8ZM223.72 122.1l-22.39 82.11c-1.899 6.962-8.223 11.792-15.44 11.79h-9.89l14.4 19.2c2.651 3.535 1.935 8.549-1.6 11.2-3.535 2.651-8.549 1.935-11.2-1.6L156 216h-56L78.4 244.8c-2.651 3.535-7.665 4.251-11.2 1.6-3.535-2.651-4.251-7.665-1.6-11.2L80 216h-9.89c-7.217 .002-13.541-4.828-15.44-11.79L32.28 122.1c-.37-1.376-.37-2.824 0-4.2L54.67 35.79C56.569 28.828 62.893 23.998 70.11 24h115.78c7.217-.002 13.541 4.828 15.44 11.79l22.39 82.11c.37 1.376 .37 2.824 0 4.2ZM136 152c0-4.418-3.582-8-8-8-4.418 0-8 3.582-8 8v40c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8ZM206 113.69 185.89 40h-115.78L50 113.69l78 14.18Z"),
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
        return _trainRegional!!
    }

private var _trainRegional: ImageVector? = null
