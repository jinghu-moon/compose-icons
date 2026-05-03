package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.OpenArmLine: ImageVector
    get() {
        if (_openArmLine != null) return _openArmLine!!
        _openArmLine = remixIcon(
            name = "OpenArmLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 18.000 17.000 L 18.000 22.000 L 16.000 22.000 L 16.000 17.000 C 16.000 12.549 18.644 8.715 22.448 6.984 L 23.275 8.805 C 20.164 10.221 18.000 13.358 18.000 17.000 ZM 8.000 17.000 L 8.000 22.000 L 6.000 22.000 L 6.000 17.000 C 6.000 13.358 3.837 10.221 0.726 8.805 L 1.553 6.984 C 5.357 8.715 8.000 12.549 8.000 17.000 ZM 12.000 12.000 C 9.239 12.000 7.000 9.761 7.000 7.000 C 7.000 4.239 9.239 2.000 12.000 2.000 C 14.762 2.000 17.000 4.239 17.000 7.000 C 17.000 9.761 14.762 12.000 12.000 12.000 ZM 12.000 10.000 C 13.657 10.000 15.000 8.657 15.000 7.000 C 15.000 5.343 13.657 4.000 12.000 4.000 C 10.344 4.000 9.000 5.343 9.000 7.000 C 9.000 8.657 10.344 10.000 12.000 10.000 Z"),
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
        return _openArmLine!!
    }

private var _openArmLine: ImageVector? = null
