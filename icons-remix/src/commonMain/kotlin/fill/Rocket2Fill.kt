package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.Rocket2Fill: ImageVector
    get() {
        if (_rocket2Fill != null) return _rocket2Fill!!
        _rocket2Fill = remixIcon(
            name = "Rocket2Fill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 8.498 20.005 L 15.502 20.005 C 14.843 21.584 13.579 22.848 12.000 23.507 C 10.421 22.848 9.157 21.584 8.498 20.005 ZM 18.000 14.809 L 20.000 17.078 L 20.000 19.005 L 4.000 19.005 L 4.000 17.078 L 6.000 14.809 L 6.000 9.005 C 6.000 5.522 8.504 2.558 12.000 1.460 C 15.496 2.558 18.000 5.522 18.000 9.005 L 18.000 14.809 ZM 12.000 11.005 C 13.105 11.005 14.000 10.109 14.000 9.005 C 14.000 7.900 13.105 7.005 12.000 7.005 C 10.895 7.005 10.000 7.900 10.000 9.005 C 10.000 10.109 10.895 11.005 12.000 11.005 Z"),
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
        return _rocket2Fill!!
    }

private var _rocket2Fill: ImageVector? = null
