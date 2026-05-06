package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.BrandSteam: ImageVector
    get() {
        if (_brandSteam != null) return _brandSteam!!
        _brandSteam = tablerFilledIcon(
            name = "BrandSteam",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M16.5 4c1.999 .005 3.838 1.093 4.803 2.843 .965 1.75 .905 3.886-.157 5.579-1.062 1.693-2.959 2.677-4.955 2.569l-.078-.007-3.646 2.524-.011 .094c-.267 1.775-1.707 3.18-3.571 3.38L8.676 21h-.176C6.822 21 5.322 19.953 4.744 18.377l-.016-.048L2.606 17.419c-.328-.141-.556-.446-.599-.8L2 16.5v-3.5c0-.346 .18-.668 .474-.85 .295-.182 .663-.199 .973-.044l2.964 1.481 .174-.1c.657-.359 1.402-.526 2.15-.482l.166 .014 2.126-2.977-.01-.098c-.109-1.344 .28-2.682 1.092-3.758l.169-.212C13.323 4.723 14.87 4 16.5 4M16.5 7.5c-1.105 0-2 .895-2 2 0 1.105 .895 2 2 2 1.105 0 2-.895 2-2 0-1.105-.895-2-2-2"),
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
        return _brandSteam!!
    }

private var _brandSteam: ImageVector? = null
