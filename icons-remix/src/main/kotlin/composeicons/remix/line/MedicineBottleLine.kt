package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.MedicineBottleLine: ImageVector
    get() {
        if (_medicineBottleLine != null) return _medicineBottleLine!!
        _medicineBottleLine = remixIcon(
            name = "MedicineBottleLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M19 2v2h-2v3c1.657 0 3 1.343 3 3v11c0 .552-.448 1-1 1h-14C4.448 22 4 21.552 4 21v-11C4 8.343 5.343 7 7 7v-3h-2v-2h14ZM17 9h-10C6.448 9 6 9.448 6 10v10h12v-10C18 9.448 17.552 9 17 9ZM13 11v2h2v2h-2.001L13 17h-2l-.001-2h-1.999v-2h2v-2h2ZM15 4h-6v3h6v-3Z"),
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
        return _medicineBottleLine!!
    }

private var _medicineBottleLine: ImageVector? = null
