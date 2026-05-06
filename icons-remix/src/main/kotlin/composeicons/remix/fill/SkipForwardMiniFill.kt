package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.SkipForwardMiniFill: ImageVector
    get() {
        if (_skipForwardMiniFill != null) return _skipForwardMiniFill!!
        _skipForwardMiniFill = remixIcon(
            name = "SkipForwardMiniFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M7.788 17.444c-.084 .06-.185 .091-.288 .091C7.224 17.535 7 17.311 7 17.035v-10.07c0-.103 .032-.204 .092-.288 .159-.226 .471-.279 .697-.12l7.133 5.035c.047 .033 .087 .073 .12 .12 .159 .226 .105 .537-.12 .697L7.788 17.444ZM16 7c0-.552 .448-1 1-1 .552 0 1 .448 1 1v10c0 .552-.448 1-1 1-.552 0-1-.448-1-1v-10Z"),
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
        return _skipForwardMiniFill!!
    }

private var _skipForwardMiniFill: ImageVector? = null
