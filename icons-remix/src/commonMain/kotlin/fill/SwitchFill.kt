package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.SwitchFill: ImageVector
    get() {
        if (_switchFill != null) return _switchFill!!
        _switchFill = remixIcon(
            name = "SwitchFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 13.620 21.000 C 13.535 21.000 13.479 20.943 13.493 20.873 L 13.493 3.127 C 13.493 3.071 13.535 3.014 13.606 3.014 L 16.391 3.014 C 18.937 3.014 21.001 5.079 21.001 7.624 L 21.001 16.390 C 21.001 18.936 18.937 21.000 16.391 21.000 L 13.620 21.000 ZM 17.042 11.074 C 16.038 11.074 15.218 11.894 15.218 12.898 C 15.218 13.902 16.038 14.722 17.042 14.722 C 18.046 14.722 18.866 13.902 18.866 12.898 C 18.866 11.894 18.046 11.074 17.042 11.074 ZM 5.801 8.401 C 5.801 7.468 6.564 6.705 7.497 6.705 C 8.431 6.705 9.194 7.468 9.194 8.401 C 9.194 9.335 8.431 10.098 7.497 10.098 C 6.564 10.098 5.801 9.335 5.801 8.401 ZM 11.541 3.000 C 11.626 3.000 11.683 3.057 11.669 3.127 L 11.669 20.859 C 11.669 20.929 11.612 20.986 11.541 20.986 L 7.611 20.986 C 5.065 20.986 3.001 18.921 3.001 16.376 L 3.001 7.610 C 3.001 5.064 5.065 3.000 7.611 3.000 L 11.541 3.000 ZM 10.226 19.544 L 10.226 4.442 L 7.611 4.442 C 6.762 4.442 5.970 4.782 5.376 5.375 C 4.768 5.969 4.443 6.761 4.443 7.610 L 4.443 16.376 C 4.443 17.225 4.783 18.017 5.376 18.610 C 5.970 19.218 6.762 19.544 7.611 19.544 L 10.226 19.544 Z"),
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
        return _switchFill!!
    }

private var _switchFill: ImageVector? = null
