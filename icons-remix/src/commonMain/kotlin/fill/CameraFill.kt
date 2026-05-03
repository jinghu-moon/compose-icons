package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.CameraFill: ImageVector
    get() {
        if (_cameraFill != null) return _cameraFill!!
        _cameraFill = remixIcon(
            name = "CameraFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 9.000 3.000 L 15.000 3.000 L 17.000 5.000 L 21.000 5.000 C 21.552 5.000 22.000 5.448 22.000 6.000 L 22.000 20.000 C 22.000 20.552 21.552 21.000 21.000 21.000 L 3.000 21.000 C 2.448 21.000 2.000 20.552 2.000 20.000 L 2.000 6.000 C 2.000 5.448 2.448 5.000 3.000 5.000 L 7.000 5.000 L 9.000 3.000 ZM 12.000 19.000 C 15.314 19.000 18.000 16.314 18.000 13.000 C 18.000 9.686 15.314 7.000 12.000 7.000 C 8.686 7.000 6.000 9.686 6.000 13.000 C 6.000 16.314 8.686 19.000 12.000 19.000 ZM 12.000 17.000 C 9.791 17.000 8.000 15.209 8.000 13.000 C 8.000 10.791 9.791 9.000 12.000 9.000 C 14.209 9.000 16.000 10.791 16.000 13.000 C 16.000 15.209 14.209 17.000 12.000 17.000 Z"),
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
        return _cameraFill!!
    }

private var _cameraFill: ImageVector? = null
