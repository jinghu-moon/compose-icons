package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.Cake3Line: ImageVector
    get() {
        if (_cake3Line != null) return _cake3Line!!
        _cake3Line = remixIcon(
            name = "Cake3Line",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 15.500 2.000 C 17.433 2.000 19.000 3.567 19.000 5.500 C 19.000 5.727 18.978 5.949 18.937 6.163 L 18.922 6.229 C 20.711 6.825 22.000 8.512 22.000 10.500 C 22.000 12.374 20.854 13.981 19.225 14.657 L 18.139 21.164 C 18.059 21.647 17.642 22.000 17.153 22.000 L 6.847 22.000 C 6.358 22.000 5.941 21.647 5.861 21.164 L 4.832 14.994 C 3.249 14.904 2.000 13.598 2.000 12.000 C 2.000 10.693 2.836 9.581 4.003 9.170 L 4.000 9.000 C 4.000 5.686 6.686 3.000 10.000 3.000 C 10.921 3.000 11.794 3.208 12.574 3.579 C 13.198 2.628 14.276 2.000 15.500 2.000 ZM 9.000 15.000 L 6.860 15.000 L 7.694 20.000 L 9.000 20.000 L 9.000 15.000 ZM 13.000 15.000 L 11.000 15.000 L 11.000 20.000 L 13.000 20.000 L 13.000 15.000 ZM 17.139 15.000 L 15.000 15.000 L 15.000 20.000 L 16.305 20.000 L 17.139 15.000 ZM 10.000 5.000 C 7.858 5.000 6.109 6.684 6.005 8.767 L 6.000 8.964 L 6.003 9.134 C 6.017 9.941 5.545 10.673 4.817 10.997 L 4.668 11.056 C 4.271 11.196 4.000 11.572 4.000 12.000 C 4.000 12.552 4.448 13.000 5.000 13.000 L 17.500 13.000 C 18.881 13.000 20.000 11.881 20.000 10.500 C 20.000 9.119 18.881 8.000 17.500 8.000 C 17.164 8.000 16.842 8.065 16.544 8.190 L 16.369 8.271 C 15.402 8.769 14.225 8.402 13.706 7.467 L 13.636 7.330 C 12.988 5.921 11.578 5.000 10.000 5.000 ZM 15.500 4.000 C 14.954 4.000 14.476 4.292 14.213 4.729 C 14.726 5.234 15.148 5.831 15.453 6.493 C 15.897 6.265 16.384 6.109 16.899 6.040 C 16.965 5.873 17.000 5.690 17.000 5.500 C 17.000 4.672 16.328 4.000 15.500 4.000 Z"),
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
        return _cake3Line!!
    }

private var _cake3Line: ImageVector? = null
