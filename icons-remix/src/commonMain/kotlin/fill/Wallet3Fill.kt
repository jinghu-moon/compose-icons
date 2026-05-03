package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.Wallet3Fill: ImageVector
    get() {
        if (_wallet3Fill != null) return _wallet3Fill!!
        _wallet3Fill = remixIcon(
            name = "Wallet3Fill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 22.005 6.000 L 15.005 6.000 C 11.691 6.000 9.005 8.686 9.005 12.000 C 9.005 15.314 11.691 18.000 15.005 18.000 L 22.005 18.000 L 22.005 20.000 C 22.005 20.552 21.557 21.000 21.005 21.000 L 3.005 21.000 C 2.453 21.000 2.005 20.552 2.005 20.000 L 2.005 4.000 C 2.005 3.447 2.453 3.000 3.005 3.000 L 21.005 3.000 C 21.557 3.000 22.005 3.447 22.005 4.000 L 22.005 6.000 ZM 15.005 8.000 L 23.005 8.000 L 23.005 16.000 L 15.005 16.000 C 12.796 16.000 11.005 14.209 11.005 12.000 C 11.005 9.791 12.796 8.000 15.005 8.000 ZM 15.005 11.000 L 15.005 13.000 L 18.005 13.000 L 18.005 11.000 L 15.005 11.000 Z"),
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
        return _wallet3Fill!!
    }

private var _wallet3Fill: ImageVector? = null
