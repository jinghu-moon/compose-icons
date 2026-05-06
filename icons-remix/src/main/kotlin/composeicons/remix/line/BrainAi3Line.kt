package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.BrainAi3Line: ImageVector
    get() {
        if (_brainAi3Line != null) return _brainAi3Line!!
        _brainAi3Line = remixIcon(
            name = "BrainAi3Line",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M19.5 4.783v2.888L22 9.114v5.772l-2.501 1.444 .001 2.887-5 2.887L12 20.661 9.5 22.104l-5-2.887v-2.887L2 14.888 2.001 9.113 4.5 7.67v-2.886l5-2.887 2.499 1.443L14.501 1.896l4.999 2.887ZM13 5.072v1.928h-2v-1.927L9.5 4.207 6.499 5.938v2.887L4 10.268v3.466l2.5 1.443v2.887l3 1.732L11 18.929v-1.929h2v1.93l1.5 .866 3-1.733v-2.886L20 13.732v-3.463L17.499 8.825l.001-2.888L14.501 4.206 13 5.072ZM14.265 13.16c.088-.213 .383-.213 .471 0l.127 .305c.216 .521 .618 .938 1.125 1.163l.358 .159c.205 .091 .205 .39 0 .482l-.38 .169c-.494 .22-.89 .621-1.109 1.125l-.123 .282c-.09 .207-.377 .207-.467 0l-.123-.282c-.22-.504-.616-.905-1.109-1.125l-.38-.169c-.205-.091-.205-.39 0-.482l.358-.159c.507-.225 .909-.642 1.125-1.163l.127-.305ZM9.588 7.779c.155-.373 .67-.373 .824 0l.222 .535c.378 .912 1.082 1.642 1.969 2.036l.628 .278c.359 .16 .359 .683 0 .843l-.665 .296c-.864 .384-1.557 1.087-1.941 1.97l-.216 .495c-.158 .362-.658 .362-.816 0l-.216-.495C8.991 12.855 8.299 12.152 7.435 11.768l-.665-.296c-.359-.16-.359-.683 0-.843l.628-.278C8.284 9.956 8.988 9.227 9.366 8.314l.222-.535Z"),
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
        return _brainAi3Line!!
    }

private var _brainAi3Line: ImageVector? = null
