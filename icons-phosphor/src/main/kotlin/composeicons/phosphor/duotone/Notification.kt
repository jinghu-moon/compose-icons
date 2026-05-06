package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Notification: ImageVector
    get() {
        if (_notification != null) return _notification!!
        _notification = phosphorDuotoneIcon(
            name = "Notification",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M224 60c0 15.464-12.536 28-28 28C180.536 88 168 75.464 168 60c0-15.464 12.536-28 28-28 15.464 0 28 12.536 28 28Z"),
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
                pathData = parseSvgPathData("M216 128v80c0 8.837-7.163 16-16 16h-152c-8.837 0-16-7.163-16-16v-152C32 47.163 39.163 40 48 40h80c4.418 0 8 3.582 8 8 0 4.418-3.582 8-8 8h-80v152h152v-80c0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8ZM232 60c0 19.882-16.118 36-36 36C176.118 96 160 79.882 160 60c0-19.882 16.118-36 36-36 19.882 0 36 16.118 36 36ZM216 60C216 48.954 207.046 40 196 40c-11.046 0-20 8.954-20 20 0 11.046 8.954 20 20 20 11.046 0 20-8.954 20-20Z"),
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
        return _notification!!
    }

private var _notification: ImageVector? = null
