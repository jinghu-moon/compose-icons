package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.RobotFill: ImageVector
    get() {
        if (_robotFill != null) return _robotFill!!
        _robotFill = remixIcon(
            name = "RobotFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 13.000 4.055 C 17.500 4.552 21.000 8.367 21.000 13.000 L 21.000 22.000 L 3.000 22.000 L 3.000 13.000 C 3.000 8.367 6.500 4.552 11.000 4.055 L 11.000 1.000 L 13.000 1.000 L 13.000 4.055 ZM 12.000 18.000 C 14.761 18.000 17.000 15.761 17.000 13.000 C 17.000 10.239 14.761 8.000 12.000 8.000 C 9.239 8.000 7.000 10.239 7.000 13.000 C 7.000 15.761 9.239 18.000 12.000 18.000 ZM 12.000 16.000 C 10.343 16.000 9.000 14.657 9.000 13.000 C 9.000 11.343 10.343 10.000 12.000 10.000 C 13.657 10.000 15.000 11.343 15.000 13.000 C 15.000 14.657 13.657 16.000 12.000 16.000 ZM 12.000 14.000 C 12.552 14.000 13.000 13.552 13.000 13.000 C 13.000 12.448 12.552 12.000 12.000 12.000 C 11.448 12.000 11.000 12.448 11.000 13.000 C 11.000 13.552 11.448 14.000 12.000 14.000 Z"),
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
        return _robotFill!!
    }

private var _robotFill: ImageVector? = null
