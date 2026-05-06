package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.LiveLine: ImageVector
    get() {
        if (_liveLine != null) return _liveLine!!
        _liveLine = remixIcon(
            name = "LiveLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M16 4c.552 0 1 .448 1 1v4.2L22.213 5.551c.226-.158 .538-.103 .696 .123 .059 .084 .09 .184 .09 .287v12.079c0 .276-.224 .5-.5 .5-.103 0-.203-.032-.287-.09L17 14.8v4.2c0 .552-.448 1-1 1h-14C1.448 20 1 19.552 1 19v-14C1 4.448 1.448 4 2 4h14ZM15 6h-12v12h12v-12ZM7.4 8.829c.076 0 .151 .022 .215 .063l4.355 2.771c.186 .119 .241 .366 .123 .552-.031 .049-.073 .091-.123 .123L7.615 15.109c-.186 .119-.434 .064-.552-.123C7.022 14.922 7 14.847 7 14.771v-5.543c0-.221 .179-.4 .4-.4ZM21 8.841l-4 2.8v.718l4 2.8v-6.317Z"),
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
        return _liveLine!!
    }

private var _liveLine: ImageVector? = null
