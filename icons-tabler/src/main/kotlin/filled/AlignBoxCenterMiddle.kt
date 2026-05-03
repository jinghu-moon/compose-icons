package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.AlignBoxCenterMiddle: ImageVector
    get() {
        if (_alignBoxCenterMiddle != null) return _alignBoxCenterMiddle!!
        _alignBoxCenterMiddle = tablerFilledIcon(
            name = "AlignBoxCenterMiddle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 19.000 2.000 C 20.589 2.000 21.902 3.238 21.995 4.824 L 22.000 5.000 L 22.000 19.000 C 22.000 20.589 20.762 21.902 19.176 21.995 L 19.000 22.000 L 5.000 22.000 C 3.420 22.000 2.111 20.774 2.007 19.198 L 2.000 19.000 L 2.000 5.000 C 2.000 3.411 3.238 2.098 4.824 2.005 L 5.000 2.000 L 19.000 2.000 ZM 13.000 14.000 L 11.000 14.000 L 10.883 14.007 C 10.380 14.067 10.001 14.493 10.001 15.000 C 10.001 15.507 10.380 15.933 10.883 15.993 L 11.000 16.000 L 13.000 16.000 L 13.117 15.993 C 13.620 15.933 13.999 15.507 13.999 15.000 C 13.999 14.493 13.620 14.067 13.117 14.007 L 13.000 14.000 ZM 15.000 11.000 L 9.000 11.000 L 8.883 11.007 C 8.380 11.067 8.001 11.493 8.001 12.000 C 8.001 12.507 8.380 12.933 8.883 12.993 L 9.000 13.000 L 15.000 13.000 L 15.117 12.993 C 15.620 12.933 15.999 12.507 15.999 12.000 C 15.999 11.493 15.620 11.067 15.117 11.007 L 15.000 11.000 ZM 14.000 8.000 L 10.000 8.000 L 9.883 8.007 C 9.380 8.067 9.001 8.493 9.001 9.000 C 9.001 9.507 9.380 9.933 9.883 9.993 L 10.000 10.000 L 14.000 10.000 L 14.117 9.993 C 14.620 9.933 14.999 9.507 14.999 9.000 C 14.999 8.493 14.620 8.067 14.117 8.007 L 14.000 8.000 Z"),
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
        return _alignBoxCenterMiddle!!
    }

private var _alignBoxCenterMiddle: ImageVector? = null
