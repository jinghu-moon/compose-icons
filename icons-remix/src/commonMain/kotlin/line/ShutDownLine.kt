package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.ShutDownLine: ImageVector
    get() {
        if (_shutDownLine != null) return _shutDownLine!!
        _shutDownLine = remixIcon(
            name = "ShutDownLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 6.265 3.807 L 7.412 5.446 C 5.349 6.892 4.000 9.289 4.000 12.000 C 4.000 16.418 7.582 20.000 12.000 20.000 C 16.418 20.000 20.000 16.418 20.000 12.000 C 20.000 9.289 18.651 6.892 16.588 5.446 L 17.735 3.807 C 20.314 5.616 22.000 8.611 22.000 12.000 C 22.000 17.523 17.523 22.000 12.000 22.000 C 6.477 22.000 2.000 17.523 2.000 12.000 C 2.000 8.611 3.686 5.616 6.265 3.807 ZM 11.000 12.000 L 11.000 2.000 L 13.000 2.000 L 13.000 12.000 L 11.000 12.000 Z"),
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
        return _shutDownLine!!
    }

private var _shutDownLine: ImageVector? = null
