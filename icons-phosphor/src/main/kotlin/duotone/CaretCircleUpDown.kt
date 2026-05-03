package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.CaretCircleUpDown: ImageVector
    get() {
        if (_caretCircleUpDown != null) return _caretCircleUpDown!!
        _caretCircleUpDown = phosphorDuotoneIcon(
            name = "CaretCircleUpDown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            group(
                groupAlpha = 0.2f,
            ) {
                addPath(
                    pathData = parseSvgPathData("M 224.000 128.000 C 224.000 181.019 181.019 224.000 128.000 224.000 C 74.981 224.000 32.000 181.019 32.000 128.000 C 32.000 74.981 74.981 32.000 128.000 32.000 C 181.019 32.000 224.000 74.981 224.000 128.000 Z"),
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
            addPath(
                pathData = parseSvgPathData("M 128.000 24.000 C 70.562 24.000 24.000 70.562 24.000 128.000 C 24.000 185.438 70.562 232.000 128.000 232.000 C 185.438 232.000 232.000 185.438 232.000 128.000 C 231.939 70.588 185.412 24.061 128.000 24.000 ZM 128.000 216.000 C 79.399 216.000 40.000 176.601 40.000 128.000 C 40.000 79.399 79.399 40.000 128.000 40.000 C 176.601 40.000 216.000 79.399 216.000 128.000 C 215.945 176.578 176.578 215.945 128.000 216.000 ZM 165.660 98.340 C 168.786 101.466 168.786 106.534 165.660 109.660 C 162.534 112.786 157.466 112.786 154.340 109.660 L 128.000 83.310 L 101.660 109.660 C 98.534 112.786 93.466 112.786 90.340 109.660 C 87.214 106.534 87.214 101.466 90.340 98.340 L 122.340 66.340 C 123.841 64.838 125.877 63.994 128.000 63.994 C 130.123 63.994 132.159 64.838 133.660 66.340 ZM 165.660 146.340 C 167.162 147.841 168.006 149.877 168.006 152.000 C 168.006 154.123 167.162 156.159 165.660 157.660 L 133.660 189.660 C 132.159 191.162 130.123 192.006 128.000 192.006 C 125.877 192.006 123.841 191.162 122.340 189.660 L 90.340 157.660 C 87.214 154.534 87.214 149.466 90.340 146.340 C 93.466 143.214 98.534 143.214 101.660 146.340 L 128.000 172.690 L 154.340 146.340 C 155.841 144.838 157.877 143.994 160.000 143.994 C 162.123 143.994 164.159 144.838 165.660 146.340 Z"),
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
        return _caretCircleUpDown!!
    }

private var _caretCircleUpDown: ImageVector? = null
