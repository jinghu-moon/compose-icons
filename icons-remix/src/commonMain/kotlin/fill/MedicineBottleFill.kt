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
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 17.000 5.000 L 17.000 7.000 C 18.657 7.000 20.000 8.343 20.000 10.000 L 20.000 21.000 C 20.000 21.552 19.552 22.000 19.000 22.000 L 5.000 22.000 C 4.448 22.000 4.000 21.552 4.000 21.000 L 4.000 10.000 C 4.000 8.343 5.343 7.000 7.000 7.000 L 7.000 5.000 L 17.000 5.000 ZM 13.000 11.000 L 11.000 11.000 L 11.000 13.000 L 9.000 13.000 L 9.000 15.000 L 10.999 15.000 L 11.000 17.000 L 13.000 17.000 L 12.999 15.000 L 15.000 15.000 L 15.000 13.000 L 13.000 13.000 L 13.000 11.000 ZM 19.000 2.000 L 19.000 4.000 L 5.000 4.000 L 5.000 2.000 L 19.000 2.000 Z"),
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
        return _medicineBottleFill!!
    }

private var _medicineBottleFill: ImageVector? = null
