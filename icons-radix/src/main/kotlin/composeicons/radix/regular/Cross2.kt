package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.Cross2: ImageVector
    get() {
        if (_cross2 != null) return _cross2!!
        _cross2 = radixIcon(
            name = "Cross2",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15f, height = 15f),
        ) {
            addPath(
                pathData = parseSvgPathData("M10.969 3.219c.225-.225 .588-.225 .812 0 .224 .225 .224 .588 0 .812L8.313 7.5l3.469 3.469 .074 .09c.147 .223 .122 .526-.074 .723-.196 .196-.499 .221-.723 .074l-.09-.074L7.5 8.312 4.031 11.781c-.224 .224-.588 .224-.812 0-.225-.225-.225-.588 0-.812L6.688 7.5 3.219 4.031 3.145 3.941c-.147-.223-.122-.526 .074-.723 .196-.196 .499-.222 .723-.074l.09 .074L7.5 6.687 10.969 3.219Z"),
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
        return _cross2!!
    }

private var _cross2: ImageVector? = null
