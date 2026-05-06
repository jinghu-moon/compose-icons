package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.CrumpledPaper: ImageVector
    get() {
        if (_crumpledPaper != null) return _crumpledPaper!!
        _crumpledPaper = radixIcon(
            name = "CrumpledPaper",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15f, height = 15f),
        ) {
            addPath(
                pathData = parseSvgPathData("M4.609 .063 8.609 1.063l.092 .034 3 1.5c.152 .076 .249 .232 .249 .402v2.274l1.819 1.365c.141 .106 .208 .286 .17 .458l-1 4.5-.017 .057c-.047 .128-.149 .229-.28 .272l-3 1c-.006 .002-.012 .004-.019 .006l-3.5 1c-.188 .054-.389-.02-.498-.183L4.201 11.612 1.327 10.415l-.072-.038c-.158-.103-.239-.297-.191-.486L2.012 6.099 .64 4.27C.556 4.158 .529 4.013 .567 3.879 .604 3.744 .703 3.634 .833 3.582L3.154 2.653 4.082 .333C4.155 .15 4.337 .039 4.527 .051l.082 .013ZM6.852 4.281l-.048 .051c-.119 .109-.29 .147-.446 .095L3.515 3.479 1.713 4.199 2.725 5.55h2.275c.248 0 .45 .202 .45 .45-0 .248-.202 .45-.45 .45h-2.148L2.031 9.733l2.642 1.102c.062 .026 .117 .064 .161 .113L4.874 11l1.318 1.977 2.211-.632L7.262 11.632c-.211-.132-.275-.409-.144-.62 .132-.211 .409-.275 .62-.143l1.516 .947 .819-2.458c.02-.06 .052-.114 .094-.16l.045-.043L12.776 7.019 11.433 6.012 9.361 6.84 8.927 8.143l-.037 .083c-.105 .181-.326 .27-.532 .201C8.151 8.358 8.028 8.154 8.053 7.946l.021-.089L8.573 6.357c.031-.094 .092-.175 .173-.229l.087-.046 2.217-.887v-1.918L8.625 2.064 6.852 4.281ZM10.887 9.764l-.675 2.024 1.904-.635 .658-2.963L10.887 9.764ZM4.096 2.724l2.249 .75L7.711 1.766 4.773 1.031 4.096 2.724Z"),
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
        return _crumpledPaper!!
    }

private var _crumpledPaper: ImageVector? = null
