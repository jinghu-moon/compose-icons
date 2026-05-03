package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.DriveFill: ImageVector
    get() {
        if (_driveFill != null) return _driveFill!!
        _driveFill = remixIcon(
            name = "DriveFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 7.940 4.146 L 11.422 10.176 L 5.482 20.469 L 2.000 14.440 L 7.940 4.146 ZM 10.116 14.440 L 22.000 14.440 L 18.518 20.469 L 6.635 20.469 L 10.116 14.440 ZM 14.459 13.440 L 8.518 3.145 L 15.482 3.145 L 21.423 13.440 L 14.459 13.440 Z"),
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
        return _driveFill!!
    }

private var _driveFill: ImageVector? = null
