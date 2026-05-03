package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.CaretCircleDoubleRight: ImageVector
    get() {
        if (_caretCircleDoubleRight != null) return _caretCircleDoubleRight!!
        _caretCircleDoubleRight = phosphorFillIcon(
            name = "CaretCircleDoubleRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 201.570 54.420 C 160.945 13.835 95.114 13.856 54.516 54.468 C 13.917 95.080 13.917 160.910 54.516 201.522 C 95.114 242.134 160.945 242.155 201.570 201.570 C 242.139 160.908 242.139 95.082 201.570 54.420 ZM 125.660 133.660 L 93.660 165.660 C 90.534 168.786 85.466 168.786 82.340 165.660 C 79.214 162.534 79.214 157.466 82.340 154.340 L 108.680 128.000 L 82.320 101.640 C 79.194 98.514 79.194 93.446 82.320 90.320 C 85.446 87.194 90.514 87.194 93.640 90.320 L 125.640 122.320 C 127.151 123.819 128.003 125.858 128.006 127.986 C 128.010 130.114 127.166 132.156 125.660 133.660 ZM 181.660 133.660 L 149.660 165.660 C 146.534 168.786 141.466 168.786 138.340 165.660 C 135.214 162.534 135.214 157.466 138.340 154.340 L 164.710 128.000 L 138.350 101.640 C 135.224 98.514 135.224 93.446 138.350 90.320 C 141.476 87.194 146.544 87.194 149.670 90.320 L 181.670 122.320 C 183.180 123.820 184.029 125.860 184.031 127.988 C 184.033 130.116 183.187 132.157 181.680 133.660 Z"),
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
        return _caretCircleDoubleRight!!
    }

private var _caretCircleDoubleRight: ImageVector? = null
