package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.BrandPaypal: ImageVector
    get() {
        if (_brandPaypal != null) return _brandPaypal!!
        _brandPaypal = tablerFilledIcon(
            name = "BrandPaypal",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12.5 2c3.113 0 5.309 1.785 5.863 4.565C20.088 7.75 21 9.717 21 12c0 2.933-2.748 5.384-5.783 5.496L15 17.5h-1.754l-.466 2.8c-.179 .882-.925 1.536-1.823 1.597l-.157 .003h-2.68c-.456 .009-.89-.19-1.182-.54-.251-.298-.376-.682-.348-1.07L6.632 20h-1.632C3.996 20 3.086 19.136 3.006 18.143L3 18l.01-.141L5.003 3.905l.003-.048C5.078 2.963 5.821 2.175 6.701 2.025l.156-.02L7 2h5.5ZM18.312 9.35l-.024 .087c-.706 2.403-3.072 4.436-5.555 4.557L12.5 14h-2.503v.05l-.025 .183-1.2 5c-.005 .024-.012 .047-.019 .07l-.088 .597h2.154l.595-3.564c.073-.438 .425-.775 .865-.829l.121-.007h2.6c2.073 0 4-1.67 4-3.5 0-1.022-.236-1.924-.688-2.65Z"),
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
        return _brandPaypal!!
    }

private var _brandPaypal: ImageVector? = null
