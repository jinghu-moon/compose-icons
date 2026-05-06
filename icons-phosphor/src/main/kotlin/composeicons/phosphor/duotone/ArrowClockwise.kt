package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.ArrowClockwise: ImageVector
    get() {
        if (_arrowClockwise != null) return _arrowClockwise!!
        _arrowClockwise = phosphorDuotoneIcon(
            name = "ArrowClockwise",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M216 128c0 48.601-39.399 88-88 88C79.399 216 40 176.601 40 128 40 79.399 79.399 40 128 40c48.601 0 88 39.399 88 88Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.2f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
            addPath(
                pathData = parseSvgPathData("M240 56v48c0 4.418-3.582 8-8 8h-48c-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8h27.4L184.81 71.64l-.25-.24C153.529 40.381 103.304 40.144 71.981 70.868 40.659 101.593 39.928 151.813 70.344 183.436c30.415 31.623 80.626 32.847 112.546 2.744 3.212-3.038 8.277-2.897 11.315 .315 3.038 3.212 2.897 8.277-.315 11.315C176.105 214.677 152.512 224.055 128 224h-1.32C83.419 223.407 45.9 193.95 35.058 152.066 24.216 110.181 42.731 66.22 80.271 44.712 117.811 23.204 165.1 29.464 195.75 60L224 85.8v-29.8c0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8Z"),
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
        return _arrowClockwise!!
    }

private var _arrowClockwise: ImageVector? = null
