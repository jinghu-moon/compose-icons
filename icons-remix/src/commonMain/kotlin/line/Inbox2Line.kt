package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.Inbox2Line: ImageVector
    get() {
        if (_inbox2Line != null) return _inbox2Line!!
        _inbox2Line = remixIcon(
            name = "Inbox2Line",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 4.024 3.783 C 4.125 3.326 4.531 3.000 5.000 3.000 L 19.000 3.000 C 19.469 3.000 19.875 3.326 19.976 3.783 L 21.976 12.783 C 21.992 12.854 22.000 12.927 22.000 13.000 L 22.000 20.000 C 22.000 20.552 21.552 21.000 21.000 21.000 L 3.000 21.000 C 2.448 21.000 2.000 20.552 2.000 20.000 L 2.000 13.000 C 2.000 12.927 2.008 12.854 2.024 12.783 L 4.024 3.783 ZM 5.802 5.000 L 4.247 12.000 L 9.000 12.000 C 9.000 13.657 10.343 15.000 12.000 15.000 C 13.657 15.000 15.000 13.657 15.000 12.000 L 19.753 12.000 L 18.198 5.000 L 5.802 5.000 ZM 16.584 14.000 C 15.812 15.766 14.050 17.000 12.000 17.000 C 9.950 17.000 8.188 15.766 7.416 14.000 L 4.000 14.000 L 4.000 19.000 L 20.000 19.000 L 20.000 14.000 L 16.584 14.000 Z"),
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
        return _inbox2Line!!
    }

private var _inbox2Line: ImageVector? = null
