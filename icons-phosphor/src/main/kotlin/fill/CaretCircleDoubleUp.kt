package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.CaretCircleDoubleUp: ImageVector
    get() {
        if (_caretCircleDoubleUp != null) return _caretCircleDoubleUp!!
        _caretCircleDoubleUp = phosphorFillIcon(
            name = "CaretCircleDoubleUp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 201.580 54.430 C 160.956 13.841 95.123 13.859 54.522 54.471 C 13.922 95.083 13.922 160.917 54.522 201.529 C 95.123 242.141 160.956 242.159 201.580 201.570 C 242.142 160.910 242.142 95.090 201.580 54.430 ZM 165.680 173.680 C 164.179 175.182 162.143 176.026 160.020 176.026 C 157.897 176.026 155.861 175.182 154.360 173.680 L 128.000 147.320 L 101.650 173.680 C 98.524 176.806 93.456 176.806 90.330 173.680 C 87.204 170.554 87.204 165.486 90.330 162.360 L 122.330 130.360 C 123.831 128.858 125.867 128.014 127.990 128.014 C 130.113 128.014 132.149 128.858 133.650 130.360 L 165.650 162.360 C 167.156 163.857 168.006 165.891 168.011 168.014 C 168.017 170.137 167.178 172.175 165.680 173.680 ZM 165.680 117.680 C 164.179 119.182 162.143 120.026 160.020 120.026 C 157.897 120.026 155.861 119.182 154.360 117.680 L 128.000 91.290 L 101.650 117.650 C 98.524 120.776 93.456 120.776 90.330 117.650 C 87.204 114.524 87.204 109.456 90.330 106.330 L 122.330 74.330 C 123.831 72.828 125.867 71.984 127.990 71.984 C 130.113 71.984 132.149 72.828 133.650 74.330 L 165.650 106.330 C 167.156 107.827 168.006 109.861 168.011 111.984 C 168.017 114.107 167.178 116.145 165.680 117.650 Z"),
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
        return _caretCircleDoubleUp!!
    }

private var _caretCircleDoubleUp: ImageVector? = null
