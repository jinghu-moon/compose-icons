package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.LinkedinLogo: ImageVector
    get() {
        if (_linkedinLogo != null) return _linkedinLogo!!
        _linkedinLogo = radixIcon(
            name = "LinkedinLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15.0f, height = 15.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 13.000 1.000 C 13.552 1.000 14.000 1.448 14.000 2.000 L 14.000 13.000 C 14.000 13.552 13.552 14.000 13.000 14.000 L 2.000 14.000 C 1.448 14.000 1.000 13.552 1.000 13.000 L 1.000 2.000 C 1.000 1.448 1.448 1.000 2.000 1.000 L 13.000 1.000 ZM 9.675 5.851 C 9.295 5.832 8.917 5.911 8.579 6.081 C 8.322 6.210 8.052 6.505 7.845 7.019 L 7.792 7.019 L 7.792 6.000 L 6.000 6.000 L 6.000 12.005 L 7.906 12.005 L 7.906 8.812 C 7.879 8.484 7.983 8.061 8.197 7.810 C 8.411 7.558 8.718 7.498 8.950 7.468 L 9.022 7.468 C 9.629 7.468 10.078 7.843 10.078 8.789 L 10.078 12.005 L 11.984 12.005 L 12.000 8.357 C 12.000 6.553 10.834 5.851 9.675 5.851 ZM 3.050 12.000 L 4.950 12.000 L 4.950 6.000 L 3.050 6.000 L 3.050 12.000 ZM 4.000 2.930 C 3.406 2.930 2.925 3.411 2.925 4.005 C 2.925 4.599 3.406 5.080 4.000 5.080 C 4.594 5.080 5.075 4.599 5.075 4.005 C 5.075 3.411 4.594 2.930 4.000 2.930 Z"),
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
        return _linkedinLogo!!
    }

private var _linkedinLogo: ImageVector? = null
