package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.ChargingPile: ImageVector
    get() {
        if (_chargingPile != null) return _chargingPile!!
        _chargingPile = tablerFilledIcon(
            name = "ChargingPile",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 12.000 3.000 C 13.657 3.000 15.000 4.343 15.000 6.000 L 15.000 10.000 C 16.657 10.000 18.000 11.343 18.000 13.000 L 18.000 16.000 C 18.000 16.276 18.224 16.500 18.500 16.500 C 18.776 16.500 19.000 16.276 19.000 16.000 L 19.000 9.415 L 18.000 8.415 L 17.707 8.707 C 17.315 9.086 16.691 9.081 16.305 8.695 C 15.919 8.309 15.914 7.685 16.293 7.293 L 16.585 7.000 L 16.293 6.707 C 15.937 6.351 15.901 5.785 16.210 5.387 L 16.293 5.293 C 16.684 4.903 17.316 4.903 17.707 5.293 L 20.707 8.293 C 20.895 8.480 21.000 8.735 21.000 9.000 L 21.000 16.000 C 21.000 17.381 19.881 18.500 18.500 18.500 C 17.119 18.500 16.000 17.381 16.000 16.000 L 16.000 13.000 C 16.000 12.448 15.552 12.000 15.000 12.000 L 15.000 19.000 C 15.552 19.000 16.000 19.448 16.000 20.000 C 16.000 20.552 15.552 21.000 15.000 21.000 L 3.000 21.000 C 2.448 21.000 2.000 20.552 2.000 20.000 C 2.000 19.448 2.448 19.000 3.000 19.000 L 3.000 6.000 C 3.000 4.343 4.343 3.000 6.000 3.000 ZM 9.514 10.643 C 9.041 10.360 8.427 10.513 8.143 10.986 L 6.643 13.486 L 6.589 13.586 C 6.448 13.896 6.474 14.256 6.659 14.542 C 6.843 14.828 7.160 15.000 7.500 15.000 L 8.733 15.000 L 8.143 15.986 C 7.883 16.457 8.043 17.049 8.505 17.326 C 8.966 17.603 9.564 17.465 9.857 17.014 L 11.357 14.514 L 11.411 14.414 C 11.552 14.104 11.526 13.744 11.341 13.458 C 11.157 13.172 10.840 13.000 10.500 13.000 L 9.265 13.000 L 9.857 12.014 C 10.140 11.541 9.987 10.927 9.514 10.643M 12.000 5.000 L 6.000 5.000 C 5.448 5.000 5.000 5.448 5.000 6.000 L 5.000 7.000 L 13.000 7.000 L 13.000 6.000 C 13.000 5.448 12.552 5.000 12.000 5.000"),
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
        return _chargingPile!!
    }

private var _chargingPile: ImageVector? = null
