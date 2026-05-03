package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.CaretCircleDoubleDown: ImageVector
    get() {
        if (_caretCircleDoubleDown != null) return _caretCircleDoubleDown!!
        _caretCircleDoubleDown = phosphorFillIcon(
            name = "CaretCircleDoubleDown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 201.570 54.430 C 166.464 19.253 111.396 13.780 70.053 41.359 C 28.711 68.937 12.613 121.884 31.608 167.808 C 50.603 213.732 99.398 239.837 148.143 230.154 C 196.888 220.471 232.000 177.697 232.000 128.000 C 231.998 100.415 221.054 73.957 201.570 54.430 ZM 165.670 149.670 L 133.670 181.670 C 132.169 183.172 130.133 184.016 128.010 184.016 C 125.887 184.016 123.851 183.172 122.350 181.670 L 90.350 149.670 C 87.224 146.544 87.224 141.476 90.350 138.350 C 93.476 135.224 98.544 135.224 101.670 138.350 L 128.000 164.710 L 154.350 138.350 C 157.476 135.224 162.544 135.224 165.670 138.350 C 168.796 141.476 168.796 146.544 165.670 149.670 ZM 165.670 93.670 L 133.670 125.670 C 132.169 127.172 130.133 128.016 128.010 128.016 C 125.887 128.016 123.851 127.172 122.350 125.670 L 90.350 93.670 C 87.224 90.544 87.224 85.476 90.350 82.350 C 93.476 79.224 98.544 79.224 101.670 82.350 L 128.000 108.680 L 154.350 82.320 C 157.476 79.194 162.544 79.194 165.670 82.320 C 168.796 85.446 168.796 90.514 165.670 93.640 Z"),
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
        return _caretCircleDoubleDown!!
    }

private var _caretCircleDoubleDown: ImageVector? = null
