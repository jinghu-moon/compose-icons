package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.CaretCircleDoubleUp: ImageVector
    get() {
        if (_caretCircleDoubleUp != null) return _caretCircleDoubleUp!!
        _caretCircleDoubleUp = phosphorRegularIcon(
            name = "CaretCircleDoubleUp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 201.540 54.460 C 160.925 13.845 95.075 13.845 54.460 54.460 C 13.845 95.075 13.845 160.925 54.460 201.540 C 95.075 242.155 160.925 242.155 201.540 201.540 C 242.155 160.925 242.155 95.075 201.540 54.460 ZM 190.230 190.230 C 155.863 224.592 100.146 224.590 65.782 190.224 C 31.418 155.858 31.418 100.142 65.782 65.776 C 100.146 31.410 155.863 31.408 190.230 65.770 C 224.542 100.162 224.542 155.838 190.230 190.230 ZM 165.660 162.340 C 168.786 165.466 168.786 170.534 165.660 173.660 C 162.534 176.786 157.466 176.786 154.340 173.660 L 128.000 147.310 L 101.660 173.660 C 98.534 176.786 93.466 176.786 90.340 173.660 C 87.214 170.534 87.214 165.466 90.340 162.340 L 122.340 130.340 C 123.841 128.838 125.877 127.994 128.000 127.994 C 130.123 127.994 132.159 128.838 133.660 130.340 ZM 165.660 106.340 C 168.786 109.466 168.786 114.534 165.660 117.660 C 162.534 120.786 157.466 120.786 154.340 117.660 L 128.000 91.310 L 101.660 117.660 C 98.534 120.786 93.466 120.786 90.340 117.660 C 87.214 114.534 87.214 109.466 90.340 106.340 L 122.340 74.340 C 123.841 72.838 125.877 71.994 128.000 71.994 C 130.123 71.994 132.159 72.838 133.660 74.340 Z"),
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
        return _caretCircleDoubleUp!!
    }

private var _caretCircleDoubleUp: ImageVector? = null
