package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.HospitalLine: ImageVector
    get() {
        if (_hospitalLine != null) return _hospitalLine!!
        _hospitalLine = remixIcon(
            name = "HospitalLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M8 20v-6h8v6h3v-16h-14v16h3ZM10 20h4v-4h-4v4ZM21 20h2v2h-22v-2h2v-17C3 2.448 3.448 2 4 2h16c.552 0 1 .448 1 1v17ZM11 8v-2h2v2h2v2h-2v2h-2v-2h-2v-2h2Z"),
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
        return _hospitalLine!!
    }

private var _hospitalLine: ImageVector? = null
