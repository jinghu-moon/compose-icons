package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.Loader2Line: ImageVector
    get() {
        if (_loader2Line != null) return _loader2Line!!
        _loader2Line = remixIcon(
            name = "Loader2Line",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 12.000 2.000 C 12.552 2.000 13.000 2.448 13.000 3.000 L 13.000 6.000 C 13.000 6.552 12.552 7.000 12.000 7.000 C 11.448 7.000 11.000 6.552 11.000 6.000 L 11.000 3.000 C 11.000 2.448 11.448 2.000 12.000 2.000 ZM 12.000 17.000 C 12.552 17.000 13.000 17.448 13.000 18.000 L 13.000 21.000 C 13.000 21.552 12.552 22.000 12.000 22.000 C 11.448 22.000 11.000 21.552 11.000 21.000 L 11.000 18.000 C 11.000 17.448 11.448 17.000 12.000 17.000 ZM 22.000 12.000 C 22.000 12.552 21.552 13.000 21.000 13.000 L 18.000 13.000 C 17.448 13.000 17.000 12.552 17.000 12.000 C 17.000 11.448 17.448 11.000 18.000 11.000 L 21.000 11.000 C 21.552 11.000 22.000 11.448 22.000 12.000 ZM 7.000 12.000 C 7.000 12.552 6.552 13.000 6.000 13.000 L 3.000 13.000 C 2.448 13.000 2.000 12.552 2.000 12.000 C 2.000 11.448 2.448 11.000 3.000 11.000 L 6.000 11.000 C 6.552 11.000 7.000 11.448 7.000 12.000 ZM 19.071 19.071 C 18.681 19.462 18.047 19.462 17.657 19.071 L 15.535 16.950 C 15.145 16.559 15.145 15.926 15.535 15.535 C 15.926 15.145 16.559 15.145 16.950 15.535 L 19.071 17.657 C 19.462 18.047 19.462 18.681 19.071 19.071 ZM 8.464 8.464 C 8.074 8.855 7.441 8.855 7.050 8.464 L 4.929 6.343 C 4.538 5.953 4.538 5.319 4.929 4.929 C 5.319 4.538 5.953 4.538 6.343 4.929 L 8.464 7.050 C 8.855 7.441 8.855 8.074 8.464 8.464 ZM 4.929 19.071 C 4.538 18.681 4.538 18.047 4.929 17.657 L 7.050 15.535 C 7.441 15.145 8.074 15.145 8.464 15.535 C 8.855 15.926 8.855 16.559 8.464 16.950 L 6.343 19.071 C 5.953 19.462 5.319 19.462 4.929 19.071 ZM 15.535 8.464 C 15.145 8.074 15.145 7.441 15.535 7.050 L 17.657 4.929 C 18.047 4.538 18.681 4.538 19.071 4.929 C 19.462 5.319 19.462 5.953 19.071 6.343 L 16.950 8.464 C 16.559 8.855 15.926 8.855 15.535 8.464 Z"),
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
        return _loader2Line!!
    }

private var _loader2Line: ImageVector? = null
