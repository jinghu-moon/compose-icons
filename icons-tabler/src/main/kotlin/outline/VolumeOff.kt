package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.VolumeOff: ImageVector
    get() {
        if (_volumeOff != null) return _volumeOff!!
        _volumeOff = tablerOutlineIcon(
            name = "VolumeOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 15.000 8.000 C 16.527 9.145 17.268 11.059 16.912 12.934M 15.535 15.536 C 15.368 15.703 15.189 15.858 15.000 16.000"),
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
                pathData = parseSvgPathData("M 17.700 5.000 C 21.008 7.673 21.993 12.297 20.062 16.086M 18.386 18.385 C 18.168 18.602 17.939 18.807 17.700 19.000"),
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
                pathData = parseSvgPathData("M 9.069 5.054 L 9.500 4.500 C 9.681 4.149 10.090 3.982 10.464 4.107 C 10.839 4.232 11.066 4.611 11.000 5.000 L 11.000 7.000M 11.000 11.000 L 11.000 19.000 C 11.066 19.389 10.839 19.768 10.464 19.893 C 10.090 20.018 9.681 19.851 9.500 19.500 L 6.000 15.000 L 4.000 15.000 C 3.448 15.000 3.000 14.552 3.000 14.000 L 3.000 10.000 C 3.000 9.448 3.448 9.000 4.000 9.000 L 6.000 9.000 L 7.294 7.336"),
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
        return _volumeOff!!
    }

private var _volumeOff: ImageVector? = null
