package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.MailVolumeFill: ImageVector
    get() {
        if (_mailVolumeFill != null) return _mailVolumeFill!!
        _mailVolumeFill = remixIcon(
            name = "MailVolumeFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 20.000 14.500 L 20.000 23.500 L 16.667 21.000 L 14.000 21.000 L 14.000 17.000 L 16.667 17.000 L 20.000 14.500 ZM 21.000 3.000 C 21.552 3.000 22.000 3.448 22.000 4.000 L 22.001 14.529 C 20.939 13.578 19.537 13.000 18.000 13.000 C 14.686 13.000 12.000 15.686 12.000 19.000 C 12.000 19.701 12.120 20.375 12.342 21.001 L 3.000 21.000 C 2.448 21.000 2.000 20.552 2.000 20.000 L 2.000 4.000 C 2.000 3.448 2.448 3.000 3.000 3.000 L 21.000 3.000 ZM 21.000 17.000 C 22.105 17.000 23.000 17.895 23.000 19.000 C 23.000 20.054 22.184 20.918 21.149 20.994 L 21.000 21.000 L 21.000 17.000 ZM 5.647 6.238 L 4.353 7.762 L 12.073 14.317 L 19.654 7.756 L 18.346 6.244 L 12.060 11.682 L 5.647 6.238 Z"),
        pathFillType = PathFillType.NonZero,
        fill = SolidColor(Color(0xFF000000)),
        fillAlpha = 1.0f,
        stroke = null,
        strokeAlpha = 1.0f,
        strokeLineWidth = 0.0f,
        strokeLineCap = StrokeCap.Butt,
        strokeLineJoin = StrokeJoin.Miter,
    )
        }
        return _mailVolumeFill!!
    }

private var _mailVolumeFill: ImageVector? = null
