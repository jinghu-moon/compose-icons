package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.CameraAi: ImageVector
    get() {
        if (_cameraAi != null) return _cameraAi!!
        _cameraAi = tablerOutlineIcon(
            name = "CameraAi",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 10.000 20.000 L 5.000 20.000 C 3.895 20.000 3.000 19.105 3.000 18.000 L 3.000 9.000 C 3.000 7.895 3.895 7.000 5.000 7.000 L 6.000 7.000 C 7.105 7.000 8.000 6.105 8.000 5.000 C 8.000 4.448 8.448 4.000 9.000 4.000 L 15.000 4.000 C 15.552 4.000 16.000 4.448 16.000 5.000 C 16.000 6.105 16.895 7.000 18.000 7.000 L 19.000 7.000 C 20.105 7.000 21.000 7.895 21.000 9.000 L 21.000 11.000"),
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
                pathData = parseSvgPathData("M 14.362 11.150 C 13.641 10.230 12.452 9.812 11.314 10.079 C 10.176 10.347 9.297 11.251 9.061 12.396 C 8.826 13.541 9.278 14.719 10.218 15.413"),
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
                pathData = parseSvgPathData("M 14.000 21.000 L 14.000 17.000 C 14.000 15.895 14.895 15.000 16.000 15.000 C 17.105 15.000 18.000 15.895 18.000 17.000 L 18.000 21.000"),
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
                pathData = parseSvgPathData("M 14.000 19.000 L 18.000 19.000"),
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
                pathData = parseSvgPathData("M 21.000 15.000 L 21.000 21.000"),
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
        return _cameraAi!!
    }

private var _cameraAi: ImageVector? = null
