package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.ArrowsInCardinal: ImageVector
    get() {
        if (_arrowsInCardinal != null) return _arrowsInCardinal!!
        _arrowsInCardinal = phosphorFillIcon(
            name = "ArrowsInCardinal",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M101.66 133.66l-32 32c-2.288 2.291-5.731 2.976-8.722 1.737C57.947 166.158 55.997 163.238 56 160v-24h-32c-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8h32v-24c-.003-3.238 1.947-6.158 4.938-7.397 2.991-1.239 6.434-.554 8.722 1.737l32 32c1.502 1.501 2.346 3.537 2.346 5.66 0 2.123-.844 4.159-2.346 5.66ZM122.34 101.66c1.501 1.502 3.537 2.346 5.66 2.346 2.123 0 4.159-.844 5.66-2.346l32-32c2.291-2.288 2.976-5.731 1.737-8.722C166.158 57.947 163.238 55.997 160 56h-24v-32c0-4.418-3.582-8-8-8-4.418 0-8 3.582-8 8v32h-24c-3.238-.003-6.158 1.947-7.397 4.938-1.239 2.991-.554 6.434 1.737 8.722ZM133.66 154.34c-1.501-1.502-3.537-2.346-5.66-2.346-2.123 0-4.159 .844-5.66 2.346l-32 32c-2.291 2.288-2.976 5.731-1.737 8.722 1.239 2.991 4.159 4.94 7.397 4.938h24v32c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8v-32h24c3.238 .003 6.158-1.947 7.397-4.938 1.239-2.991 .554-6.434-1.737-8.722ZM232 120h-32v-24c.003-3.238-1.947-6.158-4.938-7.397-2.991-1.239-6.434-.554-8.722 1.737l-32 32c-1.502 1.501-2.346 3.537-2.346 5.66 0 2.123 .844 4.159 2.346 5.66l32 32c2.288 2.291 5.731 2.976 8.722 1.737 2.991-1.239 4.94-4.159 4.938-7.397v-24h32c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8Z"),
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
        return _arrowsInCardinal!!
    }

private var _arrowsInCardinal: ImageVector? = null
