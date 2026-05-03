package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.RotateClockwise: ImageVector
    get() {
        if (_rotateClockwise != null) return _rotateClockwise!!
        _rotateClockwise = tablerOutlineIcon(
            name = "RotateClockwise",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 4.050 11.000 C 4.573 7.009 7.981 4.028 12.006 4.040 C 16.032 4.052 19.421 7.053 19.920 11.047 C 20.420 15.042 17.873 18.785 13.975 19.788 C 10.076 20.790 6.040 18.740 4.550 15.000M 4.050 20.000 L 4.050 15.000 L 9.050 15.000"),
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
        return _rotateClockwise!!
    }

private var _rotateClockwise: ImageVector? = null
