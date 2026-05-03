package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.MedicalCross: ImageVector
    get() {
        if (_medicalCross != null) return _medicalCross!!
        _medicalCross = tablerOutlineIcon(
            name = "MedicalCross",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 13.000 3.000 C 13.552 3.000 14.000 3.448 14.000 4.000 L 14.000 8.535 L 17.928 6.268 C 18.406 5.992 19.018 6.156 19.294 6.634 L 20.294 8.366 C 20.570 8.844 20.406 9.456 19.928 9.732 L 16.001 12.000 L 19.928 14.269 C 20.406 14.545 20.570 15.157 20.294 15.635 L 19.294 17.367 C 19.018 17.845 18.406 18.009 17.928 17.733 L 14.000 15.464 L 14.000 20.000 C 14.000 20.552 13.552 21.000 13.000 21.000 L 11.000 21.000 C 10.448 21.000 10.000 20.552 10.000 20.000 L 10.000 15.464 L 6.072 17.732 C 5.594 18.008 4.982 17.844 4.706 17.366 L 3.706 15.634 C 3.430 15.156 3.594 14.544 4.072 14.268 L 7.999 12.000 L 4.072 9.732 C 3.594 9.456 3.430 8.844 3.706 8.366 L 4.706 6.634 C 4.982 6.156 5.594 5.992 6.072 6.268 L 10.000 8.535 L 10.000 4.000 C 10.000 3.448 10.448 3.000 11.000 3.000 L 13.000 3.000"),
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
        return _medicalCross!!
    }

private var _medicalCross: ImageVector? = null
