package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.SnowyLine: ImageVector
    get() {
        if (_snowyLine != null) return _snowyLine!!
        _snowyLine = remixIcon(
            name = "SnowyLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M13 16.268l1.964-1.134 1 1.732L14 18l1.964 1.134-1 1.732L13 19.732v2.268h-2v-2.268L9.036 20.866l-1-1.732L10 18 8.036 16.866l1-1.732L11 16.268v-2.268h2v2.268ZM17 18v-2h.5C19.433 16 21 14.433 21 12.5 21 10.567 19.433 9 17.5 9c-.979 0-1.865 .402-2.5 1.051C15 10.034 15 10.017 15 10 15 6.686 12.314 4 9 4 5.686 4 3 6.686 3 10c0 2.612 1.67 4.835 4 5.659v2.089C3.55 16.86 1 13.728 1 10 1 5.582 4.582 2 9 2c3.395 0 6.296 2.115 7.458 5.099C16.795 7.034 17.144 7 17.5 7 20.538 7 23 9.462 23 12.5 23 15.538 20.538 18 17.5 18h-.5Z"),
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
        return _snowyLine!!
    }

private var _snowyLine: ImageVector? = null
