package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.PinDistanceLine: ImageVector
    get() {
        if (_pinDistanceLine != null) return _pinDistanceLine!!
        _pinDistanceLine = remixIcon(
            name = "PinDistanceLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 9.975 8.975 C 11.342 7.608 11.342 5.392 9.975 4.025 C 8.608 2.658 6.392 2.658 5.025 4.025 C 3.658 5.392 3.658 7.608 5.025 8.975 L 7.500 11.450 L 9.975 8.975 ZM 7.500 14.278 L 3.611 10.389 C 1.463 8.241 1.463 4.759 3.611 2.611 C 5.759 0.463 9.241 0.463 11.389 2.611 C 13.537 4.759 13.537 8.241 11.389 10.389 L 7.500 14.278 ZM 7.500 8.000 C 6.672 8.000 6.000 7.328 6.000 6.500 C 6.000 5.672 6.672 5.000 7.500 5.000 C 8.328 5.000 9.000 5.672 9.000 6.500 C 9.000 7.328 8.328 8.000 7.500 8.000 ZM 16.500 20.450 L 18.975 17.975 C 20.342 16.608 20.342 14.392 18.975 13.025 C 17.608 11.658 15.392 11.658 14.025 13.025 C 12.658 14.392 12.658 16.608 14.025 17.975 L 16.500 20.450 ZM 20.389 19.389 L 16.500 23.278 L 12.611 19.389 C 10.463 17.241 10.463 13.759 12.611 11.611 C 14.759 9.463 18.241 9.463 20.389 11.611 C 22.537 13.759 22.537 17.241 20.389 19.389 ZM 16.500 17.000 C 15.672 17.000 15.000 16.328 15.000 15.500 C 15.000 14.672 15.672 14.000 16.500 14.000 C 17.328 14.000 18.000 14.672 18.000 15.500 C 18.000 16.328 17.328 17.000 16.500 17.000 Z"),
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
        return _pinDistanceLine!!
    }

private var _pinDistanceLine: ImageVector? = null
