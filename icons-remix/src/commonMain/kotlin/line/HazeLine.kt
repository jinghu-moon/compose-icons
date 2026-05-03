package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.HazeLine: ImageVector
    get() {
        if (_hazeLine != null) return _hazeLine!!
        _hazeLine = remixIcon(
            name = "HazeLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 6.083 13.000 C 6.028 12.675 6.000 12.341 6.000 12.000 C 6.000 8.686 8.686 6.000 12.000 6.000 C 15.314 6.000 18.000 8.686 18.000 12.000 C 18.000 12.341 17.972 12.675 17.917 13.000 L 15.874 13.000 C 15.956 12.680 16.000 12.345 16.000 12.000 C 16.000 9.791 14.209 8.000 12.000 8.000 C 9.791 8.000 8.000 9.791 8.000 12.000 C 8.000 12.345 8.044 12.680 8.126 13.000 L 6.083 13.000 ZM 2.000 15.000 L 12.000 15.000 L 12.000 17.000 L 2.000 17.000 L 2.000 15.000 ZM 14.000 15.000 L 22.000 15.000 L 22.000 17.000 L 14.000 17.000 L 14.000 15.000 ZM 16.000 19.000 L 20.000 19.000 L 20.000 21.000 L 16.000 21.000 L 16.000 19.000 ZM 4.000 19.000 L 14.000 19.000 L 14.000 21.000 L 4.000 21.000 L 4.000 19.000 ZM 11.000 1.000 L 13.000 1.000 L 13.000 4.000 L 11.000 4.000 L 11.000 1.000 ZM 3.515 4.929 L 4.929 3.515 L 7.050 5.636 L 5.636 7.050 L 3.515 4.929 ZM 19.071 3.515 L 20.485 4.929 L 18.364 7.050 L 16.950 5.636 L 19.071 3.515 ZM 23.000 11.000 L 23.000 13.000 L 20.000 13.000 L 20.000 11.000 L 23.000 11.000 ZM 4.000 11.000 L 4.000 13.000 L 1.000 13.000 L 1.000 11.000 L 4.000 11.000 Z"),
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
        return _hazeLine!!
    }

private var _hazeLine: ImageVector? = null
