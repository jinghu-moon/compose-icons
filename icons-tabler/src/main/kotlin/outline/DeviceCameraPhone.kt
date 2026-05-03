package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.DeviceCameraPhone: ImageVector
    get() {
        if (_deviceCameraPhone != null) return _deviceCameraPhone!!
        _deviceCameraPhone = tablerOutlineIcon(
            name = "DeviceCameraPhone",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 16.000 8.500 C 16.000 9.881 17.119 11.000 18.500 11.000 C 19.881 11.000 21.000 9.881 21.000 8.500 C 21.000 7.119 19.881 6.000 18.500 6.000 C 17.119 6.000 16.000 7.119 16.000 8.500"),
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
                pathData = parseSvgPathData("M 13.000 7.000 L 5.000 7.000 C 3.895 7.000 3.000 7.895 3.000 9.000 L 3.000 16.000 C 3.000 17.105 3.895 18.000 5.000 18.000 L 18.000 18.000 C 19.105 18.000 20.000 17.105 20.000 16.000 L 20.000 14.000"),
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
                pathData = parseSvgPathData("M 17.000 15.000 L 17.000 14.000"),
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
        return _deviceCameraPhone!!
    }

private var _deviceCameraPhone: ImageVector? = null
