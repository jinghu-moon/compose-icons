package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.AccountPinBoxLine: ImageVector
    get() {
        if (_accountPinBoxLine != null) return _accountPinBoxLine!!
        _accountPinBoxLine = remixIcon(
            name = "AccountPinBoxLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 14.000 21.000 L 12.000 23.000 L 10.000 21.000 L 4.995 21.000 C 3.893 21.000 3.000 20.107 3.000 19.005 L 3.000 4.995 C 3.000 3.893 3.893 3.000 4.995 3.000 L 19.005 3.000 C 20.107 3.000 21.000 3.893 21.000 4.995 L 21.000 19.005 C 21.000 20.107 20.107 21.000 19.005 21.000 L 14.000 21.000 ZM 19.000 19.000 L 19.000 5.000 L 5.000 5.000 L 5.000 19.000 L 10.828 19.000 L 12.000 20.172 L 13.172 19.000 L 19.000 19.000 ZM 7.972 18.181 C 7.353 17.913 6.767 17.584 6.221 17.202 C 7.468 15.275 9.636 14.000 12.102 14.000 C 14.502 14.000 16.619 15.207 17.880 17.047 C 17.344 17.444 16.766 17.788 16.156 18.072 C 15.247 16.817 13.770 16.000 12.102 16.000 C 10.387 16.000 8.873 16.864 7.972 18.181 ZM 12.000 13.000 C 10.067 13.000 8.500 11.433 8.500 9.500 C 8.500 7.567 10.067 6.000 12.000 6.000 C 13.933 6.000 15.500 7.567 15.500 9.500 C 15.500 11.433 13.933 13.000 12.000 13.000 ZM 12.000 11.000 C 12.828 11.000 13.500 10.328 13.500 9.500 C 13.500 8.672 12.828 8.000 12.000 8.000 C 11.172 8.000 10.500 8.672 10.500 9.500 C 10.500 10.328 11.172 11.000 12.000 11.000 Z"),
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
        return _accountPinBoxLine!!
    }

private var _accountPinBoxLine: ImageVector? = null
