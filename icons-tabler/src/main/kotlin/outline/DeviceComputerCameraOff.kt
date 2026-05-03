package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.DeviceComputerCameraOff: ImageVector
    get() {
        if (_deviceComputerCameraOff != null) return _deviceComputerCameraOff!!
        _deviceComputerCameraOff = tablerOutlineIcon(
            name = "DeviceComputerCameraOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 6.150 6.153 C 4.323 8.927 4.698 12.603 7.047 14.952 C 9.396 17.301 13.072 17.676 15.846 15.849M 17.846 13.849 C 19.674 11.074 19.300 7.396 16.949 5.047 C 14.599 2.698 10.921 2.325 8.147 4.154"),
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
                pathData = parseSvgPathData("M 9.130 9.122 C 8.805 10.183 9.091 11.336 9.875 12.121 C 10.659 12.906 11.812 13.194 12.873 12.871M 14.873 10.871 C 15.191 9.814 14.902 8.667 14.121 7.886 C 13.340 7.106 12.193 6.817 11.136 7.135"),
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
                pathData = parseSvgPathData("M 8.000 16.000 L 5.909 19.486 C 5.724 19.795 5.719 20.179 5.897 20.493 C 6.074 20.806 6.406 21.000 6.766 21.000 L 17.234 21.000 C 17.594 21.000 17.926 20.806 18.103 20.493 C 18.281 20.179 18.276 19.795 18.091 19.486 L 16.000 16.000"),
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
                pathData = parseSvgPathData("M 3.000 3.000 L 21.000 21.000"),
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
        return _deviceComputerCameraOff!!
    }

private var _deviceComputerCameraOff: ImageVector? = null
