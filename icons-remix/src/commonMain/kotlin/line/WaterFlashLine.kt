package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.WaterFlashLine: ImageVector
    get() {
        if (_waterFlashLine != null) return _waterFlashLine!!
        _waterFlashLine = remixIcon(
            name = "WaterFlashLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 12.005 3.103 L 7.055 8.053 C 4.321 10.787 4.321 15.219 7.055 17.952 C 9.789 20.686 14.221 20.686 16.955 17.952 C 19.688 15.219 19.688 10.787 16.955 8.053 L 12.005 3.103 ZM 12.005 0.275 L 18.369 6.639 C 21.884 10.153 21.884 15.852 18.369 19.367 C 14.854 22.881 9.156 22.881 5.641 19.367 C 2.126 15.852 2.126 10.153 5.641 6.639 L 12.005 0.275 ZM 13.005 11.003 L 15.505 11.003 L 11.005 17.503 L 11.005 13.003 L 8.505 13.003 L 13.005 6.503 L 13.005 11.003 Z"),
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
        return _waterFlashLine!!
    }

private var _waterFlashLine: ImageVector? = null
