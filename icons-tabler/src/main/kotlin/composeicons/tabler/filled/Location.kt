package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Location: ImageVector
    get() {
        if (_location != null) return _location!!
        _location = tablerFilledIcon(
            name = "Location",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M20.891 2.006 20.997 2l.13 .008 .09 .016 .123 .035 .107 .046 .1 .057 .09 .067 .082 .075 .052 .059 .082 .116 .052 .096c.047 .1 .077 .206 .09 .316L22 2.997c0 .075-.008 .149-.024 .22l-.035 .123L15.409 21.417c-.253 .55-.803 .903-1.409 .903-.543 .002-1.048-.282-1.329-.747l-.065-.127L9.254 14.744 2.584 11.408c-.502-.23-.844-.709-.898-1.259L1.68 10c0-.56 .301-1.072 .841-1.37l.14-.07L20.678 2.054l.106-.03 .108-.018Z"),
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
        return _location!!
    }

private var _location: ImageVector? = null
