package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.DeleteBack2Fill: ImageVector
    get() {
        if (_deleteBack2Fill != null) return _deleteBack2Fill!!
        _deleteBack2Fill = remixIcon(
            name = "DeleteBack2Fill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 6.535 3.000 L 20.999 3.000 C 21.552 3.000 21.999 3.448 21.999 4.000 L 21.999 20.000 C 21.999 20.552 21.552 21.000 20.999 21.000 L 6.535 21.000 C 6.200 21.000 5.888 20.833 5.702 20.555 L 0.369 12.555 C 0.145 12.219 0.145 11.781 0.369 11.445 L 5.702 3.445 C 5.888 3.167 6.200 3.000 6.535 3.000 ZM 12.999 10.586 L 10.171 7.757 L 8.757 9.172 L 11.585 12.000 L 8.757 14.828 L 10.171 16.243 L 12.999 13.414 L 15.828 16.243 L 17.242 14.828 L 14.413 12.000 L 17.242 9.172 L 15.828 7.757 L 12.999 10.586 Z"),
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
        return _deleteBack2Fill!!
    }

private var _deleteBack2Fill: ImageVector? = null
