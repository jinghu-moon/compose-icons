package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.CloudCheck: ImageVector
    get() {
        if (_cloudCheck != null) return _cloudCheck!!
        _cloudCheck = phosphorDuotoneIcon(
            name = "CloudCheck",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M240 128c0 44.183-35.817 80-80 80h-88C50.325 207.973 30.612 195.441 21.39 175.826c-9.222-19.615-6.296-42.791 7.512-59.499C42.709 99.619 64.919 92.379 85.92 97.74v.1C100.357 62.428 137.838 42.186 175.368 49.532 212.898 56.878 239.98 89.758 240 128Z"),
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
                pathData = parseSvgPathData("M160 40C126.668 40.026 96.206 58.862 81.29 88.67 57.575 85.211 33.915 95.292 19.981 114.792 6.048 134.291 4.177 159.941 15.132 181.256 26.088 202.572 48.034 215.98 72 216h88c48.601 0 88-39.399 88-88C248 79.399 208.601 40 160 40ZM160 200h-88C45.49 200 24 178.51 24 152c0-26.51 21.49-48 48-48 1.1 0 2.2 0 3.29 .11C73.102 111.885 71.995 119.923 72 128c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8C88 88.235 120.235 56 160 56c39.764 0 72 32.235 72 72 0 39.764-32.236 72-72 72ZM197.66 106.34c1.502 1.501 2.346 3.537 2.346 5.66 0 2.123-.844 4.159-2.346 5.66l-48 48c-1.501 1.502-3.537 2.346-5.66 2.346-2.123 0-4.159-.844-5.66-2.346l-24-24c-3.126-3.126-3.126-8.194 0-11.32 3.126-3.126 8.194-3.126 11.32 0L144 148.69l42.34-42.35c1.501-1.502 3.537-2.346 5.66-2.346 2.123 0 4.159 .844 5.66 2.346Z"),
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
        return _cloudCheck!!
    }

private var _cloudCheck: ImageVector? = null
