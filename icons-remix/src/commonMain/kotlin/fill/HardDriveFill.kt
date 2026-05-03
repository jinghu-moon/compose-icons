package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.HardDriveFill: ImageVector
    get() {
        if (_hardDriveFill != null) return _hardDriveFill!!
        _hardDriveFill = remixIcon(
            name = "HardDriveFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 13.951 2.000 L 20.000 2.000 C 20.552 2.000 21.000 2.448 21.000 3.000 L 21.000 21.000 C 21.000 21.552 20.552 22.000 20.000 22.000 L 4.000 22.000 C 3.448 22.000 3.000 21.552 3.000 21.000 L 3.000 12.951 C 3.329 12.983 3.662 13.000 4.000 13.000 C 9.523 13.000 14.000 8.523 14.000 3.000 C 14.000 2.662 13.983 2.329 13.951 2.000 ZM 15.000 16.000 L 15.000 18.000 L 17.000 18.000 L 17.000 16.000 L 15.000 16.000 ZM 11.938 2.000 C 11.979 2.328 12.000 2.661 12.000 3.000 C 12.000 7.418 8.418 11.000 4.000 11.000 C 3.661 11.000 3.328 10.979 3.000 10.938 L 3.000 3.000 C 3.000 2.448 3.448 2.000 4.000 2.000 L 11.938 2.000 Z"),
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
        return _hardDriveFill!!
    }

private var _hardDriveFill: ImageVector? = null
