package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.MicOffFill: ImageVector
    get() {
        if (_micOffFill != null) return _micOffFill!!
        _micOffFill = remixIcon(
            name = "MicOffFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 16.425 17.839 C 15.393 18.423 14.234 18.809 13.000 18.945 L 13.000 23.000 L 11.000 23.000 L 11.000 18.945 C 6.829 18.484 3.516 15.172 3.055 11.000 L 5.071 11.000 C 5.556 14.392 8.474 17.000 12.000 17.000 C 13.050 17.000 14.046 16.769 14.940 16.354 L 13.390 14.804 C 12.949 14.932 12.483 15.000 12.000 15.000 C 9.239 15.000 7.000 12.761 7.000 10.000 L 7.000 8.414 L 1.394 2.808 L 2.808 1.393 L 22.607 21.192 L 21.192 22.607 L 16.425 17.839 ZM 19.375 15.160 L 17.932 13.718 C 18.441 12.908 18.788 11.987 18.929 11.000 L 20.945 11.000 C 20.775 12.537 20.219 13.957 19.375 15.160 ZM 16.466 12.251 L 7.686 3.471 C 8.554 1.993 10.161 1.000 12.000 1.000 C 14.762 1.000 17.000 3.239 17.000 6.000 L 17.000 10.000 C 17.000 10.810 16.808 11.575 16.466 12.251 Z"),
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
        return _micOffFill!!
    }

private var _micOffFill: ImageVector? = null
