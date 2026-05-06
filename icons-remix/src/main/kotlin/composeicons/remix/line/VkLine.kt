package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.VkLine: ImageVector
    get() {
        if (_vkLine != null) return _vkLine!!
        _vkLine = remixIcon(
            name = "VkLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M5.827 5.828c-.343 .349-.57 .839-.695 1.771-.129 .964-.131 2.243-.131 4.081v.64c0 1.836 .002 3.113 .131 4.077 .125 .932 .352 1.424 .697 1.776 .349 .344 .839 .57 1.771 .695 .964 .129 2.243 .131 4.081 .131h.64c1.836 0 3.113-.002 4.077-.131 .932-.125 1.424-.352 1.776-.697 .344-.349 .57-.839 .695-1.771 .129-.964 .131-2.243 .131-4.081v-.64c0-1.836-.002-3.113-.131-4.077-.125-.932-.352-1.424-.697-1.776-.349-.343-.839-.57-1.771-.695-.964-.129-2.243-.131-4.081-.131h-.64c-1.836 0-3.113 .002-4.077 .131-.932 .125-1.424 .352-1.776 .697ZM11.68 3h.64c1.444 0 2.911-.043 4.347 .149 1.156 .155 2.136 .487 2.917 1.261l.008 .008c.773 .784 1.104 1.763 1.259 2.919 .192 1.434 .149 2.9 .149 4.343v.64c0 1.444 .043 2.911-.149 4.347-.155 1.156-.486 2.135-1.261 2.917l-.008 .008c-.784 .773-1.763 1.104-2.919 1.259C15.229 21.043 13.763 21 12.32 21h-.64c-1.444 0-2.911 .043-4.347-.149C6.177 20.696 5.198 20.365 4.417 19.59l-.008-.008C3.636 18.799 3.304 17.819 3.149 16.663 2.957 15.229 3 13.763 3 12.32v-.64c0-1.444-.043-2.911 .149-4.347C3.304 6.177 3.636 5.198 4.41 4.416l.008-.008C5.202 3.635 6.181 3.304 7.338 3.149c1.434-.192 2.9-.149 4.343-.149ZM6.036 8.478c.096 4.68 2.436 7.488 6.54 7.488h.006 .234v-2.676c1.506 .15 2.646 1.254 3.102 2.676h2.13c-.219-.808-.606-1.561-1.136-2.208-.531-.647-1.192-1.175-1.942-1.548 .672-.409 1.251-.952 1.704-1.595 .452-.643 .767-1.373 .924-2.143h-1.932c-.42 1.488-1.668 2.838-2.85 2.964v-2.958h-1.938v5.184C9.678 13.362 8.166 11.91 8.1 8.478h-2.064Z"),
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
        return _vkLine!!
    }

private var _vkLine: ImageVector? = null
