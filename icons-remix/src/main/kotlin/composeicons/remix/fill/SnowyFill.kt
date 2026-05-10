package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.SnowyFill: ImageVector
    get() {
        if (_snowyFill != null) return _snowyFill!!
        _snowyFill = remixIcon(
            name = "SnowyFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M6.027 17.429C3.081 16.249 1 13.368 1 10 1 5.582 4.582 2 9 2c3.395 0 6.296 2.115 7.458 5.099C16.795 7.034 17.144 7 17.5 7 20.538 7 23 9.462 23 12.5c0 2.869-2.197 5.225-5 5.478C17.988 14.674 15.306 12 12 12 8.879 12 6.314 14.383 6.027 17.429ZM13 16.268l1.964-1.134 1 1.732L14 18l1.964 1.134-1 1.732L13 19.732v2.268h-2v-2.268L9.036 20.866l-1-1.732L10 18 8.036 16.866l1-1.732L11 16.268v-2.268h2v2.268Z"),
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
        return _snowyFill!!
    }

private var _snowyFill: ImageVector? = null
