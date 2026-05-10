package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.AtomFill: ImageVector
    get() {
        if (_atomFill != null) return _atomFill!!
        _atomFill = remixIcon(
            name = "AtomFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M14.415 3.308c2.074-.736 4.31-.846 5.717 .561 1.407 1.407 1.297 3.642 .561 5.717-.278 .783-.663 1.595-1.14 2.415 .477 .82 .862 1.632 1.14 2.415 .736 2.074 .846 4.31-.561 5.717-1.407 1.407-3.642 1.297-5.717 .561C13.632 20.414 12.82 20.03 12 19.553c-.82 .477-1.632 .862-2.415 1.14-2.074 .736-4.31 .846-5.717-.561C2.462 18.725 2.572 16.49 3.308 14.416 3.586 13.633 3.969 12.82 4.446 12 3.969 11.18 3.586 10.367 3.308 9.584 2.572 7.51 2.462 5.275 3.868 3.868 5.275 2.462 7.51 2.572 9.584 3.308c.783 .278 1.596 .661 2.416 1.139 .82-.477 1.632-.861 2.415-1.139ZM5.703 13.884c-.202 .412-.373 .814-.511 1.201-.671 1.892-.456 3.087 .09 3.633 .546 .546 1.741 .762 3.633 .091 .387-.137 .789-.31 1.2-.513C9.313 17.691 8.519 17.004 7.757 16.242 6.995 15.48 6.308 14.686 5.703 13.884ZM18.296 13.884c-.605 .803-1.292 1.597-2.054 2.359-.762 .762-1.556 1.448-2.358 2.053 .412 .202 .814 .374 1.201 .512 1.892 .671 3.087 .456 3.633-.09 .546-.546 .761-1.741 .09-3.633-.138-.388-.309-.79-.512-1.201ZM12 10c-1.105 0-2 .895-2 2 0 1.105 .895 2 2 2 1.104 0 2-.896 2-2 0-1.105-.896-2-2-2ZM8.915 5.192C7.023 4.521 5.828 4.736 5.282 5.282c-.546 .546-.761 1.741-.09 3.633 .137 .387 .309 .789 .511 1.2C6.308 9.313 6.996 8.52 7.758 7.758 8.52 6.996 9.313 6.308 10.115 5.703 9.704 5.501 9.302 5.33 8.915 5.192ZM18.718 5.282c-.546-.546-1.741-.761-3.633-.09-.387 .138-.79 .308-1.201 .511 .803 .605 1.596 1.292 2.358 2.054 .762 .762 1.449 1.556 2.054 2.358 .202-.411 .374-.812 .512-1.199 .671-1.892 .456-3.088-.09-3.634Z"),
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
        return _atomFill!!
    }

private var _atomFill: ImageVector? = null
