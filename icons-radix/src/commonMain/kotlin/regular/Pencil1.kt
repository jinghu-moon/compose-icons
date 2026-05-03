package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.Pencil1: ImageVector
    get() {
        if (_pencil1 != null) return _pencil1!!
        _pencil1 = radixIcon(
            name = "Pencil1",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15.0f, height = 15.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 11.225 1.082 C 11.419 0.954 11.683 0.976 11.854 1.146 L 13.854 3.146 L 13.918 3.225 C 14.046 3.419 14.024 3.683 13.854 3.854 L 6.422 11.285 C 6.354 11.353 6.278 11.410 6.194 11.456 L 6.108 11.497 L 2.697 12.960 C 2.509 13.040 2.291 12.998 2.146 12.854 C 2.002 12.709 1.959 12.491 2.040 12.303 L 3.503 8.892 L 3.544 8.806 C 3.590 8.722 3.647 8.646 3.715 8.578 L 11.146 1.146 L 11.225 1.082 ZM 4.422 9.285 L 3.780 10.780 L 4.218 11.218 L 5.715 10.578 L 12.793 3.500 L 11.500 2.207 L 4.422 9.285 Z"),
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
        return _pencil1!!
    }

private var _pencil1: ImageVector? = null
