package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.MedicineBottleFill: ImageVector
    get() {
        if (_medicineBottleFill != null) return _medicineBottleFill!!
        _medicineBottleFill = remixIcon(
            name = "MedicineBottleFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M17 5v2c1.657 0 3 1.343 3 3v11c0 .552-.448 1-1 1h-14C4.448 22 4 21.552 4 21v-11C4 8.343 5.343 7 7 7v-2h10ZM13 11h-2v2h-2v2h1.999L11 17h2l-.001-2h2.001v-2h-2v-2ZM19 2v2h-14v-2h14Z"),
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
        return _medicineBottleFill!!
    }

private var _medicineBottleFill: ImageVector? = null
