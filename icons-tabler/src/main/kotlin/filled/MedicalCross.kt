package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.MedicalCross: ImageVector
    get() {
        if (_medicalCross != null) return _medicalCross!!
        _medicalCross = tablerFilledIcon(
            name = "MedicalCross",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 11.000 2.000 L 10.850 2.005 C 9.806 2.083 9.000 2.953 9.000 4.000 L 9.000 6.803 L 6.572 5.402 C 5.615 4.850 4.392 5.177 3.840 6.134 L 2.840 7.866 L 2.767 8.004 C 2.317 8.946 2.668 10.076 3.572 10.598 L 5.999 12.000 L 3.572 13.402 C 2.615 13.954 2.288 15.177 2.840 16.134 L 3.840 17.866 L 3.923 17.998 C 4.514 18.859 5.668 19.120 6.572 18.598 L 9.000 17.196 L 9.000 20.000 C 9.000 21.105 9.895 22.000 11.000 22.000 L 13.000 22.000 L 13.150 21.995 C 14.194 21.917 15.000 21.047 15.000 20.000 L 15.000 17.196 L 17.428 18.599 C 18.385 19.151 19.608 18.824 20.160 17.867 L 21.160 16.135 L 21.233 15.997 C 21.683 15.055 21.332 13.925 20.428 13.403 L 18.000 12.000 L 20.428 10.598 C 21.385 10.046 21.712 8.823 21.160 7.866 L 20.160 6.134 L 20.077 6.002 C 19.486 5.141 18.332 4.880 17.428 5.402 L 15.000 6.802 L 15.000 4.000 C 15.000 2.895 14.105 2.000 13.000 2.000 L 11.000 2.000 Z"),
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
        return _medicalCross!!
    }

private var _medicalCross: ImageVector? = null
