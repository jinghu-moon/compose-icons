package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.MicOffLine: ImageVector
    get() {
        if (_micOffLine != null) return _micOffLine!!
        _micOffLine = remixIcon(
            name = "MicOffLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 16.425 17.839 L 21.192 22.607 L 22.607 21.192 L 2.808 1.393 L 1.394 2.808 L 7.000 8.414 L 7.000 10.000 C 7.000 12.761 9.239 15.000 12.000 15.000 C 12.483 15.000 12.949 14.932 13.390 14.804 L 14.940 16.354 C 14.046 16.769 13.050 17.000 12.000 17.000 C 8.474 17.000 5.556 14.392 5.071 11.000 L 3.055 11.000 C 3.516 15.172 6.829 18.484 11.000 18.945 L 11.000 23.000 L 13.000 23.000 L 13.000 18.945 C 14.234 18.809 15.393 18.423 16.425 17.839 ZM 11.553 12.967 C 10.254 12.773 9.227 11.746 9.033 10.447 L 11.553 12.967 ZM 19.375 15.160 L 17.932 13.718 C 18.441 12.908 18.788 11.987 18.929 11.000 L 20.945 11.000 C 20.775 12.537 20.219 13.957 19.375 15.160 ZM 16.466 12.251 L 14.917 10.703 C 14.972 10.477 15.000 10.242 15.000 10.000 L 15.000 6.000 C 15.000 4.343 13.657 3.000 12.000 3.000 C 10.706 3.000 9.603 3.820 9.182 4.968 L 7.686 3.471 C 8.554 1.993 10.161 1.000 12.000 1.000 C 14.762 1.000 17.000 3.239 17.000 6.000 L 17.000 10.000 C 17.000 10.810 16.808 11.575 16.466 12.251 Z"),
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
        return _micOffLine!!
    }

private var _micOffLine: ImageVector? = null
