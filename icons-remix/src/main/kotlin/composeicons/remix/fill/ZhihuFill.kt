package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.ZhihuFill: ImageVector
    get() {
        if (_zhihuFill != null) return _zhihuFill!!
        _zhihuFill = remixIcon(
            name = "ZhihuFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M13.373 18.896l1.452 0 .478 1.637 2.605-1.637h3.071v-13.502h-7.606v13.502ZM14.919 6.86h4.515v10.571h-1.732l-1.73 1.087-.315-1.084-.738-.002v-10.571l-0-0ZM12.09 11.573h-3.244C8.954 9.891 8.982 8.371 8.982 7.013h3.172c0 0 .122-1.4-.532-1.384h-5.487c.216-.814 .488-1.655 .813-2.524 0 0-1.493 0-2.001 1.339C4.738 4.996 4.129 7.121 3.045 9.292 3.41 9.252 4.618 9.219 5.329 7.914c.131-.365 .156-.413 .318-.902h1.79c0 .651-.074 4.151-.104 4.558h-3.24c-.728 0-.965 1.466-.965 1.466h4.066c-.273 3.095-1.737 5.703-4.393 7.764 1.27 .363 2.536-.058 3.162-.615 0 0 1.425-1.297 2.206-4.298l3.346 4.031c0 0 .491-1.669-.077-2.482C10.967 16.883 9.698 15.385 9.157 14.842l-.907 .72c.27-.868 .433-1.71 .488-2.525h3.822c0 0-.005-1.466-.471-1.466v.001Z"),
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
        return _zhihuFill!!
    }

private var _zhihuFill: ImageVector? = null
