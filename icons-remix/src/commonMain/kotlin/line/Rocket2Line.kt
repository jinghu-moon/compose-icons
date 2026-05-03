package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.Rocket2Line: ImageVector
    get() {
        if (_rocket2Line != null) return _rocket2Line!!
        _rocket2Line = remixIcon(
            name = "Rocket2Line",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 15.502 20.005 C 14.843 21.584 13.579 22.848 12.000 23.507 C 10.421 22.848 9.157 21.584 8.498 20.005 L 10.757 20.005 C 11.084 20.493 11.505 20.917 12.000 21.248 C 12.495 20.917 12.916 20.493 13.243 20.005 L 15.502 20.005 ZM 18.000 14.809 L 20.000 17.078 L 20.000 19.005 L 4.000 19.005 L 4.000 17.078 L 6.000 14.809 L 6.000 9.005 C 6.000 5.522 8.504 2.558 12.000 1.460 C 15.496 2.558 18.000 5.522 18.000 9.005 L 18.000 14.809 ZM 17.269 17.005 L 16.000 15.565 L 16.000 9.005 C 16.000 6.687 14.429 4.574 12.000 3.584 C 9.571 4.574 8.000 6.687 8.000 9.005 L 8.000 15.565 L 6.731 17.005 L 17.269 17.005 ZM 12.000 11.005 C 10.895 11.005 10.000 10.109 10.000 9.005 C 10.000 7.900 10.895 7.005 12.000 7.005 C 13.105 7.005 14.000 7.900 14.000 9.005 C 14.000 10.109 13.105 11.005 12.000 11.005 Z"),
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
        return _rocket2Line!!
    }

private var _rocket2Line: ImageVector? = null
