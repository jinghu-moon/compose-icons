package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.DeviceComputerCamera: ImageVector
    get() {
        if (_deviceComputerCamera != null) return _deviceComputerCamera!!
        _deviceComputerCamera = tablerOutlineIcon(
            name = "DeviceComputerCamera",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 5.000 10.000 C 5.000 13.866 8.134 17.000 12.000 17.000 C 15.866 17.000 19.000 13.866 19.000 10.000 C 19.000 6.134 15.866 3.000 12.000 3.000 C 8.134 3.000 5.000 6.134 5.000 10.000"),
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
                pathData = parseSvgPathData("M 9.000 10.000 C 9.000 11.657 10.343 13.000 12.000 13.000 C 13.657 13.000 15.000 11.657 15.000 10.000 C 15.000 8.343 13.657 7.000 12.000 7.000 C 10.343 7.000 9.000 8.343 9.000 10.000"),
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
        }
        return _deviceComputerCamera!!
    }

private var _deviceComputerCamera: ImageVector? = null
