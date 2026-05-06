package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.ListBullet: ImageVector
    get() {
        if (_listBullet != null) return _listBullet!!
        _listBullet = radixIcon(
            name = "ListBullet",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15f, height = 15f),
        ) {
            addPath(
                pathData = parseSvgPathData("M1.5 9.75c.414 0 .75 .336 .75 .75 0 .414-.336 .75-.75 .75-.414 0-.75-.336-.75-.75 0-.414 .336-.75 .75-.75ZM13.601 10.01c.228 .047 .399 .248 .399 .49 0 .242-.171 .444-.399 .49L13.5 11h-9C4.224 11 4 10.776 4 10.5 4 10.224 4.224 10 4.5 10h9l.101 .01ZM1.5 6.75c.414 0 .75 .336 .75 .75 0 .414-.336 .75-.75 .75-.414 0-.75-.336-.75-.75 0-.414 .336-.75 .75-.75ZM13.601 7.01c.228 .047 .399 .249 .399 .49 0 .242-.171 .444-.399 .49l-.101 .01h-9C4.224 8 4 7.776 4 7.5c0-.276 .224-.5 .5-.5h9l.101 .01ZM1.5 3.75c.414 0 .75 .336 .75 .75 0 .414-.336 .75-.75 .75-.414 0-.75-.336-.75-.75 0-.414 .336-.75 .75-.75ZM13.601 4.01c.228 .047 .399 .249 .399 .49 0 .242-.171 .444-.399 .49l-.101 .01h-9C4.224 5 4 4.776 4 4.5c0-.276 .224-.5 .5-.5h9l.101 .01Z"),
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
        return _listBullet!!
    }

private var _listBullet: ImageVector? = null
