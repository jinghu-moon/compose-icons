package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.DeviceGamepad3: ImageVector
    get() {
        if (_deviceGamepad3 != null) return _deviceGamepad3!!
        _deviceGamepad3 = tablerOutlineIcon(
            name = "DeviceGamepad3",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 9.000 12.000 L 6.000 9.000 L 4.000 9.000 C 3.448 9.000 3.000 9.448 3.000 10.000 L 3.000 14.000 C 3.000 14.552 3.448 15.000 4.000 15.000 L 6.000 15.000 L 9.000 12.000"),
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
                pathData = parseSvgPathData("M 15.000 12.000 L 18.000 9.000 L 20.000 9.000 C 20.552 9.000 21.000 9.448 21.000 10.000 L 21.000 14.000 C 21.000 14.552 20.552 15.000 20.000 15.000 L 18.000 15.000 L 15.000 12.000"),
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
                pathData = parseSvgPathData("M 12.000 15.000 L 9.000 18.000 L 9.000 20.000 C 9.000 20.552 9.448 21.000 10.000 21.000 L 14.000 21.000 C 14.552 21.000 15.000 20.552 15.000 20.000 L 15.000 18.000 L 12.000 15.000"),
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
                pathData = parseSvgPathData("M 12.000 9.000 L 9.000 6.000 L 9.000 4.000 C 9.000 3.448 9.448 3.000 10.000 3.000 L 14.000 3.000 C 14.552 3.000 15.000 3.448 15.000 4.000 L 15.000 6.000 L 12.000 9.000"),
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
        return _deviceGamepad3!!
    }

private var _deviceGamepad3: ImageVector? = null
