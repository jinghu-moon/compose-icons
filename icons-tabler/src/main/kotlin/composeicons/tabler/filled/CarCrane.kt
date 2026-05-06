package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.CarCrane: ImageVector
    get() {
        if (_carCrane != null) return _carCrane!!
        _carCrane = tablerFilledIcon(
            name = "CarCrane",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M3.06 5.66l.035-.085 .07-.125 .033-.048 .063-.075 .064-.065 .098-.079 .106-.065 .067-.033 .048-.02 .139-.041L21.836 2.014c.29-.048 .586 .034 .81 .223 .224 .19 .354 .469 .354 .763v2c0 .552-.448 1-1 1C21.448 6 21 5.552 21 5v-.82L7.198 6.48l1.25 .626C8.786 7.276 9 7.622 9 8l-.001 3h2.001v-4c0-.552 .448-1 1-1h4c3.314 0 6 2.686 6 6v5c0 .552-.448 1-1 1h-1.17c-.423 1.2-1.558 2.002-2.83 2.002-1.272 0-2.407-.802-2.83-2.002h-6.34c-.488 1.377-1.896 2.203-3.336 1.956C3.054 19.709 2.001 18.461 2 17v-5c0-.552 .448-1 1-1v-4.99c-.001-.119 .019-.238 .06-.35M5 16c-.552 0-1 .448-1 1 0 .552 .448 1 1 1 .552 0 1-.448 1-1C6 16.448 5.552 16 5 16M17 16c-.536-0-.977 .423-.999 .958-.022 .536 .382 .994 .916 1.038 .534 .044 1.009-.34 1.075-.873L18 16.992l-.007-.109C17.934 16.38 17.507 16 17 16M16.348 8.015 17.243 11h2.63l-.042-.155C19.386 9.368 18.132 8.279 16.608 8.045Z"),
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
        return _carCrane!!
    }

private var _carCrane: ImageVector? = null
