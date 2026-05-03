package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.FileInfinity: ImageVector
    get() {
        if (_fileInfinity != null) return _fileInfinity!!
        _fileInfinity = tablerOutlineIcon(
            name = "FileInfinity",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 15.536 17.586 C 14.716 16.805 13.427 16.805 12.607 17.586 C 12.220 17.954 12.000 18.465 12.000 19.000 C 12.000 19.535 12.220 20.046 12.607 20.414 C 13.416 21.195 14.727 21.195 15.536 20.414 C 16.345 19.633 14.731 21.192 15.536 20.414 L 16.996 19.004 L 18.456 17.585"),
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
                pathData = parseSvgPathData("M 15.540 17.582 L 17.000 19.002 L 18.460 20.412 C 19.269 21.192 17.655 19.633 18.460 20.412 C 19.265 21.191 20.580 21.193 21.389 20.412 C 21.776 20.044 21.996 19.533 21.996 18.998 C 21.996 18.463 21.776 17.952 21.389 17.584 C 20.569 16.803 19.280 16.803 18.460 17.584"),
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
                pathData = parseSvgPathData("M 14.000 3.000 L 14.000 7.000 C 14.000 7.552 14.448 8.000 15.000 8.000 L 19.000 8.000"),
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
                pathData = parseSvgPathData("M 9.500 21.000 L 7.000 21.000 C 5.895 21.000 5.000 20.105 5.000 19.000 L 5.000 5.000 C 5.000 3.895 5.895 3.000 7.000 3.000 L 14.000 3.000 L 19.000 8.000 L 19.000 14.000"),
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
        return _fileInfinity!!
    }

private var _fileInfinity: ImageVector? = null
