package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.Store2Line: ImageVector
    get() {
        if (_store2Line != null) return _store2Line!!
        _store2Line = remixIcon(
            name = "Store2Line",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 21.000 13.242 L 21.000 20.000 L 22.000 20.000 L 22.000 22.000 L 2.000 22.000 L 2.000 20.000 L 3.000 20.000 L 3.000 13.242 C 1.794 12.435 1.000 11.060 1.000 9.500 C 1.000 8.673 1.224 7.876 1.633 7.197 L 4.345 2.500 C 4.524 2.191 4.854 2.000 5.211 2.000 L 18.789 2.000 C 19.146 2.000 19.476 2.191 19.655 2.500 L 22.358 7.182 C 22.776 7.876 23.000 8.673 23.000 9.500 C 23.000 11.060 22.206 12.435 21.000 13.242 ZM 19.000 13.972 C 18.836 13.991 18.669 14.000 18.500 14.000 C 17.241 14.000 16.079 13.478 15.250 12.613 C 14.421 13.478 13.259 14.000 12.000 14.000 C 10.741 14.000 9.579 13.478 8.750 12.613 C 7.921 13.478 6.759 14.000 5.500 14.000 C 5.331 14.000 5.164 13.991 5.000 13.972 L 5.000 20.000 L 19.000 20.000 L 19.000 13.972 ZM 5.789 4.000 L 3.356 8.213 C 3.124 8.598 3.000 9.039 3.000 9.500 C 3.000 10.881 4.119 12.000 5.500 12.000 C 6.531 12.000 7.445 11.370 7.822 10.429 C 8.157 9.592 9.343 9.592 9.678 10.429 C 10.055 11.370 10.969 12.000 12.000 12.000 C 13.031 12.000 13.945 11.370 14.322 10.429 C 14.657 9.592 15.843 9.592 16.178 10.429 C 16.555 11.370 17.469 12.000 18.500 12.000 C 19.881 12.000 21.000 10.881 21.000 9.500 C 21.000 9.039 20.876 8.598 20.635 8.197 L 18.211 4.000 L 5.789 4.000 Z"),
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
        return _store2Line!!
    }

private var _store2Line: ImageVector? = null
