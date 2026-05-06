package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.LiveFill: ImageVector
    get() {
        if (_liveFill != null) return _liveFill!!
        _liveFill = remixIcon(
            name = "LiveFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M16 4c.552 0 1 .448 1 1v4.2L22.213 5.551c.226-.158 .538-.103 .696 .123 .059 .084 .09 .184 .09 .287v12.079c0 .276-.224 .5-.5 .5-.103 0-.203-.032-.287-.09L17 14.8v4.2c0 .552-.448 1-1 1h-14C1.448 20 1 19.552 1 19v-14C1 4.448 1.448 4 2 4h14ZM7.4 8.829c-.193 0-.355 .137-.392 .319L7 9.229v5.543c0 .076 .022 .151 .063 .215 .104 .163 .306 .226 .48 .159l.072-.036 4.355-2.771c.049-.031 .091-.073 .123-.123 .104-.163 .075-.373-.059-.502l-.064-.05L7.615 8.891C7.551 8.85 7.476 8.829 7.4 8.829Z"),
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
        return _liveFill!!
    }

private var _liveFill: ImageVector? = null
