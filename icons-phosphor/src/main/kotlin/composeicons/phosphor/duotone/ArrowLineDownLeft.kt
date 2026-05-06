package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.ArrowLineDownLeft: ImageVector
    get() {
        if (_arrowLineDownLeft != null) return _arrowLineDownLeft!!
        _arrowLineDownLeft = phosphorDuotoneIcon(
            name = "ArrowLineDownLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M168 208h-96v-96Z"),
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
                pathData = parseSvgPathData("M232 48c0 4.418-3.582 8-8 8h-176c-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8h176c4.418 0 8 3.582 8 8ZM189.66 90.34c1.502 1.501 2.346 3.537 2.346 5.66 0 2.123-.844 4.159-2.346 5.66L131.31 160l42.35 42.34c2.291 2.288 2.976 5.731 1.737 8.722-1.239 2.991-4.159 4.94-7.397 4.938h-96c-4.418 0-8-3.582-8-8v-96c-.003-3.238 1.947-6.158 4.938-7.397 2.991-1.239 6.434-.554 8.722 1.737L120 148.69 178.34 90.34c1.501-1.502 3.537-2.346 5.66-2.346 2.123 0 4.159 .844 5.66 2.346ZM148.69 200 114.35 165.66h0L80 131.31v68.69Z"),
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
        return _arrowLineDownLeft!!
    }

private var _arrowLineDownLeft: ImageVector? = null
