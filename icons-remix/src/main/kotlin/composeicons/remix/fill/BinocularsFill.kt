package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.BinocularsFill: ImageVector
    get() {
        if (_binocularsFill != null) return _binocularsFill!!
        _binocularsFill = remixIcon(
            name = "BinocularsFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M15.49 3.33c2.134-.571 4.327 .696 4.898 2.829l2.459 9.176c.643 2.4-.782 4.868-3.182 5.512-2.4 .643-4.868-.782-5.512-3.183-.085-.319-.134-.64-.148-.957-.635 .19-1.309 .293-2.005 .293-.697 0-1.37-.103-2.006-.293-.015 .317-.062 .638-.147 .957-.643 2.4-3.111 3.826-5.512 3.183C1.936 20.203 .511 17.735 1.154 15.335L3.613 6.159C4.185 4.026 6.378 2.759 8.512 3.33c1.732 .464 2.892 1.997 2.962 3.698 .173-.018 .349-.028 .527-.028 .178 0 .353 .01 .526 .028 .07-1.701 1.231-3.234 2.963-3.698ZM5.501 14c-1.381 0-2.5 1.119-2.5 2.5 0 1.381 1.119 2.5 2.5 2.5 1.38-0 2.5-1.119 2.5-2.5C8.001 15.119 6.882 14 5.501 14ZM18.501 14c-1.381 0-2.5 1.119-2.5 2.5 0 1.381 1.119 2.5 2.5 2.5 1.381-0 2.5-1.119 2.5-2.5 0-1.381-1.119-2.5-2.5-2.5Z"),
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
        return _binocularsFill!!
    }

private var _binocularsFill: ImageVector? = null
