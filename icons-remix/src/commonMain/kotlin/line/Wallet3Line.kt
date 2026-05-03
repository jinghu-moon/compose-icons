package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.Wallet3Line: ImageVector
    get() {
        if (_wallet3Line != null) return _wallet3Line!!
        _wallet3Line = remixIcon(
            name = "Wallet3Line",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 22.005 7.000 L 23.005 7.000 L 23.005 17.000 L 22.005 17.000 L 22.005 20.000 C 22.005 20.552 21.557 21.000 21.005 21.000 L 3.005 21.000 C 2.453 21.000 2.005 20.552 2.005 20.000 L 2.005 4.000 C 2.005 3.447 2.453 3.000 3.005 3.000 L 21.005 3.000 C 21.557 3.000 22.005 3.447 22.005 4.000 L 22.005 7.000 ZM 20.005 17.000 L 14.005 17.000 C 11.243 17.000 9.005 14.761 9.005 12.000 C 9.005 9.238 11.243 7.000 14.005 7.000 L 20.005 7.000 L 20.005 5.000 L 4.005 5.000 L 4.005 19.000 L 20.005 19.000 L 20.005 17.000 ZM 21.005 15.000 L 21.005 9.000 L 14.005 9.000 C 12.348 9.000 11.005 10.343 11.005 12.000 C 11.005 13.657 12.348 15.000 14.005 15.000 L 21.005 15.000 ZM 14.005 11.000 L 17.005 11.000 L 17.005 13.000 L 14.005 13.000 L 14.005 11.000 Z"),
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
        return _wallet3Line!!
    }

private var _wallet3Line: ImageVector? = null
