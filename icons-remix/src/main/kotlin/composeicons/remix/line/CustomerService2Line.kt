package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.CustomerService2Line: ImageVector
    get() {
        if (_customerService2Line != null) return _customerService2Line!!
        _customerService2Line = remixIcon(
            name = "CustomerService2Line",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M19.938 8h1.062c1.105 0 2 .895 2 2v4c0 1.105-.895 2-2 2h-1.062c-.492 3.946-3.859 7-7.938 7v-2c3.314 0 6-2.686 6-6v-6C18 5.686 15.314 3 12 3 8.686 3 6 5.686 6 9v7h-3C1.895 16 1 15.105 1 14v-4C1 8.895 1.895 8 3 8h1.062C4.554 4.054 7.92 1 12 1c4.08 0 7.446 3.054 7.938 7ZM3 10v4h1v-4h-1ZM20 10v4h1v-4h-1ZM7.759 15.785 8.82 14.089C9.742 14.666 10.832 15 12 15c1.168 0 2.258-.334 3.18-.911l1.06 1.696C15.011 16.555 13.558 17 12 17 10.442 17 8.989 16.555 7.759 15.785Z"),
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
        return _customerService2Line!!
    }

private var _customerService2Line: ImageVector? = null
