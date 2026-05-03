package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.CameraLine: ImageVector
    get() {
        if (_cameraLine != null) return _cameraLine!!
        _cameraLine = remixIcon(
            name = "CameraLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 9.828 5.000 L 7.828 7.000 L 4.000 7.000 L 4.000 19.000 L 20.000 19.000 L 20.000 7.000 L 16.172 7.000 L 14.172 5.000 L 9.828 5.000 ZM 9.000 3.000 L 15.000 3.000 L 17.000 5.000 L 21.000 5.000 C 21.552 5.000 22.000 5.448 22.000 6.000 L 22.000 20.000 C 22.000 20.552 21.552 21.000 21.000 21.000 L 3.000 21.000 C 2.448 21.000 2.000 20.552 2.000 20.000 L 2.000 6.000 C 2.000 5.448 2.448 5.000 3.000 5.000 L 7.000 5.000 L 9.000 3.000 ZM 12.000 18.000 C 8.962 18.000 6.500 15.538 6.500 12.500 C 6.500 9.462 8.962 7.000 12.000 7.000 C 15.038 7.000 17.500 9.462 17.500 12.500 C 17.500 15.538 15.038 18.000 12.000 18.000 ZM 12.000 16.000 C 13.933 16.000 15.500 14.433 15.500 12.500 C 15.500 10.567 13.933 9.000 12.000 9.000 C 10.067 9.000 8.500 10.567 8.500 12.500 C 8.500 14.433 10.067 16.000 12.000 16.000 Z"),
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
        return _cameraLine!!
    }

private var _cameraLine: ImageVector? = null
