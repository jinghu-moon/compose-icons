package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.CoreosFill: ImageVector
    get() {
        if (_coreosFill != null) return _coreosFill!!
        _coreosFill = remixIcon(
            name = "CoreosFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12 22C6.477 22 2 17.523 2 12 2 6.477 6.477 2 12 2c5.523 0 10 4.477 10 10 0 5.523-4.477 10-10 10ZM8.329 12.304c-.04 .851 .038 1.698 .118 2.545 .006 .06 .028 .073 .081 .08 .406 .053 .812 .101 1.221 .127 .965 .061 1.929 .138 2.896 .084 .549-.031 1.1-.047 1.648-.095 .781-.068 1.56-.155 2.33-.311 .959-.194 1.907-.425 2.801-.845 .405-.19 .79-.415 1.113-.736 .237-.235 .408-.508 .41-.859 .002-.314-.014-.628-.045-.941-.074-.746-.227-1.476-.482-2.18C19.837 7.554 18.912 6.183 17.596 5.103 16.458 4.168 15.175 3.54 13.744 3.239c-.5-.105-1.006-.144-1.514-.18-.573-.041-1.064 .121-1.488 .514-.495 .458-.837 1.025-1.122 1.634C8.953 6.633 8.647 8.16 8.454 9.714c-.106 .857-.166 1.721-.126 2.59ZM11.899 7.274c.959 .031 1.77 .324 2.494 .856 .896 .658 1.47 1.528 1.714 2.612 .068 .304 .097 .612 .104 .922 .004 .209-.11 .362-.263 .49-.307 .257-.67 .401-1.05 .507-.741 .208-1.496 .327-2.265 .366-.5 .026-1 .035-1.5 .01-.192-.01-.385-.024-.577-.032-.06-.002-.08-.02-.084-.082-.023-.434-.057-.867-.051-1.302 .016-1.026 .094-2.045 .397-3.033 .101-.329 .223-.65 .421-.936 .172-.25 .378-.438 .659-.379Z"),
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
        return _coreosFill!!
    }

private var _coreosFill: ImageVector? = null
