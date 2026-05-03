package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.PokerSpadesLine: ImageVector
    get() {
        if (_pokerSpadesLine != null) return _pokerSpadesLine!!
        _pokerSpadesLine = remixIcon(
            name = "PokerSpadesLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 12.000 15.916 C 11.882 15.467 11.610 15.065 11.218 14.789 C 10.626 14.372 9.853 14.307 9.200 14.621 C 8.703 14.860 8.126 15.000 7.500 15.000 C 5.383 15.000 4.000 13.482 4.000 12.000 C 4.000 10.940 4.515 9.885 5.613 8.710 C 6.746 7.498 8.268 6.399 9.898 5.224 C 10.591 4.724 11.319 4.200 12.000 3.657 C 12.681 4.200 13.409 4.724 14.102 5.224 C 15.732 6.399 17.254 7.498 18.387 8.710 C 19.485 9.885 20.000 10.940 20.000 12.000 C 20.000 13.482 18.617 15.000 16.500 15.000 C 15.874 15.000 15.297 14.860 14.800 14.621 C 14.147 14.307 13.374 14.372 12.782 14.789 C 12.390 15.065 12.118 15.467 12.000 15.916 ZM 12.000 1.000 C 11.129 1.871 9.920 2.742 8.644 3.662 C 5.525 5.911 2.000 8.452 2.000 12.000 C 2.000 14.761 4.462 17.000 7.500 17.000 C 8.427 17.000 9.300 16.792 10.066 16.424 C 9.974 17.291 9.788 18.030 9.530 18.741 C 9.310 19.345 9.039 19.929 8.728 20.554 C 8.398 21.220 8.875 22.000 9.618 22.000 L 14.382 22.000 C 15.125 22.000 15.602 21.220 15.272 20.554 C 14.962 19.929 14.690 19.345 14.470 18.741 C 14.212 18.030 14.026 17.291 13.934 16.424 C 14.700 16.792 15.573 17.000 16.500 17.000 C 19.538 17.000 22.000 14.761 22.000 12.000 C 22.000 8.452 18.475 5.911 15.356 3.662 C 14.080 2.742 12.871 1.871 12.000 1.000 ZM 12.000 17.074 C 12.158 18.184 12.451 19.121 12.815 20.000 L 11.185 20.000 C 11.549 19.121 11.842 18.184 12.000 17.074 Z"),
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
        return _pokerSpadesLine!!
    }

private var _pokerSpadesLine: ImageVector? = null
