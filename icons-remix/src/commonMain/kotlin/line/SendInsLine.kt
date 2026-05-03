package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.SendInsLine: ImageVector
    get() {
        if (_sendInsLine != null) return _sendInsLine!!
        _sendInsLine = remixIcon(
            name = "SendInsLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 19.500 2.000 C 20.094 2.000 20.699 2.151 21.250 2.469 C 22.924 3.435 23.498 5.576 22.531 7.250 L 15.031 20.240 C 14.065 21.914 11.924 22.488 10.250 21.521 C 9.414 21.039 8.852 20.261 8.620 19.397 L 6.853 12.804 L 2.025 7.975 C 0.658 6.608 0.659 4.392 2.025 3.025 C 2.658 2.393 3.534 2.000 4.500 2.000 L 19.500 2.000 ZM 4.500 4.000 C 4.086 4.000 3.712 4.167 3.439 4.439 C 2.854 5.025 2.854 5.975 3.439 6.561 L 7.914 11.035 L 14.891 7.007 C 15.369 6.731 15.981 6.895 16.257 7.373 C 16.533 7.851 16.369 8.463 15.891 8.739 L 8.914 12.768 L 10.552 18.879 C 10.651 19.251 10.891 19.582 11.250 19.789 C 11.967 20.203 12.884 19.958 13.299 19.240 L 20.799 6.250 C 21.213 5.533 20.967 4.615 20.250 4.201 C 20.013 4.064 19.756 4.000 19.501 4.000 L 4.500 4.000 Z"),
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
        return _sendInsLine!!
    }

private var _sendInsLine: ImageVector? = null
