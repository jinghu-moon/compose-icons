package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.VisaFill: ImageVector
    get() {
        if (_visaFill != null) return _visaFill!!
        _visaFill = remixIcon(
            name = "VisaFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M1 4h22v2h-22v-2ZM1 18h22v2h-22v-2ZM19.622 14.914l-.174-.87-1.949-0-.309 .863-1.562 .003c1.004-2.407 1.749-4.19 2.235-5.349 .127-.303 .353-.457 .685-.455 .254 .002 .669 .002 1.244 .001L21 14.911l-1.378 .003ZM17.938 12.852h1.256l-.469-2.18-.787 2.18ZM7.872 9.106l1.57 .002L7.015 14.914 5.425 14.913C4.888 12.842 4.493 11.307 4.241 10.308c-.077-.307-.231-.521-.526-.622C3.452 9.596 3.014 9.456 2.4 9.267v-.159c1.147-0 1.983-0 2.509 0 .434 0 .688 .209 .769 .639 .082 .431 .288 1.528 .62 3.289L7.872 9.106ZM11.599 9.108l-1.241 5.805L8.864 14.911c.029-.141 .442-2.076 1.239-5.805l1.496 .002ZM14.631 9c.447 0 1.01 .138 1.335 .267l-.262 1.204c-.293-.117-.775-.276-1.18-.27-.59 .009-.954 .256-.954 .493 0 .385 .632 .578 1.284 .999 .743 .48 .841 .91 .832 1.378C15.674 14.042 14.853 15 13.12 15c-.791-.012-1.076-.078-1.72-.306l.272-1.256c.656 .274 .935 .361 1.496 .361 .514 0 .955-.207 .959-.568 .003-.257-.155-.384-.732-.701-.577-.318-1.386-.757-1.375-1.64C12.033 9.758 13.107 9 14.631 9Z"),
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
        return _visaFill!!
    }

private var _visaFill: ImageVector? = null
