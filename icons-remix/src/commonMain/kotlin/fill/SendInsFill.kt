package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.SendInsFill: ImageVector
    get() {
        if (_sendInsFill != null) return _sendInsFill!!
        _sendInsFill = remixIcon(
            name = "SendInsFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 19.500 2.001 C 20.094 2.001 20.699 2.151 21.250 2.469 C 22.924 3.435 23.498 5.576 22.531 7.250 L 15.031 20.240 C 14.065 21.914 11.924 22.488 10.250 21.521 C 9.414 21.039 8.852 20.260 8.620 19.397 L 7.121 13.803 L 15.891 8.739 C 16.369 8.463 16.533 7.851 16.257 7.373 C 15.981 6.895 15.369 6.731 14.891 7.007 L 6.121 12.071 L 2.025 7.975 C 0.658 6.608 0.659 4.392 2.025 3.025 C 2.657 2.393 3.534 2.000 4.500 2.000 L 19.500 2.001 Z"),
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
        return _sendInsFill!!
    }

private var _sendInsFill: ImageVector? = null
