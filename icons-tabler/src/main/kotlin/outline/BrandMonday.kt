package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandMonday: ImageVector
    get() {
        if (_brandMonday != null) return _brandMonday!!
        _brandMonday = tablerOutlineIcon(
            name = "BrandMonday",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 18.000 15.500 C 18.000 16.328 18.672 17.000 19.500 17.000 C 20.328 17.000 21.000 16.328 21.000 15.500 C 21.000 14.672 20.328 14.000 19.500 14.000 C 18.672 14.000 18.000 14.672 18.000 15.500"),
        pathFillType = PathFillType.NonZero,
        fill = null,
        fillAlpha = 1.0f,
        stroke = SolidColor(Color(0xFF000000)),
        strokeAlpha = 1.0f,
        strokeLineWidth = 2.0f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round,
    )
    addPath(
        pathData = parseSvgPathData("M 9.500 7.000 C 10.021 7.000 10.505 7.270 10.778 7.714 C 11.051 8.158 11.074 8.712 10.839 9.177 L 6.805 16.251 C 6.541 16.698 6.055 17.000 5.500 17.000 C 4.954 17.000 4.452 16.704 4.187 16.226 C 3.923 15.749 3.939 15.165 4.229 14.703 L 8.135 7.876 C 8.379 7.342 8.913 7.000 9.500 7.000"),
        pathFillType = PathFillType.NonZero,
        fill = null,
        fillAlpha = 1.0f,
        stroke = SolidColor(Color(0xFF000000)),
        strokeAlpha = 1.0f,
        strokeLineWidth = 2.0f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round,
    )
    addPath(
        pathData = parseSvgPathData("M 16.500 7.000 C 17.021 7.000 17.505 7.270 17.778 7.714 C 18.051 8.158 18.074 8.712 17.839 9.177 L 13.805 16.251 C 13.541 16.698 13.055 17.000 12.500 17.000 C 11.954 17.000 11.452 16.704 11.187 16.226 C 10.923 15.749 10.939 15.165 11.229 14.703 L 15.135 7.876 C 15.379 7.342 15.913 7.000 16.500 7.000"),
        pathFillType = PathFillType.NonZero,
        fill = null,
        fillAlpha = 1.0f,
        stroke = SolidColor(Color(0xFF000000)),
        strokeAlpha = 1.0f,
        strokeLineWidth = 2.0f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round,
    )
        }
        return _brandMonday!!
    }

private var _brandMonday: ImageVector? = null
