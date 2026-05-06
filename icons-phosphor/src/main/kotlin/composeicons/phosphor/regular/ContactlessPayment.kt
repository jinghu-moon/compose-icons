package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.ContactlessPayment: ImageVector
    get() {
        if (_contactlessPayment != null) return _contactlessPayment!!
        _contactlessPayment = phosphorRegularIcon(
            name = "ContactlessPayment",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M128 24C70.562 24 24 70.562 24 128c0 57.438 46.562 104 104 104 57.438 0 104-46.562 104-104C231.939 70.588 185.412 24.061 128 24ZM128 216C79.399 216 40 176.601 40 128 40 79.399 79.399 40 128 40c48.601 0 88 39.399 88 88-.055 48.578-39.422 87.945-88 88ZM97.07 100.26c9.179 17.354 9.179 38.126 0 55.48-1.302 2.589-3.901 4.272-6.796 4.399-2.895 .127-5.632-1.321-7.156-3.785-1.524-2.465-1.596-5.561-.188-8.093 6.8-12.651 6.8-27.869 0-40.52-1.956-3.89-.442-8.629 3.407-10.665 3.848-2.036 8.618-.62 10.733 3.185ZM153.07 68.26c19.984 37.341 19.984 82.199 0 119.54-2.212 3.632-6.878 4.899-10.623 2.884-3.745-2.015-5.259-6.607-3.447-10.454 17.476-32.627 17.476-71.833 0-104.46-2.082-3.899-.609-8.748 3.29-10.83 3.899-2.082 8.748-.609 10.83 3.29ZM125.07 84.26c14.585 27.35 14.585 60.17 0 87.52-1.315 2.574-3.916 4.239-6.805 4.355-2.889 .115-5.615-1.336-7.131-3.798-1.516-2.461-1.587-5.549-.184-8.077 12.082-22.65 12.082-49.83 0-72.48-1.402-2.528-1.332-5.616 .184-8.077 1.516-2.461 4.242-3.913 7.131-3.798 2.889 .115 5.49 1.78 6.805 4.355Z"),
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
