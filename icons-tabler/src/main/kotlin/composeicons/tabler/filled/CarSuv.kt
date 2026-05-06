package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.CarSuv: ImageVector
    get() {
        if (_carSuv != null) return _carSuv!!
        _carSuv = tablerFilledIcon(
            name = "CarSuv",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M7 14c1.657 0 3 1.343 3 3 0 1.657-1.343 3-3 3C5.343 20 4 18.657 4 17l.005-.176C4.098 15.238 5.411 14 7 14M18 14c1.657 0 3 1.343 3 3 0 1.657-1.343 3-3 3-1.657 0-3-1.343-3-3l.005-.176C15.098 15.238 16.411 14 18 14M7 16c-.552 0-1 .448-1 1 0 .552 .448 1 1 1 .552 0 1-.448 1-1C8 16.448 7.552 16 7 16M18 16c-.552 0-1 .448-1 1 0 .552 .448 1 1 1 .552 0 1-.448 1-1 0-.552-.448-1-1-1M14.438 4c1.376 0 2.576 .937 2.91 2.272L17.781 8h2.219c1.589-0 2.902 1.238 2.995 2.824L23 11v3.02l-.01 .117c-.03 .218-.13 .42-.286 .575l-.107 .091-.07 .049-.076 .042-.106 .046-.017 .005-.047 .016-.108 .025-.118 .013-.08 .002-.122-.012-.148-.033-.063-.022c-.137-.053-.26-.134-.362-.24l-.08-.094C20.445 13.593 19.259 13 18 13c-1.259 0-2.445 .593-3.2 1.6C14.611 14.852 14.315 15 14 15h-3c-.315 0-.611-.148-.8-.4C9.445 13.591 8.258 12.998 6.998 12.998c-1.26 0-2.446 .595-3.2 1.604-.331 .442-.958 .533-1.4 .202-.442-.331-.533-.958-.202-1.4C2.689 12.744 3.306 12.204 4 11.802v-2.792c-.001-.119 .019-.238 .06-.35l.042-.1L6.106 4.553C6.275 4.214 6.621 4 7 4ZM2 6c.552 0 1 .448 1 1v4c0 .552-.448 1-1 1C1.448 12 1 11.552 1 11v-4C1 6.448 1.448 6 2 6M14.438 6h-3.438v2h4.718L15.408 6.757C15.297 6.312 14.897 6 14.438 6M9 6h-1.382L6.617 8h2.383Z"),
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
        return _carSuv!!
    }

private var _carSuv: ImageVector? = null
