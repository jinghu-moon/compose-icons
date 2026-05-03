package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.SwordLine: ImageVector
    get() {
        if (_swordLine != null) return _swordLine!!
        _swordLine = remixIcon(
            name = "SwordLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 17.456 3.000 L 20.999 3.003 L 21.001 6.526 L 15.534 11.992 L 18.362 14.821 L 19.777 13.407 L 21.191 14.821 L 18.717 17.296 L 21.545 20.125 L 20.131 21.539 L 17.302 18.710 L 14.828 21.185 L 13.413 19.771 L 14.827 18.356 L 11.998 15.528 L 9.170 18.356 L 10.585 19.771 L 9.171 21.185 L 6.696 18.710 L 3.867 21.539 L 2.453 20.125 L 5.282 17.296 L 2.807 14.821 L 4.221 13.407 L 5.635 14.820 L 8.462 11.992 L 3.002 6.531 L 2.999 3.000 L 6.545 3.003 L 11.998 8.457 L 17.456 3.000 ZM 9.876 13.406 L 7.048 16.234 L 7.756 16.941 L 10.583 14.113 L 9.876 13.406 ZM 19.000 5.001 L 18.283 5.001 L 13.412 9.870 L 14.119 10.577 L 19.000 5.698 L 19.000 5.001 ZM 5.000 5.001 L 5.000 5.701 L 16.241 16.942 L 16.948 16.235 L 5.715 5.002 L 5.000 5.001 Z"),
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
        return _swordLine!!
    }

private var _swordLine: ImageVector? = null
