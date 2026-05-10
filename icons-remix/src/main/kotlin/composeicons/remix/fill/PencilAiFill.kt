package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.PencilAiFill: ImageVector
    get() {
        if (_pencilAiFill != null) return _pencilAiFill!!
        _pencilAiFill = remixIcon(
            name = "PencilAiFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M17.143 11.097 7.242 20.996h-4.242v-4.242L12.899 6.854l4.243 4.242ZM16.436 3.318c.39-.39 1.024-.39 1.414 0l2.828 2.829c.39 .391 .39 1.024 0 1.414L18.557 9.683 14.314 5.44 16.436 3.318ZM4.529 1.319c.177-.426 .765-.426 .941 0l.253 .611c.432 1.043 1.238 1.875 2.251 2.326l.718 .319c.41 .183 .41 .78 0 .963l-.76 .338C6.945 6.316 6.153 7.119 5.714 8.128l-.247 .565c-.18 .414-.753 .414-.934 0L4.286 8.128C3.847 7.119 3.055 6.316 2.067 5.877L1.308 5.539c-.41-.183-.41-.78 0-.963l.718-.319C3.038 3.806 3.844 2.973 4.276 1.931l.253-.611Z"),
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
        return _pencilAiFill!!
    }

private var _pencilAiFill: ImageVector? = null
