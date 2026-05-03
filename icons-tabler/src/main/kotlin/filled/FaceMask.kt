package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.FaceMask: ImageVector
    get() {
        if (_faceMask != null) return _faceMask!!
        _faceMask = tablerFilledIcon(
            name = "FaceMask",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 12.825 4.196 L 17.825 5.626 C 19.112 5.994 20.000 7.171 20.000 8.510 L 20.000 8.575 C 21.700 8.905 23.000 10.295 23.000 12.000 C 23.000 13.705 21.700 15.095 20.000 15.425 L 20.000 15.491 C 20.000 16.830 19.113 18.008 17.825 18.376 L 12.825 19.804 C 12.286 19.958 11.714 19.958 11.175 19.804 L 6.175 18.375 C 4.952 18.025 4.082 16.943 4.005 15.673 L 4.000 15.426 C 2.300 15.096 1.000 13.706 1.000 12.000 C 1.000 10.295 2.300 8.904 4.000 8.574 L 4.000 8.510 C 4.000 7.171 4.888 5.994 6.175 5.626 L 11.175 4.198 C 11.714 4.044 12.286 4.044 12.825 4.198M 15.000 13.000 L 9.000 13.000 C 8.448 13.000 8.000 13.448 8.000 14.000 C 8.000 14.552 8.448 15.000 9.000 15.000 L 15.000 15.000 C 15.552 15.000 16.000 14.552 16.000 14.000 C 16.000 13.448 15.552 13.000 15.000 13.000M 4.000 10.651 C 3.400 10.899 3.000 11.421 3.000 12.000 C 3.000 12.578 3.400 13.101 4.000 13.349 ZM 20.001 10.651 L 20.001 13.348 C 20.600 13.100 21.000 12.578 21.000 12.000 C 21.000 11.422 20.600 10.900 20.001 10.652M 15.000 9.000 L 9.000 9.000 C 8.448 9.000 8.000 9.448 8.000 10.000 C 8.000 10.552 8.448 11.000 9.000 11.000 L 15.000 11.000 C 15.552 11.000 16.000 10.552 16.000 10.000 C 16.000 9.448 15.552 9.000 15.000 9.000"),
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
        return _faceMask!!
    }

private var _faceMask: ImageVector? = null
