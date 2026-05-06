package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.BrandWhatsapp: ImageVector
    get() {
        if (_brandWhatsapp != null) return _brandWhatsapp!!
        _brandWhatsapp = tablerFilledIcon(
            name = "BrandWhatsapp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M18.497 4.409c3.749 3.199 4.608 8.652 2.024 12.849-2.584 4.197-7.84 5.885-12.384 3.979l-.223-.098-4.759 .849-.11 .011c-.037 .002-.073 .002-.11 0l-.102-.013-.108-.024-.105-.037-.099-.047-.093-.058-.014-.011-.012-.007-.086-.073-.077-.08-.067-.088-.056-.094-.034-.07-.04-.108-.028-.128-.012-.102c-.003-.042-.003-.083 0-.125l.012-.1 .024-.11 .045-.122L3.516 17.298l-.009-.014C1.03 13.285 1.675 8.1 5.056 4.83l.215-.203C8.995 1.233 14.663 1.14 18.497 4.41M9.5 7.5C8.672 7.5 8 8.172 8 9v1c0 3.314 2.686 6 6 6h1c.828 0 1.5-.672 1.5-1.5C16.5 13.672 15.828 13 15 13h-1l-.144 .007c-.464 .045-.881 .302-1.128 .697l-.042 .074-.022-.007c-1.137-.404-2.031-1.298-2.435-2.435l-.008-.023 .075-.041c.438-.274 .704-.755 .704-1.272v-1C11 8.172 10.328 7.5 9.5 7.5"),
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
        return _brandWhatsapp!!
    }

private var _brandWhatsapp: ImageVector? = null
