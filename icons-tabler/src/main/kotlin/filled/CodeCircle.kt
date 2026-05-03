package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.CodeCircle: ImageVector
    get() {
        if (_codeCircle != null) return _codeCircle!!
        _codeCircle = tablerFilledIcon(
            name = "CodeCircle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 17.000 3.340 C 21.203 5.766 23.057 10.860 21.397 15.421 C 19.737 19.981 15.043 22.691 10.263 21.848 C 5.484 21.006 2.000 16.853 2.000 12.000 L 2.005 11.676 C 2.119 8.163 4.069 4.968 7.141 3.260 C 10.213 1.552 13.956 1.582 17.000 3.340M 10.707 9.293 C 10.316 8.903 9.684 8.903 9.293 9.293 L 7.293 11.293 C 6.903 11.684 6.903 12.316 7.293 12.707 L 9.293 14.707 C 9.684 15.097 10.316 15.097 10.707 14.707 L 10.790 14.613 C 11.099 14.215 11.063 13.649 10.707 13.293 L 9.415 12.000 L 10.707 10.707 C 11.097 10.316 11.097 9.684 10.707 9.293M 14.707 9.293 C 14.316 8.903 13.684 8.903 13.293 9.293 L 13.210 9.387 C 12.901 9.785 12.937 10.351 13.293 10.707 L 14.585 12.000 L 13.293 13.293 C 12.914 13.685 12.919 14.309 13.305 14.695 C 13.691 15.081 14.315 15.086 14.707 14.707 L 16.707 12.707 C 17.097 12.316 17.097 11.684 16.707 11.293 Z"),
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
        return _codeCircle!!
    }

private var _codeCircle: ImageVector? = null
