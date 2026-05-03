package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.SecurePaymentFill: ImageVector
    get() {
        if (_securePaymentFill != null) return _securePaymentFill!!
        _securePaymentFill = remixIcon(
            name = "SecurePaymentFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 11.005 2.000 L 18.303 4.281 C 18.721 4.411 19.005 4.798 19.005 5.235 L 19.005 7.000 L 21.005 7.000 C 21.557 7.000 22.005 7.448 22.005 8.000 L 22.005 10.000 L 9.005 10.000 L 9.005 8.000 C 9.005 7.448 9.453 7.000 10.005 7.000 L 17.005 7.000 L 17.005 5.970 L 11.005 4.094 L 5.005 5.970 L 5.005 13.374 C 5.005 14.619 5.584 15.788 6.563 16.543 L 6.752 16.679 L 11.005 19.579 L 14.787 17.000 L 10.005 17.000 C 9.453 17.000 9.005 16.552 9.005 16.000 L 9.005 12.000 L 22.005 12.000 L 22.005 16.000 C 22.005 16.552 21.557 17.000 21.005 17.000 L 17.785 17.001 C 17.398 17.511 16.928 17.962 16.385 18.332 L 11.005 22.000 L 5.625 18.332 C 3.986 17.214 3.005 15.358 3.005 13.374 L 3.005 5.235 C 3.005 4.798 3.289 4.411 3.707 4.281 L 11.005 2.000 Z"),
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
        return _securePaymentFill!!
    }

private var _securePaymentFill: ImageVector? = null
