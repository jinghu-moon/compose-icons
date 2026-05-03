package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.CaretCircleDoubleLeft: ImageVector
    get() {
        if (_caretCircleDoubleLeft != null) return _caretCircleDoubleLeft!!
        _caretCircleDoubleLeft = phosphorFillIcon(
            name = "CaretCircleDoubleLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 201.570 54.420 C 160.945 13.835 95.114 13.856 54.516 54.468 C 13.917 95.080 13.917 160.910 54.516 201.522 C 95.114 242.134 160.945 242.155 201.570 201.570 C 242.139 160.908 242.139 95.082 201.570 54.420 ZM 117.650 154.350 C 120.776 157.476 120.776 162.544 117.650 165.670 C 114.524 168.796 109.456 168.796 106.330 165.670 L 74.330 133.670 C 72.828 132.169 71.984 130.133 71.984 128.010 C 71.984 125.887 72.828 123.851 74.330 122.350 L 106.330 90.350 C 109.456 87.224 114.524 87.224 117.650 90.350 C 120.776 93.476 120.776 98.544 117.650 101.670 L 91.290 128.000 ZM 173.650 154.350 C 176.776 157.476 176.776 162.544 173.650 165.670 C 170.524 168.796 165.456 168.796 162.330 165.670 L 130.330 133.670 C 128.828 132.169 127.984 130.133 127.984 128.010 C 127.984 125.887 128.828 123.851 130.330 122.350 L 162.330 90.350 C 165.456 87.224 170.524 87.224 173.650 90.350 C 176.776 93.476 176.776 98.544 173.650 101.670 L 147.320 128.000 Z"),
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
