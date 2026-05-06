package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.RidingLine: ImageVector
    get() {
        if (_ridingLine != null) return _ridingLine!!
        _ridingLine = remixIcon(
            name = "RidingLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M5.5 21C3.015 21 1 18.985 1 16.5 1 14.015 3.015 12 5.5 12 7.985 12 10 14.015 10 16.5 10 18.985 7.985 21 5.5 21ZM5.5 19C6.881 19 8 17.881 8 16.5 8 15.119 6.881 14 5.5 14 4.119 14 3 15.119 3 16.5 3 17.881 4.119 19 5.5 19ZM18.5 21C16.015 21 14 18.985 14 16.5 14 14.015 16.015 12 18.5 12 20.985 12 23 14.015 23 16.5 23 18.985 20.985 21 18.5 21ZM18.5 19C19.881 19 21 17.881 21 16.5 21 15.119 19.881 14 18.5 14 17.119 14 16 15.119 16 16.5 16 17.881 17.119 19 18.5 19ZM11.023 10.305 13 12v6h-2v-5L8.281 10.734C8.182 10.666 8.088 10.588 8 10.5 7.219 9.719 7.219 8.453 8 7.672L10.828 4.843c.781-.781 2.047-.781 2.829 0l1.414 1.414c1.104 1.103 2.484 1.762 3.917 1.974l-.01 2.016C17.034 10.022 15.149 9.163 13.657 7.672l-2.634 2.634ZM16 5C14.895 5 14 4.105 14 3c0-1.105 .895-2 2-2 1.105 0 2 .895 2 2 0 1.105-.895 2-2 2Z"),
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
        return _ridingLine!!
    }

private var _ridingLine: ImageVector? = null
