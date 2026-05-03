package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.DentalBroken: ImageVector
    get() {
        if (_dentalBroken != null) return _dentalBroken!!
        _dentalBroken = tablerOutlineIcon(
            name = "DentalBroken",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 12.000 5.500 C 10.926 4.914 9.417 4.000 8.000 4.000 C 5.900 4.000 4.000 5.247 4.000 9.000 C 4.000 13.899 5.056 17.410 6.671 19.537 C 7.244 20.293 8.641 20.058 9.238 19.301 C 9.636 18.796 10.057 17.862 10.500 16.500 C 10.792 15.729 11.392 14.996 12.000 15.000 C 12.602 15.000 13.210 15.737 13.500 16.500 C 13.943 17.862 14.364 18.795 14.762 19.300 C 15.359 20.059 16.762 20.293 17.329 19.537 C 18.944 17.410 20.000 13.900 20.000 9.000 C 20.000 5.260 18.092 4.000 16.000 4.000 C 14.577 4.000 13.080 4.911 12.000 5.500"),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color(0xFF000000)),
                strokeAlpha = 1f,
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
            )
            addPath(
                pathData = parseSvgPathData("M 12.000 5.500 L 13.000 8.000 L 11.000 10.000 L 13.000 12.000"),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color(0xFF000000)),
                strokeAlpha = 1f,
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
            )
        }
        return _dentalBroken!!
    }

private var _dentalBroken: ImageVector? = null
