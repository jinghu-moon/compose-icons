package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.Save2Line: ImageVector
    get() {
        if (_save2Line != null) return _save2Line!!
        _save2Line = remixIcon(
            name = "Save2Line",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 5.000 5.000 L 5.000 19.000 L 19.000 19.000 L 19.000 7.828 L 16.172 5.000 L 5.000 5.000 ZM 4.000 3.000 L 17.000 3.000 L 20.707 6.707 C 20.895 6.895 21.000 7.149 21.000 7.414 L 21.000 20.000 C 21.000 20.552 20.552 21.000 20.000 21.000 L 4.000 21.000 C 3.448 21.000 3.000 20.552 3.000 20.000 L 3.000 4.000 C 3.000 3.448 3.448 3.000 4.000 3.000 ZM 12.000 18.000 C 10.343 18.000 9.000 16.657 9.000 15.000 C 9.000 13.343 10.343 12.000 12.000 12.000 C 13.657 12.000 15.000 13.343 15.000 15.000 C 15.000 16.657 13.657 18.000 12.000 18.000 ZM 6.000 6.000 L 15.000 6.000 L 15.000 10.000 L 6.000 10.000 L 6.000 6.000 Z"),
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
        return _save2Line!!
    }

private var _save2Line: ImageVector? = null
