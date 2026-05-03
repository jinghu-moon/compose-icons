package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.ImageAddLine: ImageVector
    get() {
        if (_imageAddLine != null) return _imageAddLine!!
        _imageAddLine = remixIcon(
            name = "ImageAddLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 21.000 15.000 L 21.000 18.000 L 24.000 18.000 L 24.000 20.000 L 21.000 20.000 L 21.000 23.000 L 19.000 23.000 L 19.000 20.000 L 16.000 20.000 L 16.000 18.000 L 19.000 18.000 L 19.000 15.000 L 21.000 15.000 ZM 21.008 3.000 C 21.556 3.000 22.000 3.445 22.000 3.993 L 22.000 13.000 L 20.000 13.000 L 20.000 5.000 L 4.000 5.000 L 4.000 18.999 L 14.000 9.000 L 17.000 12.000 L 17.000 14.829 L 14.000 11.828 L 6.827 19.000 L 14.000 19.000 L 14.000 21.000 L 2.992 21.000 C 2.444 21.000 2.000 20.555 2.000 20.007 L 2.000 3.993 C 2.000 3.445 2.455 3.000 2.992 3.000 L 21.008 3.000 ZM 8.000 7.000 C 9.105 7.000 10.000 7.895 10.000 9.000 C 10.000 10.105 9.105 11.000 8.000 11.000 C 6.895 11.000 6.000 10.105 6.000 9.000 C 6.000 7.895 6.895 7.000 8.000 7.000 Z"),
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
        return _imageAddLine!!
    }

private var _imageAddLine: ImageVector? = null
