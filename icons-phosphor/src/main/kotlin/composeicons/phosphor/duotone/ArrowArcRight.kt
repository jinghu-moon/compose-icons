package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.ArrowArcRight: ImageVector
    get() {
        if (_arrowArcRight != null) return _arrowArcRight!!
        _arrowArcRight = phosphorDuotoneIcon(
            name = "ArrowArcRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M232 88v64h-64Z"),
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
                pathData = parseSvgPathData("M235.06 80.61c-2.989-1.24-6.431-.557-8.72 1.73l-26.48 26.49C169.762 80.062 125.408 72.016 87.124 88.381 48.839 104.745 24.004 142.365 24 184c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8 .014-35.156 20.951-66.93 53.25-80.813 32.299-13.882 69.761-7.209 95.28 16.973l-26.19 26.18c-2.291 2.288-2.976 5.731-1.737 8.722 1.239 2.991 4.159 4.94 7.397 4.938h64c4.418 0 8-3.582 8-8v-64c-.001-3.236-1.95-6.152-4.94-7.39ZM224 144h-36.69L224 107.31Z"),
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
        return _arrowArcRight!!
    }

private var _arrowArcRight: ImageVector? = null
