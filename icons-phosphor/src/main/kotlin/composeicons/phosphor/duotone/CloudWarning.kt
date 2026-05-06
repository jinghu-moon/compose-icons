package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.CloudWarning: ImageVector
    get() {
        if (_cloudWarning != null) return _cloudWarning!!
        _cloudWarning = phosphorDuotoneIcon(
            name = "CloudWarning",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M240 127.62c0 44.183-35.817 80-80 80h-88C50.325 207.593 30.612 195.061 21.39 175.446c-9.222-19.615-6.296-42.791 7.512-59.499C42.709 99.239 64.919 91.999 85.92 97.36v.1C100.357 62.048 137.838 41.806 175.368 49.152c37.53 7.346 64.612 40.226 64.632 78.468Z"),
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
                pathData = parseSvgPathData("M160 40C126.668 40.026 96.206 58.862 81.29 88.67 57.575 85.211 33.915 95.292 19.981 114.792 6.048 134.291 4.177 159.941 15.132 181.256 26.088 202.572 48.034 215.98 72 216h88c48.601 0 88-39.399 88-88C248 79.399 208.601 40 160 40ZM160 200h-88C45.49 200 24 178.51 24 152c0-26.51 21.49-48 48-48 1.1 0 2.2 0 3.29 .11C73.102 111.885 71.995 119.923 72 128c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8C88 88.235 120.235 56 160 56c39.764 0 72 32.235 72 72 0 39.764-32.236 72-72 72ZM152 128v-40c0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8v40c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8ZM172 164c0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12 0-6.627 5.373-12 12-12 6.627 0 12 5.373 12 12Z"),
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
        return _cloudWarning!!
    }

private var _cloudWarning: ImageVector? = null
