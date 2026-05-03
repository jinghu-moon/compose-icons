package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.Image2Line: ImageVector
    get() {
        if (_image2Line != null) return _image2Line!!
        _image2Line = remixIcon(
            name = "Image2Line",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 5.000 11.101 L 7.000 9.101 L 12.500 14.601 L 16.000 11.101 L 19.000 14.101 L 19.000 5.000 L 5.000 5.000 L 5.000 11.101 ZM 5.000 13.929 L 5.000 19.000 L 8.101 19.000 L 11.086 16.015 L 7.000 11.929 L 5.000 13.929 ZM 10.929 19.000 L 19.000 19.000 L 19.000 16.929 L 16.000 13.929 L 10.929 19.000 ZM 4.000 3.000 L 20.000 3.000 C 20.552 3.000 21.000 3.448 21.000 4.000 L 21.000 20.000 C 21.000 20.552 20.552 21.000 20.000 21.000 L 4.000 21.000 C 3.448 21.000 3.000 20.552 3.000 20.000 L 3.000 4.000 C 3.000 3.448 3.448 3.000 4.000 3.000 ZM 15.500 10.000 C 14.672 10.000 14.000 9.328 14.000 8.500 C 14.000 7.672 14.672 7.000 15.500 7.000 C 16.328 7.000 17.000 7.672 17.000 8.500 C 17.000 9.328 16.328 10.000 15.500 10.000 Z"),
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
        return _image2Line!!
    }

private var _image2Line: ImageVector? = null
