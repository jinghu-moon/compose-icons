package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Lungs: ImageVector
    get() {
        if (_lungs != null) return _lungs!!
        _lungs = tablerOutlineIcon(
            name = "Lungs",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 6.081 20.000 C 7.693 20.000 9.000 18.665 9.000 17.020 L 9.000 7.257 C 9.000 6.563 8.448 6.000 7.768 6.000 C 7.563 6.000 7.363 6.052 7.184 6.150 L 7.054 6.233 C 5.594 7.292 4.622 8.880 3.650 12.057 C 3.230 13.427 3.014 15.019 3.002 16.832 C 2.990 18.507 4.263 19.886 5.879 19.993 L 6.082 20.000"),
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
        pathData = parseSvgPathData("M 17.920 20.000 C 16.307 20.000 15.000 18.665 15.000 17.020 L 15.000 7.257 C 15.000 6.563 15.552 6.000 16.233 6.000 C 16.437 6.000 16.638 6.052 16.817 6.150 L 16.947 6.233 C 18.407 7.292 19.379 8.880 20.352 12.057 C 20.772 13.427 20.988 15.019 21.000 16.832 C 21.012 18.507 19.739 19.886 18.122 19.993 L 17.920 20.000"),
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
        pathData = parseSvgPathData("M 9.000 12.000 C 10.657 12.000 12.000 10.657 12.000 9.000 C 12.000 10.657 13.343 12.000 15.000 12.000"),
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
        pathData = parseSvgPathData("M 12.000 4.000 L 12.000 9.000"),
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
        return _lungs!!
    }

private var _lungs: ImageVector? = null
