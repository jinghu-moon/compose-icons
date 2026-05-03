package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.AccountPinCircleFill: ImageVector
    get() {
        if (_accountPinCircleFill != null) return _accountPinCircleFill!!
        _accountPinCircleFill = remixIcon(
            name = "AccountPinCircleFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 14.256 21.744 L 12.000 24.000 L 9.744 21.744 C 5.309 20.720 2.000 16.744 2.000 12.000 C 2.000 6.480 6.480 2.000 12.000 2.000 C 17.520 2.000 22.000 6.480 22.000 12.000 C 22.000 16.744 18.691 20.720 14.256 21.744 ZM 6.023 15.416 C 7.491 17.607 9.695 19.000 12.160 19.000 C 14.624 19.000 16.829 17.607 18.296 15.416 C 16.688 13.917 14.531 13.000 12.160 13.000 C 9.788 13.000 7.631 13.917 6.023 15.416 ZM 12.000 11.000 C 13.657 11.000 15.000 9.657 15.000 8.000 C 15.000 6.343 13.657 5.000 12.000 5.000 C 10.343 5.000 9.000 6.343 9.000 8.000 C 9.000 9.657 10.343 11.000 12.000 11.000 Z"),
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
        return _accountPinCircleFill!!
    }

private var _accountPinCircleFill: ImageVector? = null
