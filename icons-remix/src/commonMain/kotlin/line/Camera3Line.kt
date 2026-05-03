package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.Camera3Line: ImageVector
    get() {
        if (_camera3Line != null) return _camera3Line!!
        _camera3Line = remixIcon(
            name = "Camera3Line",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 2.000 6.001 C 2.000 5.448 2.455 5.000 2.992 5.000 L 21.008 5.000 C 21.556 5.000 22.000 5.445 22.000 6.001 L 22.000 19.999 C 22.000 20.552 21.545 21.000 21.008 21.000 L 2.992 21.000 C 2.444 21.000 2.000 20.555 2.000 19.999 L 2.000 6.001 ZM 4.000 7.000 L 4.000 19.000 L 20.000 19.000 L 20.000 7.000 L 4.000 7.000 ZM 14.000 16.000 C 15.657 16.000 17.000 14.657 17.000 13.000 C 17.000 11.343 15.657 10.000 14.000 10.000 C 12.343 10.000 11.000 11.343 11.000 13.000 C 11.000 14.657 12.343 16.000 14.000 16.000 ZM 14.000 18.000 C 11.239 18.000 9.000 15.761 9.000 13.000 C 9.000 10.239 11.239 8.000 14.000 8.000 C 16.761 8.000 19.000 10.239 19.000 13.000 C 19.000 15.761 16.761 18.000 14.000 18.000 ZM 4.000 2.000 L 10.000 2.000 L 10.000 4.000 L 4.000 4.000 L 4.000 2.000 Z"),
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
        return _camera3Line!!
    }

private var _camera3Line: ImageVector? = null
