package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.CaretCircleDoubleDown: ImageVector
    get() {
        if (_caretCircleDoubleDown != null) return _caretCircleDoubleDown!!
        _caretCircleDoubleDown = phosphorDuotoneIcon(
            name = "CaretCircleDoubleDown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    group(
        groupAlpha = 0.20000000298023224f,
    ) {
        addPath(
            pathData = parseSvgPathData("M 195.880 195.880 C 168.425 223.337 127.133 231.552 91.259 216.693 C 55.386 201.834 31.995 166.829 31.995 128.000 C 31.995 89.171 55.386 54.166 91.259 39.307 C 127.133 24.448 168.425 32.663 195.880 60.120 C 233.367 97.610 233.367 158.390 195.880 195.880 Z"),
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
    addPath(
        pathData = parseSvgPathData("M 201.540 54.460 C 160.925 13.845 95.075 13.845 54.460 54.460 C 13.845 95.075 13.845 160.925 54.460 201.540 C 95.075 242.155 160.925 242.155 201.540 201.540 C 242.155 160.925 242.155 95.075 201.540 54.460 ZM 190.230 190.230 C 155.863 224.592 100.146 224.590 65.782 190.224 C 31.418 155.858 31.418 100.142 65.782 65.776 C 100.146 31.410 155.863 31.408 190.230 65.770 C 224.542 100.162 224.542 155.838 190.230 190.230 ZM 165.660 82.340 C 167.162 83.841 168.006 85.877 168.006 88.000 C 168.006 90.123 167.162 92.159 165.660 93.660 L 133.660 125.660 C 132.159 127.162 130.123 128.006 128.000 128.006 C 125.877 128.006 123.841 127.162 122.340 125.660 L 90.340 93.660 C 87.214 90.534 87.214 85.466 90.340 82.340 C 93.466 79.214 98.534 79.214 101.660 82.340 L 128.000 108.690 L 154.340 82.340 C 155.841 80.838 157.877 79.994 160.000 79.994 C 162.123 79.994 164.159 80.838 165.660 82.340 ZM 165.660 138.340 C 167.162 139.841 168.006 141.877 168.006 144.000 C 168.006 146.123 167.162 148.159 165.660 149.660 L 133.660 181.660 C 132.159 183.162 130.123 184.006 128.000 184.006 C 125.877 184.006 123.841 183.162 122.340 181.660 L 90.340 149.660 C 87.214 146.534 87.214 141.466 90.340 138.340 C 93.466 135.214 98.534 135.214 101.660 138.340 L 128.000 164.690 L 154.340 138.340 C 155.841 136.838 157.877 135.994 160.000 135.994 C 162.123 135.994 164.159 136.838 165.660 138.340 Z"),
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
        return _caretCircleDoubleDown!!
    }

private var _caretCircleDoubleDown: ImageVector? = null
