package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.HardDrive3Fill: ImageVector
    get() {
        if (_hardDrive3Fill != null) return _hardDrive3Fill!!
        _hardDrive3Fill = remixIcon(
            name = "HardDrive3Fill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 5.500 2.000 C 4.996 2.000 4.570 2.376 4.508 2.876 L 3.008 14.876 C 3.003 14.917 3.000 14.958 3.000 15.000 L 3.000 21.000 C 3.000 21.552 3.448 22.000 4.000 22.000 L 20.000 22.000 C 20.552 22.000 21.000 21.552 21.000 21.000 L 21.000 15.000 C 21.000 14.958 20.997 14.917 20.992 14.876 L 19.492 2.876 C 19.430 2.376 19.004 2.000 18.500 2.000 L 5.500 2.000 ZM 5.000 16.000 L 19.000 16.000 L 19.000 20.000 L 5.000 20.000 L 5.000 16.000 ZM 15.000 17.000 L 17.000 17.000 L 17.000 19.000 L 15.000 19.000 L 15.000 17.000 ZM 13.000 17.000 L 11.000 17.000 L 11.000 19.000 L 13.000 19.000 L 13.000 17.000 Z"),
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
        return _hardDrive3Fill!!
    }

private var _hardDrive3Fill: ImageVector? = null
