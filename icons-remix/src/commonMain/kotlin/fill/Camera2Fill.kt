package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.Camera2Fill: ImageVector
    get() {
        if (_camera2Fill != null) return _camera2Fill!!
        _camera2Fill = remixIcon(
            name = "Camera2Fill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 2.000 3.993 C 2.000 3.445 2.455 3.000 2.992 3.000 L 21.008 3.000 C 21.556 3.000 22.000 3.445 22.000 3.993 L 22.000 20.007 C 22.000 20.555 21.545 21.000 21.008 21.000 L 2.992 21.000 C 2.444 21.000 2.000 20.555 2.000 20.007 L 2.000 3.993 ZM 12.000 15.000 C 10.343 15.000 9.000 13.657 9.000 12.000 C 9.000 10.343 10.343 9.000 12.000 9.000 C 13.657 9.000 15.000 10.343 15.000 12.000 C 15.000 13.657 13.657 15.000 12.000 15.000 ZM 12.000 17.000 C 14.761 17.000 17.000 14.761 17.000 12.000 C 17.000 9.239 14.761 7.000 12.000 7.000 C 9.239 7.000 7.000 9.239 7.000 12.000 C 7.000 14.761 9.239 17.000 12.000 17.000 ZM 18.000 5.000 L 18.000 7.000 L 20.000 7.000 L 20.000 5.000 L 18.000 5.000 Z"),
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
        return _camera2Fill!!
    }

private var _camera2Fill: ImageVector? = null
