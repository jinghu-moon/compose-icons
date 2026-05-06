package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.MovieLine: ImageVector
    get() {
        if (_movieLine != null) return _movieLine!!
        _movieLine = remixIcon(
            name = "MovieLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M2 3.993C2 3.445 2.455 3 2.992 3h18.016c.548 0 .992 .445 .992 .993v16.013c0 .549-.455 .993-.992 .993h-18.016C2.444 21 2 20.555 2 20.007v-16.013ZM4 5v14h16v-14h-16ZM10.622 8.415l4.879 3.253c.184 .122 .233 .371 .111 .555-.029 .044-.067 .082-.111 .111l-4.879 3.253c-.184 .123-.432 .073-.555-.111C10.023 15.409 10 15.332 10 15.253v-6.505c0-.221 .179-.4 .4-.4 .079 0 .156 .023 .222 .067Z"),
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
        return _movieLine!!
    }

private var _movieLine: ImageVector? = null
