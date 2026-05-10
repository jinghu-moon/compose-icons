package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.RidingFill: ImageVector
    get() {
        if (_ridingFill != null) return _ridingFill!!
        _ridingFill = remixIcon(
            name = "RidingFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M5.5 21C3.015 21 1 18.985 1 16.5 1 14.015 3.015 12 5.5 12 7.985 12 10 14.015 10 16.5 10 18.985 7.985 21 5.5 21ZM5.5 18C6.328 18 7 17.328 7 16.5 7 15.672 6.328 15 5.5 15 4.672 15 4 15.672 4 16.5 4 17.328 4.672 18 5.5 18ZM18.5 21C16.015 21 14 18.985 14 16.5 14 14.015 16.015 12 18.5 12 20.985 12 23 14.015 23 16.5 23 18.985 20.985 21 18.5 21ZM18.5 18C19.328 18 20 17.328 20 16.5 20 15.672 19.328 15 18.5 15 17.672 15 17 15.672 17 16.5c0 .828 .672 1.5 1.5 1.5ZM11.531 9.797 13 12v6h-2v-5L8.281 10.734C8.182 10.666 8.088 10.588 8 10.5 7.219 9.719 7.219 8.453 8 7.672L10.828 4.843c.781-.781 2.047-.781 2.829 0l1.414 1.414c1.104 1.103 2.484 1.762 3.917 1.974l-.01 2.016C17.034 10.022 15.149 9.163 13.657 7.672L11.531 9.797ZM16 5C14.895 5 14 4.105 14 3c0-1.105 .895-2 2-2 1.105 0 2 .895 2 2 0 1.105-.895 2-2 2Z"),
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
        return _ridingFill!!
    }

private var _ridingFill: ImageVector? = null
