package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.MicLine: ImageVector
    get() {
        if (_micLine != null) return _micLine!!
        _micLine = remixIcon(
            name = "MicLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 12.000 3.000 C 10.343 3.000 9.000 4.343 9.000 6.000 L 9.000 10.000 C 9.000 11.657 10.343 13.000 12.000 13.000 C 13.657 13.000 15.000 11.657 15.000 10.000 L 15.000 6.000 C 15.000 4.343 13.657 3.000 12.000 3.000 ZM 12.000 1.000 C 14.761 1.000 17.000 3.239 17.000 6.000 L 17.000 10.000 C 17.000 12.761 14.761 15.000 12.000 15.000 C 9.238 15.000 7.000 12.761 7.000 10.000 L 7.000 6.000 C 7.000 3.239 9.238 1.000 12.000 1.000 ZM 3.055 11.000 L 5.071 11.000 C 5.556 14.392 8.473 17.000 12.000 17.000 C 15.526 17.000 18.444 14.392 18.929 11.000 L 20.945 11.000 C 20.484 15.172 17.171 18.484 13.000 18.945 L 13.000 23.000 L 11.000 23.000 L 11.000 18.945 C 6.828 18.484 3.516 15.172 3.055 11.000 Z"),
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
        return _micLine!!
    }

private var _micLine: ImageVector? = null
