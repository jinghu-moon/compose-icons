package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.AtomFill: ImageVector
    get() {
        if (_atomFill != null) return _atomFill!!
        _atomFill = remixIcon(
            name = "AtomFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 14.415 3.308 C 16.489 2.572 18.725 2.462 20.132 3.868 C 21.538 5.275 21.428 7.511 20.692 9.585 C 20.414 10.368 20.030 11.180 19.553 12.000 C 20.030 12.820 20.414 13.632 20.692 14.415 C 21.428 16.489 21.538 18.725 20.132 20.132 C 18.725 21.538 16.489 21.428 14.415 20.692 C 13.632 20.414 12.820 20.030 12.000 19.553 C 11.180 20.030 10.368 20.414 9.585 20.692 C 7.511 21.428 5.275 21.538 3.868 20.132 C 2.462 18.725 2.572 16.490 3.308 14.416 C 3.586 13.633 3.969 12.820 4.446 12.000 C 3.969 11.180 3.586 10.367 3.308 9.584 C 2.572 7.510 2.462 5.275 3.868 3.868 C 5.275 2.462 7.510 2.572 9.584 3.308 C 10.367 3.586 11.180 3.969 12.000 4.446 C 12.820 3.969 13.632 3.586 14.415 3.308 ZM 5.703 13.884 C 5.501 14.295 5.330 14.697 5.192 15.085 C 4.521 16.977 4.736 18.172 5.282 18.718 C 5.828 19.264 7.023 19.480 8.915 18.809 C 9.302 18.671 9.704 18.498 10.115 18.296 C 9.313 17.691 8.519 17.004 7.757 16.242 C 6.995 15.480 6.308 14.686 5.703 13.884 ZM 18.296 13.884 C 17.691 14.686 17.004 15.481 16.242 16.243 C 15.480 17.005 14.686 17.691 13.884 18.296 C 14.295 18.498 14.697 18.670 15.085 18.808 C 16.977 19.479 18.172 19.264 18.718 18.718 C 19.264 18.172 19.479 16.977 18.808 15.085 C 18.670 14.697 18.498 14.295 18.296 13.884 ZM 12.000 10.000 C 10.895 10.000 10.000 10.895 10.000 12.000 C 10.000 13.105 10.895 14.000 12.000 14.000 C 13.104 14.000 14.000 13.104 14.000 12.000 C 14.000 10.895 13.104 10.000 12.000 10.000 ZM 8.915 5.192 C 7.023 4.521 5.828 4.736 5.282 5.282 C 4.736 5.828 4.521 7.023 5.192 8.915 C 5.330 9.302 5.501 9.704 5.703 10.115 C 6.308 9.313 6.996 8.520 7.758 7.758 C 8.520 6.996 9.313 6.308 10.115 5.703 C 9.704 5.501 9.302 5.330 8.915 5.192 ZM 18.718 5.282 C 18.172 4.736 16.977 4.521 15.085 5.192 C 14.697 5.330 14.295 5.501 13.884 5.703 C 14.686 6.308 15.480 6.995 16.242 7.757 C 17.004 8.519 17.691 9.313 18.296 10.115 C 18.498 9.704 18.670 9.303 18.808 8.916 C 19.479 7.024 19.264 5.828 18.718 5.282 Z"),
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
        return _atomFill!!
    }

private var _atomFill: ImageVector? = null
