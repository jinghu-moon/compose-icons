package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.Crop2Line: ImageVector
    get() {
        if (_crop2Line != null) return _crop2Line!!
        _crop2Line = remixIcon(
            name = "Crop2Line",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M8.414 17h6.586v2h-9C5.448 19 5 18.552 5 18v-11h-3v-2h3v-3h2v13.586L15.586 7h-6.586v-2h8.586L20.142 2.444l1.414 1.414L19 6.414v10.586h3v2h-3v3h-2v-13.586L8.414 17Z"),
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
        return _crop2Line!!
    }

private var _crop2Line: ImageVector? = null
