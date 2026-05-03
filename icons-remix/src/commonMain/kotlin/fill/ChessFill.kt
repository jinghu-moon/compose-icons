package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.ChessFill: ImageVector
    get() {
        if (_chessFill != null) return _chessFill!!
        _chessFill = remixIcon(
            name = "ChessFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 5.000 16.000 L 17.808 16.000 C 17.410 14.185 16.343 12.853 14.147 11.911 C 13.927 11.817 13.810 11.571 13.885 11.344 C 13.952 11.144 14.150 11.017 14.361 11.041 L 18.846 11.551 C 19.243 11.596 19.628 11.400 19.827 11.053 L 20.653 9.608 C 20.861 9.243 20.819 8.787 20.548 8.466 L 15.500 2.500 L 15.500 0.287 C 9.336 2.840 5.000 8.913 5.000 16.000 ZM 4.000 17.000 L 19.000 17.000 L 19.000 20.000 L 20.000 20.000 L 20.000 22.000 L 3.000 22.000 L 3.000 20.000 L 4.000 20.000 L 4.000 17.000 ZM 15.000 7.000 C 15.000 7.552 14.552 8.000 14.000 8.000 C 13.448 8.000 13.000 7.552 13.000 7.000 C 13.000 6.448 13.448 6.000 14.000 6.000 C 14.552 6.000 15.000 6.448 15.000 7.000 Z"),
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
        return _chessFill!!
    }

private var _chessFill: ImageVector? = null
