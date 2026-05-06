package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.Brain3Line: ImageVector
    get() {
        if (_brain3Line != null) return _brain3Line!!
        _brain3Line = remixIcon(
            name = "Brain3Line",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M19.5 4.783v2.888L22 9.114v5.772l-2.501 1.444 .001 2.887-5 2.887L12 20.661 9.5 22.104l-5-2.887v-2.887L2 14.888 2.001 9.113 4.5 7.67v-2.886l5-2.887 2.499 1.443L14.501 1.896l4.999 2.887ZM13 5.072v2.928h-2v-2.927L9.5 4.207 6.499 5.938v2.887L4 10.268v3.466l2.5 1.443v2.887l3 1.732L11 18.929v-2.929h2l.001 2.93 1.499 .866 3-1.733v-2.886L20 13.732v-3.463L17.499 8.825l.001-2.888L14.501 4.206 13 5.072Z"),
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
        return _brain3Line!!
    }

private var _brain3Line: ImageVector? = null
