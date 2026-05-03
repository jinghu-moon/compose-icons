package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.Robot2Line: ImageVector
    get() {
        if (_robot2Line != null) return _robot2Line!!
        _robot2Line = remixIcon(
            name = "Robot2Line",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 13.500 2.000 C 13.500 2.444 13.307 2.843 13.000 3.118 L 13.000 5.000 L 18.000 5.000 C 19.657 5.000 21.000 6.343 21.000 8.000 L 21.000 18.000 C 21.000 19.657 19.657 21.000 18.000 21.000 L 6.000 21.000 C 4.343 21.000 3.000 19.657 3.000 18.000 L 3.000 8.000 C 3.000 6.343 4.343 5.000 6.000 5.000 L 11.000 5.000 L 11.000 3.118 C 10.693 2.843 10.500 2.444 10.500 2.000 C 10.500 1.172 11.172 0.500 12.000 0.500 C 12.828 0.500 13.500 1.172 13.500 2.000 ZM 6.000 7.000 C 5.448 7.000 5.000 7.448 5.000 8.000 L 5.000 18.000 C 5.000 18.552 5.448 19.000 6.000 19.000 L 18.000 19.000 C 18.552 19.000 19.000 18.552 19.000 18.000 L 19.000 8.000 C 19.000 7.448 18.552 7.000 18.000 7.000 L 13.000 7.000 L 11.000 7.000 L 6.000 7.000 ZM 2.000 10.000 L 0.000 10.000 L 0.000 16.000 L 2.000 16.000 L 2.000 10.000 ZM 22.000 10.000 L 24.000 10.000 L 24.000 16.000 L 22.000 16.000 L 22.000 10.000 ZM 9.000 14.500 C 9.828 14.500 10.500 13.828 10.500 13.000 C 10.500 12.172 9.828 11.500 9.000 11.500 C 8.172 11.500 7.500 12.172 7.500 13.000 C 7.500 13.828 8.172 14.500 9.000 14.500 ZM 15.000 14.500 C 15.828 14.500 16.500 13.828 16.500 13.000 C 16.500 12.172 15.828 11.500 15.000 11.500 C 14.172 11.500 13.500 12.172 13.500 13.000 C 13.500 13.828 14.172 14.500 15.000 14.500 Z"),
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
        return _robot2Line!!
    }

private var _robot2Line: ImageVector? = null
