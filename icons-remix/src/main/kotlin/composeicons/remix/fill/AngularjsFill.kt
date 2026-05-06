package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.AngularjsFill: ImageVector
    get() {
        if (_angularjsFill != null) return _angularjsFill!!
        _angularjsFill = remixIcon(
            name = "AngularjsFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12 2l9.3 3.32L19.882 17.63 12 22 4.119 17.63 2.7 5.32 12 2ZM12 4.21 6.186 17.26h2.168L9.523 14.34h4.935l1.169 2.92h2.168L12 4.21ZM13.698 12.54h-3.396L12 8.45l1.698 4.09Z"),
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
        return _angularjsFill!!
    }

private var _angularjsFill: ImageVector? = null
