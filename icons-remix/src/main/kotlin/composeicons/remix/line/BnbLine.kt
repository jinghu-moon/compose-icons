package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.BnbLine: ImageVector
    get() {
        if (_bnbLine != null) return _bnbLine!!
        _bnbLine = remixIcon(
            name = "BnbLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12 20.689 9.991 19.526l-.003 2.309L12 23l2.012-1.164-.003-2.309-2.009 1.163ZM16.007 18.369l.003 2.309 5.49-3.178v-6.354l-2 1.151v4.05l-3.493 2.022ZM19.5 9.989l2-1.152v-2.338L19.504 5.344 17.508 6.5l1.992 1.153v2.336ZM15.512 5.344 17.508 4.189 12 1 6.492 4.189 8.488 5.345 12 3.311l3.512 2.033ZM6.492 6.5 4.496 5.345 2.5 6.5v2.338L4.5 9.99v-2.337L6.492 6.5ZM2.5 11.146l2 1.151v4.049l3.492 2.022-.003 2.309L2.5 17.5v-6.354ZM17.5 8.806 15.512 7.656 12 9.689 8.488 7.656 6.5 8.806v2.335l3.498 2.014-.005 4.061 2.006 1.162 2.006-1.161-.005-4.061 3.499-2.015v-2.335ZM7.995 16.059l.002-1.748L6.5 13.449v1.745l1.495 .866ZM10.483 6.5l1.516 .878 1.517-.878L12 5.622l-1.517 .878ZM16.003 14.311l1.497-.862v1.745l-1.495 .866-.002-1.749Z"),
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
        return _bnbLine!!
    }

private var _bnbLine: ImageVector? = null
