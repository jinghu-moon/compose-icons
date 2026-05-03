package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.DirectionSign: ImageVector
    get() {
        if (_directionSign != null) return _directionSign!!
        _directionSign = tablerFilledIcon(
            name = "DirectionSign",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 10.520 2.614 C 11.291 1.844 12.523 1.793 13.355 2.497 L 13.481 2.614 L 21.386 10.519 C 22.163 11.296 22.202 12.532 21.503 13.355 L 21.386 13.481 L 13.481 21.386 C 12.710 22.157 11.477 22.208 10.645 21.503 L 10.519 21.386 L 2.612 13.480 C 1.843 12.709 1.793 11.476 2.497 10.645 L 2.614 10.519 L 10.519 2.614 ZM 16.489 12.149 L 16.499 12.033 L 16.496 11.913 L 16.480 11.799 L 16.450 11.689 L 16.406 11.577 L 16.354 11.479 L 16.278 11.374 L 16.208 11.293 L 12.708 7.793 L 12.613 7.710 C 12.252 7.430 11.748 7.430 11.387 7.710 L 11.293 7.793 L 11.210 7.887 C 10.930 8.248 10.930 8.752 11.210 9.113 L 11.293 9.207 L 13.085 11.000 L 8.000 11.000 L 7.883 11.007 C 7.380 11.067 7.001 11.493 7.001 12.000 C 7.001 12.507 7.380 12.933 7.883 12.993 L 8.000 13.000 L 13.085 13.000 L 11.293 14.793 L 11.210 14.887 C 10.901 15.285 10.937 15.851 11.293 16.207 C 11.649 16.563 12.215 16.599 12.613 16.290 L 12.707 16.207 L 16.207 12.707 L 16.304 12.595 L 16.354 12.521 L 16.391 12.454 L 16.441 12.342 L 16.464 12.266 L 16.489 12.149 Z"),
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
        return _directionSign!!
    }

private var _directionSign: ImageVector? = null
