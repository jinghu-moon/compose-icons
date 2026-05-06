package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.CursorArrow: ImageVector
    get() {
        if (_cursorArrow != null) return _cursorArrow!!
        _cursorArrow = radixIcon(
            name = "CursorArrow",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15f, height = 15f),
        ) {
            addPath(
                pathData = parseSvgPathData("M3.292 .049c.178-.081 .387-.051 .535 .077l9.031 7.824c.155 .134 .212 .349 .145 .542-.067 .193-.246 .327-.45 .336L9.219 8.975l1.932 4.244c.114 .251 .003 .548-.248 .662l-2.152 .98c-.251 .114-.547 .004-.662-.247L6.152 10.369 3.862 12.785c-.141 .148-.358 .197-.548 .121C3.124 12.83 3 12.646 3 12.441v-11.937L3.005 .432C3.029 .265 3.136 .12 3.292 .049ZM4 11.188 5.938 9.145l.045-.042c.111-.091 .256-.131 .399-.107 .164 .027 .304 .135 .373 .286l2.034 4.462 1.243-.565L8.002 8.715c-.069-.151-.058-.326 .028-.468 .087-.142 .239-.231 .404-.238l2.82-.125L4 1.598v9.59Z"),
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
        return _cursorArrow!!
    }

private var _cursorArrow: ImageVector? = null
