package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.HexagonLetterM: ImageVector
    get() {
        if (_hexagonLetterM != null) return _hexagonLetterM!!
        _hexagonLetterM = tablerFilledIcon(
            name = "HexagonLetterM",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 13.666 1.429 L 20.416 5.409 L 20.512 5.472 L 20.605 5.550 L 20.711 5.624 C 21.470 6.193 21.940 7.067 21.995 8.014 L 22.000 8.218 L 22.000 15.502 C 22.000 16.677 21.357 17.758 20.377 18.295 L 13.573 22.597 C 12.593 23.135 11.407 23.135 10.373 22.565 L 3.678 18.328 C 2.645 17.762 2.002 16.679 2.000 15.502 L 2.000 8.217 C 2.000 7.111 2.570 6.089 3.476 5.512 L 10.426 1.414 C 11.426 0.862 12.640 0.862 13.666 1.429M 16.000 8.000 C 16.000 6.986 14.664 6.616 14.143 7.486 L 12.000 11.056 L 9.857 7.486 C 9.336 6.616 8.000 6.986 8.000 8.000 L 8.000 16.000 C 8.000 16.552 8.448 17.000 9.000 17.000 L 9.117 16.993 C 9.620 16.934 10.000 16.507 10.000 16.000 L 10.000 11.610 L 11.143 13.514 L 11.217 13.622 C 11.421 13.879 11.738 14.019 12.065 13.997 C 12.392 13.976 12.688 13.795 12.857 13.514 L 14.000 11.610 L 14.000 16.000 C 14.000 16.552 14.448 17.000 15.000 17.000 C 15.552 17.000 16.000 16.552 16.000 16.000 Z"),
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
        return _hexagonLetterM!!
    }

private var _hexagonLetterM: ImageVector? = null
