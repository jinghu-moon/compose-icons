package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.GitPrDraftLine: ImageVector
    get() {
        if (_gitPrDraftLine != null) return _gitPrDraftLine!!
        _gitPrDraftLine = remixIcon(
            name = "GitPrDraftLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 5.000 6.000 C 5.000 5.448 5.448 5.000 6.000 5.000 C 6.552 5.000 7.000 5.448 7.000 6.000 C 7.000 6.552 6.552 7.000 6.000 7.000 C 5.448 7.000 5.000 6.552 5.000 6.000 ZM 6.000 3.000 C 4.343 3.000 3.000 4.343 3.000 6.000 C 3.000 7.306 3.835 8.417 5.000 8.829 L 5.000 15.171 C 3.835 15.583 3.000 16.694 3.000 18.000 C 3.000 19.657 4.343 21.000 6.000 21.000 C 7.657 21.000 9.000 19.657 9.000 18.000 C 9.000 16.694 8.165 15.583 7.000 15.171 L 7.000 8.829 C 8.165 8.417 9.000 7.306 9.000 6.000 C 9.000 4.343 7.657 3.000 6.000 3.000 ZM 5.000 18.000 C 5.000 17.448 5.448 17.000 6.000 17.000 C 6.552 17.000 7.000 17.448 7.000 18.000 C 7.000 18.552 6.552 19.000 6.000 19.000 C 5.448 19.000 5.000 18.552 5.000 18.000 ZM 18.000 17.000 C 17.448 17.000 17.000 17.448 17.000 18.000 C 17.000 18.552 17.448 19.000 18.000 19.000 C 18.552 19.000 19.000 18.552 19.000 18.000 C 19.000 17.448 18.552 17.000 18.000 17.000 ZM 15.000 18.000 C 15.000 16.343 16.343 15.000 18.000 15.000 C 19.657 15.000 21.000 16.343 21.000 18.000 C 21.000 19.657 19.657 21.000 18.000 21.000 C 16.343 21.000 15.000 19.657 15.000 18.000 ZM 18.000 7.500 C 18.828 7.500 19.500 6.828 19.500 6.000 C 19.500 5.172 18.828 4.500 18.000 4.500 C 17.172 4.500 16.500 5.172 16.500 6.000 C 16.500 6.828 17.172 7.500 18.000 7.500 ZM 19.500 11.500 C 19.500 12.328 18.828 13.000 18.000 13.000 C 17.172 13.000 16.500 12.328 16.500 11.500 C 16.500 10.672 17.172 10.000 18.000 10.000 C 18.828 10.000 19.500 10.672 19.500 11.500 Z"),
        pathFillType = PathFillType.NonZero,
        fill = SolidColor(Color(0xFF000000)),
        fillAlpha = 1.0f,
        stroke = null,
        strokeAlpha = 1.0f,
        strokeLineWidth = 0.0f,
        strokeLineCap = StrokeCap.Butt,
        strokeLineJoin = StrokeJoin.Miter,
    )
        }
        return _gitPrDraftLine!!
    }

private var _gitPrDraftLine: ImageVector? = null
