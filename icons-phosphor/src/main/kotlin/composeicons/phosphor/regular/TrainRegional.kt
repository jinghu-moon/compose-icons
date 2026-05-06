package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.TrainRegional: ImageVector
    get() {
        if (_trainRegional != null) return _trainRegional!!
        _trainRegional = phosphorRegularIcon(
            name = "TrainRegional",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M223.72 117.9 201.33 35.79C199.431 28.828 193.107 23.998 185.89 24h-115.78C62.893 23.998 56.569 28.828 54.67 35.79L32.28 117.9c-.37 1.376-.37 2.824 0 4.2l22.39 82.11c1.899 6.962 8.223 11.792 15.44 11.79h9.89L65.6 235.2c-2.651 3.535-1.935 8.549 1.6 11.2 3.535 2.651 8.549 1.935 11.2-1.6L100 216h56l21.6 28.8c2.651 3.535 7.665 4.251 11.2 1.6 3.535-2.651 4.251-7.665 1.6-11.2L176 216h9.89c7.217 .002 13.541-4.828 15.44-11.79l22.39-82.11c.37-1.376 .37-2.824 0-4.2ZM70.11 40h115.78L206 113.69l-78 14.18L50 113.69ZM51.11 130.14 120 142.68v57.32h-49.89ZM185.89 200h-49.89v-57.32l68.94-12.54ZM88 88c0-4.418 3.582-8 8-8h64c4.418 0 8 3.582 8 8 0 4.418-3.582 8-8 8h-64c-4.418 0-8-3.582-8-8Z"),
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
