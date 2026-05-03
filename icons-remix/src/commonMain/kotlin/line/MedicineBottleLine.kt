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
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 19.000 2.000 L 19.000 4.000 L 17.000 4.000 L 17.000 7.000 C 18.657 7.000 20.000 8.343 20.000 10.000 L 20.000 21.000 C 20.000 21.552 19.552 22.000 19.000 22.000 L 5.000 22.000 C 4.448 22.000 4.000 21.552 4.000 21.000 L 4.000 10.000 C 4.000 8.343 5.343 7.000 7.000 7.000 L 7.000 4.000 L 5.000 4.000 L 5.000 2.000 L 19.000 2.000 ZM 17.000 9.000 L 7.000 9.000 C 6.448 9.000 6.000 9.448 6.000 10.000 L 6.000 20.000 L 18.000 20.000 L 18.000 10.000 C 18.000 9.448 17.552 9.000 17.000 9.000 ZM 13.000 11.000 L 13.000 13.000 L 15.000 13.000 L 15.000 15.000 L 12.999 15.000 L 13.000 17.000 L 11.000 17.000 L 10.999 15.000 L 9.000 15.000 L 9.000 13.000 L 11.000 13.000 L 11.000 11.000 L 13.000 11.000 ZM 15.000 4.000 L 9.000 4.000 L 9.000 7.000 L 15.000 7.000 L 15.000 4.000 Z"),
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
        return _medicineBottleLine!!
    }

private var _medicineBottleLine: ImageVector? = null
