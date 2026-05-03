package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.BarricadeLine: ImageVector
    get() {
        if (_barricadeLine != null) return _barricadeLine!!
        _barricadeLine = remixIcon(
            name = "BarricadeLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 6.493 19.000 L 17.507 19.000 L 16.840 16.000 L 7.160 16.000 L 6.493 19.000 ZM 19.556 19.000 L 21.000 19.000 L 21.000 21.000 L 3.000 21.000 L 3.000 19.000 L 4.444 19.000 L 7.826 3.783 C 7.928 3.326 8.333 3.000 8.802 3.000 L 15.198 3.000 C 15.667 3.000 16.072 3.326 16.174 3.783 L 19.556 19.000 ZM 7.604 14.000 L 16.396 14.000 L 15.507 10.000 L 8.493 10.000 L 7.604 14.000 ZM 8.938 8.000 L 15.062 8.000 L 14.396 5.000 L 9.604 5.000 L 8.938 8.000 Z"),
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
        return _barricadeLine!!
    }

private var _barricadeLine: ImageVector? = null
