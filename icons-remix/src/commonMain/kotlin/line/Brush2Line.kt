package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.Brush2Line: ImageVector
    get() {
        if (_brush2Line != null) return _brush2Line!!
        _brush2Line = remixIcon(
            name = "Brush2Line",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 16.536 15.946 L 18.657 13.825 L 15.475 10.643 L 19.011 7.108 L 16.889 4.986 L 13.354 8.522 L 10.172 5.340 L 8.050 7.461 L 16.536 15.946 ZM 15.122 17.361 L 6.636 8.875 L 3.808 11.704 L 12.293 20.189 L 15.122 17.361 ZM 13.354 5.693 L 16.182 2.865 C 16.573 2.475 17.206 2.475 17.596 2.865 L 21.132 6.401 C 21.522 6.791 21.522 7.424 21.132 7.815 L 18.303 10.643 L 20.778 13.118 C 21.169 13.509 21.169 14.142 20.778 14.532 L 13.000 22.310 C 12.610 22.701 11.976 22.701 11.586 22.310 L 1.686 12.411 C 1.296 12.021 1.296 11.387 1.686 10.997 L 9.465 3.219 C 9.855 2.828 10.488 2.828 10.879 3.219 L 13.354 5.693 Z"),
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
        return _brush2Line!!
    }

private var _brush2Line: ImageVector? = null
