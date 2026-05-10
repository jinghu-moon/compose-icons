package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.BeerBottle: ImageVector
    get() {
        if (_beerBottle != null) return _beerBottle!!
        _beerBottle = phosphorFillIcon(
            name = "BeerBottle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M245.66 42.34l-32-32c-3.126-3.126-8.194-3.126-11.32 0-3.126 3.126-3.126 8.194 0 11.32l1.48 1.47L148.65 64.51l-38.22 7.65c-1.548 .31-2.97 1.068-4.09 2.18L23 157.66c-9.372 9.372-9.372 24.568 0 33.94L64.4 233c9.372 9.372 24.568 9.372 33.94 0l83.32-83.31c1.114-1.118 1.873-2.541 2.18-4.09l7.65-38.22L232.87 52.21l1.47 1.48c3.126 3.126 8.194 3.126 11.32 0 3.126-3.126 3.126-8.194 0-11.32ZM81.37 224c-2.12 .006-4.155-.837-5.65-2.34L34.34 180.28c-3.122-3.124-3.122-8.186 0-11.31L40 163.31 92.69 216 87 221.66c-1.494 1.493-3.518 2.334-5.63 2.34ZM177.6 99.2c-.717 .954-1.21 2.059-1.44 3.23l-7.53 37.63L160 148.69 107.31 96l8.63-8.63 37.63-7.53c1.171-.23 2.276-.723 3.23-1.44L215.25 34.56l6.19 6.19Z"),
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
        return _beerBottle!!
    }

private var _beerBottle: ImageVector? = null
