package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.GlobeLine: ImageVector
    get() {
        if (_globeLine != null) return _globeLine!!
        _globeLine = remixIcon(
            name = "GlobeLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M13 21h5v2h-12v-2h5v-1.049C7.707 19.624 4.884 17.699 3.316 14.962l1.737-.993C6.432 16.378 9.027 18 12 18c4.418 0 8-3.582 8-8 0-2.974-1.622-5.568-4.03-6.947l.993-1.737c3.01 1.724 5.038 4.967 5.038 8.684 0 5.185-3.947 9.449-9 9.951v1.049ZM12 17C8.134 17 5 13.866 5 10c0-3.866 3.134-7 7-7 3.866 0 7 3.134 7 7 0 3.866-3.134 7-7 7ZM12 15c2.761 0 5-2.239 5-5 0-2.761-2.239-5-5-5C9.239 5 7 7.239 7 10c0 2.761 2.239 5 5 5Z"),
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
        return _globeLine!!
    }

private var _globeLine: ImageVector? = null
