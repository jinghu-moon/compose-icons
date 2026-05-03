package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Biohazard: ImageVector
    get() {
        if (_biohazard != null) return _biohazard!!
        _biohazard = tablerOutlineIcon(
            name = "Biohazard",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 10.000 12.000 C 10.000 13.105 10.895 14.000 12.000 14.000 C 13.105 14.000 14.000 13.105 14.000 12.000 C 14.000 10.895 13.105 10.000 12.000 10.000 C 10.895 10.000 10.000 10.895 10.000 12.000"),
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
        pathData = parseSvgPathData("M 11.939 14.000 C 11.939 14.173 11.987 14.351 11.995 14.533 L 11.995 14.750 C 11.995 17.289 9.998 19.379 7.462 19.495 L 7.245 19.495M 2.495 14.745 C 2.495 12.915 3.547 11.247 5.199 10.459 C 6.851 9.670 8.809 9.901 10.232 11.052M 16.745 19.495 C 15.354 19.495 14.032 18.885 13.130 17.826 C 12.227 16.767 11.834 15.366 12.055 13.992 L 11.995 13.992M 13.759 11.048 C 15.152 9.922 17.060 9.675 18.693 10.410 C 20.327 11.145 21.408 12.736 21.490 14.525 L 21.490 14.742M 10.295 10.929 C 8.830 10.370 7.736 9.124 7.370 7.599 C 7.005 6.074 7.415 4.468 8.467 3.305 L 8.631 3.133M 15.349 3.133 C 16.488 4.271 16.973 5.910 16.637 7.485 C 16.300 9.060 15.189 10.357 13.684 10.931"),
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
        return _biohazard!!
    }

private var _biohazard: ImageVector? = null
