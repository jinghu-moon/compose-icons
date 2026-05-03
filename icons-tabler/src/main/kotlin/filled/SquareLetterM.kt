package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.SquareLetterM: ImageVector
    get() {
        if (_squareLetterM != null) return _squareLetterM!!
        _squareLetterM = tablerFilledIcon(
            name = "SquareLetterM",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 19.000 2.000 C 20.657 2.000 22.000 3.343 22.000 5.000 L 22.000 19.000 C 22.000 20.657 20.657 22.000 19.000 22.000 L 5.000 22.000 C 3.343 22.000 2.000 20.657 2.000 19.000 L 2.000 5.000 C 2.000 3.343 3.343 2.000 5.000 2.000 ZM 16.000 8.000 C 16.000 6.986 14.664 6.616 14.143 7.486 L 12.000 11.056 L 9.857 7.486 C 9.336 6.616 8.000 6.986 8.000 8.000 L 8.000 16.000 C 8.000 16.552 8.448 17.000 9.000 17.000 L 9.117 16.993 C 9.620 16.934 10.000 16.507 10.000 16.000 L 10.000 11.610 L 11.143 13.514 L 11.217 13.622 C 11.421 13.879 11.738 14.019 12.065 13.997 C 12.392 13.976 12.688 13.795 12.857 13.514 L 14.000 11.610 L 14.000 16.000 C 14.000 16.552 14.448 17.000 15.000 17.000 C 15.552 17.000 16.000 16.552 16.000 16.000 Z"),
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
        return _squareLetterM!!
    }

private var _squareLetterM: ImageVector? = null
