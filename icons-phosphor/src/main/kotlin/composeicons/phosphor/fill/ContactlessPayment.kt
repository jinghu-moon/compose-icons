package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.ContactlessPayment: ImageVector
    get() {
        if (_contactlessPayment != null) return _contactlessPayment!!
        _contactlessPayment = phosphorFillIcon(
            name = "ContactlessPayment",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M128 24C70.562 24 24 70.562 24 128c0 57.438 46.562 104 104 104 57.438 0 104-46.562 104-104C231.939 70.588 185.412 24.061 128 24ZM97.07 155.74c-1.302 2.589-3.901 4.272-6.796 4.399-2.895 .127-5.632-1.321-7.156-3.785-1.524-2.465-1.596-5.561-.188-8.093 6.8-12.651 6.8-27.869 0-40.52-1.956-3.89-.442-8.629 3.407-10.665 3.848-2.036 8.618-.62 10.733 3.185 9.179 17.354 9.179 38.126 0 55.48ZM125.07 171.74c-1.315 2.574-3.916 4.239-6.805 4.355-2.889 .115-5.615-1.336-7.131-3.798-1.516-2.461-1.587-5.549-.184-8.077 12.069-22.653 12.069-49.827 0-72.48-1.402-2.528-1.332-5.616 .184-8.077 1.516-2.461 4.242-3.913 7.131-3.798 2.889 .115 5.49 1.78 6.805 4.355 14.589 27.357 14.585 60.186-.01 87.54ZM153.07 187.74c-2.251 3.51-6.822 4.702-10.501 2.739-3.679-1.964-5.232-6.424-3.569-10.249 17.476-32.627 17.476-71.833 0-104.46-2.082-3.899-.609-8.748 3.29-10.83 3.899-2.082 8.748-.609 10.83 3.29 19.969 37.349 19.95 82.207-.05 119.54Z"),
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
        return _contactlessPayment!!
    }

private var _contactlessPayment: ImageVector? = null
