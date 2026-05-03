package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.MicrosoftCopilotFill: ImageVector
    get() {
        if (_microsoftCopilotFill != null) return _microsoftCopilotFill!!
        _microsoftCopilotFill = remixIcon(
            name = "MicrosoftCopilotFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 14.865 3.062 C 15.722 3.063 16.483 3.607 16.761 4.418 L 17.363 6.176 C 17.632 6.961 18.356 7.496 19.180 7.528 L 19.733 7.528 C 19.760 7.528 19.787 7.531 19.813 7.531 L 19.886 7.531 L 19.881 7.533 C 23.553 7.647 22.242 12.027 21.237 15.314 C 20.377 18.126 19.088 20.938 16.940 20.938 L 9.361 20.938 C 8.500 20.938 7.735 20.389 7.460 19.573 L 6.874 17.834 C 6.602 17.025 5.848 16.479 4.997 16.470 L 4.266 16.470 C 0.412 16.470 1.744 12.016 2.762 8.686 C 3.622 5.874 4.911 3.063 7.059 3.062 L 14.865 3.062 ZM 13.246 7.531 C 12.433 7.531 11.710 8.021 11.400 8.756 C 10.729 11.028 10.009 13.502 9.571 15.019 C 9.325 15.871 8.550 16.458 7.665 16.469 L 10.743 16.469 C 11.605 16.469 12.366 15.917 12.640 15.106 C 13.299 12.872 14.000 10.467 14.429 8.979 C 14.671 8.143 15.422 7.562 16.287 7.531 L 13.246 7.531 Z"),
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
        return _microsoftCopilotFill!!
    }

private var _microsoftCopilotFill: ImageVector? = null
