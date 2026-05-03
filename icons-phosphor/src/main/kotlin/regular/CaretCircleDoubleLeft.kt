package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.CaretCircleDoubleLeft: ImageVector
    get() {
        if (_caretCircleDoubleLeft != null) return _caretCircleDoubleLeft!!
        _caretCircleDoubleLeft = phosphorRegularIcon(
            name = "CaretCircleDoubleLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 201.540 54.460 C 160.925 13.845 95.075 13.845 54.460 54.460 C 13.845 95.075 13.845 160.925 54.460 201.540 C 95.075 242.155 160.925 242.155 201.540 201.540 C 242.155 160.925 242.155 95.075 201.540 54.460 ZM 190.230 190.230 C 155.863 224.592 100.146 224.590 65.782 190.224 C 31.418 155.858 31.418 100.142 65.782 65.776 C 100.146 31.410 155.863 31.408 190.230 65.770 C 224.542 100.162 224.542 155.838 190.230 190.230 ZM 173.660 101.660 L 147.310 128.000 L 173.660 154.340 C 176.786 157.466 176.786 162.534 173.660 165.660 C 170.534 168.786 165.466 168.786 162.340 165.660 L 130.340 133.660 C 128.838 132.159 127.994 130.123 127.994 128.000 C 127.994 125.877 128.838 123.841 130.340 122.340 L 162.340 90.340 C 165.466 87.214 170.534 87.214 173.660 90.340 C 176.786 93.466 176.786 98.534 173.660 101.660 ZM 117.660 101.660 L 91.310 128.000 L 117.660 154.340 C 120.786 157.466 120.786 162.534 117.660 165.660 C 114.534 168.786 109.466 168.786 106.340 165.660 L 74.340 133.660 C 72.838 132.159 71.994 130.123 71.994 128.000 C 71.994 125.877 72.838 123.841 74.340 122.340 L 106.340 90.340 C 109.466 87.214 114.534 87.214 117.660 90.340 C 120.786 93.466 120.786 98.534 117.660 101.660 Z"),
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
        return _caretCircleDoubleLeft!!
    }

private var _caretCircleDoubleLeft: ImageVector? = null
