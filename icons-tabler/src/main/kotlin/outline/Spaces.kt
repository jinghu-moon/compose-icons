package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Spaces: ImageVector
    get() {
        if (_spaces != null) return _spaces!!
        _spaces = tablerOutlineIcon(
            name = "Spaces",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 6.045 9.777 C 3.677 11.117 2.507 13.883 3.195 16.516 C 3.883 19.148 6.256 20.988 8.977 20.999 C 11.698 21.009 14.085 19.187 14.794 16.560 C 15.502 13.933 14.353 11.158 11.996 9.800"),
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
        pathData = parseSvgPathData("M 11.997 20.196 C 14.286 21.519 17.171 21.187 19.101 19.380 C 21.030 17.572 21.549 14.715 20.379 12.344 C 19.208 9.974 16.624 8.649 14.016 9.082 C 11.408 9.515 9.390 11.604 9.049 14.226"),
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
        pathData = parseSvgPathData("M 17.950 9.785 Q 18.000 9.399 18.000 9.000 C 17.999 6.291 16.183 3.918 13.567 3.210 C 10.952 2.503 8.187 3.635 6.820 5.975 C 5.453 8.314 5.823 11.279 7.724 13.211 C 9.624 15.142 12.583 15.559 14.944 14.230"),
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
        return _spaces!!
    }

private var _spaces: ImageVector? = null
