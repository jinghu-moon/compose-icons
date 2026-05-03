package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.CaretCircleDoubleRight: ImageVector
    get() {
        if (_caretCircleDoubleRight != null) return _caretCircleDoubleRight!!
        _caretCircleDoubleRight = phosphorDuotoneIcon(
            name = "CaretCircleDoubleRight",
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
        pathData = parseSvgPathData("M 201.540 54.460 C 160.925 13.845 95.075 13.845 54.460 54.460 C 13.845 95.075 13.845 160.925 54.460 201.540 C 95.075 242.155 160.925 242.155 201.540 201.540 C 242.155 160.925 242.155 95.075 201.540 54.460 ZM 190.230 190.230 C 155.863 224.592 100.146 224.590 65.782 190.224 C 31.418 155.858 31.418 100.142 65.782 65.776 C 100.146 31.410 155.863 31.408 190.230 65.770 C 224.542 100.162 224.542 155.838 190.230 190.230 ZM 125.660 122.340 C 127.162 123.841 128.006 125.877 128.006 128.000 C 128.006 130.123 127.162 132.159 125.660 133.660 L 93.660 165.660 C 90.534 168.786 85.466 168.786 82.340 165.660 C 79.214 162.534 79.214 157.466 82.340 154.340 L 108.690 128.000 L 82.340 101.660 C 79.214 98.534 79.214 93.466 82.340 90.340 C 85.466 87.214 90.534 87.214 93.660 90.340 ZM 181.660 122.340 C 183.162 123.841 184.006 125.877 184.006 128.000 C 184.006 130.123 183.162 132.159 181.660 133.660 L 149.660 165.660 C 146.534 168.786 141.466 168.786 138.340 165.660 C 135.214 162.534 135.214 157.466 138.340 154.340 L 164.690 128.000 L 138.340 101.660 C 135.214 98.534 135.214 93.466 138.340 90.340 C 141.466 87.214 146.534 87.214 149.660 90.340 Z"),
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
        return _caretCircleDoubleRight!!
    }

private var _caretCircleDoubleRight: ImageVector? = null
